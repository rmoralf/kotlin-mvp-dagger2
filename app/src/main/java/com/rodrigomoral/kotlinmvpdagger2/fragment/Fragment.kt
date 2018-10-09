package com.rodrigomoral.kotlinmvpdagger2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rodrigomoral.kotlinmvpdagger2.R
import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseFragment
import com.rodrigomoral.kotlinmvpdagger2.core.dagger.ActivityScoped
import javax.inject.Inject

/**
 * Created by Liquid Squad at Accenture Digital on 9/10/18.
 */
@ActivityScoped
class Fragment @Inject constructor() : BaseFragment(), FragmentContract.View {

    @Inject
    lateinit var mPresenter: FragmentContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onResume() {
        super.onResume()
        mPresenter.setView(this)
        mPresenter.testFragmentPresenterFunction()
    }

    override fun onDestroy() {
        mPresenter.dropView()
        super.onDestroy()
    }

    override fun testFragmentViewFunction() {
        println("testFragmentViewFunction")
    }

}