// PasswordFormFillData.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/autofill/core/common/mojom/autofill_types.mojom
//

package org.chromium.autofill.mojom;


public final class PasswordFormFillData extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 72;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(72, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public FormRendererId formRendererId;
    public org.chromium.url.mojom.Url url;
    public org.chromium.url.mojom.Url action;
    public FormFieldData usernameField;
    public FormFieldData passwordField;
    public boolean usernameMayUsePrefilledPlaceholder;
    public String preferredRealm;
    public boolean usesAccountStore;
    public PasswordAndMetadata[] additionalLogins;
    public boolean waitForUsername;

    private PasswordFormFillData(int version) {
        super(STRUCT_SIZE, version);
    }

    public PasswordFormFillData() {
        this(0);
    }

    public static PasswordFormFillData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static PasswordFormFillData deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static PasswordFormFillData decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        PasswordFormFillData result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new PasswordFormFillData(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.formRendererId = FormRendererId.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.url = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.action = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.usernameField = FormFieldData.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.passwordField = FormFieldData.decode(decoder1);
                }
                {
                    
                result.usernameMayUsePrefilledPlaceholder = decoder0.readBoolean(48, 0);
                }
                {
                    
                result.usesAccountStore = decoder0.readBoolean(48, 1);
                }
                {
                    
                result.waitForUsername = decoder0.readBoolean(48, 2);
                }
                {
                    
                result.preferredRealm = decoder0.readString(56, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.additionalLogins = new PasswordAndMetadata[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.additionalLogins[i1] = PasswordAndMetadata.decode(decoder2);
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
        
        encoder0.encode(this.formRendererId, 8, false);
        
        encoder0.encode(this.url, 16, false);
        
        encoder0.encode(this.action, 24, false);
        
        encoder0.encode(this.usernameField, 32, false);
        
        encoder0.encode(this.passwordField, 40, false);
        
        encoder0.encode(this.usernameMayUsePrefilledPlaceholder, 48, 0);
        
        encoder0.encode(this.usesAccountStore, 48, 1);
        
        encoder0.encode(this.waitForUsername, 48, 2);
        
        encoder0.encode(this.preferredRealm, 56, false);
        
        if (this.additionalLogins == null) {
            encoder0.encodeNullPointer(64, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.additionalLogins.length, 64, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.additionalLogins.length; ++i0) {
                
                encoder1.encode(this.additionalLogins[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
    }
}