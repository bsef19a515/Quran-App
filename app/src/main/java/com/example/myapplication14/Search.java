package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class Search extends AppCompatActivity {

    EditText surah;
    Button find;
    ListView listview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        surah=findViewById(R.id.searchbysurah);
        find=findViewById(R.id.searchbtn);
        listview2=findViewById(R.id.listview2);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DBHelper dbHelper = new DBHelper(Search.this);

                Integer text=Integer.parseInt(surah.getText().toString());

                List<String> list = dbHelper.find(text);
                ArrayAdapter arrayAdapter = new ArrayAdapter<String>
                        (Search.this, android.R.layout.simple_list_item_1,list);

//
                listview2.setAdapter(arrayAdapter);

            }
        });
    }
}