package com.example.makingit.softchatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by makingit on 11/12/18.
 */

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
    }

    public void settings (View view){
        Intent goToSettings = new Intent(this, SettingActivity2.class);
        startActivity(goToSettings);
    }

    public void userList (View view){
        Intent goToUserList = new Intent(this, UserList.class);
        startActivity(goToUserList);
    }

}
