package com.hospital.nutritionalinformation;

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
    comments = "Source: nutritionalinformation.proto")
public final class NutritionalInformationServiceGrpc {

  private NutritionalInformationServiceGrpc() {}

  public static final String SERVICE_NAME = "NutritionalInformationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.NutriInformationRequest,
      com.hospital.nutritionalinformation.NutriInformationResponse> getNutriInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "nutriInformation",
      requestType = com.hospital.nutritionalinformation.NutriInformationRequest.class,
      responseType = com.hospital.nutritionalinformation.NutriInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.NutriInformationRequest,
      com.hospital.nutritionalinformation.NutriInformationResponse> getNutriInformationMethod() {
    io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.NutriInformationRequest, com.hospital.nutritionalinformation.NutriInformationResponse> getNutriInformationMethod;
    if ((getNutriInformationMethod = NutritionalInformationServiceGrpc.getNutriInformationMethod) == null) {
      synchronized (NutritionalInformationServiceGrpc.class) {
        if ((getNutriInformationMethod = NutritionalInformationServiceGrpc.getNutriInformationMethod) == null) {
          NutritionalInformationServiceGrpc.getNutriInformationMethod = getNutriInformationMethod = 
              io.grpc.MethodDescriptor.<com.hospital.nutritionalinformation.NutriInformationRequest, com.hospital.nutritionalinformation.NutriInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NutritionalInformationService", "nutriInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.nutritionalinformation.NutriInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.nutritionalinformation.NutriInformationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NutritionalInformationServiceMethodDescriptorSupplier("nutriInformation"))
                  .build();
          }
        }
     }
     return getNutriInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.MealRankingRequest,
      com.hospital.nutritionalinformation.MealRankingResponse> getMealRankingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mealRanking",
      requestType = com.hospital.nutritionalinformation.MealRankingRequest.class,
      responseType = com.hospital.nutritionalinformation.MealRankingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.MealRankingRequest,
      com.hospital.nutritionalinformation.MealRankingResponse> getMealRankingMethod() {
    io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.MealRankingRequest, com.hospital.nutritionalinformation.MealRankingResponse> getMealRankingMethod;
    if ((getMealRankingMethod = NutritionalInformationServiceGrpc.getMealRankingMethod) == null) {
      synchronized (NutritionalInformationServiceGrpc.class) {
        if ((getMealRankingMethod = NutritionalInformationServiceGrpc.getMealRankingMethod) == null) {
          NutritionalInformationServiceGrpc.getMealRankingMethod = getMealRankingMethod = 
              io.grpc.MethodDescriptor.<com.hospital.nutritionalinformation.MealRankingRequest, com.hospital.nutritionalinformation.MealRankingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NutritionalInformationService", "mealRanking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.nutritionalinformation.MealRankingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.nutritionalinformation.MealRankingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NutritionalInformationServiceMethodDescriptorSupplier("mealRanking"))
                  .build();
          }
        }
     }
     return getMealRankingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.MicroNutrientStatsRequest,
      com.hospital.nutritionalinformation.MicroNutrientStatsResponse> getMicroNutrientStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "microNutrientStats",
      requestType = com.hospital.nutritionalinformation.MicroNutrientStatsRequest.class,
      responseType = com.hospital.nutritionalinformation.MicroNutrientStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.MicroNutrientStatsRequest,
      com.hospital.nutritionalinformation.MicroNutrientStatsResponse> getMicroNutrientStatsMethod() {
    io.grpc.MethodDescriptor<com.hospital.nutritionalinformation.MicroNutrientStatsRequest, com.hospital.nutritionalinformation.MicroNutrientStatsResponse> getMicroNutrientStatsMethod;
    if ((getMicroNutrientStatsMethod = NutritionalInformationServiceGrpc.getMicroNutrientStatsMethod) == null) {
      synchronized (NutritionalInformationServiceGrpc.class) {
        if ((getMicroNutrientStatsMethod = NutritionalInformationServiceGrpc.getMicroNutrientStatsMethod) == null) {
          NutritionalInformationServiceGrpc.getMicroNutrientStatsMethod = getMicroNutrientStatsMethod = 
              io.grpc.MethodDescriptor.<com.hospital.nutritionalinformation.MicroNutrientStatsRequest, com.hospital.nutritionalinformation.MicroNutrientStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "NutritionalInformationService", "microNutrientStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.nutritionalinformation.MicroNutrientStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.nutritionalinformation.MicroNutrientStatsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NutritionalInformationServiceMethodDescriptorSupplier("microNutrientStats"))
                  .build();
          }
        }
     }
     return getMicroNutrientStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NutritionalInformationServiceStub newStub(io.grpc.Channel channel) {
    return new NutritionalInformationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NutritionalInformationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NutritionalInformationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NutritionalInformationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NutritionalInformationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NutritionalInformationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void nutriInformation(com.hospital.nutritionalinformation.NutriInformationRequest request,
        io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.NutriInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNutriInformationMethod(), responseObserver);
    }

    /**
     */
    public void mealRanking(com.hospital.nutritionalinformation.MealRankingRequest request,
        io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.MealRankingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMealRankingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.MicroNutrientStatsRequest> microNutrientStats(
        io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.MicroNutrientStatsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMicroNutrientStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNutriInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.nutritionalinformation.NutriInformationRequest,
                com.hospital.nutritionalinformation.NutriInformationResponse>(
                  this, METHODID_NUTRI_INFORMATION)))
          .addMethod(
            getMealRankingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.nutritionalinformation.MealRankingRequest,
                com.hospital.nutritionalinformation.MealRankingResponse>(
                  this, METHODID_MEAL_RANKING)))
          .addMethod(
            getMicroNutrientStatsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.hospital.nutritionalinformation.MicroNutrientStatsRequest,
                com.hospital.nutritionalinformation.MicroNutrientStatsResponse>(
                  this, METHODID_MICRO_NUTRIENT_STATS)))
          .build();
    }
  }

  /**
   */
  public static final class NutritionalInformationServiceStub extends io.grpc.stub.AbstractStub<NutritionalInformationServiceStub> {
    private NutritionalInformationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NutritionalInformationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NutritionalInformationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NutritionalInformationServiceStub(channel, callOptions);
    }

    /**
     */
    public void nutriInformation(com.hospital.nutritionalinformation.NutriInformationRequest request,
        io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.NutriInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNutriInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mealRanking(com.hospital.nutritionalinformation.MealRankingRequest request,
        io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.MealRankingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMealRankingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.MicroNutrientStatsRequest> microNutrientStats(
        io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.MicroNutrientStatsResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMicroNutrientStatsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class NutritionalInformationServiceBlockingStub extends io.grpc.stub.AbstractStub<NutritionalInformationServiceBlockingStub> {
    private NutritionalInformationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NutritionalInformationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NutritionalInformationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NutritionalInformationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hospital.nutritionalinformation.NutriInformationResponse nutriInformation(com.hospital.nutritionalinformation.NutriInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getNutriInformationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hospital.nutritionalinformation.MealRankingResponse mealRanking(com.hospital.nutritionalinformation.MealRankingRequest request) {
      return blockingUnaryCall(
          getChannel(), getMealRankingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NutritionalInformationServiceFutureStub extends io.grpc.stub.AbstractStub<NutritionalInformationServiceFutureStub> {
    private NutritionalInformationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NutritionalInformationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NutritionalInformationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NutritionalInformationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.nutritionalinformation.NutriInformationResponse> nutriInformation(
        com.hospital.nutritionalinformation.NutriInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNutriInformationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.nutritionalinformation.MealRankingResponse> mealRanking(
        com.hospital.nutritionalinformation.MealRankingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMealRankingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NUTRI_INFORMATION = 0;
  private static final int METHODID_MEAL_RANKING = 1;
  private static final int METHODID_MICRO_NUTRIENT_STATS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NutritionalInformationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NutritionalInformationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NUTRI_INFORMATION:
          serviceImpl.nutriInformation((com.hospital.nutritionalinformation.NutriInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.NutriInformationResponse>) responseObserver);
          break;
        case METHODID_MEAL_RANKING:
          serviceImpl.mealRanking((com.hospital.nutritionalinformation.MealRankingRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.MealRankingResponse>) responseObserver);
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
        case METHODID_MICRO_NUTRIENT_STATS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.microNutrientStats(
              (io.grpc.stub.StreamObserver<com.hospital.nutritionalinformation.MicroNutrientStatsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NutritionalInformationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NutritionalInformationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hospital.nutritionalinformation.ContinuousAssessment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NutritionalInformationService");
    }
  }

  private static final class NutritionalInformationServiceFileDescriptorSupplier
      extends NutritionalInformationServiceBaseDescriptorSupplier {
    NutritionalInformationServiceFileDescriptorSupplier() {}
  }

  private static final class NutritionalInformationServiceMethodDescriptorSupplier
      extends NutritionalInformationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NutritionalInformationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NutritionalInformationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NutritionalInformationServiceFileDescriptorSupplier())
              .addMethod(getNutriInformationMethod())
              .addMethod(getMealRankingMethod())
              .addMethod(getMicroNutrientStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
