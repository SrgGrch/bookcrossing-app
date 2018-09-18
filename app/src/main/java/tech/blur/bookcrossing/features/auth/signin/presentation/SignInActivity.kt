package tech.blur.bookcrossing.features.auth.signin.presentation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import tech.blur.bookcrossing.R
import com.firebase.ui.auth.AuthUI
import java.util.*
import java.util.Arrays.asList
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import android.R.attr.data
import android.app.Activity
import android.widget.Toast
import com.firebase.ui.auth.IdpResponse





class SignInActivity : AppCompatActivity(){

    private val RC_SIGN_IN = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }

    fun createSignInIntent(){
        val providers = Arrays.asList(
                AuthUI.IdpConfig.EmailBuilder().build())

        // Create and launch sign-in intent
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .build(),
                RC_SIGN_IN)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == RC_SIGN_IN) {
            val response = IdpResponse.fromResultIntent(data)

            if (resultCode == Activity.RESULT_OK) {
                // Successfully signed in
                val user = FirebaseAuth.getInstance().currentUser
                Toast.makeText(this,"done", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this,"fail", Toast.LENGTH_LONG).show()
            }
        }
    }
}
