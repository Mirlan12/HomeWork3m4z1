package com.example.homework3m4z;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameViewHolder>{

    private ArrayList<Game> arrayListGame;
    private onItemClick onItemClick;

    public GameAdapter(ArrayList<Game> arrayListGame, onItemClick onItemClick) {
        this.arrayListGame = arrayListGame;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, @SuppressLint("RecyclerView") int position) {
       holder.onBind(arrayListGame.get(position));
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               onItemClick.onClick(arrayListGame.get(position));
           }
       });
    }

    @Override
    public int getItemCount() {
        return arrayListGame.size();
    }
}

class GameViewHolder extends RecyclerView.ViewHolder {

   ImageView imageView;
   TextView textView;

    public GameViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    void onBind(Game game){
        imageView = itemView.findViewById(R.id.image_view);
        textView = itemView.findViewById(R.id.text_view);
        Glide.with(imageView).load(game.getIcon()).into(imageView);
        textView.setText(game.getName());
    }

}

