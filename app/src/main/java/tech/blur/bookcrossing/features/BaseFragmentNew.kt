package tech.blur.bookcrossing.features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment

abstract class BaseFragmentNew : MvpAppCompatFragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        injectDependencies()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    protected abstract fun injectDependencies()

    protected abstract fun getLayoutID(): Int

}