package tech.blur.bookcrossing.features.main.bookshelf.presentation

import tech.blur.bookcrossing.App
import tech.blur.bookcrossing.R
import tech.blur.bookcrossing.features.BaseFragmentNew

class BookShelfFragment: BaseFragmentNew(){

    override fun injectDependencies() {
        App.component!!.inject(this)
    }

    override fun getLayoutID(): Int {
        return R.layout.fragment_bookshelf
    }






    //TODO Фрагмент содержащий табы
}