package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class EngTransation extends AppCompatActivity {

    ListView getengtarajama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_transation);

        getengtarajama=findViewById(R.id.getengtarjama);

        Intent intent = getIntent();
        int id = intent.getIntExtra("SuraID", 0);

        DBHelper dbHelper = new DBHelper(EngTransation.this);


        List<String> list = dbHelper.find(id);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>
                (EngTransation.this, android.R.layout.simple_list_item_1,list);

//
        getengtarajama.setAdapter(arrayAdapter);
    }
}