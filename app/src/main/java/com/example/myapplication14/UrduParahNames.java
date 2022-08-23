package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UrduParahNames extends AppCompatActivity {
    ListView listView;

    QDH qdh=new QDH();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdu_parah_names);

        String[] parahNamesUrdu=qdh.ParahName;


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,parahNamesUrdu);
        listView = findViewById(R.id.listviewurdupara);
        listView.setAdapter(arrayAdapter);

    }
}