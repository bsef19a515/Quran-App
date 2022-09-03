package com.example.myapplication14;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder>{

        ArrayList<String> data;

        public MyAdapter3(ArrayList<String> data) {

            this.data=data;

        }
        @NonNull
        @Override
        public MyAdapter3.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(parent.getContext());
            View view= inflater.inflate(R.layout.translation,parent,false);

            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyAdapter3.MyViewHolder holder,int position) {
            holder.text.setText(data.get(position));

            }



        @Override
        public int getItemCount() {
            return data.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder{
            TextView text;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                text=itemView.findViewById(R.id.textView8);

            }
        }
    }


