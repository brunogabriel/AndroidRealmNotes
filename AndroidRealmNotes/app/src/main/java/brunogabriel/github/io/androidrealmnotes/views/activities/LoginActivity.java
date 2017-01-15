package brunogabriel.github.io.androidrealmnotes.views.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;

import java.util.Locale;

import javax.inject.Inject;

import brunogabriel.github.io.androidrealmnotes.R;
import brunogabriel.github.io.androidrealmnotes.manager.App;
import brunogabriel.github.io.androidrealmnotes.manager.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by brunogabriel on 14/01/17.
 */

public class LoginActivity extends BaseActivity {

    @BindView(R.id.tvNoAccount)
    protected AppCompatTextView tvNoAccount;

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        App.getAppComponent(this).inject(this);
        initUI();
    }

    @Override
    protected void initUI() {
        ButterKnife.bind(this);
        // Apply Spannable String Effect
        String noAccount = getString(R.string.app_login_activity_no_account);
        String signup = getString(R.string.app_login_activity_signup);
        SpannableString spannableString = new SpannableString(noAccount + " " + signup.toUpperCase(Locale.getDefault()));
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), spannableString.length() - signup.length(),
                spannableString.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        tvNoAccount.setText(spannableString);
    }

    @OnClick(R.id.tvNoAccount)
    protected void onClickSignup() {
        Intent mIntent = new Intent(this, SignupActivity.class);
        startActivity(mIntent);
    }
}
