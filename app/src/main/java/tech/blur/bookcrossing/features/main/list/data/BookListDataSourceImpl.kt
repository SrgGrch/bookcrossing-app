package tech.blur.bookcrossing.features.main.list.data

import tech.blur.bookcrossing.features.core.books.model.Book
import tech.blur.bookcrossing.network.Carry
import tech.blur.bookcrossing.network.DefaultCallback

class BookListDataSourceImpl(val bookListApi: BookListApi) : BookListDataSource
{
    override fun getBooks(carry: Carry<List<Book>>) {
           bookListApi.getBookList().enqueue(DefaultCallback(carry))
    }


}