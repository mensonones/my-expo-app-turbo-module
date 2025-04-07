package com.myturbopackage

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider

class NativeAndroidVersionPackage : TurboReactPackage() {

  override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? =
    if (name == NativeAndroidVersionModule.NAME) {
      NativeAndroidVersionModule(reactContext)
    } else {
      null
    }

  override fun getReactModuleInfoProvider() = ReactModuleInfoProvider {
    mapOf(
        NativeAndroidVersionModule.NAME to ReactModuleInfo(
        _name = NativeAndroidVersionModule.NAME,
        _className = NativeAndroidVersionModule.NAME,
        _canOverrideExistingModule = false,
        _needsEagerInit = false,
        isCxxModule = false,
        isTurboModule = true
      )
    )
  }
}