package com.somercelik.activitychanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView2;
    String userName;

    /*İki Activity arasındaki data transferi sağlanmıştır.
     * created by @somercelik*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        userName = intent.getStringExtra("userInput");
        textView2.setText(userName);
    }

    public void changeToFirst(View view) {
        Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
        startActivity(intent);
    }
}