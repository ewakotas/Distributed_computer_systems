import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: GrpcInterface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GrpcServiceGrpc {

  private GrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "GrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcRequest,
      GrpcResponse> getGrpcProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "grpcProcedure",
      requestType = GrpcRequest.class,
      responseType = GrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcRequest,
      GrpcResponse> getGrpcProcedureMethod() {
    io.grpc.MethodDescriptor<GrpcRequest, GrpcResponse> getGrpcProcedureMethod;
    if ((getGrpcProcedureMethod = GrpcServiceGrpc.getGrpcProcedureMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getGrpcProcedureMethod = GrpcServiceGrpc.getGrpcProcedureMethod) == null) {
          GrpcServiceGrpc.getGrpcProcedureMethod = getGrpcProcedureMethod =
              io.grpc.MethodDescriptor.<GrpcRequest, GrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "grpcProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("grpcProcedure"))
              .build();
        }
      }
    }
    return getGrpcProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcRequest,
      GrpcResponse> getStreamProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamProcedure",
      requestType = GrpcRequest.class,
      responseType = GrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcRequest,
      GrpcResponse> getStreamProcedureMethod() {
    io.grpc.MethodDescriptor<GrpcRequest, GrpcResponse> getStreamProcedureMethod;
    if ((getStreamProcedureMethod = GrpcServiceGrpc.getStreamProcedureMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getStreamProcedureMethod = GrpcServiceGrpc.getStreamProcedureMethod) == null) {
          GrpcServiceGrpc.getStreamProcedureMethod = getStreamProcedureMethod =
              io.grpc.MethodDescriptor.<GrpcRequest, GrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("streamProcedure"))
              .build();
        }
      }
    }
    return getStreamProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fibRequest,
      fibResponse> getStreamFibMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamFib",
      requestType = fibRequest.class,
      responseType = fibResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<fibRequest,
      fibResponse> getStreamFibMethod() {
    io.grpc.MethodDescriptor<fibRequest, fibResponse> getStreamFibMethod;
    if ((getStreamFibMethod = GrpcServiceGrpc.getStreamFibMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getStreamFibMethod = GrpcServiceGrpc.getStreamFibMethod) == null) {
          GrpcServiceGrpc.getStreamFibMethod = getStreamFibMethod =
              io.grpc.MethodDescriptor.<fibRequest, fibResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamFib"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fibRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fibResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("streamFib"))
              .build();
        }
      }
    }
    return getStreamFibMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcRequest,
      GrpcResponse> getStreamToSrvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamToSrv",
      requestType = GrpcRequest.class,
      responseType = GrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcRequest,
      GrpcResponse> getStreamToSrvMethod() {
    io.grpc.MethodDescriptor<GrpcRequest, GrpcResponse> getStreamToSrvMethod;
    if ((getStreamToSrvMethod = GrpcServiceGrpc.getStreamToSrvMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getStreamToSrvMethod = GrpcServiceGrpc.getStreamToSrvMethod) == null) {
          GrpcServiceGrpc.getStreamToSrvMethod = getStreamToSrvMethod =
              io.grpc.MethodDescriptor.<GrpcRequest, GrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamToSrv"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("streamToSrv"))
              .build();
        }
      }
    }
    return getStreamToSrvMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceStub>() {
        @java.lang.Override
        public GrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceStub(channel, callOptions);
        }
      };
    return GrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceBlockingStub>() {
        @java.lang.Override
        public GrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return GrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceFutureStub>() {
        @java.lang.Override
        public GrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceFutureStub(channel, callOptions);
        }
      };
    return GrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GrpcServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Greeting procedure
     * </pre>
     */
    public void grpcProcedure(GrpcRequest request,
        io.grpc.stub.StreamObserver<GrpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrpcProcedureMethod(), responseObserver);
    }

    /**
     */
    public void streamProcedure(GrpcRequest request,
        io.grpc.stub.StreamObserver<GrpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamProcedureMethod(), responseObserver);
    }

    /**
     */
    public void streamFib(fibRequest request,
        io.grpc.stub.StreamObserver<fibResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamFibMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<GrpcRequest> streamToSrv(
        io.grpc.stub.StreamObserver<GrpcResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamToSrvMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGrpcProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcRequest,
                GrpcResponse>(
                  this, METHODID_GRPC_PROCEDURE)))
          .addMethod(
            getStreamProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcRequest,
                GrpcResponse>(
                  this, METHODID_STREAM_PROCEDURE)))
          .addMethod(
            getStreamFibMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                fibRequest,
                fibResponse>(
                  this, METHODID_STREAM_FIB)))
          .addMethod(
            getStreamToSrvMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                GrpcRequest,
                GrpcResponse>(
                  this, METHODID_STREAM_TO_SRV)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<GrpcServiceStub> {
    private GrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Greeting procedure
     * </pre>
     */
    public void grpcProcedure(GrpcRequest request,
        io.grpc.stub.StreamObserver<GrpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrpcProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamProcedure(GrpcRequest request,
        io.grpc.stub.StreamObserver<GrpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamFib(fibRequest request,
        io.grpc.stub.StreamObserver<fibResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamFibMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<GrpcRequest> streamToSrv(
        io.grpc.stub.StreamObserver<GrpcResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamToSrvMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcServiceBlockingStub> {
    private GrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Greeting procedure
     * </pre>
     */
    public GrpcResponse grpcProcedure(GrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrpcProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcResponse> streamProcedure(
        GrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<fibResponse> streamFib(
        fibRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamFibMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcServiceFutureStub> {
    private GrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Greeting procedure
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcResponse> grpcProcedure(
        GrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrpcProcedureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRPC_PROCEDURE = 0;
  private static final int METHODID_STREAM_PROCEDURE = 1;
  private static final int METHODID_STREAM_FIB = 2;
  private static final int METHODID_STREAM_TO_SRV = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRPC_PROCEDURE:
          serviceImpl.grpcProcedure((GrpcRequest) request,
              (io.grpc.stub.StreamObserver<GrpcResponse>) responseObserver);
          break;
        case METHODID_STREAM_PROCEDURE:
          serviceImpl.streamProcedure((GrpcRequest) request,
              (io.grpc.stub.StreamObserver<GrpcResponse>) responseObserver);
          break;
        case METHODID_STREAM_FIB:
          serviceImpl.streamFib((fibRequest) request,
              (io.grpc.stub.StreamObserver<fibResponse>) responseObserver);
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
        case METHODID_STREAM_TO_SRV:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamToSrv(
              (io.grpc.stub.StreamObserver<GrpcResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcAppProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcService");
    }
  }

  private static final class GrpcServiceFileDescriptorSupplier
      extends GrpcServiceBaseDescriptorSupplier {
    GrpcServiceFileDescriptorSupplier() {}
  }

  private static final class GrpcServiceMethodDescriptorSupplier
      extends GrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcServiceFileDescriptorSupplier())
              .addMethod(getGrpcProcedureMethod())
              .addMethod(getStreamProcedureMethod())
              .addMethod(getStreamFibMethod())
              .addMethod(getStreamToSrvMethod())
              .build();
        }
      }
    }
    return result;
  }
}
