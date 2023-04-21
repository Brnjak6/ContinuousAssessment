package com.hospital;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class PortionCalculatorClient {
    private final PortionCalculatorServiceGrpc.PortionCalculatorServiceBlockingStub blockingStub;
    private final PortionCalculatorServiceGrpc.PortionCalculatorServiceStub asyncStub;

    public PortionCalculatorClient(Channel channel) {
        blockingStub = PortionCalculatorServiceGrpc.newBlockingStub(channel);
        asyncStub = PortionCalculatorServiceGrpc.newStub(channel);
    }

    public void suitableMeal(String userId) {
        SuitableMealRequest request = SuitableMealRequest.newBuilder().setUserId(userId).build();
        SuitableMealResponse response = blockingStub.suitableMeal(request);
        System.out.println("Suitable meal level for user " + userId + ": " + response.getDietLevel());
    }

    public void dailyMeals(String userId) {
        DailyMealsRequest request = DailyMealsRequest.newBuilder().setUserId(userId).build();
        StreamObserver<DailyMealsResponse> responseObserver = new StreamObserver<DailyMealsResponse>() {
            @Override
            public void onNext(DailyMealsResponse response) {
                for (String meal : response.getMealsList()) {
                    System.out.println("Meal for user " + userId + ": " + meal);
                }
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error while receiving daily meals: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished receiving daily meals.");
            }
        };
        asyncStub.dailyMeals(request, responseObserver);
    }

    public void currentPortion(String userId, String meal) {
        CurrentPortionRequest request = CurrentPortionRequest.newBuilder().setUserId(userId).setMeal(meal).build();
        CurrentPortionResponse response = blockingStub.currentPortion(request);
        System.out.println("Current portion for user " + userId + " and meal " + meal + ": " +
                response.getFood() + " - " + response.getQuantity() + "g");
    }

    public static void main(String[] args) {
        String target = "localhost:50051";
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()
                .build();
        try {
            PortionCalculatorClient client = new PortionCalculatorClient(channel);

            String userId = "Patrick Bourke";
            client.suitableMeal(userId);
            client.dailyMeals(userId);
            client.currentPortion(userId, "option 1");

        } finally {
            channel.shutdownNow();
        }
    }
}