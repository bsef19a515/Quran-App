package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


public class MainRecycler extends AppCompatActivity {

     QDH qdh=new QDH();
     String[] engparahnames=qdh.englishParahName;
     String [] urduparanames=qdh.ParahName;


    //String s1[]={"kinza","muqaddas","pakiza","shazia","sadia","seher"};


    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        recyclerView = findViewById(R.id.recycle);
        MyAdapter myAdapter = new MyAdapter(this, engparahnames,urduparanames);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    }
