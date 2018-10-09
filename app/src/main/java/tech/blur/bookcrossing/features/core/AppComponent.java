package tech.blur.bookcrossing.features.core;

import javax.inject.Singleton;

import dagger.Component;
import tech.blur.bookcrossing.features.auth.signin.presentation.SignInActivity;
import tech.blur.bookcrossing.features.core.modules.NavigatorModule;
import tech.blur.bookcrossing.features.main.BookShelfActivity;
import tech.blur.bookcrossing.features.main.bookshelf.fragments.given.presentation.GivenBooksFragment;
import tech.blur.bookcrossing.features.main.bookshelf.presentation.BookShelfFragment;

@Singleton
@Component(modules = {NavigatorModule.class})
public interface AppComponent {

    void inject(BookShelfActivity mainActivity);

    void inject(BookShelfFragment bookShelfFragment);

    void inject(SignInActivity authActivity);

    void inject(GivenBooksFragment givenBooksFragment);

}
