package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Thread background = new Thread(){
          public void run(){
              try{
                  sleep(5*1000);
                  Intent intent = new Intent(Splash.this,Login.class);
                  startActivity(intent);
                  finish();
              }
              catch (Exception e)
              {
                  Toast.makeText(Splash.this,e.toString(),Toast.LENGTH_LONG).show();
              }
          }
        };
        background.start();
    }
}
