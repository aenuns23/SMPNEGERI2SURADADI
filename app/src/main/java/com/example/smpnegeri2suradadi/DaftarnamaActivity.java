package com.example.smpnegeri2suradadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaftarnamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarnama);
    }

    public void kelas7(View view) {
        Intent intent = new Intent(DaftarnamaActivity.this, Kelas7Activity.class);
        startActivity(intent);
    }

    public void kelas8(View view) {
        Intent intent = new Intent(DaftarnamaActivity.this, Kelas8Activity.class);
        startActivity(intent);
    }

    public void kelas9(View view) {
        Intent intent = new Intent(DaftarnamaActivity.this, Kelas9Activity.class);
        startActivity(intent);
    }
}