package tech.blur.bookcrossing.features.main.list.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.book_list_fragment.*
import tech.blur.bookcrossing.R
import tech.blur.bookcrossing.features.core.books.model.Book


class BookListFragment : BookListView, MvpAppCompatFragment()  {
    @InjectPresenter
    lateinit var mPresenter: BookListPresenter

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.book_list_fragment, container, false)

    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showBookList(list: List<Book>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun signOutDone(isAuth: Boolean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}