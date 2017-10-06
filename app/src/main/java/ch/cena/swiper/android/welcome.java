package ch.cena.swiper.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void startLogin(View view){
        Intent intent = new Intent(this, swiper.class);
        EditText editText = (EditText) findViewById(R.id.txtUserName);
        String userName = editText.getText().toString();
        intent.putExtra(swiper.EXTRA_USER_NAME,userName);
        startActivity(intent);

    }
}
