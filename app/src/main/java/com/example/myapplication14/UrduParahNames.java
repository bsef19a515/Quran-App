package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int start = qdh.PSP[i];
                int end = qdh.PSP[i+1];
                QuranArabicText qat = new QuranArabicText();
                if (start == 5748) {
                    end = qat.QuranArabicText.length-1;
                }
                Intent intent = new Intent(UrduParahNames.this, EngParah.class);
                intent.putExtra("start", start);
                intent.putExtra("end", end);
                startActivity(intent);
            }
        });

    }
}