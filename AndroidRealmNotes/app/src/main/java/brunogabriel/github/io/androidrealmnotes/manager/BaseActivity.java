package brunogabriel.github.io.androidrealmnotes.manager;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by brunogabriel on 14/01/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected void initUI() {};

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}
