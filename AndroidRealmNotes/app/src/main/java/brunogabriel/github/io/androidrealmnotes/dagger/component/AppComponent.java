package brunogabriel.github.io.androidrealmnotes.dagger.component;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import brunogabriel.github.io.androidrealmnotes.dagger.module.AppModule;
import brunogabriel.github.io.androidrealmnotes.views.activities.LoginActivity;
import dagger.Component;

/**
 * Created by brunogabriel on 15/01/17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    SharedPreferences preferences();
    void inject(LoginActivity activity);
}
