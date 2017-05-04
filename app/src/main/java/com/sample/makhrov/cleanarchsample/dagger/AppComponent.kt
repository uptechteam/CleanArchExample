package com.sample.makhrov.cleanarchsample.dagger

import com.sample.makhrov.cleanarchsample.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created on 5/4/17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
public interface AppComponent {
  fun inject(mainActivity: MainActivity)
}