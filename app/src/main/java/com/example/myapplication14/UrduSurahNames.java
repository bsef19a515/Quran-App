package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UrduSurahNames extends AppCompatActivity {
      Window window;
    ListView listView;

    QDH qdh=new QDH();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdu_surah_names);

        String[] surahNamesurdu=qdh.urduSurahNames;


//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                (this, android.R.layout.simple_list_item_1,surahNamesurdu);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (getApplicationContext(),R.layout.text_layout_nastaleeq,surahNamesurdu);
        listView = findViewById(R.id.listviewurdu);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                QuranArabicText qat = new QuranArabicText();
                int end;
                int start = qdh.SSP[i];
                if (start == 6342) {
                    end = qat.QuranArabicText.length+1;
                }
                else {
                    end = qdh.SSP[i + 1];
                }

                Intent intent = new Intent(UrduSurahNames.this, EngSurah.class);
                intent.putExtra("start", start);
                intent.putExtra("end", end);
                startActivity(intent);
            }
        });
        if(Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));
        }

    }
}