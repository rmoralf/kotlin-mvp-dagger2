package com.rodrigomoral.kotlinmvpdagger2.fragment

import com.rodrigomoral.kotlinmvpdagger2.core.base.BasePresenter
import javax.inject.Inject

/**
 * Created by Liquid Squad at Accenture Digital on 9/10/18.
 */
class FragmentPresenter @Inject constructor() : BasePresenter(), FragmentContract.Presenter {

    private var mView: FragmentContract.View? = null

    override fun testFragmentPresenterFunction() {
        println("testFragmentPresenterFunction")

        mView?.testFragmentViewFunction()
    }

    override fun setView(view: FragmentContract.View) {
        mView = view
    }

    override fun dropView() {
        mView = null
    }

}