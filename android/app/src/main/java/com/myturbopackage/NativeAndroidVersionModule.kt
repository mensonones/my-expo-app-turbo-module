package com.myturbopackage

import android.os.Build
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.Promise
import com.myturbopackage.NativeAndroidVersionSpec

class NativeAndroidVersionModule(reactContext: ReactApplicationContext) : NativeAndroidVersionSpec(reactContext) {

  override fun getName() = NAME

  // Implementação do método declarado no Spec
  override fun getVersion(promise: Promise) {
    promise.resolve(Build.VERSION.RELEASE)
  }

  companion object {
    const val NAME = "NativeAndroidVersion"
  }
}