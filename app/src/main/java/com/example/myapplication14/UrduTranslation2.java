package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class UrduTranslation2 extends AppCompatActivity {
    ListView geturdutarajama2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdu_translation2);

            geturdutarajama2=findViewById(R.id.geturdutarjama2);

            Intent intent = getIntent();
            int id = intent.getIntExtra("SuraID", 0);

            DBHelper dbHelper = new DBHelper(UrduTranslation2.this);


            List<String> list = dbHelper.FatehmuhJalandhri(id);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>
                    (UrduTranslation2.this, android.R.layout.simple_list_item_1,list);

//
            geturdutarajama2.setAdapter(arrayAdapter);
        }
    }

