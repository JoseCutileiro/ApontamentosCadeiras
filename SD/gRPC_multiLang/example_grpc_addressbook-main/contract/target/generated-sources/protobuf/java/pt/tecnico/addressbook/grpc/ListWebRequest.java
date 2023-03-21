// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddressBook.proto

package pt.tecnico.addressbook.grpc;

/**
 * Protobuf type {@code pt.tecnico.addressbook.grpc.ListWebRequest}
 */
public final class ListWebRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pt.tecnico.addressbook.grpc.ListWebRequest)
    ListWebRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListWebRequest.newBuilder() to construct.
  private ListWebRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListWebRequest() {
    website_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListWebRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListWebRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            website_ = s;
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
    return pt.tecnico.addressbook.grpc.AddressBookProtobuf.internal_static_pt_tecnico_addressbook_grpc_ListWebRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pt.tecnico.addressbook.grpc.AddressBookProtobuf.internal_static_pt_tecnico_addressbook_grpc_ListWebRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pt.tecnico.addressbook.grpc.ListWebRequest.class, pt.tecnico.addressbook.grpc.ListWebRequest.Builder.class);
  }

  public static final int WEBSITE_FIELD_NUMBER = 1;
  private volatile java.lang.Object website_;
  /**
   * <code>string website = 1;</code>
   * @return The website.
   */
  @java.lang.Override
  public java.lang.String getWebsite() {
    java.lang.Object ref = website_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      website_ = s;
      return s;
    }
  }
  /**
   * <code>string website = 1;</code>
   * @return The bytes for website.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWebsiteBytes() {
    java.lang.Object ref = website_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      website_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(website_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, website_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(website_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, website_);
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
    if (!(obj instanceof pt.tecnico.addressbook.grpc.ListWebRequest)) {
      return super.equals(obj);
    }
    pt.tecnico.addressbook.grpc.ListWebRequest other = (pt.tecnico.addressbook.grpc.ListWebRequest) obj;

    if (!getWebsite()
        .equals(other.getWebsite())) return false;
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
    hash = (37 * hash) + WEBSITE_FIELD_NUMBER;
    hash = (53 * hash) + getWebsite().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.tecnico.addressbook.grpc.ListWebRequest parseFrom(
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
  public static Builder newBuilder(pt.tecnico.addressbook.grpc.ListWebRequest prototype) {
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
   * Protobuf type {@code pt.tecnico.addressbook.grpc.ListWebRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pt.tecnico.addressbook.grpc.ListWebRequest)
      pt.tecnico.addressbook.grpc.ListWebRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pt.tecnico.addressbook.grpc.AddressBookProtobuf.internal_static_pt_tecnico_addressbook_grpc_ListWebRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pt.tecnico.addressbook.grpc.AddressBookProtobuf.internal_static_pt_tecnico_addressbook_grpc_ListWebRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pt.tecnico.addressbook.grpc.ListWebRequest.class, pt.tecnico.addressbook.grpc.ListWebRequest.Builder.class);
    }

    // Construct using pt.tecnico.addressbook.grpc.ListWebRequest.newBuilder()
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
      website_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pt.tecnico.addressbook.grpc.AddressBookProtobuf.internal_static_pt_tecnico_addressbook_grpc_ListWebRequest_descriptor;
    }

    @java.lang.Override
    public pt.tecnico.addressbook.grpc.ListWebRequest getDefaultInstanceForType() {
      return pt.tecnico.addressbook.grpc.ListWebRequest.getDefaultInstance();
    }

    @java.lang.Override
    public pt.tecnico.addressbook.grpc.ListWebRequest build() {
      pt.tecnico.addressbook.grpc.ListWebRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pt.tecnico.addressbook.grpc.ListWebRequest buildPartial() {
      pt.tecnico.addressbook.grpc.ListWebRequest result = new pt.tecnico.addressbook.grpc.ListWebRequest(this);
      result.website_ = website_;
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
      if (other instanceof pt.tecnico.addressbook.grpc.ListWebRequest) {
        return mergeFrom((pt.tecnico.addressbook.grpc.ListWebRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pt.tecnico.addressbook.grpc.ListWebRequest other) {
      if (other == pt.tecnico.addressbook.grpc.ListWebRequest.getDefaultInstance()) return this;
      if (!other.getWebsite().isEmpty()) {
        website_ = other.website_;
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
      pt.tecnico.addressbook.grpc.ListWebRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pt.tecnico.addressbook.grpc.ListWebRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object website_ = "";
    /**
     * <code>string website = 1;</code>
     * @return The website.
     */
    public java.lang.String getWebsite() {
      java.lang.Object ref = website_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        website_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string website = 1;</code>
     * @return The bytes for website.
     */
    public com.google.protobuf.ByteString
        getWebsiteBytes() {
      java.lang.Object ref = website_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        website_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string website = 1;</code>
     * @param value The website to set.
     * @return This builder for chaining.
     */
    public Builder setWebsite(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      website_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string website = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWebsite() {
      
      website_ = getDefaultInstance().getWebsite();
      onChanged();
      return this;
    }
    /**
     * <code>string website = 1;</code>
     * @param value The bytes for website to set.
     * @return This builder for chaining.
     */
    public Builder setWebsiteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      website_ = value;
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


    // @@protoc_insertion_point(builder_scope:pt.tecnico.addressbook.grpc.ListWebRequest)
  }

  // @@protoc_insertion_point(class_scope:pt.tecnico.addressbook.grpc.ListWebRequest)
  private static final pt.tecnico.addressbook.grpc.ListWebRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pt.tecnico.addressbook.grpc.ListWebRequest();
  }

  public static pt.tecnico.addressbook.grpc.ListWebRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWebRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListWebRequest>() {
    @java.lang.Override
    public ListWebRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListWebRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListWebRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWebRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pt.tecnico.addressbook.grpc.ListWebRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

