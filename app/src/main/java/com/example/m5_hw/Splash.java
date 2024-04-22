package com.example.m5_hw;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/************************************************************************************
 *
 *  The Splash Screen activity shows the user a Splash screen with an image and text.
 *  After some time, the user is taken to the main activity screen
 *
 *************************************************************************************/

public class Splash extends AppCompatActivity {

    Handler handler;
    final int TIME_LIMIT = 8000;     // The time delay after splash screen in milliseconds.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        // postDelayed(Runnable, time) method is used to start the second activity with a delay
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME_LIMIT);
    }
}

/*********************************** End of Splash Screen ****************************************/