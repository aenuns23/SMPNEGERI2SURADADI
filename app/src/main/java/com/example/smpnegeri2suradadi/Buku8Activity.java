package com.example.smpnegeri2suradadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Buku8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku8);
    }

    public void mtk8(View view) {
        goToUrl("https://drive.google.com/file/d/1QXpoCmuE9qx2lxvllD5u2nntsGpC6zUQ/view?usp=sharing");
    }

    public void ipa8(View view) {
        goToUrl("https://drive.google.com/file/d/1IVlMAu5WvVR5WCMfXqzqXmyJfEN1KViQ/view?usp=sharing");
    }

    public void prakarya8(View view) {
        goToUrl("https://drive.google.com/file/d/1QDSKJmU-TBtyPsthsk4xDOcyePCDqlMi/view?usp=sharing");
    }

    public void bind8(View view) {
        goToUrl("https://drive.google.com/file/d/1QJi9YctnB1aac2WLgm7j-7jEA-vzfwDQ/view?usp=sharing");
    }

    public void bing8(View view) {
        goToUrl("https://drive.google.com/file/d/1QMN-DaOtw7rA5IzRLBCLsljKgvxc3hMs/view?usp=sharing");
    }

    public void pai8(View view) {
        goToUrl("https://drive.google.com/file/d/1QbEAk6y-Veee89ga4J9AQyC1xJ-4fmfo/view?usp=sharing");
    }

    public void ppkn8(View view) {
        goToUrl("https://drive.google.com/file/d/1IHQihHJPuT2Wjv6whNvwtgcXDXX_pjMO/view?usp=sharing");
    }

    public void pjok8(View view) {
        goToUrl("https://drive.google.com/file/d/1IH2zX5IZNIUUjL-xHT3eOS2HE8QJDipw/view?usp=sharing");
    }

    public void sbk8(View view) {
        goToUrl("https://drive.google.com/file/d/1QkM2zZghoT0BJUKLZF2Bc42hwqwiy3G0/view?usp=sharing");
    }

    public void ips8(View view) {
        goToUrl("https://drive.google.com/file/d/1QTT70ghMSve9x1N8VKC14BUzWfJJhcrR/view?usp=sharing");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}