package com.raghad.moviecardsr;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>  {

    ArrayList<MovieAlbum> arrayList = new ArrayList<>();
    private String context;

    RecyclerAdapter (ArrayList<MovieAlbum> movies){
        this.arrayList=movies;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new MyViewHolder(view);
    }


    @Override
    //Binding: The process of preparing a child view to display
    // data corresponding to a position within the adapter.
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // position is The position of a data item within an Adapter.
        holder.imageView.setImageResource(arrayList.get(position).getImageId());

    }


    @Override
    public int getItemCount() {
        // to make the size of recycler view as the size of our list
    return arrayList.size()-1;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title;

        CardView card = (CardView) itemView.findViewById(R.id.cardView);

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView)itemView.findViewById(R.id.album);
            title = (TextView)itemView.findViewById(R.id.movie_name); }}}
