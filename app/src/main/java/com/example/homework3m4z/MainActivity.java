package com.example.homework3m4z;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements onItemClick {

    RecyclerView recyclerView;
    private ArrayList<Game> gameArrayList = new ArrayList<>();
    private GameAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        fillList();
        setAdapter();
    }
    private void setAdapter(){
        adapter = new GameAdapter(gameArrayList, this::onClick);
        recyclerView.setAdapter(adapter);
    }

    private void findViews(){
        recyclerView = findViewById(R.id.recycler_view);
    }

    private void fillList(){
        gameArrayList = new ArrayList<>();
        gameArrayList.add(new Game("Grand Theft Auto",
                "https://pdacdn.com/app/5d861f15901c0/mordor-mobile.png",
                "простой и удобный лаунчер для установки всеми известной игры Grand Theft Auto: San Andreas Multiplayer. Все что от вас требуется это скачать лаунчер и выбрать Lite или Full версию для скачивания.")
        );
        gameArrayList.add(new Game("Minecraft - Pocket Edition",
                "https://pdacdn.com/app/59522ace02abb/minecraft.png",
                "Minecraft - Pocket Edition (Майнкрафт) – игра представляет из себя строительную песочницу, в которой вы вольны заниматься своими делами как только захотите.")
        );
        gameArrayList.add(new Game("Terraria",
                "https://pdacdn.com/app/59522b28534ca/terraria.png",
                "Terraria (Террария) – это знаменитая игра из жанра \"песочница\", которая появилась и на Андроид. Для каждого игрока создаётся свой уникальный мир, который вы пытаетесь пройти")
        );
        gameArrayList.add(new Game("Need for Speed: Most Wanted",
                "https://pdacdn.com/app/59522add3b454/need-for-speed-most-wanted.png",
                "простой и удобный лаунчер для установки всеми известной игры Grand Theft Auto: San Andreas Multiplayer. Все что от вас требуется это скачать лаунчер и выбрать Lite или Full версию для скачивания.")
        );
        gameArrayList.add(new Game("Grand Theft Auto",
                "https://pdacdn.com/app/5d861f15901c0/mordor-mobile.png",
                "Need For Speed: Most Wanted на Андроид - долгожданные гонки от EA Games добрались и на ваши устройства! Вас порадуют эффекты столкновений, реализованные при помощи новой физики")
        );
        gameArrayList.add(new Game("Shadow Fight 2",
                "https://pdacdn.com/app/59522b30b6b9f/shadow-fight-2.png",
                "Shadow Fight 2 на Андроид, продолжение знаменитой игры с захватывающей сюжетной линией где вам предстоит сражаться с врагами.")
        );
        gameArrayList.add(new Game("Gangstar Vegas",
                "https://pdacdn.com/app/59522b0f83726/gangstar-vegas-world-of-crime.png",
                "Gangstar Vegas - игра на Андроид которая ни кого не оставит равнодушным. Вас ждёт экшен, стрельба, погони, мафиозные разборки, отличный сюжет и головокружительная графика в большом свободном для вашего передвижения городе Вегас!")
        );
    }

    @Override
    public void onClick(Game game) {
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("gametv", game.getName());
        intent.putExtra("img", game.getIcon());
        startActivity(intent);
    }

}