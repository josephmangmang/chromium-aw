// VkPhysicalDeviceType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/vulkan_types.mojom
//

package org.chromium.gpu.mojom;

public final class VkPhysicalDeviceType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int OTHER = 0;
    public static final int INTEGRATED_GPU = 1;
    public static final int DISCRETE_GPU = 2;
    public static final int VIRTUAL_GPU = 3;
    public static final int CPU = 4;
    public static final int INVALID_VALUE = -1;
    public static final int MIN_VALUE = -1;
    public static final int MAX_VALUE = 4;

    public static boolean isKnownValue(int value) {
        return value >= -1 && value <= 4;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private VkPhysicalDeviceType() {}
}