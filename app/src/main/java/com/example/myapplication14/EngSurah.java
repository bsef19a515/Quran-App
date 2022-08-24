package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class EngSurah extends AppCompatActivity {
    QDH qdh=new QDH();
    QuranArabicText qat=new QuranArabicText();
    ListView engSurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_surah);

        int start=qdh.getSurahStart(0);
        int end=qdh.SSP[1]-1;

        List data= Arrays.asList(qat.QuranArabicText).subList(start,end);




        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,data);

        engSurah=findViewById(R.id.engsurah);
        String name=getIntent().getStringExtra("file");
        if(name.equals("Al-Fatihah")){
            engSurah.setAdapter(arrayAdapter);
        }

    }

}