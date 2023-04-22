package com.hospital.portioncalculator;


import java.util.Iterator;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PortionCalculatorClient {
    private final ManagedChannel channel;
    private final PortionCalculatorServiceGrpc.PortionCalculatorServiceBlockingStub blockingStub;

    public PortionCalculatorClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = PortionCalculatorServiceGrpc.newBlockingStub(channel);
    }

    public void calculateSuitableMeal(String userId) {
        SuitableMealRequest request = SuitableMealRequest.newBuilder().setUserId(userId).build();
        SuitableMealResponse response = blockingStub.suitableMeal(request);
        System.out.println("Suitable diet level for user " + userId + ": " + response.getDietLevel());
    }

    public void getDailyMeals(String userId) {
        DailyMealsRequest request = DailyMealsRequest.newBuilder().setUserId(userId).build();
        Iterator<DailyMealsResponse> responseIterator = blockingStub.dailyMeals(request);
        System.out.println("Meals for user " + userId + ":");
        while (responseIterator.hasNext()) {
            DailyMealsResponse response = responseIterator.next();
            for (String meal : response.getMealsList()) {
                System.out.println("- " + meal);
            }
        }
    }

    public void getCurrentPortion(String userId, String meal) {
        CurrentPortionRequest request = CurrentPortionRequest.newBuilder().setUserId(userId).setMeal(meal).build();
        CurrentPortionResponse response = blockingStub.currentPortion(request);
        System.out.println("Current portion details for user " + userId + " and meal " + meal + ":");
        System.out.println("- Food: " + response.getFood());
        System.out.println("- Quantity: " + response.getQuantity());
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        PortionCalculatorClient client = new PortionCalculatorClient("localhost", 50051);
        try {
            client.calculateSuitableMeal("Patrick O'Connor");
            client.getDailyMeals("Patrick O'Connor");
            client.getCurrentPortion("Patrick O'Connor", "Lunch");
        } finally {
            client.shutdown();
        }
    }
}