package tech.blur.bookcrossing.features.main.list.presentation

import android.view.View
import com.arellomobile.mvp.MvpView
import tech.blur.bookcrossing.features.core.books.model.Book

interface BookListView : MvpView {
     fun showProgress(view : View)

     fun hideProgress(view : View)

     fun showBookList(list: ArrayList<Book>)

     fun signOutDone(isAuth: Boolean?)

     fun showError(message: String)
}