package com.rodrigomoral.kotlinmvpdagger2.fragment

import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseModule
import com.rodrigomoral.kotlinmvpdagger2.core.dagger.ActivityScoped
import com.rodrigomoral.kotlinmvpdagger2.core.dagger.FragmentScoped
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Liquid Squad at Accenture Digital on 9/10/18.
 */
@Module(includes = [BaseModule::class])
abstract class FragmentModule {

    @ContributesAndroidInjector
    @FragmentScoped
    abstract fun fragment(): Fragment

    @Binds
    @ActivityScoped
    internal abstract fun fragmentPresenter(presenter: FragmentPresenter): FragmentContract.Presenter

}