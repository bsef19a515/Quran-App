package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        listVieweng.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item=listVieweng.getItemAtPosition(i).toString();
                Intent intent=new Intent(getApplicationContext(),EngSurah.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
    }
}