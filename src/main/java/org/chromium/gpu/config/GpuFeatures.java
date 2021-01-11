// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.gpu.config;

/**
 * Constants for the names of GPU Features.
 */
public final class GpuFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../gpu/config/gpu_finch_features.cc
    // Into
    //     ../../gpu/config/android/java/src/org/chromium/gpu/config/GpuFeatures.java.tmpl

    // Used to limit GL version to 2.0 for skia raster on Android.
    public static final String USE_GLES2_FOR_OOP_R = "UseGles2ForOopR";

    // Use android SurfaceControl API for managing display compositor's buffer queue
    // and using overlays on Android. Also used by webview to disable surface
    // SurfaceControl.
    public static final String ANDROID_SURFACE_CONTROL = "AndroidSurfaceControl";

    // Use AImageReader for MediaCodec and MediaPlyer on android.
    public static final String A_IMAGE_READER = "AImageReader";

    // If webview-draw-functor-uses-vulkan is set, use vulkan for composite and
    // raster.
    public static final String WEBVIEW_VULKAN = "WebViewVulkan";

    // Enable GPU Rasterization by default. This can still be overridden by
    // --enable-gpu-rasterization or --disable-gpu-rasterization.
    // DefaultEnableGpuRasterization has launched on Mac, Windows, ChromeOS, and
    // Android.
    public static final String DEFAULT_ENABLE_GPU_RASTERIZATION = "DefaultEnableGpuRasterization";

    // Enable out of process rasterization by default.  This can still be overridden
    // by --disable-oop-rasterization.
    public static final String DEFAULT_ENABLE_OOP_RASTERIZATION = "DefaultEnableOopRasterization";

    // Use a high priority for GPU process on Windows.
    public static final String GPU_PROCESS_HIGH_PRIORITY_WIN = "GpuProcessHighPriorityWin";

    // Compute the root damage rect from the surface damage list for overlays on
    // Windows.
    public static final String DIRECT_COMPOSITION_USE_OVERLAY_DAMAGE_LIST = "DirectCompositionUseOverlayDamageList";

    // Use ThreadPriority::DISPLAY for GPU main, viz compositor and IO threads.
    public static final String GPU_USE_DISPLAY_THREAD_PRIORITY = "GpuUseDisplayThreadPriority";

    // Use a different set of watchdog timeouts on V2
    public static final String GPU_WATCHDOG_V2_NEW_TIMEOUT = "GpuWatchdogV2NewTimeout";

    // Enable use of Metal for OOP rasterization.
    public static final String METAL = "Metal";

    // Turns on skia deferred display list for out of process raster.
    public static final String OOP_RASTERIZATION_DDL = "OopRasterizationDDL";

    // Causes us to use the SharedImageManager, removing support for the old
    // mailbox system. Any consumers of the GPU process using the old mailbox
    // system will experience undefined results.
    public static final String SHARED_IMAGE_MANAGER = "SharedImageManager";

    // Controls the decode acceleration of JPEG images (as opposed to camera
    // captures) in Chrome OS using the VA-API.
    // TODO(andrescj): remove or enable by default in Chrome OS once
    // https://crbug.com/868400 is resolved.
    public static final String VAAPI_JPEG_IMAGE_DECODE_ACCELERATION = "VaapiJpegImageDecodeAcceleration";

    // Controls the decode acceleration of WebP images in Chrome OS using the
    // VA-API.
    // TODO(gildekel): remove or enable by default in Chrome OS once
    // https://crbug.com/877694 is resolved.
    public static final String VAAPI_WEB_P_IMAGE_DECODE_ACCELERATION = "VaapiWebPImageDecodeAcceleration";

    // Enable Vulkan graphics backend for compositing and rasterization. Defaults to
    // native implementation if --use-vulkan flag is not used. Otherwise
    // --use-vulkan will be followed.
    // Note Android WebView uses kWebViewVulkan instead of this.
    public static final String VULKAN = "Vulkan";

    // Enable SkiaRenderer Dawn graphics backend. On Windows this will use D3D12,
    // and on Linux this will use Vulkan.
    public static final String SKIA_DAWN = "SkiaDawn";

    // Used to enable shared image mailbox and disable legacy texture mailbox on
    // webview.
    public static final String ENABLE_SHARED_IMAGE_FOR_WEBVIEW = "EnableSharedImageForWebview";

    // Enable GrShaderCache to use with Vulkan backend.
    public static final String ENABLE_GR_SHADER_CACHE_FOR_VULKAN = "EnableGrShaderCacheForVulkan";

    // Prevent instantiation.
    private GpuFeatures() {}
}
