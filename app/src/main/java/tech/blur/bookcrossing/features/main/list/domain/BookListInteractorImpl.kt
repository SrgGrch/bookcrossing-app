package tech.blur.bookcrossing.features.main.list.domain

import tech.blur.bookcrossing.features.core.books.model.Book
import tech.blur.bookcrossing.features.main.list.data.BookListRepository
import tech.blur.bookcrossing.network.Carry

class BookListInteractorImpl(val bookListRepository: BookListRepository) : BookListInteractor {
    override fun loadEvents(carry: Carry<List<Book>>) {
        bookListRepository.loadBooks(carry)
    }
}