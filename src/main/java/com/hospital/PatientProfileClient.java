package com.hospital;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PatientProfileClient {
	  private final ManagedChannel channel;
	  private final PatientProfileServiceGrpc.PatientProfileServiceBlockingStub blockingStub;

	  public PatientProfileClient(String host, int port) {
	    channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
	    blockingStub = PatientProfileServiceGrpc.newBlockingStub(channel);
	  }

	  public void shutdown() throws InterruptedException {
	    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	  }

	  public void createPatientProfile(int age, double weight, double height) {
	    CreatePatientProfileRequest request = CreatePatientProfileRequest.newBuilder()
	        .setAge(age)
	        .setWeight(weight)
	        .setHeight(height)
	        .build();
	    try {
	      CreatePatientProfileResponse response = blockingStub.createPatientProfile(request);
	      System.out.println("Create patient profile response: " + response.getConfirmation());
	    } catch (StatusRuntimeException e) {
	      System.out.println("RPC failed: " + e.getStatus());
	    }
	  }

	  public void getPatientMeals(String patientId) {
	    GetPatientMealsRequest request = GetPatientMealsRequest.newBuilder()
	        .setPatientId(patientId)
	        .build();
	    try {
	      GetPatientMealsResponse response = blockingStub.getPatientMeals(request);
	      List<String> meals = response.getMealsList();
	      System.out.println("Meals for patient " + patientId + ": " + Arrays.toString(meals.toArray()));
	    } catch (StatusRuntimeException e) {
	      System.out.println("RPC failed: " + e.getStatus());
	    }
	  }

	  public void updatePatientMeals(String patientId, List<String> meals) {
	    StreamObserver<UpdatePatientMealsRequest> requestObserver = blockingStub.updatePatientMeals(new StreamObserver<UpdatePatientMealsResponse>() {
	      @Override
	      public void onNext(UpdatePatientMealsResponse response) {
	        System.out.println("Update patient meals response: " + response.getConfirmation());
	      }

	      @Override
	      public void onError(Throwable t) {
	        System.out.println("RPC error: " + t.getMessage());
	      }

	      @Override
	      public void onCompleted() {
	        System.out.println("Update patient meals completed.");
	      }
	    });

	    try {
	      UpdatePatientMealsRequest request = UpdatePatientMealsRequest.newBuilder()
	          .setPatientId(patientId)
	          .addAllMeals(meals)
	          .build();
	      requestObserver.onNext(request);
	    } catch (RuntimeException e) {
	      requestObserver.onError(e);
	      throw e;
	    }

	    requestObserver.onCompleted();
	  }

	  public static void main(String[] args) throws InterruptedException {
	    PatientProfileClient client = new PatientProfileClient("localhost", 50051);
	    try {
	      // Testing createPatientProfile method
	      client.createPatientProfile(30, 70.5, 1.75);

	      // Testing getPatientMeals method
	      client.getPatientMeals("Ivor ONeill");

	      // Testing updatePatientMeals method
	      client.updatePatientMeals("Ivor ONeill", Arrays.asList("Fry-up", "Irish Stew", "Risotto"));
	    } finally {
	      client.shutdown();
	    }
	  }
	}