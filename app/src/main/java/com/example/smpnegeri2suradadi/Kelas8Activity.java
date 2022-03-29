package com.example.smpnegeri2suradadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kelas8Activity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas8);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("kelas8.pdf").load();
    }
}