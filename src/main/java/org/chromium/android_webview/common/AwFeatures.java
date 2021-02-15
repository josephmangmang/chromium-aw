// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.android_webview.common;

/**
 * Constants for the names of WebView Features.
 */
public final class AwFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../android_webview/common/aw_features.cc
    // Into
    //     ../../android_webview/java/src/org/chromium/android_webview/common/AwFeatures.java.tmpl

    // Enable brotli compression support in WebView.
    public static final String WEBVIEW_BROTLI_SUPPORT = "WebViewBrotliSupport";

    // Use the SafeBrowsingApiHandler which uses the connectionless GMS APIs. This
    // Feature is checked and used in downstream internal code.
    public static final String WEBVIEW_CONNECTIONLESS_SAFE_BROWSING = "WebViewConnectionlessSafeBrowsing";

    // Restricts WebView child processes to use only LITTLE cores on big.LITTLE
    // architectures.
    public static final String WEBVIEW_CPU_AFFINITY_RESTRICT_TO_LITTLE_CORES = "WebViewCpuAffinityRestrictToLittleCores";

    // Enable display cutout support for Android P and above.
    public static final String WEBVIEW_DISPLAY_CUTOUT = "WebViewDisplayCutout";

    // When enabled, passive mixed content (Audio/Video/Image subresources loaded
    // over HTTP on HTTPS sites) will be autoupgraded to HTTPS, and the load will be
    // blocked if the resource fails to load over HTTPS. This only affects apps that
    // set the mixed content mode to MIXED_CONTENT_COMPATIBILITY_MODE, autoupgrades
    // are always disabled for MIXED_CONTENT_NEVER_ALLOW and
    // MIXED_CONTENT_ALWAYS_ALLOW modes.
    public static final String WEBVIEW_MIXED_CONTENT_AUTOUPGRADES = "WebViewMixedContentAutoupgrades";

    // Only allow extra headers added via loadUrl() to be sent to the original
    // origin; strip them from the request if a cross-origin redirect occurs.
    public static final String WEBVIEW_EXTRA_HEADERS_SAME_ORIGIN_ONLY = "WebViewExtraHeadersSameOriginOnly";

    // Measure the number of pixels occupied by one or more WebViews as a
    // proportion of the total screen size. Depending on the number of
    // WebVieaws and the size of the screen this might be expensive so
    // hidden behind a feature flag until the true runtime cost can be
    // measured.
    public static final String WEBVIEW_MEASURE_SCREEN_COVERAGE = "WebViewMeasureScreenCoverage";

    // A Feature used for WebView variations tests. Not used in production.
    public static final String WEBVIEW_TEST_FEATURE = "WebViewTestFeature";

    // Enable raster in wide color gamut for apps that use webview in a wide color
    // gamut activity.
    public static final String WEBVIEW_WIDE_COLOR_GAMUT_SUPPORT = "WebViewWideColorGamutSupport";

    // Do not instantiate this class.
    private AwFeatures() {}
}
