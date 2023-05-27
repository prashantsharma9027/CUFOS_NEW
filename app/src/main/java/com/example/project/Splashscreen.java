package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {
    private static int SPLASH_SCREEN=3000;

    ImageView image;
    TextView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splashscreen);

        image =(ImageView) findViewById(R.id.imageView);
        logo =(TextView) findViewById(R.id.textView);

        new Handler ().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent0= new Intent(Splashscreen.this,MainActivity.class);
                startActivity(intent0);
                finish();

            }
        },SPLASH_SCREEN);

    }
}