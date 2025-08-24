package com.example.moipz_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_main);

        View hitMenu    = findViewById(R.id.hitMenu);
        View hitBest    = findViewById(R.id.hitBest);
        View hitHome    = findViewById(R.id.hitHome);
        View hitFriends = findViewById(R.id.hitFriends);
        View hitMy      = findViewById(R.id.hitMy);

        hitMenu.setOnClickListener(v -> startActivity(new Intent(this, PriceCompareActivity.class))); // 예시
        hitBest.setOnClickListener(v -> startActivity(new Intent(this, RecommendActivity.class)));
        hitHome.setOnClickListener(v -> { /* 현재 화면이면 무시 */ });
        hitFriends.setOnClickListener(v -> startActivity(new Intent(this, SocialFeedActivity.class)));
        hitMy.setOnClickListener(v -> startActivity(new Intent(this, com.example.moipz_app.SettingsActivity.class)));
        hitMy.setOnClickListener(v ->
                startActivity(new Intent(this, MyPageActivity.class)));
    }
}