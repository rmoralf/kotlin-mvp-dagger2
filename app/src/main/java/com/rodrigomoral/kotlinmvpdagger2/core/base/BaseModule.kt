package com.rodrigomoral.kotlinmvpdagger2.core.base

import android.content.Context
import com.rodrigomoral.kotlinmvpdagger2.core.dagger.ActivityScoped
import dagger.Binds
import dagger.Module

/**
 * Created by Rodrigo Moral Fiel on 9/10/18.
 */
@Module
abstract class BaseModule {
    @Binds
    @ActivityScoped
    abstract fun activityContext(activity: BaseActivity): Context
}