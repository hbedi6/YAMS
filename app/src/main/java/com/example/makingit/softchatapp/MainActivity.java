package com.example.makingit.softchatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void joinChat (View view){
        Intent joinChatNow = new Intent(this, TextActivity.class);
            startActivity(joinChatNow);
    }


}
