package com.example.ramazani2020;


import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class FullscreenActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        ImageView img=(ImageView)findViewById(R.id.widget45);
        img.setImageResource(R.drawable.vaktija_2020);
    }

}
