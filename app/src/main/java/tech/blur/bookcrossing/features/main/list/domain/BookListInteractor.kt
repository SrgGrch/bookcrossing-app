package tech.blur.bookcrossing.features.main.list.domain

import tech.blur.bookcrossing.features.core.books.model.Book
import tech.blur.bookcrossing.network.Carry

interface BookListInteractor {
    abstract fun loadEvents(carry: Carry<List<Book>>)
}