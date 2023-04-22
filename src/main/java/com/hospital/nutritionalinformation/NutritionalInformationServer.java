package com.hospital.nutritionalinformation;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class NutritionalInformationServer {
  public static void main(String[] args) throws Exception {
    Server server = ServerBuilder.forPort(8080)
        .addService(new NutritionalInformationServiceImpl())
        .build();
    server.start();
    System.out.println("Server started");
    server.awaitTermination();
  }
  
  static class NutritionalInformationServiceImpl extends NutritionalInformationServiceGrpc.NutritionalInformationServiceImplBase {
    @Override
    public void nutriInformation(NutriInformationRequest request, StreamObserver<NutriInformationResponse> responseObserver) {
      NutriInformationResponse response = NutriInformationResponse.newBuilder()
          .setMealIngredients("Example meal ingredients for meal " + request.getMealNumber())
          .build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    
    @Override
    public void mealRanking(MealRankingRequest request, StreamObserver<MealRankingResponse> responseObserver) {
      MealRankingResponse response = MealRankingResponse.newBuilder()
          .setAvgRating(7.5f) 
          .build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    
    @Override
    public StreamObserver<MicroNutrientStatsRequest> microNutrientStats(StreamObserver<MicroNutrientStatsResponse> responseObserver) {
      return new StreamObserver<MicroNutrientStatsRequest>() {
        @Override
        public void onNext(MicroNutrientStatsRequest request) {
          MicroNutrientStatsResponse.NutrientInfo nutrientInfo1 = MicroNutrientStatsResponse.NutrientInfo.newBuilder()
              .setNutrientName("High in carbs meal")
              .setNutrientValue(10.0f)
              .build();
          MicroNutrientStatsResponse.NutrientInfo nutrientInfo2 = MicroNutrientStatsResponse.NutrientInfo.newBuilder()
              .setNutrientName("High in fat and protein meal")
              .setNutrientValue(20.0f)
              .build();
          MicroNutrientStatsResponse response = MicroNutrientStatsResponse.newBuilder()
              .addNutrientInfos(nutrientInfo1)
              .addNutrientInfos(nutrientInfo2)
              .build();
          responseObserver.onNext(response);
        }
        
        @Override
        public void onCompleted() {
          responseObserver.onCompleted();
        }

		@Override
		public void onError(Throwable t) {
	          Status status = Status.UNKNOWN;
	          if (t instanceof IllegalArgumentException) {
	            status = Status.INVALID_ARGUMENT;
	          } else if (t instanceof IllegalStateException) {
	            status = Status.FAILED_PRECONDITION;
	          } else if (t instanceof UnsupportedOperationException) {
	            status = Status.UNIMPLEMENTED;
	          }
	          responseObserver.onError(new StatusRuntimeException(status.withDescription(t.getMessage())));
	        }
      };
    }
  }
}