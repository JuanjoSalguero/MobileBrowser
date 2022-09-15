package com.example.mobilebrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Vincular con la parte gráfica "google" (activity 2)
        webView = (WebView) findViewById(R.id.google);

        String information = getIntent().getStringExtra("writen");

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.google.es/search?q=" + information);
    }
}