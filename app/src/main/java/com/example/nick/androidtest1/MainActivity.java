package com.example.nick.androidtest1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.nick.androidtest1.data.AppDatabase;
import com.example.nick.androidtest1.data.User;

import java.util.List;

public class MainActivity extends Activity {
    public static final String ID_EMAIL = "com.example.nick.email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        AppDatabase db = AppDatabase.getInstance(getApplicationContext());
        // List<User> users = db.userDao().getAll();

        Intent intent = new Intent(this, SecondActivity.class);
        EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
        String email = txtEmail.getText().toString();
        intent.putExtra(ID_EMAIL, email);
        //startActivity(intent);

        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
        // Or map point based on latitude/longitude
        // Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
}
