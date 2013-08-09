package net.chakrit.android.dummy;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(
        injects = { MainActivity.class },
        library = true,
        overrides = true
)
public class AppModuleONE {
    @Provides @Singleton DataObject provideDataObject() {
        return new DataObjectONE();
    }
}
