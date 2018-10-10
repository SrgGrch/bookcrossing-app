package tech.blur.bookcrossing.features.main

import android.app.Fragment
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.support.v7.appcompat.R.id.add
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import tech.blur.bookcrossing.R
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.fragment_all_books.*
import tech.blur.bookcrossing.features.main.list.presentation.AllBooksFragment


class BookShelfActivity : AppCompatActivity() {



    private var mFirebaseAuth: FirebaseAuth? = null
    private var mFirebaseUser: FirebaseUser? = null

    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        mFirebaseAuth = FirebaseAuth.getInstance()
        mFirebaseUser = mFirebaseAuth?.currentUser

        supportFragmentManager.inTransaction {
            add(R.id.fr_place,AllBooksFragment())
        }

//        if (mFirebaseUser == null){
//            SignInActivity.start(this)
//        }

    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

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
    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
        val fragmentTransaction = beginTransaction()
        fragmentTransaction.func()
        fragmentTransaction.commit()
    }
//    override fun <T : MvpView> getPresenter(): MvpPresenter<T> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun <T : MvpView> getMvpView(): T {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
}
