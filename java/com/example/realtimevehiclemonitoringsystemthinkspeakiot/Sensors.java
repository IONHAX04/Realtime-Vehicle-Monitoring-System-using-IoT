package com.example.realtimevehiclemonitoringsystemthinkspeakiot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Sensors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors);

        findViewById(R.id.analysis1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sensors.this, Fleet1.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.analysis2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sensors.this, Fleet2.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.analysis3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sensors.this, Fleet3.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.analysis4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sensors.this, Fleet4.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.analysis5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sensors.this, Fleet5.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.analysis6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sensors.this, Fleet6.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.analysis7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sensors.this, Fleet7.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.analysis8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sensors.this, Fleet8.class);
                startActivity(intent);
            }
        });
    }
}