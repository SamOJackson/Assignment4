package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //use threads

        //create a runnable that navigates to the main activity.
        //schedule this runnable to execute after 3 seconds.

        Runnable task = () ->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        };
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.schedule(task, 3, TimeUnit.SECONDS);

    }
}