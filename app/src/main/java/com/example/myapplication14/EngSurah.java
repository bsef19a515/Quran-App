package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EngSurah extends AppCompatActivity  {
    Window window;
    QuranArabicText qat=new QuranArabicText();
    ListView engSurah;
    ArrayList<String> data = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_surah);

        engSurah=findViewById(R.id.engsurah);

        Intent intent = getIntent();
        int start = intent.getIntExtra("start", 0);
        int end = intent.getIntExtra("end", 0);



        for (int i = start; i < end - 1; i++) {
            data.add(qat.QuranArabicText[i]);
        }
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                (this, android.R.layout.simple_list_item_1,data);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (getApplicationContext(),R.layout.text_layout,data);
        engSurah.setAdapter(arrayAdapter);


        if(Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));
        }

    }

}