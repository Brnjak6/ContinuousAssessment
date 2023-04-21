package com.hospital;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class PortionCalculatorServer {
    private final int port;
    private final Server server;

    public PortionCalculatorServer(int port) throws IOException {
        this(ServerBuilder.forPort(port), port);
    }

    public PortionCalculatorServer(ServerBuilder<?> serverBuilder, int port) {
        this.port = port;
        this.server = serverBuilder.addService(new PortionCalculatorServiceImpl()).build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            PortionCalculatorServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private static class PortionCalculatorServiceImpl extends PortionCalculatorServiceGrpc.PortionCalculatorServiceImplBase {
        @Override
        public void suitableMeal(SuitableMealRequest request, StreamObserver<SuitableMealResponse> responseObserver) {
            SuitableMealResponse response = SuitableMealResponse.newBuilder()
                .setDietLevel(SuitableMealResponse.DietLevel.MEDIUM)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void dailyMeals(DailyMealsRequest request, StreamObserver<DailyMealsResponse> responseObserver) {
            DailyMealsResponse response = DailyMealsResponse.newBuilder()
                .addMeals("Eggs and piece of bacon")
                .addMeals("Salmon and potatoes")
                .addMeals("Mushroom soup")
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void currentPortion(CurrentPortionRequest request, StreamObserver<CurrentPortionResponse> responseObserver) {
            CurrentPortionResponse response = CurrentPortionResponse.newBuilder()
                .setFood("Chicken filets and green vegetable")
                .setQuantity(100)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        PortionCalculatorServer server = new PortionCalculatorServer(port);
        server.start();
        server.blockUntilShutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}