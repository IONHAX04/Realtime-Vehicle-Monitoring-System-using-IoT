package com.example.realtimevehiclemonitoringsystemthinkspeakiot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Fleet3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet3);


        //        WEB 1 TEMPERATURE
        WebView webView = (WebView) findViewById(R.id.web_field1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://thingspeak.com/channels/1973737/charts/3?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15");

        WebView webView1 = (WebView) findViewById(R.id.number_field1);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl("https://thingspeak.com/channels/1973737/widgets/642854");
    }
}