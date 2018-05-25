package com.example.user.ar1;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        ab.setDisplayShowTitleEnabled(true);
        ab.setDisplayShowHomeEnabled(true);
    }
}
