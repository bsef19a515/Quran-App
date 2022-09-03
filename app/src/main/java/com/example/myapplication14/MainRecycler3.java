package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainRecycler3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler3);

            DBHelper dbHelper=new DBHelper(MainRecycler3.this);
            RecyclerView recyclerView3;
            RecyclerView.Adapter adapter;
            RecyclerView.LayoutManager layoutManager;

                recyclerView3 = findViewById(R.id.recycle3);
        ArrayList<String> list= dbHelper.DrMohsinKhantrans();

        MyAdapter3 myAdapter3 = new MyAdapter3(list);
                recyclerView3.setAdapter(myAdapter3);
                recyclerView3.setLayoutManager(new LinearLayoutManager(this));



//
            }

        }


