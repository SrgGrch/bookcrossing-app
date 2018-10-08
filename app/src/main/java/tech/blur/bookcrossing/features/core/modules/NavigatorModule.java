package tech.blur.bookcrossing.features.core.modules;

import dagger.Module;
import dagger.Provides;
import ru.terrakok.cicerone.Cicerone;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.Router;
import tech.blur.bookcrossing.features.core.qualifier.Global;

@Module
public class NavigatorModule {

    private Cicerone<Router> localCicerone;
    private Cicerone<Router> globalCicerone;

    public NavigatorModule() {
        localCicerone = Cicerone.create();
        globalCicerone = Cicerone.create();
    }

    @Provides
    @Global
    public Router provideGlobalRouter() {
        return globalCicerone.getRouter();
    }


    @Provides
    @Global
    public NavigatorHolder provideGlobalNavigatorHolder() {
        return globalCicerone.getNavigatorHolder();
    }
}
