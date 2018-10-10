package com.rodrigomoral.kotlinmvpdagger2.fragment

import com.rodrigomoral.kotlinmvpdagger2.core.base.BasePresenter
import javax.inject.Inject

/**
 * Created by Rodrigo Moral Fiel on 9/10/18.
 */
class FragmentPresenter @Inject constructor() : BasePresenter(), FragmentContract.Presenter {

    private var mView: FragmentContract.View? = null

    override fun testFragmentPresenterFunction() {
        println("testFragmentPresenterFunction")

        mView?.testFragmentViewFunction()
    }

    override fun bindView(view: FragmentContract.View) {
        mView = view
    }

    override fun dropView() {
        mView = null
    }

}