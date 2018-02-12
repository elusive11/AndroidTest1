package com.example.nick.androidtest1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.ID_EMAIL);

        TextView txtEmail = findViewById(R.id.lblEmail);
        txtEmail.setText(email);
    }

}
