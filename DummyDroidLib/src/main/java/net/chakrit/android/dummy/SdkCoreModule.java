package net.chakrit.android.dummy;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(library = true)
public class SdkCoreModule {
    @Provides @Singleton DataObject provideDataObject() {
        return new DataObject();
    }
}
