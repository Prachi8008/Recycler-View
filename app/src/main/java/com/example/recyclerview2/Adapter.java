package com.example.recyclerview2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    ArrayList<Data> list;

    public Adapter(ArrayList<Data> list) {
        this.list = list;
    }


    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter , parent , false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        holder.tvView.setText(list.get(position).getDescription());
        holder.imgView.setImageResource(list.get(position).getImg());
        holder.img2View.setImageResource(list.get(position).getImg2());

    }


    @Override
    public int getItemCount() {
        if(list == null){
            return 0;
        }
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvView;
        ImageView imgView;
        ImageView img2View;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvView = itemView.findViewById(R.id.text);
            imgView = itemView.findViewById(R.id.image);
            img2View = itemView.findViewById(R.id.image2);
        }
    }

}