package com.hospital;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: portioncalculator.proto")
public final class PortionCalculatorServiceGrpc {

  private PortionCalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "PortionCalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hospital.SuitableMealRequest,
      com.hospital.SuitableMealResponse> getSuitableMealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuitableMeal",
      requestType = com.hospital.SuitableMealRequest.class,
      responseType = com.hospital.SuitableMealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.SuitableMealRequest,
      com.hospital.SuitableMealResponse> getSuitableMealMethod() {
    io.grpc.MethodDescriptor<com.hospital.SuitableMealRequest, com.hospital.SuitableMealResponse> getSuitableMealMethod;
    if ((getSuitableMealMethod = PortionCalculatorServiceGrpc.getSuitableMealMethod) == null) {
      synchronized (PortionCalculatorServiceGrpc.class) {
        if ((getSuitableMealMethod = PortionCalculatorServiceGrpc.getSuitableMealMethod) == null) {
          PortionCalculatorServiceGrpc.getSuitableMealMethod = getSuitableMealMethod = 
              io.grpc.MethodDescriptor.<com.hospital.SuitableMealRequest, com.hospital.SuitableMealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PortionCalculatorService", "SuitableMeal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.SuitableMealRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.SuitableMealResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PortionCalculatorServiceMethodDescriptorSupplier("SuitableMeal"))
                  .build();
          }
        }
     }
     return getSuitableMealMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hospital.DailyMealsRequest,
      com.hospital.DailyMealsResponse> getDailyMealsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DailyMeals",
      requestType = com.hospital.DailyMealsRequest.class,
      responseType = com.hospital.DailyMealsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.hospital.DailyMealsRequest,
      com.hospital.DailyMealsResponse> getDailyMealsMethod() {
    io.grpc.MethodDescriptor<com.hospital.DailyMealsRequest, com.hospital.DailyMealsResponse> getDailyMealsMethod;
    if ((getDailyMealsMethod = PortionCalculatorServiceGrpc.getDailyMealsMethod) == null) {
      synchronized (PortionCalculatorServiceGrpc.class) {
        if ((getDailyMealsMethod = PortionCalculatorServiceGrpc.getDailyMealsMethod) == null) {
          PortionCalculatorServiceGrpc.getDailyMealsMethod = getDailyMealsMethod = 
              io.grpc.MethodDescriptor.<com.hospital.DailyMealsRequest, com.hospital.DailyMealsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PortionCalculatorService", "DailyMeals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.DailyMealsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.DailyMealsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PortionCalculatorServiceMethodDescriptorSupplier("DailyMeals"))
                  .build();
          }
        }
     }
     return getDailyMealsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hospital.CurrentPortionRequest,
      com.hospital.CurrentPortionResponse> getCurrentPortionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentPortion",
      requestType = com.hospital.CurrentPortionRequest.class,
      responseType = com.hospital.CurrentPortionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.CurrentPortionRequest,
      com.hospital.CurrentPortionResponse> getCurrentPortionMethod() {
    io.grpc.MethodDescriptor<com.hospital.CurrentPortionRequest, com.hospital.CurrentPortionResponse> getCurrentPortionMethod;
    if ((getCurrentPortionMethod = PortionCalculatorServiceGrpc.getCurrentPortionMethod) == null) {
      synchronized (PortionCalculatorServiceGrpc.class) {
        if ((getCurrentPortionMethod = PortionCalculatorServiceGrpc.getCurrentPortionMethod) == null) {
          PortionCalculatorServiceGrpc.getCurrentPortionMethod = getCurrentPortionMethod = 
              io.grpc.MethodDescriptor.<com.hospital.CurrentPortionRequest, com.hospital.CurrentPortionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PortionCalculatorService", "CurrentPortion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.CurrentPortionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.CurrentPortionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PortionCalculatorServiceMethodDescriptorSupplier("CurrentPortion"))
                  .build();
          }
        }
     }
     return getCurrentPortionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PortionCalculatorServiceStub newStub(io.grpc.Channel channel) {
    return new PortionCalculatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PortionCalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PortionCalculatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PortionCalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PortionCalculatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PortionCalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary method that returns a suitable diet level for a given user ID.
     * </pre>
     */
    public void suitableMeal(com.hospital.SuitableMealRequest request,
        io.grpc.stub.StreamObserver<com.hospital.SuitableMealResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSuitableMealMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming method that returns meals for a day for a given user ID.
     * </pre>
     */
    public void dailyMeals(com.hospital.DailyMealsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.DailyMealsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDailyMealsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary method that returns current portion details for a given user ID and meal.
     * </pre>
     */
    public void currentPortion(com.hospital.CurrentPortionRequest request,
        io.grpc.stub.StreamObserver<com.hospital.CurrentPortionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrentPortionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSuitableMealMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.SuitableMealRequest,
                com.hospital.SuitableMealResponse>(
                  this, METHODID_SUITABLE_MEAL)))
          .addMethod(
            getDailyMealsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.hospital.DailyMealsRequest,
                com.hospital.DailyMealsResponse>(
                  this, METHODID_DAILY_MEALS)))
          .addMethod(
            getCurrentPortionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.CurrentPortionRequest,
                com.hospital.CurrentPortionResponse>(
                  this, METHODID_CURRENT_PORTION)))
          .build();
    }
  }

  /**
   */
  public static final class PortionCalculatorServiceStub extends io.grpc.stub.AbstractStub<PortionCalculatorServiceStub> {
    private PortionCalculatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortionCalculatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortionCalculatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortionCalculatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary method that returns a suitable diet level for a given user ID.
     * </pre>
     */
    public void suitableMeal(com.hospital.SuitableMealRequest request,
        io.grpc.stub.StreamObserver<com.hospital.SuitableMealResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSuitableMealMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server streaming method that returns meals for a day for a given user ID.
     * </pre>
     */
    public void dailyMeals(com.hospital.DailyMealsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.DailyMealsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDailyMealsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary method that returns current portion details for a given user ID and meal.
     * </pre>
     */
    public void currentPortion(com.hospital.CurrentPortionRequest request,
        io.grpc.stub.StreamObserver<com.hospital.CurrentPortionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrentPortionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PortionCalculatorServiceBlockingStub extends io.grpc.stub.AbstractStub<PortionCalculatorServiceBlockingStub> {
    private PortionCalculatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortionCalculatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortionCalculatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortionCalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary method that returns a suitable diet level for a given user ID.
     * </pre>
     */
    public com.hospital.SuitableMealResponse suitableMeal(com.hospital.SuitableMealRequest request) {
      return blockingUnaryCall(
          getChannel(), getSuitableMealMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server streaming method that returns meals for a day for a given user ID.
     * </pre>
     */
    public java.util.Iterator<com.hospital.DailyMealsResponse> dailyMeals(
        com.hospital.DailyMealsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getDailyMealsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary method that returns current portion details for a given user ID and meal.
     * </pre>
     */
    public com.hospital.CurrentPortionResponse currentPortion(com.hospital.CurrentPortionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCurrentPortionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PortionCalculatorServiceFutureStub extends io.grpc.stub.AbstractStub<PortionCalculatorServiceFutureStub> {
    private PortionCalculatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortionCalculatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortionCalculatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortionCalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary method that returns a suitable diet level for a given user ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.SuitableMealResponse> suitableMeal(
        com.hospital.SuitableMealRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSuitableMealMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary method that returns current portion details for a given user ID and meal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.CurrentPortionResponse> currentPortion(
        com.hospital.CurrentPortionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrentPortionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUITABLE_MEAL = 0;
  private static final int METHODID_DAILY_MEALS = 1;
  private static final int METHODID_CURRENT_PORTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PortionCalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PortionCalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUITABLE_MEAL:
          serviceImpl.suitableMeal((com.hospital.SuitableMealRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.SuitableMealResponse>) responseObserver);
          break;
        case METHODID_DAILY_MEALS:
          serviceImpl.dailyMeals((com.hospital.DailyMealsRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.DailyMealsResponse>) responseObserver);
          break;
        case METHODID_CURRENT_PORTION:
          serviceImpl.currentPortion((com.hospital.CurrentPortionRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.CurrentPortionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PortionCalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PortionCalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hospital.ContinuousAssessment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PortionCalculatorService");
    }
  }

  private static final class PortionCalculatorServiceFileDescriptorSupplier
      extends PortionCalculatorServiceBaseDescriptorSupplier {
    PortionCalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class PortionCalculatorServiceMethodDescriptorSupplier
      extends PortionCalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PortionCalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PortionCalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PortionCalculatorServiceFileDescriptorSupplier())
              .addMethod(getSuitableMealMethod())
              .addMethod(getDailyMealsMethod())
              .addMethod(getCurrentPortionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
