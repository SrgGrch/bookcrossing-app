package tech.blur.bookcrossing.features

class MvpPresenter<View : MvpView> {
    private var view: View? = null

    fun attachView(view: View) {
        this.view = view
        onViewReady()
    }

    fun detachView() {
        view = null
    }

    private fun onViewReady() {
        // override if need
    }
}
