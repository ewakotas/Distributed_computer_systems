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
      " \001(\005\022\014\n\004fib2\030\002 \001(\0052\235\001\n\013GrpcService\022.\n\rgr" +
      "pcProcedure\022\014.GrpcRequest\032\r.GrpcResponse" +
      "\"\000\0222\n\017streamProcedure\022\014.GrpcRequest\032\r.Gr" +
      "pcResponse\"\0000\001\022*\n\tstreamFib\022\013.fibRequest" +
      "\032\014.fibResponse\"\0000\001B\026B\014GrpcAppProtoP\001\242\002\003G" +
      "APb\006proto3"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}