// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.


// This file is autogenerated by
//     third_party/jni_zero/jni_generator.py
// For
//     android/net/connectivity/org/chromium/base/CpuFeatures

#ifndef android_net_connectivity_org_chromium_base_CpuFeatures_JNI
#define android_net_connectivity_org_chromium_base_CpuFeatures_JNI

#include <jni.h>

#include "third_party/jni_zero/jni_export.h"
#include "third_party/jni_zero/jni_zero_helper.h"


// Step 1: Forward declarations.


// Step 2: Constants (optional).


// Step 3: Method stubs.
namespace base {
namespace android {

static jint JNI_CpuFeatures_GetCoreCount(JNIEnv* env);

JNI_BOUNDARY_EXPORT jint Java_android_net_connectivity_J_N_M58U6lZz(
    JNIEnv* env,
    jclass jcaller) {
  return JNI_CpuFeatures_GetCoreCount(env);
}

static jlong JNI_CpuFeatures_GetCpuFeatures(JNIEnv* env);

JNI_BOUNDARY_EXPORT jlong Java_android_net_connectivity_J_N_MXUVvXga(
    JNIEnv* env,
    jclass jcaller) {
  return JNI_CpuFeatures_GetCpuFeatures(env);
}


}  // namespace android
}  // namespace base

#endif  // android_net_connectivity_org_chromium_base_CpuFeatures_JNI
