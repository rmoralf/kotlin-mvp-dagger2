package com.rodrigomoral.kotlinmvpdagger2.core.base

import android.content.Context
import com.rodrigomoral.kotlinmvpdagger2.core.dagger.ActivityScoped
import dagger.Binds
import dagger.Module

/**
 * Created by Liquid Squad at Accenture Digital on 9/10/18.
 */
@Module
abstract class BaseModule {
    @Binds
    @ActivityScoped
    abstract fun activityContext(activity: BaseActivity): Context
}