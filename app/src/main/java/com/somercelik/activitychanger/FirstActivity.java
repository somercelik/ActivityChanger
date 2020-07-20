package com.somercelik.activitychanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText editText;
    String userName;
    //created by @somercelik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editText = findViewById(R.id.editText);
    }

    public void changeToSecond(View view) {
        userName = editText.getText().toString();

        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra("userInput", userName);
        startActivity(intent);

    }

}