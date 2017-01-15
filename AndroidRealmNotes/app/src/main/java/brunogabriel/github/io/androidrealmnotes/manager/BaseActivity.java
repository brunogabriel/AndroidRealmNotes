package brunogabriel.github.io.androidrealmnotes.manager;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

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

    protected void setupToolbar(Toolbar mToolbar, String mTitle, String mSubtitle, boolean
            isDisplayHomeAsUpEnabled, boolean isDisplayShowHomeEnabled) {

        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
            getSupportActionBar().setTitle(mTitle == null? "": mTitle);
            getSupportActionBar().setSubtitle(mSubtitle);
            getSupportActionBar().setDisplayHomeAsUpEnabled(isDisplayHomeAsUpEnabled);
            getSupportActionBar().setDisplayShowHomeEnabled(isDisplayShowHomeEnabled);
        }
    }

    protected void applyTypefaceToolbar(Toolbar mToolbar, Typeface typeface) {
        if (mToolbar != null && typeface != null) {
            try {
                for(int i = 0; i < mToolbar.getChildCount(); i++){
                    View view = mToolbar.getChildAt(i);
                    if(view instanceof TextView){
                        TextView tv = (TextView) view;
                        if(tv.getText().equals(mToolbar.getTitle())){
                            tv.setTypeface(typeface);
                            //break;
                        }
                    }
                }
            } catch (Exception ex) {
                // Stub
            }
        }
    }

}
