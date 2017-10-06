package ch.cena.swiper.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class swiper extends AppCompatActivity {

    public static final String EXTRA_USER_NAME = "ch.cena.swiper.android.EXTRA_USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiper);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(EXTRA_USER_NAME);

        TextView textView = (TextView) findViewById(R.id.txtUsername);
        textView.setText(userName);
    }
}
