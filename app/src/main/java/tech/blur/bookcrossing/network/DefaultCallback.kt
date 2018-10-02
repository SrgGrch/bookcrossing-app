package tech.blur.bookcrossing.network

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import tech.blur.bookcrossing.exception.EmptyBodyException
import tech.blur.bookcrossing.features.core.books.model.Wrapper

class DefaultCallback<T>(private val carry: Carry<T>) : Callback<Wrapper<T>> {

    override fun onResponse(call: Call<Wrapper<T>>, response: Response<Wrapper<T>>) {
        val wrapper = response.body()
        if (wrapper != null) {
            carry.onSuccess(wrapper.data)
        } else {
            carry.onFailure(EmptyBodyException())
        }
    }

    override fun onFailure(call: Call<Wrapper<T>>, t: Throwable) {
        carry.onFailure(t)
    }

}