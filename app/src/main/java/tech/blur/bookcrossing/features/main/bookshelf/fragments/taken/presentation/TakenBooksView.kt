package tech.blur.bookcrossing.features.main.bookshelf.fragments.taken.presentation

import com.arellomobile.mvp.MvpView
import tech.blur.bookcrossing.features.core.books.model.Book

interface TakenBooksView: MvpView {

    fun onBooksLoaded(bookList: List<Book>)

}