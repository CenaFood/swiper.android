package ch.cena.swiper.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import ch.cena.swiper.android.R;
import ch.cena.swiper.android.welcome;


public class swiper extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "ch.cena.cenaswiper.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiper);
    }

    public void startSwiper(View view){
        Intent intent = new Intent(this, welcome.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
