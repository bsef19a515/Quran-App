package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     Button btneng,btnurdu,btnengpara,btnurdupara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btneng=findViewById(R.id.englishsurah);
        btnurdu=findViewById(R.id.urdusurah);
        btnengpara=findViewById(R.id.englishparah);
        btnurdupara=findViewById(R.id.urduparah);

        btneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,EngSurahNames.class);
                startActivity(intent);
            }
        });

        btnurdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UrduSurahNames.class);
                startActivity(intent);
            }
        });
        btnengpara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,EngParahNames.class);
                startActivity(intent);
            }
        });

        btnurdupara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UrduParahNames.class);
                startActivity(intent);
            }
        });


    }

}