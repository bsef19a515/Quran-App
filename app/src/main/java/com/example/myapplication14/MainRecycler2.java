package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainRecycler2 extends AppCompatActivity {

    QDH qdh=new QDH();
    String[] engsurahnames=qdh.englishSurahNames;
    String [] urdusurahnames=qdh.urduSurahNames;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler2);


            recyclerView = findViewById(R.id.recycle2);
            MyAdapter myAdapter = new MyAdapter(this, engsurahnames,urdusurahnames);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));


        }

    }

