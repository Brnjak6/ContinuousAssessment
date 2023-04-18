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

import io.grpc.stub.StreamObserver;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: patientsprofile.proto")
public final class PatientProfileServiceGrpc {

  private PatientProfileServiceGrpc() {}

  public static final String SERVICE_NAME = "PatientProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hospital.CreatePatientProfileRequest,
      com.hospital.CreatePatientProfileResponse> getCreatePatientProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePatientProfile",
      requestType = com.hospital.CreatePatientProfileRequest.class,
      responseType = com.hospital.CreatePatientProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.CreatePatientProfileRequest,
      com.hospital.CreatePatientProfileResponse> getCreatePatientProfileMethod() {
    io.grpc.MethodDescriptor<com.hospital.CreatePatientProfileRequest, com.hospital.CreatePatientProfileResponse> getCreatePatientProfileMethod;
    if ((getCreatePatientProfileMethod = PatientProfileServiceGrpc.getCreatePatientProfileMethod) == null) {
      synchronized (PatientProfileServiceGrpc.class) {
        if ((getCreatePatientProfileMethod = PatientProfileServiceGrpc.getCreatePatientProfileMethod) == null) {
          PatientProfileServiceGrpc.getCreatePatientProfileMethod = getCreatePatientProfileMethod = 
              io.grpc.MethodDescriptor.<com.hospital.CreatePatientProfileRequest, com.hospital.CreatePatientProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientProfileService", "CreatePatientProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.CreatePatientProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.CreatePatientProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientProfileServiceMethodDescriptorSupplier("CreatePatientProfile"))
                  .build();
          }
        }
     }
     return getCreatePatientProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hospital.GetPatientMealsRequest,
      com.hospital.GetPatientMealsResponse> getGetPatientMealsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatientMeals",
      requestType = com.hospital.GetPatientMealsRequest.class,
      responseType = com.hospital.GetPatientMealsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.GetPatientMealsRequest,
      com.hospital.GetPatientMealsResponse> getGetPatientMealsMethod() {
    io.grpc.MethodDescriptor<com.hospital.GetPatientMealsRequest, com.hospital.GetPatientMealsResponse> getGetPatientMealsMethod;
    if ((getGetPatientMealsMethod = PatientProfileServiceGrpc.getGetPatientMealsMethod) == null) {
      synchronized (PatientProfileServiceGrpc.class) {
        if ((getGetPatientMealsMethod = PatientProfileServiceGrpc.getGetPatientMealsMethod) == null) {
          PatientProfileServiceGrpc.getGetPatientMealsMethod = getGetPatientMealsMethod = 
              io.grpc.MethodDescriptor.<com.hospital.GetPatientMealsRequest, com.hospital.GetPatientMealsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientProfileService", "GetPatientMeals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.GetPatientMealsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.GetPatientMealsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientProfileServiceMethodDescriptorSupplier("GetPatientMeals"))
                  .build();
          }
        }
     }
     return getGetPatientMealsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hospital.UpdatePatientMealsRequest,
      com.hospital.UpdatePatientMealsResponse> getUpdatePatientMealsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePatientMeals",
      requestType = com.hospital.UpdatePatientMealsRequest.class,
      responseType = com.hospital.UpdatePatientMealsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hospital.UpdatePatientMealsRequest,
      com.hospital.UpdatePatientMealsResponse> getUpdatePatientMealsMethod() {
    io.grpc.MethodDescriptor<com.hospital.UpdatePatientMealsRequest, com.hospital.UpdatePatientMealsResponse> getUpdatePatientMealsMethod;
    if ((getUpdatePatientMealsMethod = PatientProfileServiceGrpc.getUpdatePatientMealsMethod) == null) {
      synchronized (PatientProfileServiceGrpc.class) {
        if ((getUpdatePatientMealsMethod = PatientProfileServiceGrpc.getUpdatePatientMealsMethod) == null) {
          PatientProfileServiceGrpc.getUpdatePatientMealsMethod = getUpdatePatientMealsMethod = 
              io.grpc.MethodDescriptor.<com.hospital.UpdatePatientMealsRequest, com.hospital.UpdatePatientMealsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientProfileService", "UpdatePatientMeals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.UpdatePatientMealsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hospital.UpdatePatientMealsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientProfileServiceMethodDescriptorSupplier("UpdatePatientMeals"))
                  .build();
          }
        }
     }
     return getUpdatePatientMealsMethod;
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
    public void createPatientProfile(com.hospital.CreatePatientProfileRequest request,
        io.grpc.stub.StreamObserver<com.hospital.CreatePatientProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePatientProfileMethod(), responseObserver);
    }

    /**
     */
    public void getPatientMeals(com.hospital.GetPatientMealsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.GetPatientMealsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientMealsMethod(), responseObserver);
    }

    /**
     */
    public void updatePatientMeals(com.hospital.UpdatePatientMealsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.UpdatePatientMealsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePatientMealsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePatientProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.CreatePatientProfileRequest,
                com.hospital.CreatePatientProfileResponse>(
                  this, METHODID_CREATE_PATIENT_PROFILE)))
          .addMethod(
            getGetPatientMealsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.GetPatientMealsRequest,
                com.hospital.GetPatientMealsResponse>(
                  this, METHODID_GET_PATIENT_MEALS)))
          .addMethod(
            getUpdatePatientMealsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hospital.UpdatePatientMealsRequest,
                com.hospital.UpdatePatientMealsResponse>(
                  this, METHODID_UPDATE_PATIENT_MEALS)))
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
    public void createPatientProfile(com.hospital.CreatePatientProfileRequest request,
        io.grpc.stub.StreamObserver<com.hospital.CreatePatientProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePatientProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPatientMeals(com.hospital.GetPatientMealsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.GetPatientMealsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPatientMealsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePatientMeals(com.hospital.UpdatePatientMealsRequest request,
        io.grpc.stub.StreamObserver<com.hospital.UpdatePatientMealsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePatientMealsMethod(), getCallOptions()), request, responseObserver);
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
    public com.hospital.CreatePatientProfileResponse createPatientProfile(com.hospital.CreatePatientProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePatientProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hospital.GetPatientMealsResponse getPatientMeals(com.hospital.GetPatientMealsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPatientMealsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hospital.UpdatePatientMealsResponse updatePatientMeals(com.hospital.UpdatePatientMealsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePatientMealsMethod(), getCallOptions(), request);
    }

	public StreamObserver<UpdatePatientMealsRequest> updatePatientMeals(
			StreamObserver<UpdatePatientMealsResponse> streamObserver) {
		// TODO Auto-generated method stub
		return null;
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
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.CreatePatientProfileResponse> createPatientProfile(
        com.hospital.CreatePatientProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePatientProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.GetPatientMealsResponse> getPatientMeals(
        com.hospital.GetPatientMealsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPatientMealsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hospital.UpdatePatientMealsResponse> updatePatientMeals(
        com.hospital.UpdatePatientMealsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePatientMealsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PATIENT_PROFILE = 0;
  private static final int METHODID_GET_PATIENT_MEALS = 1;
  private static final int METHODID_UPDATE_PATIENT_MEALS = 2;

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
        case METHODID_CREATE_PATIENT_PROFILE:
          serviceImpl.createPatientProfile((com.hospital.CreatePatientProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.CreatePatientProfileResponse>) responseObserver);
          break;
        case METHODID_GET_PATIENT_MEALS:
          serviceImpl.getPatientMeals((com.hospital.GetPatientMealsRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.GetPatientMealsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PATIENT_MEALS:
          serviceImpl.updatePatientMeals((com.hospital.UpdatePatientMealsRequest) request,
              (io.grpc.stub.StreamObserver<com.hospital.UpdatePatientMealsResponse>) responseObserver);
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
      return com.hospital.ContinuousAssessment.getDescriptor();
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
              .addMethod(getCreatePatientProfileMethod())
              .addMethod(getGetPatientMealsMethod())
              .addMethod(getUpdatePatientMealsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
