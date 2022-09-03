package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     Button btn1,btn2;
     Cursor c=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.recpara);
        btn1.setOnClickListener(this);

        btn2 =(Button) findViewById(R.id.recsurah);
        btn2.setOnClickListener(this);


    }
        @Override
        public void onClick(View v) {
            switch (v.getId( )) {
                case R.id.recpara:
                     Intent intent1=new Intent(MainActivity.this,MainRecycler.class);
                    startActivity(intent1);
                    break;
                case R.id.recsurah:
                    Intent intent2=new Intent(MainActivity.this,MainRecycler2.class);
                    startActivity(intent2);
                    break;
                case R.id.recycleengtrans:
                    Intent intent3=new Intent(MainActivity.this,MainRecycler3.class);
                    startActivity(intent3);
                    break;
            }

        }



    }

