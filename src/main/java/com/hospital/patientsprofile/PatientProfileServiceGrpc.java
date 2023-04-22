package com.hospital.patientsprofile;

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
    comments = "Source: patientsprofile.proto")
public final class PatientProfileServiceGrpc {

  private PatientProfileServiceGrpc() {}

  public static final String SERVICE_NAME = "PatientProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetPatientInfoRequest,
      com.hospital.patientsprofile.GetPatientInfoResponse> getGetPatientInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatientInfo",
      requestType = com.hospital.patientsprofile.GetPatientInfoRequest.class,
      responseType = com.hospital.patientsprofile.GetPatientInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetPatientInfoRequest,
      com.hospital.patientsprofile.GetPatientInfoResponse> getGetPatientInfoMethod() {
    io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetPatientInfoRequest, com.hospital.patientsprofile.GetPatientInfoResponse> getGetPatientInfoMethod;
    if ((getGetPatientInfoMethod = PatientProfileServiceGrpc.getGetPatientInfoMethod) == null) {
      synchronized (PatientProfileServiceGrpc.class) {
        if ((getGetPatientInfoMethod = PatientProfileServiceGrpc.getGetPatientInfoMethod) == null) {
          PatientProfileServiceGrpc.getGetPatientInfoMethod = getGetPatientInfoMethod = 
              io.grpc.MethodDescriptor.<com.hospital.patientsprofile.GetPatientInfoRequest, com.hospital.patientsprofile.GetPatientInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientProfileService", "GetPatientInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.patientsprofile.GetPatientInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.patientsprofile.GetPatientInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientProfileServiceMethodDescriptorSupplier("GetPatientInfo"))
                  .build();
          }
        }
     }
     return getGetPatientInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetDailyMealsRequest,
      com.hospital.patientsprofile.GetDailyMealsResponse> getGetDailyMealsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDailyMeals",
      requestType = com.hospital.patientsprofile.GetDailyMealsRequest.class,
      responseType = com.hospital.patientsprofile.GetDailyMealsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetDailyMealsRequest,
      com.hospital.patientsprofile.GetDailyMealsResponse> getGetDailyMealsMethod() {
    io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetDailyMealsRequest, com.hospital.patientsprofile.GetDailyMealsResponse> getGetDailyMealsMethod;
    if ((getGetDailyMealsMethod = PatientProfileServiceGrpc.getGetDailyMealsMethod) == null) {
      synchronized (PatientProfileServiceGrpc.class) {
        if ((getGetDailyMealsMethod = PatientProfileServiceGrpc.getGetDailyMealsMethod) == null) {
          PatientProfileServiceGrpc.getGetDailyMealsMethod = getGetDailyMealsMethod = 
              io.grpc.MethodDescriptor.<com.hospital.patientsprofile.GetDailyMealsRequest, com.hospital.patientsprofile.GetDailyMealsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PatientProfileService", "GetDailyMeals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.patientsprofile.GetDailyMealsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.patientsprofile.GetDailyMealsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientProfileServiceMethodDescriptorSupplier("GetDailyMeals"))
                  .build();
          }
        }
     }
     return getGetDailyMealsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetLunchDetailsRequest,
      com.hospital.patientsprofile.GetLunchDetailsResponse> getGetLunchDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLunchDetails",
      requestType = com.hospital.patientsprofile.GetLunchDetailsRequest.class,
      responseType = com.hospital.patientsprofile.GetLunchDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetLunchDetailsRequest,
      com.hospital.patientsprofile.GetLunchDetailsResponse> getGetLunchDetailsMethod() {
    io.grpc.MethodDescriptor<com.hospital.patientsprofile.GetLunchDetailsRequest, com.hospital.patientsprofile.GetLunchDetailsResponse> getGetLunchDetailsMethod;
    if ((getGetLunchDetailsMethod = PatientProfileServiceGrpc.getGetLunchDetailsMethod) == null) {
      synchronized (PatientProfileServiceGrpc.class) {
        if ((getGetLunchDetailsMethod = PatientProfileServiceGrpc.getGetLunchDetailsMethod) == null) {
          PatientProfileServiceGrpc.getGetLunchDetailsMethod = getGetLunchDetailsMethod = 
              io.grpc.MethodDescriptor.<com.hospital.patientsprofile.GetLunchDetailsRequest, com.hospital.patientsprofile.GetLunchDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientProfileService", "GetLunchDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.patientsprofile.GetLunchDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.patientsprofile.GetLunchDetailsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientProfileServiceMethodDescriptorSupplier("GetLunchDetails"))
                  .build();
          }
        }
     }
     return getGetLunchDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientProfileServiceStub newStub(io.grpc.Channel channel) {
    return new PatientProfileServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PatientProfileServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PatientProfileServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PatientProfileServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPatientInfo(com.hospital.patientsprofile.GetPatientInfoRequest request,
        io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetPatientInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientInfoMethod(), responseObserver);
    }

    /**
     */
    public void getDailyMeals(com.hospital.patientsprofile.GetDailyMealsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetDailyMealsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDailyMealsMethod(), responseObserver);
    }

    /**
     */
    public void getLunchDetails(com.hospital.patientsprofile.GetLunchDetailsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetLunchDetailsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLunchDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPatientInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.patientsprofile.GetPatientInfoRequest,
                com.hospital.patientsprofile.GetPatientInfoResponse>(
                  this, METHODID_GET_PATIENT_INFO)))
          .addMethod(
            getGetDailyMealsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.hospital.patientsprofile.GetDailyMealsRequest,
                com.hospital.patientsprofile.GetDailyMealsResponse>(
                  this, METHODID_GET_DAILY_MEALS)))
          .addMethod(
            getGetLunchDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.patientsprofile.GetLunchDetailsRequest,
                com.hospital.patientsprofile.GetLunchDetailsResponse>(
                  this, METHODID_GET_LUNCH_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class PatientProfileServiceStub extends io.grpc.stub.AbstractStub<PatientProfileServiceStub> {
    private PatientProfileServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientProfileServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientProfileServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientProfileServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPatientInfo(com.hospital.patientsprofile.GetPatientInfoRequest request,
        io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetPatientInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPatientInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDailyMeals(com.hospital.patientsprofile.GetDailyMealsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetDailyMealsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetDailyMealsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLunchDetails(com.hospital.patientsprofile.GetLunchDetailsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetLunchDetailsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLunchDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientProfileServiceBlockingStub extends io.grpc.stub.AbstractStub<PatientProfileServiceBlockingStub> {
    private PatientProfileServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientProfileServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientProfileServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hospital.patientsprofile.GetPatientInfoResponse getPatientInfo(com.hospital.patientsprofile.GetPatientInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPatientInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.hospital.patientsprofile.GetDailyMealsResponse> getDailyMeals(
        com.hospital.patientsprofile.GetDailyMealsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetDailyMealsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hospital.patientsprofile.GetLunchDetailsResponse getLunchDetails(com.hospital.patientsprofile.GetLunchDetailsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLunchDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientProfileServiceFutureStub extends io.grpc.stub.AbstractStub<PatientProfileServiceFutureStub> {
    private PatientProfileServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientProfileServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientProfileServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientProfileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.patientsprofile.GetPatientInfoResponse> getPatientInfo(
        com.hospital.patientsprofile.GetPatientInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPatientInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.patientsprofile.GetLunchDetailsResponse> getLunchDetails(
        com.hospital.patientsprofile.GetLunchDetailsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLunchDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PATIENT_INFO = 0;
  private static final int METHODID_GET_DAILY_MEALS = 1;
  private static final int METHODID_GET_LUNCH_DETAILS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientProfileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientProfileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PATIENT_INFO:
          serviceImpl.getPatientInfo((com.hospital.patientsprofile.GetPatientInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetPatientInfoResponse>) responseObserver);
          break;
        case METHODID_GET_DAILY_MEALS:
          serviceImpl.getDailyMeals((com.hospital.patientsprofile.GetDailyMealsRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetDailyMealsResponse>) responseObserver);
          break;
        case METHODID_GET_LUNCH_DETAILS:
          serviceImpl.getLunchDetails((com.hospital.patientsprofile.GetLunchDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.patientsprofile.GetLunchDetailsResponse>) responseObserver);
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

  private static abstract class PatientProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hospital.patientsprofile.ContinuousAssessment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientProfileService");
    }
  }

  private static final class PatientProfileServiceFileDescriptorSupplier
      extends PatientProfileServiceBaseDescriptorSupplier {
    PatientProfileServiceFileDescriptorSupplier() {}
  }

  private static final class PatientProfileServiceMethodDescriptorSupplier
      extends PatientProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientProfileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientProfileServiceFileDescriptorSupplier())
              .addMethod(getGetPatientInfoMethod())
              .addMethod(getGetDailyMealsMethod())
              .addMethod(getGetLunchDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
