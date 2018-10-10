package com.rodrigomoral.kotlinmvpdagger2.main

import com.rodrigomoral.kotlinmvpdagger2.core.base.BasePresenter
import com.rodrigomoral.kotlinmvpdagger2.core.dagger.ActivityScoped
import javax.inject.Inject

/**
 * Created by Liquid Squad at Accenture Digital on 9/10/18.
 */
@ActivityScoped
class MainPresenter @Inject constructor() : BasePresenter(), MainContract.Presenter {

    private var mView: MainContract.View? = null

    override fun testMainPresenterFunction() {
        println("testMainPresenterFunction")

        mView?.testMainViewFunction()
    }

    override fun bindView(view: MainContract.View) {
        mView = view
    }

    override fun dropView() {
        mView = null
    }

}