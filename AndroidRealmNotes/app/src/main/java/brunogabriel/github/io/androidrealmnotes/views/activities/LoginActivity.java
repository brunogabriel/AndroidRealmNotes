package brunogabriel.github.io.androidrealmnotes.views.activities;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;

import java.util.Locale;

import brunogabriel.github.io.androidrealmnotes.R;
import brunogabriel.github.io.androidrealmnotes.manager.BaseActivity;

/**
 * Created by brunogabriel on 14/01/17.
 */

public class LoginActivity extends BaseActivity {

    // TODO: Use Butterknife
    protected AppCompatTextView tvNoAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUI();
    }

    @Override
    protected void initUI() {
        tvNoAccount = (AppCompatTextView) findViewById(R.id.tvNoAccount);

        String noAccount = getString(R.string.app_login_activity_no_account);
        String signup = getString(R.string.app_login_activity_signup);

        SpannableString spannableString = new SpannableString(noAccount + " " + signup.toUpperCase(Locale.getDefault()));
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), spannableString.length() - signup.length(), spannableString.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);

        tvNoAccount.setText(spannableString);
    }
}
