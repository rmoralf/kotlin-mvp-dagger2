package com.rodrigomoral.kotlinmvpdagger2.main

import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseIPresenter
import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseIView

/**
 * Created by Rodrigo Moral Fiel on 9/10/18.
 */
interface MainContract {

    interface View : BaseIView<Presenter> {
        fun testMainViewFunction()
    }

    interface Presenter : BaseIPresenter<View> {
        fun testMainPresenterFunction()
    }
}