package com.ntlpdpaconsents

import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.google.firebase.analytics.FirebaseAnalytics
import java.util.EnumMap
//import java.util.Map

class NtlPdpaConsentsModule internal constructor(context: ReactApplicationContext) :
  NtlPdpaConsentsSpec(context) {

    private val firebaseAnalytics: FirebaseAnalytics

    //constructor
    init {
      firebaseAnalytics = FirebaseAnalytics.getInstance(reactApplicationContext)
    }

    override fun getName(): String {
      return NAME
    }

    @ReactMethod
    override fun setGrantAnalyticsStorage(cb: Callback) {
        try {
            val consentMap = EnumMap<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus>(FirebaseAnalytics.ConsentType::class.java)
            consentMap[FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE] = FirebaseAnalytics.ConsentStatus.GRANTED
            firebaseAnalytics.setConsent(consentMap)
            cb.invoke(null, "analytics_storage granted")
        } catch (e: Exception) {
            cb.invoke(e.toString(), null)
        }
    }

    @ReactMethod
    override fun setDenyAnalyticsStorage(cb: Callback) {
        try {
            //val consentMap = EnumMap<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus>(FirebaseAnalytics.ConsentType::class.java)
            //consentMap[FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE] = FirebaseAnalytics.ConsentStatus.DENIED
            //firebaseAnalytics.setConsent(consentMap)
            cb.invoke(null, "analytics_storage denied")
        } catch (e: Exception) {
            cb.invoke(e.toString(), null)
        }
    }

    @ReactMethod
    override fun setGrantAdStorage(cb: Callback) {
        try {
            //val consentMap = EnumMap<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus>(FirebaseAnalytics.ConsentType::class.java)
            //consentMap[FirebaseAnalytics.ConsentType.AD_STORAGE] = FirebaseAnalytics.ConsentStatus.GRANTED
            //firebaseAnalytics.setConsent(consentMap)
            cb.invoke(null, "ad_storage granted")
        } catch (e: Exception) {
            cb.invoke(e.toString(), null)
        }
    }

    @ReactMethod
    override fun setDenyAdStorage(cb: Callback) {
        try {
            //val consentMap = EnumMap<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus>(FirebaseAnalytics.ConsentType::class.java)
            //consentMap[FirebaseAnalytics.ConsentType.AD_STORAGE] = FirebaseAnalytics.ConsentStatus.DENIED
            //firebaseAnalytics.setConsent(consentMap)
            cb.invoke(null, "ad_storage denied")
        } catch (e: Exception) {
            cb.invoke(e.toString(), null)
        }
    }

    companion object {
      const val NAME = "NtlPdpaConsents"
    }
}
