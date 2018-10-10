package com.rodrigomoral.kotlinmvpdagger2.main

import android.os.Bundle
import com.rodrigomoral.kotlinmvpdagger2.R
import com.rodrigomoral.kotlinmvpdagger2.core.base.BaseActivity
import com.rodrigomoral.kotlinmvpdagger2.fragment.Fragment
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var mPresenter: MainContract.Presenter

    @Inject
    lateinit var fragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.contentFrame, fragment)
        transaction.commit()
    }

    public override fun onResume() {
        super.onResume()
        mPresenter.bindView(this)
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
