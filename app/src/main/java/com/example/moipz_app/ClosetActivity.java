package com.example.moipz_app;

import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class ClosetActivity extends AppCompatActivity {

    private ClosetAdapter adapter;
    private ActivityResultLauncher<String> pickImage;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_mycloset);

        // 리사이클러뷰 세팅 (2열 그리드)
        RecyclerView rv = findViewById(R.id.rvCloset);
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new ClosetAdapter();
        rv.setAdapter(adapter);

        // 사진 선택 런처
        pickImage = registerForActivityResult(
                new ActivityResultContracts.GetContent(),
                uri -> { if (uri != null) adapter.add(uri); }
        );

        // '옷 추가' 버튼 → 갤러리 열기
        ExtendedFloatingActionButton fab = findViewById(R.id.fabAddCloth);
        fab.setOnClickListener(v -> pickImage.launch("image/*"));
    }
}
