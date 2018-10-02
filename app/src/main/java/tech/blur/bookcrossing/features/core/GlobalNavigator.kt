package tech.blur.bookcrossing.features.core

import android.app.Activity
import android.content.Intent

import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.commands.Command
import ru.terrakok.cicerone.commands.Forward
import tech.blur.bookcrossing.features.auth.signin.presentation.SignInActivity
import tech.blur.bookcrossing.features.main.BookShelfActivity

class GlobalNavigator(private val activity: Activity) : Navigator {

    override fun applyCommands(commands: Array<Command>) {
        if (commands[0] is Forward) {
            val intent: Intent
            when ((commands[0] as Forward).screenKey) {
                Screens.BOOK_SHELF -> {
                    intent = Intent(activity, BookShelfActivity::class.java)
                    activity.startActivity(intent)
                    activity.finish()
                }
                Screens.SIGN_IN -> {
                    intent = Intent(activity, SignInActivity::class.java)
                    activity.startActivity(intent)
                    activity.finish()
                }
            }
        }
    }
}
