package tech.blur.bookcrossing.features.main.list.presentation

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_all_books.*

import kotlinx.android.synthetic.main.fragment_all_books.view.*
import org.jetbrains.annotations.Nullable
import tech.blur.bookcrossing.R
import tech.blur.bookcrossing.features.core.books.BookListAdapter
import tech.blur.bookcrossing.features.core.books.model.Book


 class AllBooksFragment : MvpAppCompatFragment(),BookListView{


    @InjectPresenter
    lateinit var mPresenter: BookListPresenter

     val books : ArrayList<Book> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
// todo end the motherfucking fragment
        val view: View =  inflater.inflate(R.layout.fragment_all_books, container, false)
        books.add(Book(2, "wefef", "kefwpoekfewpo", 12, 16, null, null, null))
        books.add(Book(2, "wefef", "kefwpoekfewpo", 12, 16, null, null, null))
        books.add(Book(2, "wefef", "kefwpoekfewpo", 12, 16, null, null, null))
        books.add(Book(2, "wefef", "kefwpoekfewpo", 12, 16, null, null, null))



        view.all_books_recycler_view.layoutManager = LinearLayoutManager(this.requireContext())

        view.all_books_recycler_view!!.adapter = BookListAdapter(books, this.requireContext(), object : BookListAdapter.SelectBookListener {
            override fun onBookSelected(book: Book) {

            }
        })
        hideProgress(view)

        return  view;
    }


    override fun showProgress(view : View) {
        view?.all_books_progressBar?.setVisibility(View.VISIBLE)
        view?.all_books_recycler_view?.setVisibility(View.GONE)

    }

    override fun hideProgress(view : View) {
        view?.all_books_progressBar?.setVisibility(View.GONE)
        view?.all_books_recycler_view?.setVisibility(View.VISIBLE)
    }

    override fun showBookList(list: ArrayList<Book>) {
         list.reverse()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun signOutDone(isAuth: Boolean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}




