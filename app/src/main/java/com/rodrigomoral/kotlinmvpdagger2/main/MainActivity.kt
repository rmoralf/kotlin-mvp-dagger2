package com.rodrigomoral.kotlinmvpdagger2.main

import android.os.Bundle
import com.rodrigomoral.kotlinmvpdagger2.R
import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var mPresenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public override fun onResume() {
        super.onResume()
        mPresenter.setView(this)
        mPresenter.testMainPresenterFunction()
    }

    public override fun onDestroy() {
        mPresenter.dropView()
        super.onDestroy()
    }

    override fun testMainViewFunction() {
        println("testMainViewFunction")
    }

}
