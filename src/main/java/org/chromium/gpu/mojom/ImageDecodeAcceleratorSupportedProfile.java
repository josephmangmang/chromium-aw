// ImageDecodeAcceleratorSupportedProfile.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/gpu_info.mojom
//

package org.chromium.gpu.mojom;


public final class ImageDecodeAcceleratorSupportedProfile extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int imageType;
    public org.chromium.gfx.mojom.Size minEncodedDimensions;
    public org.chromium.gfx.mojom.Size maxEncodedDimensions;
    public int[] subsamplings;

    private ImageDecodeAcceleratorSupportedProfile(int version) {
        super(STRUCT_SIZE, version);
    }

    public ImageDecodeAcceleratorSupportedProfile() {
        this(0);
    }

    public static ImageDecodeAcceleratorSupportedProfile deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ImageDecodeAcceleratorSupportedProfile deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ImageDecodeAcceleratorSupportedProfile decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ImageDecodeAcceleratorSupportedProfile result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ImageDecodeAcceleratorSupportedProfile(elementsOrVersion);
                {
                    
                result.imageType = decoder0.readInt(8);
                    ImageDecodeAcceleratorType.validate(result.imageType);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.minEncodedDimensions = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.maxEncodedDimensions = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                result.subsamplings = decoder0.readInts(32, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                {
                    for (int i1 = 0; i1 < result.subsamplings.length; ++i1) {
                        ImageDecodeAcceleratorSubsampling.validate(result.subsamplings[i1]);
                    }
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
        
        encoder0.encode(this.imageType, 8);
        
        encoder0.encode(this.minEncodedDimensions, 16, false);
        
        encoder0.encode(this.maxEncodedDimensions, 24, false);
        
        encoder0.encode(this.subsamplings, 32, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
    }
}