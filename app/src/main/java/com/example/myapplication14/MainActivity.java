package com.example.myapplication14;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     Button btnsearch,searchtext;
     ListView listView;
     Cursor c=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsearch=findViewById(R.id.btnsearch);
        searchtext=findViewById(R.id.searchbar);
        listView=findViewById(R.id.listview);



        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DBHelper dbHelper = new DBHelper(MainActivity.this);

//                Integer text=Integer.parseInt(searchtext.getText().toString());

//                List<Quran> list = dbHelper.getAllStudents();
                List<String> list = dbHelper.getEnglishTranslation();
                ArrayAdapter arrayAdapter = new ArrayAdapter<String>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);

//                List<StudentModel> list = dbHelper.getAllStudents();
//                String[] data=dbHelper.getAllStudents(text);

//                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                        (MainActivity.this, android.R.layout.simple_list_item_1,data);
                listView.setAdapter(arrayAdapter);

            }
        });
        searchtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DBHelper dbHelper = new DBHelper(MainActivity.this);

//                Integer text=Integer.parseInt(searchtext.getText().toString());

//                List<Quran> list = dbHelper.getAllStudents();
                List<String> list = dbHelper.getUrduTranslation();
                ArrayAdapter arrayAdapter = new ArrayAdapter<String>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);

//                List<StudentModel> list = dbHelper.getAllStudents();
//                String[] data=dbHelper.getAllStudents(text);

//                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                        (MainActivity.this, android.R.layout.simple_list_item_1,data);
                listView.setAdapter(arrayAdapter);

            }
        });




    }

}