package tech.blur.bookcrossing.features.main.list.data

import retrofit2.Call
import retrofit2.http.GET
import tech.blur.bookcrossing.features.core.books.model.Book
import tech.blur.bookcrossing.features.core.books.model.Wrapper

interface BookListApi {
    @GET("events")
    abstract fun getBookList(): Call<Wrapper<List<Book>>>
}