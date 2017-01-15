package brunogabriel.github.io.androidrealmnotes.manager;

import android.app.Application;
import android.content.Context;

import brunogabriel.github.io.androidrealmnotes.dagger.component.AppComponent;
import brunogabriel.github.io.androidrealmnotes.dagger.component.DaggerAppComponent;
import brunogabriel.github.io.androidrealmnotes.dagger.module.AppModule;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by brunogabriel on 15/01/17.
 */

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDagger();
        setupCalligraphy();
    }

    private void setupDagger() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    private void setupCalligraphy() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto/Roboto-Regular.ttf")
                .setFontAttrId(uk.co.chrisjenx.calligraphy.R.attr.fontPath)
                .build());

    }

    public static AppComponent getAppComponent(Context context) {
        return ((App) context.getApplicationContext()).appComponent;
    }
}
