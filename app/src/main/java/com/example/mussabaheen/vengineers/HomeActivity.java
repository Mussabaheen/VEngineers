package com.example.mussabaheen.vengineers;

import android.content.Intent;
import android.os.Handler;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private static int SPLASH_TIMEOUT=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent;
                homeIntent= new Intent(HomeActivity.this,Main2Activity.class);
                homeIntent.putExtra("run",true);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIMEOUT);
    }

}
