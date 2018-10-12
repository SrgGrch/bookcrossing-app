package tech.blur.bookcrossing.features.main.bookshelf.fragments.given.presentation

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import tech.blur.bookcrossing.App
import tech.blur.bookcrossing.R
import tech.blur.bookcrossing.features.BaseFragmentNew
import tech.blur.bookcrossing.features.core.books.model.Book

class GivenBooksFragment: BaseFragmentNew(), GivenBooksView {


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_profile -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_feed -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_bookshelf -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun getLayoutID(): Int {
        return R.layout.fragments_givenbooks
    }

    override fun injectDependencies() {
        App.component!!.inject(this)
    }


    override fun onBooksLoaded(bookList: List<Book>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}