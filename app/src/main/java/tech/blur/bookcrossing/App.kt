package tech.blur.bookcrossing

import android.app.Application
import android.content.Context
import tech.blur.bookcrossing.features.core.AppComponent
import tech.blur.bookcrossing.features.core.DaggerAppComponent


import tech.blur.bookcrossing.network.RetrofitProvider

class App : Application() {

    private lateinit  var retrofitProvider: RetrofitProvider


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

        var component: AppComponent? = null
    }
}
