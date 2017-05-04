package com.sample.makhrov.cleanarchsample.data

import com.sample.makhrov.cleanarchsample.data.models.User
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import java.util.*

/**
 * Created on 5/4/17.
 */
class UserRepository : UserRepositoryInterface {
  override fun changeUserEmail(email: String): Observable<User> {
    return Observable.create<User> { sb ->
      //Transaction or network imitation
      Thread.sleep(2000)

      sb.onNext(User(email, UUID.randomUUID().toString()))
    }.subscribeOn(Schedulers.io())
  }
}