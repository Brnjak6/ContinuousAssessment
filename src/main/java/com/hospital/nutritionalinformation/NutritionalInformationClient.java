package com.hospital.nutritionalinformation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class NutritionalInformationClient {
  public static void main(String[] args) {
	  
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
        .usePlaintext()
        .build();
    NutritionalInformationServiceGrpc.NutritionalInformationServiceBlockingStub blockingStub =
        NutritionalInformationServiceGrpc.newBlockingStub(channel);
    NutritionalInformationServiceGrpc.NutritionalInformationServiceStub asyncStub =
        NutritionalInformationServiceGrpc.newStub(channel);
    
    NutriInformationRequest nutriRequest = NutriInformationRequest.newBuilder()
        .setMealNumber(1)
        .build();
    try {
      NutriInformationResponse nutriResponse = blockingStub.nutriInformation(nutriRequest);
      System.out.println("nutriInformation response: " + nutriResponse.getMealIngredients());
    } catch (StatusRuntimeException e) {
      System.err.println("nutriInformation RPC failed: " + e.getStatus());
    }
    
    MealRankingRequest rankingRequest = MealRankingRequest.newBuilder()
        .setMealType(2)
        .build();
    try {
      MealRankingResponse rankingResponse = blockingStub.mealRanking(rankingRequest);
      System.out.println("mealRanking response: " + rankingResponse.getAvgRating());
    } catch (StatusRuntimeException e) {
      System.err.println("mealRanking RPC failed: " + e.getStatus());
    }
    
    StreamObserver<MicroNutrientStatsResponse> microNutrientStatsResponseObserver = new StreamObserver<MicroNutrientStatsResponse>() {
      @Override
      public void onNext(MicroNutrientStatsResponse response) {
        System.out.println("microNutrientStats response: " + response.getNutrientInfosList());
      }
      
      @Override
      public void onError(Throwable t) {
        System.err.println("microNutrientStats RPC failed: " + Status.fromThrowable(t));
      }
      
      @Override
      public void onCompleted() {
        System.out.println("microNutrientStats RPC completed");
      }
    };
    StreamObserver<MicroNutrientStatsRequest> microNutrientStatsRequestObserver = asyncStub.microNutrientStats(microNutrientStatsResponseObserver);
    microNutrientStatsRequestObserver.onNext(MicroNutrientStatsRequest.newBuilder()
        .addMealNumbers(1)
        .addMealNumbers(2)
        .build());
    microNutrientStatsRequestObserver.onNext(MicroNutrientStatsRequest.newBuilder()
        .addMealNumbers(3)
        .build());
    microNutrientStatsRequestObserver.onNext(MicroNutrientStatsRequest.newBuilder()
        .addMealNumbers(4)
        .build());
    microNutrientStatsRequestObserver.onCompleted();
    
    // Shutdown channel
    channel.shutdownNow();
  }
}