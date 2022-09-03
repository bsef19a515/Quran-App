package com.example.myapplication14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    Context c;
    String s1[],s2[];

    public MyAdapter(Context c,String s1[],String s2[]) {

        this.c=c;
        this.s1=s1;
        this.s2=s2;
    }
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(c);
       View view= inflater.inflate(R.layout.recyclerlayout,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.text.setText(s1[position]);
        holder.text2.setText(s2[position]);

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
