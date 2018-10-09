package tech.blur.bookcrossing.features.main.bookshelf.fragments.given.presentation

import com.arellomobile.mvp.MvpView
import tech.blur.bookcrossing.features.core.books.model.Book

interface GivenBooksView: MvpView {

    fun onBooksLoaded(bookList: List<Book>)

}