// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.


// This file is autogenerated by
//     third_party/jni_zero/jni_generator.py
// For
//     android/net/connectivity/org/chromium/base/metrics/NativeUmaRecorder

#ifndef android_net_connectivity_org_chromium_base_metrics_NativeUmaRecorder_JNI
#define android_net_connectivity_org_chromium_base_metrics_NativeUmaRecorder_JNI

#include <jni.h>

#include "third_party/jni_zero/jni_export.h"
#include "third_party/jni_zero/jni_zero_helper.h"


// Step 1: Forward declarations.


// Step 2: Constants (optional).


// Step 3: Method stubs.
namespace base {
namespace android {

static jlong JNI_NativeUmaRecorder_AddActionCallbackForTesting(JNIEnv* env, const
    base::android::JavaParamRef<jobject>& callback);

JNI_BOUNDARY_EXPORT jlong Java_android_net_connectivity_J_N_MKu5opmB_1ForTesting(
    JNIEnv* env,
    jclass jcaller,
    jobject callback) {
  return JNI_NativeUmaRecorder_AddActionCallbackForTesting(env,
      base::android::JavaParamRef<jobject>(env, callback));
}

static jlong JNI_NativeUmaRecorder_CreateHistogramSnapshotForTesting(JNIEnv* env);

JNI_BOUNDARY_EXPORT jlong Java_android_net_connectivity_J_N_MEvjgs_00024z_1ForTesting(
    JNIEnv* env,
    jclass jcaller) {
  return JNI_NativeUmaRecorder_CreateHistogramSnapshotForTesting(env);
}

static void JNI_NativeUmaRecorder_DestroyHistogramSnapshotForTesting(JNIEnv* env, jlong
    snapshotPtr);

JNI_BOUNDARY_EXPORT void Java_android_net_connectivity_J_N_Ms_00024kNROT_1ForTesting(
    JNIEnv* env,
    jclass jcaller,
    jlong snapshotPtr) {
  return JNI_NativeUmaRecorder_DestroyHistogramSnapshotForTesting(env, snapshotPtr);
}

static base::android::ScopedJavaLocalRef<jlongArray>
    JNI_NativeUmaRecorder_GetHistogramSamplesForTesting(JNIEnv* env, const
    base::android::JavaParamRef<jstring>& name);

JNI_BOUNDARY_EXPORT jlongArray Java_android_net_connectivity_J_N_MG7Fp_1PX_1ForTesting(
    JNIEnv* env,
    jclass jcaller,
    jstring name) {
  return JNI_NativeUmaRecorder_GetHistogramSamplesForTesting(env,
      base::android::JavaParamRef<jstring>(env, name)).Release();
}

static jint JNI_NativeUmaRecorder_GetHistogramTotalCountForTesting(JNIEnv* env, const
    base::android::JavaParamRef<jstring>& name,
    jlong snapshotPtr);

JNI_BOUNDARY_EXPORT jint Java_android_net_connectivity_J_N_MAEQJXoB_1ForTesting(
    JNIEnv* env,
    jclass jcaller,
    jstring name,
    jlong snapshotPtr) {
  return JNI_NativeUmaRecorder_GetHistogramTotalCountForTesting(env,
      base::android::JavaParamRef<jstring>(env, name), snapshotPtr);
}

static jint JNI_NativeUmaRecorder_GetHistogramValueCountForTesting(JNIEnv* env, const
    base::android::JavaParamRef<jstring>& name,
    jint sample,
    jlong snapshotPtr);

JNI_BOUNDARY_EXPORT jint Java_android_net_connectivity_J_N_MK_1v14VX_1ForTesting(
    JNIEnv* env,
    jclass jcaller,
    jstring name,
    jint sample,
    jlong snapshotPtr) {
  return JNI_NativeUmaRecorder_GetHistogramValueCountForTesting(env,
      base::android::JavaParamRef<jstring>(env, name), sample, snapshotPtr);
}

static jlong JNI_NativeUmaRecorder_RecordBooleanHistogram(JNIEnv* env, const
    base::android::JavaParamRef<jstring>& name,
    jlong nativeHint,
    jboolean sample);

JNI_BOUNDARY_EXPORT jlong Java_android_net_connectivity_J_N_MzWzwuwB(
    JNIEnv* env,
    jclass jcaller,
    jstring name,
    jlong nativeHint,
    jboolean sample) {
  return JNI_NativeUmaRecorder_RecordBooleanHistogram(env, base::android::JavaParamRef<jstring>(env,
      name), nativeHint, sample);
}

static jlong JNI_NativeUmaRecorder_RecordExponentialHistogram(JNIEnv* env, const
    base::android::JavaParamRef<jstring>& name,
    jlong nativeHint,
    jint sample,
    jint min,
    jint max,
    jint numBuckets);

JNI_BOUNDARY_EXPORT jlong Java_android_net_connectivity_J_N_MuJ4GoFy(
    JNIEnv* env,
    jclass jcaller,
    jstring name,
    jlong nativeHint,
    jint sample,
    jint min,
    jint max,
    jint numBuckets) {
  return JNI_NativeUmaRecorder_RecordExponentialHistogram(env,
      base::android::JavaParamRef<jstring>(env, name), nativeHint, sample, min, max, numBuckets);
}

static jlong JNI_NativeUmaRecorder_RecordLinearHistogram(JNIEnv* env, const
    base::android::JavaParamRef<jstring>& name,
    jlong nativeHint,
    jint sample,
    jint min,
    jint max,
    jint numBuckets);

JNI_BOUNDARY_EXPORT jlong Java_android_net_connectivity_J_N_M1BeiK0T(
    JNIEnv* env,
    jclass jcaller,
    jstring name,
    jlong nativeHint,
    jint sample,
    jint min,
    jint max,
    jint numBuckets) {
  return JNI_NativeUmaRecorder_RecordLinearHistogram(env, base::android::JavaParamRef<jstring>(env,
      name), nativeHint, sample, min, max, numBuckets);
}

static jlong JNI_NativeUmaRecorder_RecordSparseHistogram(JNIEnv* env, const
    base::android::JavaParamRef<jstring>& name,
    jlong nativeHint,
    jint sample);

JNI_BOUNDARY_EXPORT jlong Java_android_net_connectivity_J_N_MYt28aIK(
    JNIEnv* env,
    jclass jcaller,
    jstring name,
    jlong nativeHint,
    jint sample) {
  return JNI_NativeUmaRecorder_RecordSparseHistogram(env, base::android::JavaParamRef<jstring>(env,
      name), nativeHint, sample);
}

static void JNI_NativeUmaRecorder_RecordUserAction(JNIEnv* env, const
    base::android::JavaParamRef<jstring>& name,
    jlong millisSinceEvent);

JNI_BOUNDARY_EXPORT void Java_android_net_connectivity_J_N_MiZ3fGIS(
    JNIEnv* env,
    jclass jcaller,
    jstring name,
    jlong millisSinceEvent) {
  return JNI_NativeUmaRecorder_RecordUserAction(env, base::android::JavaParamRef<jstring>(env,
      name), millisSinceEvent);
}

static void JNI_NativeUmaRecorder_RemoveActionCallbackForTesting(JNIEnv* env, jlong callbackId);

JNI_BOUNDARY_EXPORT void Java_android_net_connectivity_J_N_MQ6A3Yuy_1ForTesting(
    JNIEnv* env,
    jclass jcaller,
    jlong callbackId) {
  return JNI_NativeUmaRecorder_RemoveActionCallbackForTesting(env, callbackId);
}


}  // namespace android
}  // namespace base

#endif  // android_net_connectivity_org_chromium_base_metrics_NativeUmaRecorder_JNI
