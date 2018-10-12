package tech.blur.bookcrossing.features.main.bookshelf.fragments.given.presentation

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.terrakok.cicerone.Router
import tech.blur.bookcrossing.features.core.qualifier.Global
import javax.inject.Inject

@InjectViewState
class GivenBooksPresenter: MvpPresenter<GivenBooksView>() {

    @Inject
    @Global
    lateinit var  globalRouter: Router //Navigation init







}