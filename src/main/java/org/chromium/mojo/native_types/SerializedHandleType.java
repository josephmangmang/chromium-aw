// SerializedHandleType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/interfaces/bindings/native_struct.mojom
//

package org.chromium.mojo.native_types;

public final class SerializedHandleType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int MOJO_HANDLE = 0;
    public static final int PLATFORM_FILE = 1; // MOJO_HANDLE + 1
    public static final int WIN_HANDLE = 2; // PLATFORM_FILE + 1
    public static final int MACH_PORT = 3; // WIN_HANDLE + 1
    public static final int FUCHSIA_HANDLE = 4; // MACH_PORT + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private SerializedHandleType() {}
}