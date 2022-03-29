package com.example.smpnegeri2suradadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kelas9Activity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas9);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("kelas9.pdf").load();
    }
}