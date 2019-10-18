package com.application.droidassist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class actionsetholder extends AppCompatActivity {
    ListView actionsetlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionsetholder);

        actionsetlistview = findViewById(R.id.actionsetlistview);
    }
}
