package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
     Button btn1,btn2;
     ListView listView;
     Cursor c=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btnengtrans);
        btn2=findViewById(R.id.btnurdutrans);
        listView=findViewById(R.id.listview);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DBHelper dbHelper = new DBHelper(MainActivity.this);

//                Integer text=Integer.parseInt(searchtext.getText().toString());

                List<String> list = dbHelper.getEnglishTranslation();
                ArrayAdapter arrayAdapter = new ArrayAdapter<String>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);

//
                listView.setAdapter(arrayAdapter);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DBHelper dbHelper = new DBHelper(MainActivity.this);

//                Integer text=Integer.parseInt(searchtext.getText().toString());

                List<String> list = dbHelper.getUrduTranslation();
                ArrayAdapter arrayAdapter = new ArrayAdapter<String>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);

//
                listView.setAdapter(arrayAdapter);

            }
        });




    }

}