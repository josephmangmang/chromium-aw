// ContentSecurityPolicyHeader.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/content_security_policy.mojom
//

package org.chromium.network.mojom;


public final class ContentSecurityPolicyHeader extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String headerValue;
    public int type;
    public int source;

    private ContentSecurityPolicyHeader(int version) {
        super(STRUCT_SIZE, version);
        this.type = (int) ContentSecurityPolicyType.ENFORCE;
        this.source = (int) ContentSecurityPolicySource.HTTP;
    }

    public ContentSecurityPolicyHeader() {
        this(0);
    }

    public static ContentSecurityPolicyHeader deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ContentSecurityPolicyHeader deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ContentSecurityPolicyHeader decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ContentSecurityPolicyHeader result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ContentSecurityPolicyHeader(elementsOrVersion);
                {
                    
                result.headerValue = decoder0.readString(8, false);
                }
                {
                    
                result.type = decoder0.readInt(16);
                    ContentSecurityPolicyType.validate(result.type);
                    result.type = ContentSecurityPolicyType.toKnownValue(result.type);
                }
                {
                    
                result.source = decoder0.readInt(20);
                    ContentSecurityPolicySource.validate(result.source);
                    result.source = ContentSecurityPolicySource.toKnownValue(result.source);
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
        
        encoder0.encode(this.headerValue, 8, false);
        
        encoder0.encode(this.type, 16);
        
        encoder0.encode(this.source, 20);
    }
}