package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class BlurImage extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blur_image);
        imageView=findViewById(R.id.ivb);
        com.jackandphantom.blurimage.BlurImage.with(getApplicationContext()).load(R.drawable.gravity).intensity(20).Async(true).into(imageView);

    }

}
