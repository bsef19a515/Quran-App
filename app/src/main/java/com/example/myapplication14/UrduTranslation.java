package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class UrduTranslation extends AppCompatActivity {

    ListView geturdutarajama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdu_translation);



            geturdutarajama=findViewById(R.id.geturdutarjama);

            Intent intent = getIntent();
            int id = intent.getIntExtra("SuraID", 0);

            DBHelper dbHelper = new DBHelper(UrduTranslation.this);


            List<String> list = dbHelper.findurdu(id);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>
                    (UrduTranslation.this, android.R.layout.simple_list_item_1,list);

//
            geturdutarajama.setAdapter(arrayAdapter);
        }
    }

