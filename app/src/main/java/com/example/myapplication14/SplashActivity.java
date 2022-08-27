package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread=new Thread(){

            public void run(){
                try {
                   sleep(3000);
                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent intent=new Intent(SplashActivity.this,NavigationDrawer.class);
                    startActivity(intent);
                }
            }

        };
        thread.start();

        if(Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));
        }

    }
}