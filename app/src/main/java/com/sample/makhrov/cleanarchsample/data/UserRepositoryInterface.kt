package com.sample.makhrov.cleanarchsample.data

import com.sample.makhrov.cleanarchsample.data.models.User
import io.reactivex.Observable

/**
 * Created on 5/4/17.
 */
interface UserRepositoryInterface {
  fun changeUserEmail(email: String): Observable<User>
}