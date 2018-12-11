package com.example.makingit.softchatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    //onCreate is to link the main activity screen to this javav class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //join chat is to move the user to the messaging screen
    public void joinChat (View view){
        Intent joinChatNow = new Intent(this, TextActivity.class);
            startActivity(joinChatNow);
    }


}
