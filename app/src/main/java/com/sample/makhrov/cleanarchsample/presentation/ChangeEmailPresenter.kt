package com.sample.makhrov.cleanarchsample.presentation

import com.sample.makhrov.cleanarchsample.domain.ChangeEmailUseCase
import com.sample.makhrov.cleanarchsample.utils.EmailValidationUtils
import javax.inject.Inject

/**
 * Created on 5/4/17.
 */
class ChangeEmailPresenter @Inject constructor(private val changeEmailUseCase: ChangeEmailUseCase) {

  var view: ChangeEmailView? = null

  fun onConfirmButtonPressed() {
    view?.let { view ->
      val emailInput = view.getEmailInput()
      if (EmailValidationUtils.isValidEmail(emailInput)) {
        view.hideKeyboard()
        changeEmailUseCase.changeUserEmail(emailInput!!)
          .subscribe({ user ->
            view.showChangedEmail(user.email)
          }, {
            //Error while changing email
          })
      } else {
        view.showEmailValidationError()
      }
    }
  }

  fun onViewCreated(view: ChangeEmailView) {
    this.view = view
  }

  fun onViewDestroyed() {
    view = null
  }
}