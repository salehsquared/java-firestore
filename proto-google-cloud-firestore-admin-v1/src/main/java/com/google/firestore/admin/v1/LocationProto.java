/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/location.proto

package com.google.firestore.admin.v1;

public final class LocationProto {
  private LocationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_LocationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_LocationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/firestore/admin/v1/location.pro"
          + "to\022\031google.firestore.admin.v1\032\030google/ty"
          + "pe/latlng.proto\032\034google/api/annotations."
          + "proto\"\022\n\020LocationMetadataB\341\001\n\035com.google"
          + ".firestore.admin.v1B\rLocationProtoP\001Z>go"
          + "ogle.golang.org/genproto/googleapis/fire"
          + "store/admin/v1;admin\242\002\004GCFS\252\002\037Google.Clo"
          + "ud.Firestore.Admin.V1\312\002\037Google\\Cloud\\Fir"
          + "estore\\Admin\\V1\352\002#Google::Cloud::Firesto"
          + "re::Admin::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.type.LatLngProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_firestore_admin_v1_LocationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_admin_v1_LocationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_LocationMetadata_descriptor,
            new java.lang.String[] {});
    com.google.type.LatLngProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
