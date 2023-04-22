package com.hospital.patientsprofile;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class PatientsProfileServer {
    private final int port;
    private final Server server;

    public PatientsProfileServer(int port) throws IOException {
        this.port = port;
        this.server = ServerBuilder.forPort(port)
                .addService(new PatientProfileServiceImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server since JVM is shutting down");
            PatientsProfileServer.this.stop();
            System.out.println("Server shut down");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private static class PatientProfileServiceImpl extends PatientProfileServiceGrpc.PatientProfileServiceImplBase {
        @Override
        public void getPatientInfo(GetPatientInfoRequest request, StreamObserver<GetPatientInfoResponse> responseObserver) {
            GetPatientInfoResponse response = GetPatientInfoResponse.newBuilder()
                    .setPatientName("Mike Peterson")
                    .setHeight(175.3f)
                    .setWeight(75.6f)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getDailyMeals(GetDailyMealsRequest request, StreamObserver<GetDailyMealsResponse> responseObserver) {
            GetDailyMealsResponse response = GetDailyMealsResponse.newBuilder()
                    .addBreakfast(GetDailyMealsResponse.Meal.newBuilder()
                            .setFood("Cereal with milk")
                            .setQuantity(1.0f)
                            .build())
                    .addLunch(GetDailyMealsResponse.Meal.newBuilder()
                            .setFood("Tuna sandwich and mushroom soup")
                            .setQuantity(1.0f)
                            .build())
                    .addDinner(GetDailyMealsResponse.Meal.newBuilder()
                            .setFood("Fish soup")
                            .setQuantity(1.5f)
                            .build())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getLunchDetails(GetLunchDetailsRequest request, StreamObserver<GetLunchDetailsResponse> responseObserver) {
            GetLunchDetailsResponse response = GetLunchDetailsResponse.newBuilder()
                    .addMeals(GetLunchDetailsResponse.Meal.newBuilder()
                            .setFood("Sandwich")
                            .setQuantity(1.0f)
                            .build())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        PatientsProfileServer server = new PatientsProfileServer(50051);
        server.start();
        server.blockUntilShutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}