package com.example.myapplication14;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter2 extends RecyclerView.Adapter<com.example.myapplication14.MyAdapter2.MyViewHolder>{

        Context c;
        String s1[],s2[];
        QDH qdh=new QDH();

        public MyAdapter2(Context c,String s1[],String s2[]) {

            this.c=c;
            this.s1=s1;
            this.s2=s2;
        }
        @NonNull
        @Override
        public MyAdapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(c);
            View view= inflater.inflate(R.layout.recyclerlayout,parent,false);

            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull com.example.myapplication14.MyAdapter2.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
            holder.text.setText(s1[position]);
            holder.text2.setText(s2[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        QuranArabicText qat = new QuranArabicText();
                        int end;
                        int start = qdh.SSP[position];
                        if (start == 6342) {
                            end = qat.QuranArabicText.length+1;
                        }
                        else {
                            end = qdh.SSP[position + 1];
                        }


                        Intent intent = new Intent(c, EngSurah.class);
                        intent.putExtra("start", start);
                        intent.putExtra("end", end);
                        c.startActivity(intent);

                    }

            });

        }

        @Override
        public int getItemCount() {
            return s1.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder{
            TextView text,text2;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                text=itemView.findViewById(R.id.textView6);
                text2=itemView.findViewById(R.id.textView4);

            }
        }
    }


