package com.rodrigomoral.kotlinmvpdagger2.core.dagger

import android.app.Application
import com.rodrigomoral.kotlinmvpdagger2.core.application.App

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Rodrigo Moral Fiel on 9/10/18.
 */
@Singleton
@Component(modules = [ApplicationModule::class, ActivityBindingModule::class, AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): AppComponent.Builder

        fun build(): AppComponent
    }

}