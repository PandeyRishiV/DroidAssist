package com.application.droidassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class createactionset extends AppCompatActivity {
    EditText title;
    Button test;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createactionset);

        wifiManager = (WifiManager) createactionset.this.getApplicationContext().getSystemService(WIFI_SERVICE);

        test = findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wifiManager.isWifiEnabled())
                {
                    wifiManager.setWifiEnabled(false);
                }
                else if(!wifiManager.isWifiEnabled())
                {
                    wifiManager.setWifiEnabled(true);
                }

            }
        });
    }
}
