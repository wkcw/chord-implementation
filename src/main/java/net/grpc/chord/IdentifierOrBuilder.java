// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

public interface IdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chord.Identifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string IP = 1;</code>
   */
  String getIP();
  /**
   * <code>string IP = 1;</code>
   */
  com.google.protobuf.ByteString
      getIPBytes();

  /**
   * <code>int32 port = 2;</code>
   */
  int getPort();

  /**
   * <code>int32 ID = 3;</code>
   */
  int getID();

  /**
   * <code>.chord.Identifier predecessor = 4;</code>
   */
  boolean hasPredecessor();
  /**
   * <code>.chord.Identifier predecessor = 4;</code>
   */
  Identifier getPredecessor();
  /**
   * <code>.chord.Identifier predecessor = 4;</code>
   */
  IdentifierOrBuilder getPredecessorOrBuilder();

  /**
   * <code>.chord.Identifier successor = 5;</code>
   */
  boolean hasSuccessor();
  /**
   * <code>.chord.Identifier successor = 5;</code>
   */
  Identifier getSuccessor();
  /**
   * <code>.chord.Identifier successor = 5;</code>
   */
  IdentifierOrBuilder getSuccessorOrBuilder();
}
