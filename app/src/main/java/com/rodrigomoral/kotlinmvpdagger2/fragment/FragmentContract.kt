package com.rodrigomoral.kotlinmvpdagger2.fragment

import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseIPresenter
import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseIView

/**
 * Created by Rodrigo Moral Fiel on 9/10/18.
 */
interface FragmentContract {

    interface View : BaseIView<Presenter> {
        fun testFragmentViewFunction()
    }

    interface Presenter : BaseIPresenter<View> {
        fun testFragmentPresenterFunction()
    }
}