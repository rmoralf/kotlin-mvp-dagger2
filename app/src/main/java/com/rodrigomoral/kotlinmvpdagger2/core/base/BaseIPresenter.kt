package com.rodrigomoral.kotlinmvpdagger2.core.base

interface BaseIPresenter<T> {

    /**
     * Binds presenter with a view.
     *
     * @param view the view associated with this presenter
     */
    fun setView(view: T)

    /**
     * Drops the reference to the view.
     */
    fun dropView()

}
