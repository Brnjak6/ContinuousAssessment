package com.hospital;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class PatientProfileServer {
  public static void main(String[] args) throws IOException, InterruptedException {
    Server server = ServerBuilder.forPort(50051).addService(new PatientProfileServiceImpl()).build();

    System.out.println("Starting server...");
    server.start();
    System.out.println("Server started!");
    
    // Keep the main thread alive to prevent the server from shutting down when the program finishes
    server.awaitTermination();
  }

  // Implementation of the PatientProfileService
  static class PatientProfileServiceImpl extends PatientProfileServiceGrpc.PatientProfileServiceImplBase {
    @Override
    public void createPatientProfile(CreatePatientProfileRequest request, StreamObserver<CreatePatientProfileResponse> responseObserver) {
      
      // Confirmation message
      String confirmationMessage = "Patient profile created for age " + request.getAge() +
                                    ", weight " + request.getWeight() +
                                    ", and height " + request.getHeight();
      
      // Response message
      CreatePatientProfileResponse response = CreatePatientProfileResponse.newBuilder()
                                                .setConfirmation(confirmationMessage)
                                                .build();
      
      // Sending the response back to the client
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }

    @Override
    public void getPatientMeals(GetPatientMealsRequest request, StreamObserver<GetPatientMealsResponse> responseObserver) {
      
    	//Static implementation for this purpose
      GetPatientMealsResponse response = GetPatientMealsResponse.newBuilder()
                                            .addMeals("Breakfast: eggs, toast, bacon")
                                            .addMeals("Lunch: chicken salad, fruit, water")
                                            .addMeals("Dinner: grilled salmon, veggies, rice")
                                            .build();
      
      // Send the response back to the client
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }

    @Override
    public void updatePatientMeals(UpdatePatientMealsRequest request, StreamObserver<UpdatePatientMealsResponse> responseObserver) {
      
      // Creating a confirmation message
      String confirmationMessage = "Patient meals updated for patient " + request.getPatientId() +
                                    ". New meals: " + String.join(", ", request.getMealsList());
      
      // Response message
      UpdatePatientMealsResponse response = UpdatePatientMealsResponse.newBuilder()
                                                .setConfirmation(confirmationMessage)
                                                .build();
      
      // Send the response back to the client
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
  }
}