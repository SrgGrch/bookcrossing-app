package tech.blur.bookcrossing.features.main.bookshelf.fragments.given.presentation

import tech.blur.bookcrossing.App
import tech.blur.bookcrossing.R
import tech.blur.bookcrossing.features.BaseFragmentNew
import tech.blur.bookcrossing.features.core.books.model.Book

class GivenBooksFragment: BaseFragmentNew(), GivenBooksView {





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