package tech.blur.bookcrossing.features.main.list.presentation

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.LinearLayout
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.book_list_fragment.*
import tech.blur.bookcrossing.R
import tech.blur.bookcrossing.features.core.books.BookListAdapter
import tech.blur.bookcrossing.features.core.books.model.Book


class BookListFragment : BookListView, MvpAppCompatFragment()  {
    @InjectPresenter
    lateinit var mPresenter: BookListPresenter

    val books : ArrayList<Book> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater?.inflate(R.layout.book_list_fragment, container, false)

        all_books_recycler_view.layoutManager = LinearLayoutManager(this.requireContext())

       // all_books_recycler_view.adapter = BookListAdapter(books, this.requireContext())
    }

    override fun showProgress() {
        all_books_progressBar.visibility = View.VISIBLE
        all_books_recycler_view.visibility = View.GONE

    }

    override fun hideProgress() {
       all_books_progressBar.visibility = View.GONE
       all_books_recycler_view.visibility = View.VISIBLE
    }

    override fun showBookList(list: ArrayList<Book>) {
      if(list!=null)  list.reverse()

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun signOutDone(isAuth: Boolean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}