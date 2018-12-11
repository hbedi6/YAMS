package com.example.makingit.softchatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by makingit on 11/12/18.
 */

public class TextActivity extends AppCompatActivity {

    //onCreate to to link this java class to the text activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
    }

    //settings will take the user to the settings screen
    public void settings (View view){
        Intent goToSettings = new Intent(this, SettingActivity2.class);
        startActivity(goToSettings);
    }

    //user list will take the user to the user list screen
    public void userList (View view){
        Intent goToUserList = new Intent(this, UserList.class);
        startActivity(goToUserList);
    }

}
