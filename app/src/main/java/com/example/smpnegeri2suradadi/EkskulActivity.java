package com.example.smpnegeri2suradadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class EkskulActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.ekskul1,
            R.drawable.ekskul2,
            R.drawable.ekskul3,
            R.drawable.ekskul4,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void osis(View view) {
        Intent intent = new Intent(EkskulActivity.this, OsisActivity.class);
        startActivity(intent);
    }

    public void pramuka(View view) {
        Intent intent = new Intent(EkskulActivity.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(EkskulActivity.this, PmrActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(EkskulActivity.this, FutsalActivity.class);
        startActivity(intent);
    }

    public void bulutangkis(View view) {
        Intent intent = new Intent(EkskulActivity.this, BulutangkisActivity.class);
        startActivity(intent);
    }
}