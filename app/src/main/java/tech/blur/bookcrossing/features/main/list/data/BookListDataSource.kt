package tech.blur.bookcrossing.features.main.list.data

import tech.blur.bookcrossing.features.core.books.model.Book
import tech.blur.bookcrossing.network.Carry

interface BookListDataSource {
    fun getBooks(carry : Carry<List<Book>>)
}