// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1beta2/table.proto

package com.google.cloud.bigquery.storage.v1beta2;

public final class TableProto {
  private TableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_storage_v1beta2_TableSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1beta2_TableSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_storage_v1beta2_TableFieldSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_storage_v1beta2_TableFieldSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/bigquery/storage/v1beta2/" +
      "table.proto\022%google.cloud.bigquery.stora" +
      "ge.v1beta2\032\037google/api/field_behavior.pr" +
      "oto\"V\n\013TableSchema\022G\n\006fields\030\001 \003(\01327.goo" +
      "gle.cloud.bigquery.storage.v1beta2.Table" +
      "FieldSchema\"\317\004\n\020TableFieldSchema\022\021\n\004name" +
      "\030\001 \001(\tB\003\340A\002\022O\n\004type\030\002 \001(\0162<.google.cloud" +
      ".bigquery.storage.v1beta2.TableFieldSche" +
      "ma.TypeB\003\340A\002\022O\n\004mode\030\003 \001(\0162<.google.clou" +
      "d.bigquery.storage.v1beta2.TableFieldSch" +
      "ema.ModeB\003\340A\001\022L\n\006fields\030\004 \003(\01327.google.c" +
      "loud.bigquery.storage.v1beta2.TableField" +
      "SchemaB\003\340A\001\022\030\n\013description\030\006 \001(\tB\003\340A\001\"\325\001" +
      "\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\n\n\006STRING\020\001" +
      "\022\t\n\005INT64\020\002\022\n\n\006DOUBLE\020\003\022\n\n\006STRUCT\020\004\022\t\n\005B" +
      "YTES\020\005\022\010\n\004BOOL\020\006\022\r\n\tTIMESTAMP\020\007\022\010\n\004DATE\020" +
      "\010\022\010\n\004TIME\020\t\022\014\n\010DATETIME\020\n\022\r\n\tGEOGRAPHY\020\013" +
      "\022\013\n\007NUMERIC\020\014\022\016\n\nBIGNUMERIC\020\r\022\014\n\010INTERVA" +
      "L\020\016\022\010\n\004JSON\020\017\"F\n\004Mode\022\024\n\020MODE_UNSPECIFIE" +
      "D\020\000\022\014\n\010NULLABLE\020\001\022\014\n\010REQUIRED\020\002\022\014\n\010REPEA" +
      "TED\020\003B\207\001\n)com.google.cloud.bigquery.stor" +
      "age.v1beta2B\nTableProtoP\001ZLgoogle.golang" +
      ".org/genproto/googleapis/cloud/bigquery/" +
      "storage/v1beta2;storageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_bigquery_storage_v1beta2_TableSchema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_storage_v1beta2_TableSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_storage_v1beta2_TableSchema_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_google_cloud_bigquery_storage_v1beta2_TableFieldSchema_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_storage_v1beta2_TableFieldSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_storage_v1beta2_TableFieldSchema_descriptor,
        new java.lang.String[] { "Name", "Type", "Mode", "Fields", "Description", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}