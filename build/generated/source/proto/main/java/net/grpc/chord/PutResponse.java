// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chordNodeService.proto

package net.grpc.chord;

/**
 * Protobuf type {@code chord.PutResponse}
 */
public  final class PutResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chord.PutResponse)
    PutResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PutResponse.newBuilder() to construct.
  private PutResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PutResponse() {
    ret_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PutResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            ret_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.grpc.chord.ChordNodeProto.internal_static_chord_PutResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.grpc.chord.ChordNodeProto.internal_static_chord_PutResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.grpc.chord.PutResponse.class, net.grpc.chord.PutResponse.Builder.class);
  }

  public static final int RET_FIELD_NUMBER = 1;
  private int ret_;
  /**
   * <code>.chord.ReturnCode ret = 1;</code>
   */
  public int getRetValue() {
    return ret_;
  }
  /**
   * <code>.chord.ReturnCode ret = 1;</code>
   */
  public net.grpc.chord.ReturnCode getRet() {
    @SuppressWarnings("deprecation")
    net.grpc.chord.ReturnCode result = net.grpc.chord.ReturnCode.valueOf(ret_);
    return result == null ? net.grpc.chord.ReturnCode.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (ret_ != net.grpc.chord.ReturnCode.SUCCESS.getNumber()) {
      output.writeEnum(1, ret_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ret_ != net.grpc.chord.ReturnCode.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ret_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.grpc.chord.PutResponse)) {
      return super.equals(obj);
    }
    net.grpc.chord.PutResponse other = (net.grpc.chord.PutResponse) obj;

    if (ret_ != other.ret_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RET_FIELD_NUMBER;
    hash = (53 * hash) + ret_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.grpc.chord.PutResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.PutResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.PutResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.PutResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.PutResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.grpc.chord.PutResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.grpc.chord.PutResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.grpc.chord.PutResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.grpc.chord.PutResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.grpc.chord.PutResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.grpc.chord.PutResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.grpc.chord.PutResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.grpc.chord.PutResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code chord.PutResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chord.PutResponse)
      net.grpc.chord.PutResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.grpc.chord.ChordNodeProto.internal_static_chord_PutResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.grpc.chord.ChordNodeProto.internal_static_chord_PutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.grpc.chord.PutResponse.class, net.grpc.chord.PutResponse.Builder.class);
    }

    // Construct using net.grpc.chord.PutResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ret_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.grpc.chord.ChordNodeProto.internal_static_chord_PutResponse_descriptor;
    }

    @java.lang.Override
    public net.grpc.chord.PutResponse getDefaultInstanceForType() {
      return net.grpc.chord.PutResponse.getDefaultInstance();
    }

    @java.lang.Override
    public net.grpc.chord.PutResponse build() {
      net.grpc.chord.PutResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.grpc.chord.PutResponse buildPartial() {
      net.grpc.chord.PutResponse result = new net.grpc.chord.PutResponse(this);
      result.ret_ = ret_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.grpc.chord.PutResponse) {
        return mergeFrom((net.grpc.chord.PutResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.grpc.chord.PutResponse other) {
      if (other == net.grpc.chord.PutResponse.getDefaultInstance()) return this;
      if (other.ret_ != 0) {
        setRetValue(other.getRetValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      net.grpc.chord.PutResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.grpc.chord.PutResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ret_ = 0;
    /**
     * <code>.chord.ReturnCode ret = 1;</code>
     */
    public int getRetValue() {
      return ret_;
    }
    /**
     * <code>.chord.ReturnCode ret = 1;</code>
     */
    public Builder setRetValue(int value) {
      ret_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.chord.ReturnCode ret = 1;</code>
     */
    public net.grpc.chord.ReturnCode getRet() {
      @SuppressWarnings("deprecation")
      net.grpc.chord.ReturnCode result = net.grpc.chord.ReturnCode.valueOf(ret_);
      return result == null ? net.grpc.chord.ReturnCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.chord.ReturnCode ret = 1;</code>
     */
    public Builder setRet(net.grpc.chord.ReturnCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ret_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.chord.ReturnCode ret = 1;</code>
     */
    public Builder clearRet() {
      
      ret_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:chord.PutResponse)
  }

  // @@protoc_insertion_point(class_scope:chord.PutResponse)
  private static final net.grpc.chord.PutResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.grpc.chord.PutResponse();
  }

  public static net.grpc.chord.PutResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PutResponse>
      PARSER = new com.google.protobuf.AbstractParser<PutResponse>() {
    @java.lang.Override
    public PutResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PutResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PutResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PutResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.grpc.chord.PutResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
