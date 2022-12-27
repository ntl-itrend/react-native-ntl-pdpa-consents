package com.ntlpdpaconsents

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.Callback

abstract class NtlPdpaConsentsSpec internal constructor(context: ReactApplicationContext) :
  NativeNtlPdpaConsentsSpec(context) {

    abstract fun setGrantAnalyticsStorage(cb: Callback)
    abstract fun setDenyAnalyticsStorage(cb: Callback)
    abstract fun setGrantAdStorage(cb: Callback)
    abstract fun setDenyAdStorage(cb: Callback)
}
