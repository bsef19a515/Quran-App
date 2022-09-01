package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class Search extends AppCompatActivity {

    EditText surah;
    Button geteng,geturdu,geteng2,geturdu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        surah=findViewById(R.id.searchbysurah);
        geteng=findViewById(R.id.geteng);
        geturdu=findViewById(R.id.geturdu);
        geteng2=findViewById(R.id.geteng2);
        geturdu2=findViewById(R.id.geturdu2);


//        int text=Integer.parseInt(surah.getText().toString());


        geteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent engtranslation = new Intent(Search.this, EngTransation.class);
                int text=Integer.parseInt(surah.getText().toString());

                engtranslation.putExtra("SuraID",text);
                startActivity(engtranslation);
            }
        });

        geturdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urdutranslation = new Intent(Search.this, UrduTranslation.class);
                int text=Integer.parseInt(surah.getText().toString());

                urdutranslation.putExtra("SuraID",text);
                startActivity(urdutranslation);
            }
        });

        geteng2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent engtranslation2 = new Intent(Search.this, EngTranslation2.class);
                int text=Integer.parseInt(surah.getText().toString());

                engtranslation2.putExtra("SuraID",text);
                startActivity(engtranslation2);
            }
        });

        geturdu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urdutranslation2 = new Intent(Search.this, UrduTranslation2.class);
                int text=Integer.parseInt(surah.getText().toString());

                urdutranslation2.putExtra("SuraID",text);
                startActivity(urdutranslation2);
            }
        });


    }
}