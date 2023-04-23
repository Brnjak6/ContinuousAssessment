package com.hospital.portioncalculator;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class PortionCalculatorServer {

    private final int port;
    private final Server server;
    private JmDNS jmdns;
    
    // Constructor for the server takes the port on which it will listen for new requests
    public PortionCalculatorServer(int port) throws IOException {
        // Create the server using the provided port and the implementation of the service
        this(ServerBuilder.forPort(port), port);
    }

    public PortionCalculatorServer(ServerBuilder<?> serverBuilder, int port) {
        this.port = port;
        // Add the service implementation to the server
        this.server = serverBuilder.addService(new PortionCalculatorServiceImpl()).build();
    }
    
    // This method starts the server and registers it with JmDNS
    public void start() throws IOException {
        // Start the server
        server.start();
        System.out.println("Server started, listening on " + port);

        String service_type = "_grpc._tcp.local.";
        String service_name = "PortionCalculatorServer";
        int service_port = port;

        InetAddress address = InetAddress.getLocalHost();
        String ipAddress = address.getHostAddress();
   
        // Create an instance of JmDNS
        jmdns = JmDNS.create(address);
        // Register the service with JmDNS
        ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, "Portion Calculator gRPC service running on " + ipAddress);
        jmdns.registerService(serviceInfo);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            PortionCalculatorServer.this.stop();
            System.err.println("*** server shut down");

            jmdns.unregisterAllServices();
            try {
                jmdns.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    
    // This method stops the server
    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
    
    // Implementation of the service
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
        // For the purpose of learning we are adding hardcoded meals once the client requests them. In below code, we add three meals to dailyMeals method and send it to client
        public void dailyMeals(DailyMealsRequest request, StreamObserver<DailyMealsResponse> responseObserver) {
            DailyMealsResponse response = DailyMealsResponse.newBuilder()
                .addMeals("Omelette and mushrooms")
                .addMeals("Green vegetables with salmon")
                .addMeals("Chicken soup")
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        // Once client requests this method, server is supposed to return details on exact meal and how many grams it has. Once we create it, we send it back to client
        public void currentPortion(CurrentPortionRequest request, StreamObserver<CurrentPortionResponse> responseObserver) {
            CurrentPortionResponse response = CurrentPortionResponse.newBuilder()
                .setFood("Chicken in light sauce")
                .setQuantity(500)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
    	//Creating instance of the PortionCalculatorServer by passing the port nuber as a parameter
        int port = 50051;
        PortionCalculatorServer server = new PortionCalculatorServer(port);
        // We start the gRPC service here
        server.start();
        server.blockUntilShutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}