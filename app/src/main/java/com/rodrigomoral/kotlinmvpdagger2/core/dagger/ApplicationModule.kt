package com.rodrigomoral.kotlinmvpdagger2.core.dagger

import android.app.Application
import android.content.Context
import com.rodrigomoral.kotlinmvpdagger2.core.application.App

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by Rodrigo Moral Fiel on 9/10/18.
 */
@Module
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun application(app: App): Application

    @Binds
    internal abstract fun bindContext(application: Application): Context
}