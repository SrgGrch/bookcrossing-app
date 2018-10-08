package tech.blur.bookcrossing.features.core;

import javax.inject.Singleton;

import dagger.Component;
import tech.blur.bookcrossing.features.auth.signin.presentation.SignInActivity;
import tech.blur.bookcrossing.features.books.StartActivity.presentation.BookShelfActivity;
import tech.blur.bookcrossing.features.core.modules.NavigatorModule;

@Singleton
@Component(modules = {NavigatorModule.class})
public interface AppComponent {

    void inject(BookShelfActivity mainActivity);

    void inject(SignInActivity authActivity);

}
