package com.rodrigomoral.kotlinmvpdagger2.core.dagger

import com.rodrigomoral.kotlinmvpdagger2.fragment.FragmentModule
import com.rodrigomoral.kotlinmvpdagger2.main.MainActivity
import com.rodrigomoral.kotlinmvpdagger2.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Liquid Squad at Accenture Digital on 9/10/18.
 */
@Module
abstract class ActivityBindingModule {

    /**
     * Provides the injector for the [MainActivity], which has access to the dependencies provided
     * by this application instance (singleton scoped objects).
     */
    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainModule::class, FragmentModule::class])
    internal abstract fun mainActivityInjector(): MainActivity

}