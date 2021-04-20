package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jp.shts.android.library.clockanimationview.ClockAnimationView;

public class CLockAnimation extends AppCompatActivity {

    Button button;
    ClockAnimationView clockAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_animation);
        button=findViewById(R.id.button);
        clockAnimationView=findViewById(R.id.clockanimate);
        clockAnimationView.setTime(0,0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clockAnimationView.animateToTime(6,30);
            }
        });
    }
}
