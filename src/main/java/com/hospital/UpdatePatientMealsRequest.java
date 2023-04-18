// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patientsprofile.proto

package com.hospital;

/**
 * Protobuf type {@code UpdatePatientMealsRequest}
 */
public  final class UpdatePatientMealsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdatePatientMealsRequest)
    UpdatePatientMealsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePatientMealsRequest.newBuilder() to construct.
  private UpdatePatientMealsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePatientMealsRequest() {
    patientId_ = "";
    meals_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdatePatientMealsRequest(
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

            patientId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              meals_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        meals_ = meals_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hospital.ContinuousAssessment.internal_static_UpdatePatientMealsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hospital.ContinuousAssessment.internal_static_UpdatePatientMealsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hospital.UpdatePatientMealsRequest.class, com.hospital.UpdatePatientMealsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PATIENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object patientId_;
  /**
   * <code>string patient_id = 1;</code>
   */
  public java.lang.String getPatientId() {
    java.lang.Object ref = patientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      patientId_ = s;
      return s;
    }
  }
  /**
   * <code>string patient_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPatientIdBytes() {
    java.lang.Object ref = patientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      patientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEALS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList meals_;
  /**
   * <code>repeated string meals = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMealsList() {
    return meals_;
  }
  /**
   * <code>repeated string meals = 2;</code>
   */
  public int getMealsCount() {
    return meals_.size();
  }
  /**
   * <code>repeated string meals = 2;</code>
   */
  public java.lang.String getMeals(int index) {
    return meals_.get(index);
  }
  /**
   * <code>repeated string meals = 2;</code>
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
    if (!getPatientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, patientId_);
    }
    for (int i = 0; i < meals_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, meals_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPatientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, patientId_);
    }
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
    if (!(obj instanceof com.hospital.UpdatePatientMealsRequest)) {
      return super.equals(obj);
    }
    com.hospital.UpdatePatientMealsRequest other = (com.hospital.UpdatePatientMealsRequest) obj;

    boolean result = true;
    result = result && getPatientId()
        .equals(other.getPatientId());
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
    hash = (37 * hash) + PATIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPatientId().hashCode();
    if (getMealsCount() > 0) {
      hash = (37 * hash) + MEALS_FIELD_NUMBER;
      hash = (53 * hash) + getMealsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hospital.UpdatePatientMealsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hospital.UpdatePatientMealsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hospital.UpdatePatientMealsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hospital.UpdatePatientMealsRequest parseFrom(
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
  public static Builder newBuilder(com.hospital.UpdatePatientMealsRequest prototype) {
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
   * Protobuf type {@code UpdatePatientMealsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdatePatientMealsRequest)
      com.hospital.UpdatePatientMealsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hospital.ContinuousAssessment.internal_static_UpdatePatientMealsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hospital.ContinuousAssessment.internal_static_UpdatePatientMealsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hospital.UpdatePatientMealsRequest.class, com.hospital.UpdatePatientMealsRequest.Builder.class);
    }

    // Construct using com.hospital.UpdatePatientMealsRequest.newBuilder()
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
      patientId_ = "";

      meals_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hospital.ContinuousAssessment.internal_static_UpdatePatientMealsRequest_descriptor;
    }

    @java.lang.Override
    public com.hospital.UpdatePatientMealsRequest getDefaultInstanceForType() {
      return com.hospital.UpdatePatientMealsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hospital.UpdatePatientMealsRequest build() {
      com.hospital.UpdatePatientMealsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hospital.UpdatePatientMealsRequest buildPartial() {
      com.hospital.UpdatePatientMealsRequest result = new com.hospital.UpdatePatientMealsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.patientId_ = patientId_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        meals_ = meals_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.meals_ = meals_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.hospital.UpdatePatientMealsRequest) {
        return mergeFrom((com.hospital.UpdatePatientMealsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hospital.UpdatePatientMealsRequest other) {
      if (other == com.hospital.UpdatePatientMealsRequest.getDefaultInstance()) return this;
      if (!other.getPatientId().isEmpty()) {
        patientId_ = other.patientId_;
        onChanged();
      }
      if (!other.meals_.isEmpty()) {
        if (meals_.isEmpty()) {
          meals_ = other.meals_;
          bitField0_ = (bitField0_ & ~0x00000002);
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
      com.hospital.UpdatePatientMealsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hospital.UpdatePatientMealsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object patientId_ = "";
    /**
     * <code>string patient_id = 1;</code>
     */
    public java.lang.String getPatientId() {
      java.lang.Object ref = patientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        patientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string patient_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPatientIdBytes() {
      java.lang.Object ref = patientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string patient_id = 1;</code>
     */
    public Builder setPatientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      patientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string patient_id = 1;</code>
     */
    public Builder clearPatientId() {
      
      patientId_ = getDefaultInstance().getPatientId();
      onChanged();
      return this;
    }
    /**
     * <code>string patient_id = 1;</code>
     */
    public Builder setPatientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      patientId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList meals_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMealsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        meals_ = new com.google.protobuf.LazyStringArrayList(meals_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string meals = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMealsList() {
      return meals_.getUnmodifiableView();
    }
    /**
     * <code>repeated string meals = 2;</code>
     */
    public int getMealsCount() {
      return meals_.size();
    }
    /**
     * <code>repeated string meals = 2;</code>
     */
    public java.lang.String getMeals(int index) {
      return meals_.get(index);
    }
    /**
     * <code>repeated string meals = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMealsBytes(int index) {
      return meals_.getByteString(index);
    }
    /**
     * <code>repeated string meals = 2;</code>
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
     * <code>repeated string meals = 2;</code>
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
     * <code>repeated string meals = 2;</code>
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
     * <code>repeated string meals = 2;</code>
     */
    public Builder clearMeals() {
      meals_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meals = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:UpdatePatientMealsRequest)
  }

  // @@protoc_insertion_point(class_scope:UpdatePatientMealsRequest)
  private static final com.hospital.UpdatePatientMealsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hospital.UpdatePatientMealsRequest();
  }

  public static com.hospital.UpdatePatientMealsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePatientMealsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePatientMealsRequest>() {
    @java.lang.Override
    public UpdatePatientMealsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdatePatientMealsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdatePatientMealsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePatientMealsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hospital.UpdatePatientMealsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

