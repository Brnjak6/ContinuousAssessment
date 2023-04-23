package com.hospital.nutritionalinformation;

import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class NutritionalInformationServer {
  public static void main(String[] args) throws Exception {
	  final int PORT = 8080;
	    final String SERVICE_TYPE = "_nutriinfo._tcp.local.";
	    final String SERVICE_NAME = "NutritionalInformationService";
	    
    Server server = ServerBuilder.forPort(8080)
        .addService(new NutritionalInformationServiceImpl())
        .build();
    
    // Create jmDNS instance
    JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

    // Register service
    ServiceInfo serviceInfo = ServiceInfo.create(SERVICE_TYPE, SERVICE_NAME, PORT, "");
    jmdns.registerService(serviceInfo);
    System.out.printf("Service registered: %s%n", serviceInfo);
    server.start();
    System.out.println("Server started");
    server.awaitTermination(); // blocking until the server is terminated
  }
  
  static class NutritionalInformationServiceImpl extends NutritionalInformationServiceGrpc.NutritionalInformationServiceImplBase {
    @Override
    public void nutriInformation(NutriInformationRequest request, StreamObserver<NutriInformationResponse> responseObserver) {
        // Create response for nutriInformation() method
      NutriInformationResponse response = NutriInformationResponse.newBuilder()
          .setMealIngredients("Example meal ingredients for meal " + request.getMealNumber())
          .build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    
    @Override
    public void mealRanking(MealRankingRequest request, StreamObserver<MealRankingResponse> responseObserver) {
        // Create response for mealRanking() method
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
        // Creating response for onNext() method of the streaming call
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