// LatencyComponentType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/latency/mojom/latency_info.mojom
//

package org.chromium.ui.mojom;

public final class LatencyComponentType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int INPUT_EVENT_LATENCY_BEGIN_RWH_COMPONENT = 0;
    public static final int INPUT_EVENT_LATENCY_SCROLL_UPDATE_ORIGINAL_COMPONENT = 1;
    public static final int INPUT_EVENT_LATENCY_FIRST_SCROLL_UPDATE_ORIGINAL_COMPONENT = 2;
    public static final int INPUT_EVENT_LATENCY_ORIGINAL_COMPONENT = 3;
    public static final int INPUT_EVENT_LATENCY_UI_COMPONENT = 4;
    public static final int INPUT_EVENT_LATENCY_RENDERER_MAIN_COMPONENT = 5;
    public static final int INPUT_EVENT_LATENCY_RENDERING_SCHEDULED_MAIN_COMPONENT = 6;
    public static final int INPUT_EVENT_LATENCY_RENDERING_SCHEDULED_IMPL_COMPONENT = 7;
    public static final int INPUT_EVENT_LATENCY_SCROLL_UPDATE_LAST_EVENT_COMPONENT = 8;
    public static final int INPUT_EVENT_LATENCY_RENDERER_SWAP_COMPONENT = 9;
    public static final int DISPLAY_COMPOSITOR_RECEIVED_FRAME_COMPONENT = 10;
    public static final int INPUT_EVENT_GPU_SWAP_BUFFER_COMPONENT = 11;
    public static final int INPUT_EVENT_LATENCY_FRAME_SWAP_COMPONENT = 12;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 12;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 12;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private LatencyComponentType() {}
}