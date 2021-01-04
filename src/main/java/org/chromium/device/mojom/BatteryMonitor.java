// BatteryMonitor.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/battery_monitor.mojom
//

package org.chromium.device.mojom;


public interface BatteryMonitor extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends BatteryMonitor, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BatteryMonitor, BatteryMonitor.Proxy> MANAGER = BatteryMonitor_Internal.MANAGER;


    void queryNextStatus(

QueryNextStatusResponse callback);

    interface QueryNextStatusResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<BatteryStatus> { }


}
