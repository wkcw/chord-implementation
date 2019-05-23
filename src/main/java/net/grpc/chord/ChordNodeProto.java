// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

public final class ChordNodeProto {
  private ChordNodeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_NullRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_NullRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_NullResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_NullResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_NotifyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_NotifyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_NotifyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_NotifyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_FindSuccessorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_FindSuccessorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_FindSuccessorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_FindSuccessorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_TellmePredecessorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_TellmePredecessorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_TellmePredecessorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_TellmePredecessorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chord_Identifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chord_Identifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026chordNodeService.proto\022\005chord\"\r\n\013NullR" +
      "equest\"\016\n\014NullResponse\"6\n\rNotifyRequest\022" +
      "%\n\nidentifier\030\001 \001(\0132\021.chord.Identifier\"-" +
      "\n\016NotifyResponse\022\017\n\007address\030\001 \001(\t\022\n\n\002ID\030" +
      "\002 \001(\005\"\"\n\024FindSuccessorRequest\022\n\n\002ID\030\001 \001(" +
      "\005\">\n\025FindSuccessorResponse\022%\n\nidentifier" +
      "\030\001 \001(\0132\021.chord.Identifier\"&\n\030TellmePrede" +
      "cessorRequest\022\n\n\002ID\030\001 \001(\005\"B\n\031TellmePrede" +
      "cessorResponse\022%\n\nidentifier\030\001 \001(\0132\021.cho" +
      "rd.Identifier\"\200\001\n\nIdentifier\022\n\n\002IP\030\001 \001(\t" +
      "\022\014\n\004port\030\002 \001(\005\022\n\n\002ID\030\003 \001(\005\022&\n\013predecesso" +
      "r\030\004 \001(\0132\021.chord.Identifier\022$\n\tsuccessor\030" +
      "\005 \001(\0132\021.chord.Identifier2\246\002\n\020ChordNodeSe" +
      "rvice\0227\n\006Notify\022\024.chord.NotifyRequest\032\025." +
      "chord.NotifyResponse\"\000\022L\n\rFindSuccessor\022" +
      "\033.chord.FindSuccessorRequest\032\034.chord.Fin" +
      "dSuccessorResponse\"\000\022X\n\021TellmePredecesso" +
      "r\022\037.chord.TellmePredecessorRequest\032 .cho" +
      "rd.TellmePredecessorResponse\"\000\0221\n\004Ping\022\022" +
      ".chord.NullRequest\032\023.chord.NullResponse\"" +
      "\000B\'\n\016net.grpc.chordB\016ChordNodeProtoP\001\242\002\002" +
      "CNb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_chord_NullRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chord_NullRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_NullRequest_descriptor,
        new String[] { });
    internal_static_chord_NullResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chord_NullResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_NullResponse_descriptor,
        new String[] { });
    internal_static_chord_NotifyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chord_NotifyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_NotifyRequest_descriptor,
        new String[] { "Identifier", });
    internal_static_chord_NotifyResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chord_NotifyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_NotifyResponse_descriptor,
        new String[] { "Address", "ID", });
    internal_static_chord_FindSuccessorRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chord_FindSuccessorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_FindSuccessorRequest_descriptor,
        new String[] { "ID", });
    internal_static_chord_FindSuccessorResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chord_FindSuccessorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_FindSuccessorResponse_descriptor,
        new String[] { "Identifier", });
    internal_static_chord_TellmePredecessorRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chord_TellmePredecessorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_TellmePredecessorRequest_descriptor,
        new String[] { "ID", });
    internal_static_chord_TellmePredecessorResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chord_TellmePredecessorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_TellmePredecessorResponse_descriptor,
        new String[] { "Identifier", });
    internal_static_chord_Identifier_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_chord_Identifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chord_Identifier_descriptor,
        new String[] { "IP", "Port", "ID", "Predecessor", "Successor", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
