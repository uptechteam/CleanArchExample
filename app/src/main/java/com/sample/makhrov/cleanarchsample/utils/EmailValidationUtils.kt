package com.sample.makhrov.cleanarchsample.utils

import android.text.TextUtils

/**
 * Created on 5/4/17.
 */
object EmailValidationUtils {

  fun isValidEmail(email: String?): Boolean {
    return email?.let {
      !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    } ?: false
  }
}