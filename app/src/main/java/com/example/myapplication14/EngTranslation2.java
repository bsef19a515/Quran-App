package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class EngTranslation2 extends AppCompatActivity {
    ListView getengtarajama2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_translation2);


            getengtarajama2=findViewById(R.id.getengtarjama2);

            Intent intent = getIntent();
            int id = intent.getIntExtra("SuraID", 0);

            DBHelper dbHelper = new DBHelper(EngTranslation2.this);


            List<String> list = dbHelper.DrMohsinKhan(id);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>
                    (EngTranslation2.this, android.R.layout.simple_list_item_1,list);

//
            getengtarajama2.setAdapter(arrayAdapter);
        }
    }
