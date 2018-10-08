package tech.blur.bookcrossing

import android.app.Application
import android.content.Context
import tech.blur.bookcrossing.features.core.AppComponent
import tech.blur.bookcrossing.features.core.DaggerAppComponent


import tech.blur.bookcrossing.network.RetrofitProvider

class App : Application() {

    private var retrofitProvider: RetrofitProvider? = null

    private var component: AppComponent? = null

    fun getComponent(): AppComponent? {
        return component
    }

    override fun onCreate() {
        super.onCreate()
        retrofitProvider = RetrofitProvider()
        component = DaggerAppComponent.builder()
                .build()
    }

    companion object {

        fun getRetrofitProvider(context: Context): RetrofitProvider? {
            return getApp(context).retrofitProvider
        }

        private fun getApp(context: Context): App {
            return context.applicationContext as App
        }
    }
}
