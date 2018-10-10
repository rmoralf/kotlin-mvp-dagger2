package com.rodrigomoral.kotlinmvpdagger2.main

import android.app.Activity
import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseModule
import com.rodrigomoral.kotlinmvpdagger2.core.dagger.ActivityScoped
import dagger.Binds
import dagger.Module

/**
 * Created by Rodrigo Moral Fiel on 9/10/18.
 */
@Module(includes = [BaseModule::class])
abstract class MainModule {

    @Binds
    @ActivityScoped
    abstract fun activity(mainActivity: MainActivity): Activity

    @Binds
    @ActivityScoped
    internal abstract fun mainPresenter(presenter: MainPresenter): MainContract.Presenter

}