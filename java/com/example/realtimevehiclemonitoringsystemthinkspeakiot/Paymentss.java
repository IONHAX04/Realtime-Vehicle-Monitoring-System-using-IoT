package com.example.realtimevehiclemonitoringsystemthinkspeakiot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Paymentss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentss);

        findViewById(R.id.register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Paymentss.this, Contents.class);
                startActivity(intent);
                Toast.makeText(Paymentss.this, "PAYMENT SUCCESSFUL", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}