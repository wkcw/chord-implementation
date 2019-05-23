package net.grpc.chord;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: chordNodeService.proto")
public final class ChordNodeServiceGrpc {

  private ChordNodeServiceGrpc() {}

  public static final String SERVICE_NAME = "chord.ChordNodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<NotifyRequest,
      NotifyResponse> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Notify",
      requestType = NotifyRequest.class,
      responseType = NotifyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<NotifyRequest,
      NotifyResponse> getNotifyMethod() {
    io.grpc.MethodDescriptor<NotifyRequest, NotifyResponse> getNotifyMethod;
    if ((getNotifyMethod = ChordNodeServiceGrpc.getNotifyMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getNotifyMethod = ChordNodeServiceGrpc.getNotifyMethod) == null) {
          ChordNodeServiceGrpc.getNotifyMethod = getNotifyMethod =
              io.grpc.MethodDescriptor.<NotifyRequest, NotifyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "Notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NotifyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("Notify"))
                  .build();
          }
        }
     }
     return getNotifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<FindSuccessorRequest,
      FindSuccessorResponse> getFindSuccessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindSuccessor",
      requestType = FindSuccessorRequest.class,
      responseType = FindSuccessorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FindSuccessorRequest,
      FindSuccessorResponse> getFindSuccessorMethod() {
    io.grpc.MethodDescriptor<FindSuccessorRequest, FindSuccessorResponse> getFindSuccessorMethod;
    if ((getFindSuccessorMethod = ChordNodeServiceGrpc.getFindSuccessorMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getFindSuccessorMethod = ChordNodeServiceGrpc.getFindSuccessorMethod) == null) {
          ChordNodeServiceGrpc.getFindSuccessorMethod = getFindSuccessorMethod =
              io.grpc.MethodDescriptor.<FindSuccessorRequest, FindSuccessorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "FindSuccessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FindSuccessorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FindSuccessorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("FindSuccessor"))
                  .build();
          }
        }
     }
     return getFindSuccessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TellmePredecessorRequest,
      TellmePredecessorResponse> getTellmePredecessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TellmePredecessor",
      requestType = TellmePredecessorRequest.class,
      responseType = TellmePredecessorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TellmePredecessorRequest,
      TellmePredecessorResponse> getTellmePredecessorMethod() {
    io.grpc.MethodDescriptor<TellmePredecessorRequest, TellmePredecessorResponse> getTellmePredecessorMethod;
    if ((getTellmePredecessorMethod = ChordNodeServiceGrpc.getTellmePredecessorMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getTellmePredecessorMethod = ChordNodeServiceGrpc.getTellmePredecessorMethod) == null) {
          ChordNodeServiceGrpc.getTellmePredecessorMethod = getTellmePredecessorMethod =
              io.grpc.MethodDescriptor.<TellmePredecessorRequest, TellmePredecessorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "TellmePredecessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TellmePredecessorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TellmePredecessorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("TellmePredecessor"))
                  .build();
          }
        }
     }
     return getTellmePredecessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<NullRequest,
      NullResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = NullRequest.class,
      responseType = NullResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<NullRequest,
      NullResponse> getPingMethod() {
    io.grpc.MethodDescriptor<NullRequest, NullResponse> getPingMethod;
    if ((getPingMethod = ChordNodeServiceGrpc.getPingMethod) == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        if ((getPingMethod = ChordNodeServiceGrpc.getPingMethod) == null) {
          ChordNodeServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<NullRequest, NullResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chord.ChordNodeService", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NullRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NullResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChordNodeServiceMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChordNodeServiceStub newStub(io.grpc.Channel channel) {
    return new ChordNodeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChordNodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChordNodeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChordNodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChordNodeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChordNodeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void notify(NotifyRequest request,
                       io.grpc.stub.StreamObserver<NotifyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    /**
     */
    public void findSuccessor(FindSuccessorRequest request,
                              io.grpc.stub.StreamObserver<FindSuccessorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindSuccessorMethod(), responseObserver);
    }

    /**
     */
    public void tellmePredecessor(TellmePredecessorRequest request,
                                  io.grpc.stub.StreamObserver<TellmePredecessorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTellmePredecessorMethod(), responseObserver);
    }

    /**
     */
    public void ping(NullRequest request,
                     io.grpc.stub.StreamObserver<NullResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                NotifyRequest,
                NotifyResponse>(
                  this, METHODID_NOTIFY)))
          .addMethod(
            getFindSuccessorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                FindSuccessorRequest,
                FindSuccessorResponse>(
                  this, METHODID_FIND_SUCCESSOR)))
          .addMethod(
            getTellmePredecessorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                TellmePredecessorRequest,
                TellmePredecessorResponse>(
                  this, METHODID_TELLME_PREDECESSOR)))
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                NullRequest,
                NullResponse>(
                  this, METHODID_PING)))
          .build();
    }
  }

  /**
   */
  public static final class ChordNodeServiceStub extends io.grpc.stub.AbstractStub<ChordNodeServiceStub> {
    private ChordNodeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordNodeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChordNodeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordNodeServiceStub(channel, callOptions);
    }

    /**
     */
    public void notify(NotifyRequest request,
                       io.grpc.stub.StreamObserver<NotifyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findSuccessor(FindSuccessorRequest request,
                              io.grpc.stub.StreamObserver<FindSuccessorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindSuccessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tellmePredecessor(TellmePredecessorRequest request,
                                  io.grpc.stub.StreamObserver<TellmePredecessorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTellmePredecessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ping(NullRequest request,
                     io.grpc.stub.StreamObserver<NullResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChordNodeServiceBlockingStub extends io.grpc.stub.AbstractStub<ChordNodeServiceBlockingStub> {
    private ChordNodeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordNodeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChordNodeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordNodeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public NotifyResponse notify(NotifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public FindSuccessorResponse findSuccessor(FindSuccessorRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindSuccessorMethod(), getCallOptions(), request);
    }

    /**
     */
    public TellmePredecessorResponse tellmePredecessor(TellmePredecessorRequest request) {
      return blockingUnaryCall(
          getChannel(), getTellmePredecessorMethod(), getCallOptions(), request);
    }

    /**
     */
    public NullResponse ping(NullRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChordNodeServiceFutureStub extends io.grpc.stub.AbstractStub<ChordNodeServiceFutureStub> {
    private ChordNodeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChordNodeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChordNodeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChordNodeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<NotifyResponse> notify(
        NotifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<FindSuccessorResponse> findSuccessor(
        FindSuccessorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindSuccessorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TellmePredecessorResponse> tellmePredecessor(
        TellmePredecessorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTellmePredecessorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<NullResponse> ping(
        NullRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY = 0;
  private static final int METHODID_FIND_SUCCESSOR = 1;
  private static final int METHODID_TELLME_PREDECESSOR = 2;
  private static final int METHODID_PING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChordNodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChordNodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY:
          serviceImpl.notify((NotifyRequest) request,
              (io.grpc.stub.StreamObserver<NotifyResponse>) responseObserver);
          break;
        case METHODID_FIND_SUCCESSOR:
          serviceImpl.findSuccessor((FindSuccessorRequest) request,
              (io.grpc.stub.StreamObserver<FindSuccessorResponse>) responseObserver);
          break;
        case METHODID_TELLME_PREDECESSOR:
          serviceImpl.tellmePredecessor((TellmePredecessorRequest) request,
              (io.grpc.stub.StreamObserver<TellmePredecessorResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((NullRequest) request,
              (io.grpc.stub.StreamObserver<NullResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChordNodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChordNodeServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ChordNodeProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChordNodeService");
    }
  }

  private static final class ChordNodeServiceFileDescriptorSupplier
      extends ChordNodeServiceBaseDescriptorSupplier {
    ChordNodeServiceFileDescriptorSupplier() {}
  }

  private static final class ChordNodeServiceMethodDescriptorSupplier
      extends ChordNodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChordNodeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChordNodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChordNodeServiceFileDescriptorSupplier())
              .addMethod(getNotifyMethod())
              .addMethod(getFindSuccessorMethod())
              .addMethod(getTellmePredecessorMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}