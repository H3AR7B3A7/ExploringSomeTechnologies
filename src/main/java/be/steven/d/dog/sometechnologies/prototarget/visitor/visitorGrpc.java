package be.steven.d.dog.sometechnologies.prototarget.visitor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: visitor.proto")
public final class visitorGrpc {

  private visitorGrpc() {}

  public static final String SERVICE_NAME = "visitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest,
      be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest.class,
      responseType = be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest,
      be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest, be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> getLoginMethod;
    if ((getLoginMethod = visitorGrpc.getLoginMethod) == null) {
      synchronized (visitorGrpc.class) {
        if ((getLoginMethod = visitorGrpc.getLoginMethod) == null) {
          visitorGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest, be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new visitorMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty,
      be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty.class,
      responseType = be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty,
      be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty, be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = visitorGrpc.getLogoutMethod) == null) {
      synchronized (visitorGrpc.class) {
        if ((getLogoutMethod = visitorGrpc.getLogoutMethod) == null) {
          visitorGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty, be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new visitorMethodDescriptorSupplier("logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static visitorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<visitorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<visitorStub>() {
        @java.lang.Override
        public visitorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new visitorStub(channel, callOptions);
        }
      };
    return visitorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static visitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<visitorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<visitorBlockingStub>() {
        @java.lang.Override
        public visitorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new visitorBlockingStub(channel, callOptions);
        }
      };
    return visitorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static visitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<visitorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<visitorFutureStub>() {
        @java.lang.Override
        public visitorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new visitorFutureStub(channel, callOptions);
        }
      };
    return visitorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class visitorImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest request,
        io.grpc.stub.StreamObserver<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty request,
        io.grpc.stub.StreamObserver<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest,
                be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty,
                be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class visitorStub extends io.grpc.stub.AbstractAsyncStub<visitorStub> {
    private visitorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected visitorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new visitorStub(channel, callOptions);
    }

    /**
     */
    public void login(be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest request,
        io.grpc.stub.StreamObserver<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty request,
        io.grpc.stub.StreamObserver<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class visitorBlockingStub extends io.grpc.stub.AbstractBlockingStub<visitorBlockingStub> {
    private visitorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected visitorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new visitorBlockingStub(channel, callOptions);
    }

    /**
     */
    public be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse login(be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse logout(be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class visitorFutureStub extends io.grpc.stub.AbstractFutureStub<visitorFutureStub> {
    private visitorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected visitorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new visitorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> login(
        be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse> logout(
        be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final visitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(visitorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.LoginRequest) request,
              (io.grpc.stub.StreamObserver<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.Empty) request,
              (io.grpc.stub.StreamObserver<be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.APIResponse>) responseObserver);
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

  private static abstract class visitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    visitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("visitor");
    }
  }

  private static final class visitorFileDescriptorSupplier
      extends visitorBaseDescriptorSupplier {
    visitorFileDescriptorSupplier() {}
  }

  private static final class visitorMethodDescriptorSupplier
      extends visitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    visitorMethodDescriptorSupplier(String methodName) {
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
      synchronized (visitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new visitorFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
