// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: portioncalculator.proto

package com.hospital;

/**
 * Protobuf type {@code DailyMealsResponse}
 */
public  final class DailyMealsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DailyMealsResponse)
    DailyMealsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DailyMealsResponse.newBuilder() to construct.
  private DailyMealsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DailyMealsResponse() {
    meals_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DailyMealsResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              meals_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            meals_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        meals_ = meals_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hospital.ContinuousAssessment.internal_static_DailyMealsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hospital.ContinuousAssessment.internal_static_DailyMealsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hospital.DailyMealsResponse.class, com.hospital.DailyMealsResponse.Builder.class);
  }

  public static final int MEALS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList meals_;
  /**
   * <code>repeated string meals = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMealsList() {
    return meals_;
  }
  /**
   * <code>repeated string meals = 1;</code>
   */
  public int getMealsCount() {
    return meals_.size();
  }
  /**
   * <code>repeated string meals = 1;</code>
   */
  public java.lang.String getMeals(int index) {
    return meals_.get(index);
  }
  /**
   * <code>repeated string meals = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMealsBytes(int index) {
    return meals_.getByteString(index);
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
    for (int i = 0; i < meals_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, meals_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < meals_.size(); i++) {
        dataSize += computeStringSizeNoTag(meals_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMealsList().size();
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
    if (!(obj instanceof com.hospital.DailyMealsResponse)) {
      return super.equals(obj);
    }
    com.hospital.DailyMealsResponse other = (com.hospital.DailyMealsResponse) obj;

    boolean result = true;
    result = result && getMealsList()
        .equals(other.getMealsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMealsCount() > 0) {
      hash = (37 * hash) + MEALS_FIELD_NUMBER;
      hash = (53 * hash) + getMealsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hospital.DailyMealsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.DailyMealsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.DailyMealsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.DailyMealsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.DailyMealsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.DailyMealsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.DailyMealsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hospital.DailyMealsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hospital.DailyMealsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hospital.DailyMealsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hospital.DailyMealsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hospital.DailyMealsResponse parseFrom(
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
  public static Builder newBuilder(com.hospital.DailyMealsResponse prototype) {
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
   * Protobuf type {@code DailyMealsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DailyMealsResponse)
      com.hospital.DailyMealsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hospital.ContinuousAssessment.internal_static_DailyMealsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hospital.ContinuousAssessment.internal_static_DailyMealsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hospital.DailyMealsResponse.class, com.hospital.DailyMealsResponse.Builder.class);
    }

    // Construct using com.hospital.DailyMealsResponse.newBuilder()
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
      meals_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hospital.ContinuousAssessment.internal_static_DailyMealsResponse_descriptor;
    }

    @java.lang.Override
    public com.hospital.DailyMealsResponse getDefaultInstanceForType() {
      return com.hospital.DailyMealsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hospital.DailyMealsResponse build() {
      com.hospital.DailyMealsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hospital.DailyMealsResponse buildPartial() {
      com.hospital.DailyMealsResponse result = new com.hospital.DailyMealsResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        meals_ = meals_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.meals_ = meals_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hospital.DailyMealsResponse) {
        return mergeFrom((com.hospital.DailyMealsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hospital.DailyMealsResponse other) {
      if (other == com.hospital.DailyMealsResponse.getDefaultInstance()) return this;
      if (!other.meals_.isEmpty()) {
        if (meals_.isEmpty()) {
          meals_ = other.meals_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMealsIsMutable();
          meals_.addAll(other.meals_);
        }
        onChanged();
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
      com.hospital.DailyMealsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hospital.DailyMealsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList meals_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMealsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        meals_ = new com.google.protobuf.LazyStringArrayList(meals_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMealsList() {
      return meals_.getUnmodifiableView();
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public int getMealsCount() {
      return meals_.size();
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public java.lang.String getMeals(int index) {
      return meals_.get(index);
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMealsBytes(int index) {
      return meals_.getByteString(index);
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public Builder setMeals(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMealsIsMutable();
      meals_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public Builder addMeals(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMealsIsMutable();
      meals_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public Builder addAllMeals(
        java.lang.Iterable<java.lang.String> values) {
      ensureMealsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, meals_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public Builder clearMeals() {
      meals_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meals = 1;</code>
     */
    public Builder addMealsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMealsIsMutable();
      meals_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:DailyMealsResponse)
  }

  // @@protoc_insertion_point(class_scope:DailyMealsResponse)
  private static final com.hospital.DailyMealsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hospital.DailyMealsResponse();
  }

  public static com.hospital.DailyMealsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DailyMealsResponse>
      PARSER = new com.google.protobuf.AbstractParser<DailyMealsResponse>() {
    @java.lang.Override
    public DailyMealsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DailyMealsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DailyMealsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DailyMealsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hospital.DailyMealsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

