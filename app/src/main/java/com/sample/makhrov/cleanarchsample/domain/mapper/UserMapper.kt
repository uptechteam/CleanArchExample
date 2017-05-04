package com.sample.makhrov.cleanarchsample.domain.mapper

import com.sample.makhrov.cleanarchsample.data.models.User
import com.sample.makhrov.cleanarchsample.presentation.models.VMUser

/**
 * Created on 5/4/17.
 */
object UserMapper {
  fun toVM(user: User): VMUser {
    return VMUser(user.email)
  }
}