package net.chakrit.android.dummy;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(library = true, overrides = true)
public class AppModuleTWO {
    @Provides @Singleton DataObject provideDataObject() {
        return new DataObjectTWO();
    }
}
