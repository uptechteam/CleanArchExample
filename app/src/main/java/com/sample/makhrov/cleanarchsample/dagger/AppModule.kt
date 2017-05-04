package com.sample.makhrov.cleanarchsample.dagger

import android.content.Context
import com.sample.makhrov.cleanarchsample.data.UserRepository
import com.sample.makhrov.cleanarchsample.data.UserRepositoryInterface
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created on 5/4/17.
 */
@Module
class AppModule(val context: Context) {

  @Provides
  @Singleton
  fun provideUserRepository(): UserRepositoryInterface {
    return UserRepository()
  }
}