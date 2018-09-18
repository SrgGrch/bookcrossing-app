package tech.blur.bookcrossing.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProvider {

    val retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .client(createClient())
                .build()
    }

    private fun createClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()

        val logInterceptor = HttpLoggingInterceptor()
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY

        builder.addInterceptor(logInterceptor)

        return builder.build()

    }

    companion object {

        private val BASE_URL = "http://40.114.255.221:1984/api/v001/"

    }

}
