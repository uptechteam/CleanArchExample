package com.sample.makhrov.cleanarchsample

import android.app.Application
import com.sample.makhrov.cleanarchsample.dagger.AppComponent
import com.sample.makhrov.cleanarchsample.dagger.AppModule
import com.sample.makhrov.cleanarchsample.dagger.DaggerAppComponent

/**
 * Created on 5/4/17.
 */
class App : Application() {
  companion object{
    lateinit var appComponent: AppComponent
  }

  override fun onCreate() {
    super.onCreate()
    appComponent =  DaggerAppComponent.builder()
      .appModule(AppModule(this))
      .build()
  }
}