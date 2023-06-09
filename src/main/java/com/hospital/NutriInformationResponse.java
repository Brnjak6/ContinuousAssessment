// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nutritionalinformation.proto

package com.hospital;

/**
 * Protobuf type {@code NutriInformationResponse}
 */
public  final class NutriInformationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NutriInformationResponse)
    NutriInformationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NutriInformationResponse.newBuilder() to construct.
  private NutriInformationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NutriInformationResponse() {
    mealName_ = "";
    calories_ = 0F;
    protein_ = 0F;
    carbohydrates_ = 0F;
    fat_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NutriInformationResponse(
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

            mealName_ = s;
            break;
          }
          case 21: {

            calories_ = input.readFloat();
            break;
          }
          case 29: {

            protein_ = input.readFloat();
            break;
          }
          case 37: {

            carbohydrates_ = input.readFloat();
            break;
          }
          case 45: {

            fat_ = input.readFloat();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hospital.ContinuousAssessment.internal_static_NutriInformationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hospital.ContinuousAssessment.internal_static_NutriInformationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hospital.NutriInformationResponse.class, com.hospital.NutriInformationResponse.Builder.class);
  }

  public static final int MEAL_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object mealName_;
  /**
   * <code>string meal_name = 1;</code>
   */
  public java.lang.String getMealName() {
    java.lang.Object ref = mealName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mealName_ = s;
      return s;
    }
  }
  /**
   * <code>string meal_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMealNameBytes() {
    java.lang.Object ref = mealName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mealName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALORIES_FIELD_NUMBER = 2;
  private float calories_;
  /**
   * <code>float calories = 2;</code>
   */
  public float getCalories() {
    return calories_;
  }

  public static final int PROTEIN_FIELD_NUMBER = 3;
  private float protein_;
  /**
   * <code>float protein = 3;</code>
   */
  public float getProtein() {
    return protein_;
  }

  public static final int CARBOHYDRATES_FIELD_NUMBER = 4;
  private float carbohydrates_;
  /**
   * <code>float carbohydrates = 4;</code>
   */
  public float getCarbohydrates() {
    return carbohydrates_;
  }

  public static final int FAT_FIELD_NUMBER = 5;
  private float fat_;
  /**
   * <code>float fat = 5;</code>
   */
  public float getFat() {
    return fat_;
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
    if (!getMealNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mealName_);
    }
    if (calories_ != 0F) {
      output.writeFloat(2, calories_);
    }
    if (protein_ != 0F) {
      output.writeFloat(3, protein_);
    }
    if (carbohydrates_ != 0F) {
      output.writeFloat(4, carbohydrates_);
    }
    if (fat_ != 0F) {
      output.writeFloat(5, fat_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMealNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mealName_);
    }
    if (calories_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, calories_);
    }
    if (protein_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, protein_);
    }
    if (carbohydrates_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, carbohydrates_);
    }
    if (fat_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, fat_);
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
    if (!(obj instanceof com.hospital.NutriInformationResponse)) {
      return super.equals(obj);
    }
    com.hospital.NutriInformationResponse other = (com.hospital.NutriInformationResponse) obj;

    boolean result = true;
    result = result && getMealName()
        .equals(other.getMealName());
    result = result && (
        java.lang.Float.floatToIntBits(getCalories())
        == java.lang.Float.floatToIntBits(
            other.getCalories()));
    result = result && (
        java.lang.Float.floatToIntBits(getProtein())
        == java.lang.Float.floatToIntBits(
            other.getProtein()));
    result = result && (
        java.lang.Float.floatToIntBits(getCarbohydrates())
        == java.lang.Float.floatToIntBits(
            other.getCarbohydrates()));
    result = result && (
        java.lang.Float.floatToIntBits(getFat())
        == java.lang.Float.floatToIntBits(
            other.getFat()));
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
    hash = (37 * hash) + MEAL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMealName().hashCode();
    hash = (37 * hash) + CALORIES_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCalories());
    hash = (37 * hash) + PROTEIN_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getProtein());
    hash = (37 * hash) + CARBOHYDRATES_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCarbohydrates());
    hash = (37 * hash) + FAT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFat());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hospital.NutriInformationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.NutriInformationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.NutriInformationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.NutriInformationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.NutriInformationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hospital.NutriInformationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hospital.NutriInformationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hospital.NutriInformationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hospital.NutriInformationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hospital.NutriInformationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hospital.NutriInformationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hospital.NutriInformationResponse parseFrom(
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
  public static Builder newBuilder(com.hospital.NutriInformationResponse prototype) {
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
   * Protobuf type {@code NutriInformationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NutriInformationResponse)
      com.hospital.NutriInformationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hospital.ContinuousAssessment.internal_static_NutriInformationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hospital.ContinuousAssessment.internal_static_NutriInformationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hospital.NutriInformationResponse.class, com.hospital.NutriInformationResponse.Builder.class);
    }

    // Construct using com.hospital.NutriInformationResponse.newBuilder()
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
      mealName_ = "";

      calories_ = 0F;

      protein_ = 0F;

      carbohydrates_ = 0F;

      fat_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hospital.ContinuousAssessment.internal_static_NutriInformationResponse_descriptor;
    }

    @java.lang.Override
    public com.hospital.NutriInformationResponse getDefaultInstanceForType() {
      return com.hospital.NutriInformationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hospital.NutriInformationResponse build() {
      com.hospital.NutriInformationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hospital.NutriInformationResponse buildPartial() {
      com.hospital.NutriInformationResponse result = new com.hospital.NutriInformationResponse(this);
      result.mealName_ = mealName_;
      result.calories_ = calories_;
      result.protein_ = protein_;
      result.carbohydrates_ = carbohydrates_;
      result.fat_ = fat_;
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
      if (other instanceof com.hospital.NutriInformationResponse) {
        return mergeFrom((com.hospital.NutriInformationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hospital.NutriInformationResponse other) {
      if (other == com.hospital.NutriInformationResponse.getDefaultInstance()) return this;
      if (!other.getMealName().isEmpty()) {
        mealName_ = other.mealName_;
        onChanged();
      }
      if (other.getCalories() != 0F) {
        setCalories(other.getCalories());
      }
      if (other.getProtein() != 0F) {
        setProtein(other.getProtein());
      }
      if (other.getCarbohydrates() != 0F) {
        setCarbohydrates(other.getCarbohydrates());
      }
      if (other.getFat() != 0F) {
        setFat(other.getFat());
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
      com.hospital.NutriInformationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hospital.NutriInformationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mealName_ = "";
    /**
     * <code>string meal_name = 1;</code>
     */
    public java.lang.String getMealName() {
      java.lang.Object ref = mealName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mealName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string meal_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMealNameBytes() {
      java.lang.Object ref = mealName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mealName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string meal_name = 1;</code>
     */
    public Builder setMealName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mealName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string meal_name = 1;</code>
     */
    public Builder clearMealName() {
      
      mealName_ = getDefaultInstance().getMealName();
      onChanged();
      return this;
    }
    /**
     * <code>string meal_name = 1;</code>
     */
    public Builder setMealNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mealName_ = value;
      onChanged();
      return this;
    }

    private float calories_ ;
    /**
     * <code>float calories = 2;</code>
     */
    public float getCalories() {
      return calories_;
    }
    /**
     * <code>float calories = 2;</code>
     */
    public Builder setCalories(float value) {
      
      calories_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float calories = 2;</code>
     */
    public Builder clearCalories() {
      
      calories_ = 0F;
      onChanged();
      return this;
    }

    private float protein_ ;
    /**
     * <code>float protein = 3;</code>
     */
    public float getProtein() {
      return protein_;
    }
    /**
     * <code>float protein = 3;</code>
     */
    public Builder setProtein(float value) {
      
      protein_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float protein = 3;</code>
     */
    public Builder clearProtein() {
      
      protein_ = 0F;
      onChanged();
      return this;
    }

    private float carbohydrates_ ;
    /**
     * <code>float carbohydrates = 4;</code>
     */
    public float getCarbohydrates() {
      return carbohydrates_;
    }
    /**
     * <code>float carbohydrates = 4;</code>
     */
    public Builder setCarbohydrates(float value) {
      
      carbohydrates_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float carbohydrates = 4;</code>
     */
    public Builder clearCarbohydrates() {
      
      carbohydrates_ = 0F;
      onChanged();
      return this;
    }

    private float fat_ ;
    /**
     * <code>float fat = 5;</code>
     */
    public float getFat() {
      return fat_;
    }
    /**
     * <code>float fat = 5;</code>
     */
    public Builder setFat(float value) {
      
      fat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float fat = 5;</code>
     */
    public Builder clearFat() {
      
      fat_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:NutriInformationResponse)
  }

  // @@protoc_insertion_point(class_scope:NutriInformationResponse)
  private static final com.hospital.NutriInformationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hospital.NutriInformationResponse();
  }

  public static com.hospital.NutriInformationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NutriInformationResponse>
      PARSER = new com.google.protobuf.AbstractParser<NutriInformationResponse>() {
    @java.lang.Override
    public NutriInformationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NutriInformationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NutriInformationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NutriInformationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hospital.NutriInformationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

