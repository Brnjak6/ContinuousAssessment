// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nutritionalinformation.proto

package com.hospital;

public final class ContinuousAssessment {
  private ContinuousAssessment() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NutriInformationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NutriInformationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NutriInformationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NutriInformationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MealRankingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MealRankingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MealRankingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MealRankingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MicroNutrientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MicroNutrientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MicroNutrientResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MicroNutrientResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034nutritionalinformation.proto\".\n\027NutriI" +
      "nformationRequest\022\023\n\013meal_number\030\001 \001(\005\"t" +
      "\n\030NutriInformationResponse\022\021\n\tmeal_name\030" +
      "\001 \001(\t\022\020\n\010calories\030\002 \001(\002\022\017\n\007protein\030\003 \001(\002" +
      "\022\025\n\rcarbohydrates\030\004 \001(\002\022\013\n\003fat\030\005 \001(\002\"*\n\022" +
      "MealRankingRequest\022\024\n\014digit_number\030\001 \001(\005" +
      "\"+\n\023MealRankingResponse\022\024\n\014confirmation\030" +
      "\001 \001(\010\")\n\024MicroNutrientRequest\022\021\n\tmeal_na" +
      "me\030\001 \001(\t\"=\n\025MicroNutrientResponse\022\020\n\010cal" +
      "ories\030\001 \001(\002\022\022\n\ndiet_level\030\002 \001(\0052\354\001\n\035Nutr" +
      "itionalInformationService\022I\n\020NutriInform" +
      "ation\022\030.NutriInformationRequest\032\031.NutriI" +
      "nformationResponse\"\000\022:\n\013MealRanking\022\023.Me" +
      "alRankingRequest\032\024.MealRankingResponse\"\000" +
      "\022D\n\rMicroNutrient\022\025.MicroNutrientRequest" +
      "\032\026.MicroNutrientResponse\"\000(\0010\001B&\n\014com.ho" +
      "spitalB\024ContinuousAssessmentP\001b\006proto3"
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
    internal_static_NutriInformationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NutriInformationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NutriInformationRequest_descriptor,
        new java.lang.String[] { "MealNumber", });
    internal_static_NutriInformationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_NutriInformationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NutriInformationResponse_descriptor,
        new java.lang.String[] { "MealName", "Calories", "Protein", "Carbohydrates", "Fat", });
    internal_static_MealRankingRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MealRankingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MealRankingRequest_descriptor,
        new java.lang.String[] { "DigitNumber", });
    internal_static_MealRankingResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_MealRankingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MealRankingResponse_descriptor,
        new java.lang.String[] { "Confirmation", });
    internal_static_MicroNutrientRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_MicroNutrientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MicroNutrientRequest_descriptor,
        new java.lang.String[] { "MealName", });
    internal_static_MicroNutrientResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_MicroNutrientResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MicroNutrientResponse_descriptor,
        new java.lang.String[] { "Calories", "DietLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
