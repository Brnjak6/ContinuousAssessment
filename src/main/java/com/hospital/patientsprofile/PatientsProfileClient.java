package com.hospital.patientsprofile;

import java.util.Iterator;

import com.hospital.patientsprofile.GetDailyMealsResponse.Meal;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PatientsProfileClient {
    // Initialize a ManagedChannel and a PatientProfileServiceBlockingStub
    private final ManagedChannel channel;
    private final PatientProfileServiceGrpc.PatientProfileServiceBlockingStub blockingStub;

    // Constructor that takes host and port
    public PatientsProfileClient(String host, int port) {
        // Creating a ManagedChannel using host
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    public PatientsProfileClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = PatientProfileServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown();
    }
    // Retrieve patient information by patient ID
    public void getPatientInfo(String patientId) {
        // Build a request with the patient ID
        GetPatientInfoRequest request = GetPatientInfoRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        // Send the request and receive a response
        GetPatientInfoResponse response = blockingStub.getPatientInfo(request);
        // Print the patient's name, height, and weight
        System.out.println("Patient Name: " + response.getPatientName());
        System.out.println("Height: " + response.getHeight() + " cm");
        System.out.println("Weight: " + response.getWeight() + " kg");
    }
 // Retrieve daily meals 
    public void getDailyMeals(String patientId) {
        // Build a request with the patient ID
        GetDailyMealsRequest request = GetDailyMealsRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        // Send the request and receive an iterator for the response
        Iterator<GetDailyMealsResponse> responseIterator = blockingStub.getDailyMeals(request);
        // Iterate over the response and print the meals for each category (breakfast, lunch, dinner)
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
        // Calling the three methods for a patient with ID "3"
        try {
            client.getPatientInfo("3");
            client.getDailyMeals("3");
            client.getLunchDetails("3");
        } finally {
            client.shutdown();
        }
    }
}