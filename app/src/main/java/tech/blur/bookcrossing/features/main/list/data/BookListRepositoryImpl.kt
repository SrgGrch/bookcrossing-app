package tech.blur.bookcrossing.features.main.list.data

import tech.blur.bookcrossing.features.core.books.model.Book
import tech.blur.bookcrossing.network.Carry

class BookListRepositoryImpl(val bookListDataSource: BookListDataSource) : BookListRepository {
    override fun loadBooks(carry: Carry<List<Book>>) {
        bookListDataSource.getBooks(carry)
    }
}