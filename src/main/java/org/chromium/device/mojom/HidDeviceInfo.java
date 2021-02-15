// HidDeviceInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/hid.mojom
//

package org.chromium.device.mojom;


public final class HidDeviceInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 128;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(104, 0),new org.chromium.mojo.bindings.DataHeader(128, 1)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[1];
    public String guid;
    public String physicalDeviceId;
    public short vendorId;
    public short productId;
    public String productName;
    public String serialNumber;
    public int busType;
    public byte[] reportDescriptor;
    public HidCollectionInfo[] collections;
    public boolean hasReportId;
    public long maxInputReportSize;
    public long maxOutputReportSize;
    public long maxFeatureReportSize;
    public String deviceNode;
    public byte[] protectedInputReportIds;
    public byte[] protectedOutputReportIds;
    public byte[] protectedFeatureReportIds;

    private HidDeviceInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public HidDeviceInfo() {
        this(1);
    }

    public static HidDeviceInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static HidDeviceInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static HidDeviceInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        HidDeviceInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new HidDeviceInfo(elementsOrVersion);
                {
                    
                result.guid = decoder0.readString(8, false);
                }
                {
                    
                result.physicalDeviceId = decoder0.readString(16, false);
                }
                {
                    
                result.vendorId = decoder0.readShort(24);
                }
                {
                    
                result.productId = decoder0.readShort(26);
                }
                {
                    
                result.busType = decoder0.readInt(28);
                    HidBusType.validate(result.busType);
                }
                {
                    
                result.productName = decoder0.readString(32, false);
                }
                {
                    
                result.serialNumber = decoder0.readString(40, false);
                }
                {
                    
                result.reportDescriptor = decoder0.readBytes(48, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.collections = new HidCollectionInfo[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.collections[i1] = HidCollectionInfo.decode(decoder2);
                    }
                }
                }
                {
                    
                result.hasReportId = decoder0.readBoolean(64, 0);
                }
                {
                    
                result.maxInputReportSize = decoder0.readLong(72);
                }
                {
                    
                result.maxOutputReportSize = decoder0.readLong(80);
                }
                {
                    
                result.maxFeatureReportSize = decoder0.readLong(88);
                }
                {
                    
                result.deviceNode = decoder0.readString(96, false);
                }
            if (elementsOrVersion >= 1) {
                {
                    
                result.protectedInputReportIds = decoder0.readBytes(104, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                result.protectedOutputReportIds = decoder0.readBytes(112, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                result.protectedFeatureReportIds = decoder0.readBytes(120, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
            }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.guid, 8, false);
        
        encoder0.encode(this.physicalDeviceId, 16, false);
        
        encoder0.encode(this.vendorId, 24);
        
        encoder0.encode(this.productId, 26);
        
        encoder0.encode(this.busType, 28);
        
        encoder0.encode(this.productName, 32, false);
        
        encoder0.encode(this.serialNumber, 40, false);
        
        encoder0.encode(this.reportDescriptor, 48, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        if (this.collections == null) {
            encoder0.encodeNullPointer(56, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.collections.length, 56, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.collections.length; ++i0) {
                
                encoder1.encode(this.collections[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.hasReportId, 64, 0);
        
        encoder0.encode(this.maxInputReportSize, 72);
        
        encoder0.encode(this.maxOutputReportSize, 80);
        
        encoder0.encode(this.maxFeatureReportSize, 88);
        
        encoder0.encode(this.deviceNode, 96, false);
        
        encoder0.encode(this.protectedInputReportIds, 104, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.protectedOutputReportIds, 112, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.protectedFeatureReportIds, 120, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
    }
}