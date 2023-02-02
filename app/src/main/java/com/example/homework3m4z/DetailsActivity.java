package com.example.homework3m4z;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    private TextView tvDetails;
    private ImageView ivDetails;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tvDetails = findViewById(R.id.tv_detail);
        ivDetails = findViewById(R.id.iv_detail);

        tvDetails.setText(getIntent().getStringExtra("gametv"));

        Game game = (Game) getIntent().getSerializableExtra("img");
        Glide.with(ivDetails).load(game.getIcon()).into(ivDetails);

    }

}