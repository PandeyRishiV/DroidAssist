package com.application.droidassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class actionsetholder extends AppCompatActivity {
    ListView actionsetlistview;
    Button addactionsetbutton;
    TextView listviewtext;
    ArrayList<String> actionsetnames;
    ArrayAdapter<String> actionsetadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionsetholder);

        actionsetlistview = findViewById(R.id.actionsetlistview);
        addactionsetbutton = findViewById(R.id.addactionsetbutton);
        listviewtext = findViewById(R.id.listviewtext);

        //TODO set up shared preference for creating list of all the action sets when added/created

        addactionsetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent tocreateactionset = new Intent(actionsetholder.this,createactionset.class);
                startActivity(tocreateactionset);
                finish();
            }
        });
    }
}