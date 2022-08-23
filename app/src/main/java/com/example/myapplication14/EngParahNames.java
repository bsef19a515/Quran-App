package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EngParahNames extends AppCompatActivity {
    ListView listView;

    QDH qdh=new QDH();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_parah_names);

        String[] parahNameseng=qdh.englishParahName;


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,parahNameseng);
        listView = findViewById(R.id.listviewenglishpara);
        listView.setAdapter(arrayAdapter);

    }
}