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

public class EngParahNames extends AppCompatActivity {
    Window window;
    ListView listView;

    QDH qdh=new QDH();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_parah_names);

        String[] parahNameseng=qdh.englishParahName;


//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                (this, android.R.layout.simple_list_item_1,parahNameseng);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (getApplicationContext(),R.layout.text_layout_nastaleeq,parahNameseng);
        listView = findViewById(R.id.listviewenglishpara);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                QuranArabicText qat = new QuranArabicText();
                int start = qdh.PSP[i];
                int end ;
                if (start == 5747) {
                    end = qat.QuranArabicText.length;
                }
                else {
                    end = qdh.PSP[i + 1];
                }

                Intent intent = new Intent(EngParahNames.this, EngParah.class);
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