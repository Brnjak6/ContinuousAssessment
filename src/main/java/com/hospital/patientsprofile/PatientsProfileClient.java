package com.hospital.patientsprofile;

import java.util.Iterator;

import com.hospital.patientsprofile.GetDailyMealsResponse.Meal;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PatientsProfileClient {
    private final ManagedChannel channel;
    private final PatientProfileServiceGrpc.PatientProfileServiceBlockingStub blockingStub;

    public PatientsProfileClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    public PatientsProfileClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = PatientProfileServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown();
    }

    public void getPatientInfo(String patientId) {
        GetPatientInfoRequest request = GetPatientInfoRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        GetPatientInfoResponse response = blockingStub.getPatientInfo(request);
        System.out.println("Patient Name: " + response.getPatientName());
        System.out.println("Height: " + response.getHeight() + " cm");
        System.out.println("Weight: " + response.getWeight() + " kg");
    }

    public void getDailyMeals(String patientId) {
        GetDailyMealsRequest request = GetDailyMealsRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        Iterator<GetDailyMealsResponse> responseIterator = blockingStub.getDailyMeals(request);
        while (responseIterator.hasNext()) {
            GetDailyMealsResponse response = responseIterator.next();
            System.out.println("Breakfast: ");
            for (Meal meal : response.getBreakfastList()) {
                System.out.println("Food: " + meal.getFood() + " - Quantity: " + meal.getQuantity());
            }
            System.out.println("Lunch: ");
            for (Meal meal : response.getLunchList()) {
                System.out.println("Food: " + meal.getFood() + " - Quantity: " + meal.getQuantity());
            }
            System.out.println("Dinner: ");
            for (Meal meal : response.getDinnerList()) {
                System.out.println("Food: " + meal.getFood() + " - Quantity: " + meal.getQuantity());
            }
        }
    }

    public void getLunchDetails(String patientId) {
        GetLunchDetailsRequest request = GetLunchDetailsRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        GetLunchDetailsResponse response = blockingStub.getLunchDetails(request);
        System.out.println("Lunch Details: ");
        for (com.hospital.patientsprofile.GetLunchDetailsResponse.Meal meal : response.getMealsList()) {
            System.out.println("Food: " + meal.getFood() + " - Quantity: " + meal.getQuantity());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PatientsProfileClient client = new PatientsProfileClient("localhost", 50051);
        try {
            client.getPatientInfo("3");
            client.getDailyMeals("3");
            client.getLunchDetails("3");
        } finally {
            client.shutdown();
        }
    }
}