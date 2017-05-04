package com.sample.makhrov.cleanarchsample.domain

import com.sample.makhrov.cleanarchsample.data.UserRepositoryInterface
import com.sample.makhrov.cleanarchsample.domain.mapper.UserMapper
import com.sample.makhrov.cleanarchsample.presentation.models.VMUser
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created on 5/4/17.
 */
@Singleton
class ChangeEmailUseCase @Inject constructor(private val userRepository: UserRepositoryInterface) {
  fun changeUserEmail(email: String): Observable<VMUser> {
    return userRepository.changeUserEmail(email)
      .map {
        UserMapper.toVM(it)
      }
      .observeOn(AndroidSchedulers.mainThread())
  }
}