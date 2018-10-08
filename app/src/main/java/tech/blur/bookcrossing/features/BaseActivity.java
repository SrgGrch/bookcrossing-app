package tech.blur.bookcrossing.features;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import ru.terrakok.cicerone.NavigatorHolder;
import tech.blur.bookcrossing.features.core.GlobalNavigator;
import tech.blur.bookcrossing.features.core.qualifier.Global;

public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    @Global
    NavigatorHolder globalNavigatorHolder;

    protected abstract <T extends MvpView> MvpPresenter<T> getPresenter();

    protected abstract <T extends MvpView> T getMvpView();

    private MvpPresenter<MvpView> presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = getPresenter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachView(getMvpView());
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        globalNavigatorHolder.setNavigator(new GlobalNavigator(this));
    }
}
