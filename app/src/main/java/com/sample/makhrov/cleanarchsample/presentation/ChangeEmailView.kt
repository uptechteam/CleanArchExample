package com.sample.makhrov.cleanarchsample.presentation

/**
 * Created on 5/4/17.
 */
interface ChangeEmailView {
  fun getEmailInput(): String?
  fun showEmailValidationError()
  fun showChangedEmail(email: String)
  fun hideKeyboard()
}