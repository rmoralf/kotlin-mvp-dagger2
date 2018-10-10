package com.rodrigomoral.kotlinmvpdagger2.core.application

import com.rodrigomoral.kotlinmvpdagger2.core.dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by Rodrigo Moral Fiel on 9/10/18.
 */
class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}