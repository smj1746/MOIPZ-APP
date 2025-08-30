package com.example.moipz_app;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8_settings);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        SwitchMaterial swPush = findViewById(R.id.swPush);
        SwitchMaterial swDark = findViewById(R.id.swDarkMode);
        LinearLayout rowAccount = findViewById(R.id.rowAccount);
        LinearLayout rowAbout = findViewById(R.id.rowAbout);

        swPush.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, isChecked ? "푸시 알림 ON" : "푸시 알림 OFF", Toast.LENGTH_SHORT).show()
        );

        swDark.setOnCheckedChangeListener((b, on) -> {
            AppCompatDelegate.setDefaultNightMode(
                    on ? AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);
        });

        rowAccount.setOnClickListener(v ->
                Toast.makeText(this, "계정 설정으로 이동 (추후 연동)", Toast.LENGTH_SHORT).show()
        );

        rowAbout.setOnClickListener(v ->
                Toast.makeText(this, "MOIP-Z v1.0", Toast.LENGTH_SHORT).show()
        );
    }
}