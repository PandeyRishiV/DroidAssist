package com.application.droidassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotoactionsetholder = new Intent(MainActivity.this,actionsetholder.class);
                startActivity(gotoactionsetholder);
                finish();
            }
        },500);
    }
}
