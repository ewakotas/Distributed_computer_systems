// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcInterface.proto

public final class GrpcAppProto {
  private GrpcAppProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrpcRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrpcRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrpcResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrpcResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fibRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fibRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fibResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fibResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ByteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ByteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ByteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ByteRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GrpcInterface.proto\"(\n\013GrpcRequest\022\014\n\004" +
      "name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\"\037\n\014GrpcResponse\022" +
      "\017\n\007message\030\001 \001(\t\"&\n\nfibRequest\022\013\n\003pow\030\001 " +
      "\001(\005\022\013\n\003num\030\002 \001(\005\"(\n\013fibResponse\022\013\n\003fib\030\001" +
      " \001(\005\022\014\n\004fib2\030\002 \001(\005\"3\n\014ByteResponse\022\024\n\014nu" +
      "m_of_bytes\030\001 \001(\005\022\r\n\005chunk\030\002 \001(\014\"\031\n\013ByteR" +
      "equest\022\n\n\002id\030\001 \001(\t2\200\002\n\013GrpcService\022.\n\rgr" +
      "pcProcedure\022\014.GrpcRequest\032\r.GrpcResponse" +
      "\"\000\0222\n\017streamProcedure\022\014.GrpcRequest\032\r.Gr" +
      "pcResponse\"\0000\001\022*\n\tstreamFib\022\013.fibRequest" +
      "\032\014.fibResponse\"\0000\001\022.\n\013streamToSrv\022\014.Grpc" +
      "Request\032\r.GrpcResponse\"\000(\001\0221\n\016streamToCl" +
      "ient\022\014.ByteRequest\032\r.ByteResponse\"\0000\001B\026B" +
      "\014GrpcAppProtoP\001\242\002\003GAPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GrpcRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GrpcRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrpcRequest_descriptor,
        new java.lang.String[] { "Name", "Age", });
    internal_static_GrpcResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GrpcResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrpcResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_fibRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_fibRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fibRequest_descriptor,
        new java.lang.String[] { "Pow", "Num", });
    internal_static_fibResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_fibResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fibResponse_descriptor,
        new java.lang.String[] { "Fib", "Fib2", });
    internal_static_ByteResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ByteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ByteResponse_descriptor,
        new java.lang.String[] { "NumOfBytes", "Chunk", });
    internal_static_ByteRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ByteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ByteRequest_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
