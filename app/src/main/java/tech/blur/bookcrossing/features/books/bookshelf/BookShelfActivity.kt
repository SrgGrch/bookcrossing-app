package tech.blur.bookcrossing.features.books.bookshelf

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import tech.blur.bookcrossing.R
import tech.blur.bookcrossing.features.auth.signin.presentation.SignInActivity

class BookShelfActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_bookshelf -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

//    override fun <T : MvpView> getPresenter(): MvpPresenter<T> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun <T : MvpView> getMvpView(): T {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
}
