package brunogabriel.github.io.androidrealmnotes.dagger.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by brunogabriel on 15/01/17.
 */

@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    SharedPreferences providePreferences() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
