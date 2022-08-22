package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EngSurahNames extends AppCompatActivity {
    ListView listVieweng;

    QDH qdh=new QDH();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_surah_names);

        String[] surahNameseng=qdh.englishSurahNames;


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,surahNameseng);
        listVieweng = findViewById(R.id.listviewenglish);
        listVieweng.setAdapter(arrayAdapter);

    }
}