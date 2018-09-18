package tech.blur.bookcrossing.features.core;

import android.app.Activity;
import android.content.Intent;

import ru.terrakok.cicerone.Navigator;
import ru.terrakok.cicerone.commands.Command;
import ru.terrakok.cicerone.commands.Forward;
import tech.blur.bookcrossing.features.books.bookshelf.BookShelfActivity;

public class GlobalNavigator implements Navigator {

    private Activity activity;

    public GlobalNavigator(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void applyCommands(Command[] commands) {
        if (commands[0] instanceof Forward) {
            Intent intent;
            switch (((Forward) commands[0]).getScreenKey()){
                case Screens.BOOK_SHELF:
                    intent = new Intent(activity, BookShelfActivity.class);
                    activity.startActivity(intent);
                    activity.finish();
                    break;
            }
        }
    }
}
