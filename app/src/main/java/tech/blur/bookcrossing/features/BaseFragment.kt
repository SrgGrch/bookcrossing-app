package tech.blur.bookcrossing.features

import android.os.Bundle
import android.support.v4.app.Fragment

abstract class BaseFragment : Fragment(){

    private var presenter: MvpPresenter<MvpView>? = null

    protected abstract fun <T : MvpView> getPresenter(): MvpPresenter<T>

    protected abstract fun <T : MvpView> getMvpView(): T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = getPresenter()
    }

    override fun onStart() {
        super.onStart()
        presenter!!.attachView(getMvpView())
    }

    override fun onStop() {
        super.onStop()
        presenter!!.detachView()
    }
}