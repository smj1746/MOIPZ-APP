package com.example.moipz_app;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PriceCompareActivity extends AppCompatActivity {

    private final List<PriceItem> allItems = new ArrayList<>();
    private final List<PriceItem> shownItems = new ArrayList<>();
    private PriceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_compare);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        RecyclerView rv = findViewById(R.id.rvPrices);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        adapter = new PriceAdapter(shownItems);
        rv.setAdapter(adapter);

        seedDummy();
        filter("");

        EditText et = findViewById(R.id.etSearch);
        et.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) { filter(s.toString()); }
            @Override public void afterTextChanged(Editable s) {}
        });
    }

    private void seedDummy() {
        allItems.clear();
        allItems.add(new PriceItem("화이트 셔츠", "UNIQLO", 29900));
        allItems.add(new PriceItem("화이트 셔츠", "COS", 89000));
        allItems.add(new PriceItem("화이트 셔츠", "H&M", 24900));
        allItems.add(new PriceItem("블랙 진", "Levi's", 129000));
        allItems.add(new PriceItem("블랙 진", "SPAO", 39900));
        allItems.add(new PriceItem("체크 자켓", "ZARA", 99000));
        allItems.add(new PriceItem("체크 자켓", "무신사 스탠다드", 69900));
    }

    private void filter(String q) {
        shownItems.clear();
        if (q == null || q.trim().isEmpty()) {
            shownItems.addAll(allItems);
        } else {
            String key = q.toLowerCase(Locale.getDefault());
            for (PriceItem it : allItems) {
                if (it.name.toLowerCase(Locale.getDefault()).contains(key)
                        || it.brand.toLowerCase(Locale.getDefault()).contains(key)) {
                    shownItems.add(it);
                }
            }
        }
        if (adapter != null) adapter.notifyDataSetChanged();
    }

    // --- 모델 ---
    static class PriceItem {
        final String name; final String brand; final int price;
        PriceItem(String name, String brand, int price) {
            this.name = name; this.brand = brand; this.price = price;
        }
    }

    // --- 어댑터 ---
    static class PriceAdapter extends RecyclerView.Adapter<PriceAdapter.VH> {
        private final List<PriceItem> data;
        PriceAdapter(List<PriceItem> data){ this.data = data; }

        @NonNull @Override
        public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_price_row, parent, false);
            return new VH(v);
        }

        @Override
        public void onBindViewHolder(@NonNull VH h, int pos) {
            PriceItem it = data.get(pos);
            NumberFormat nf = NumberFormat.getInstance(Locale.KOREA);
            h.tvName.setText(it.name);
            h.tvBrand.setText(it.brand);
            h.tvPrice.setText(nf.format(it.price) + "원");
        }

        @Override public int getItemCount() { return data.size(); }

        static class VH extends RecyclerView.ViewHolder {
            final TextView tvName, tvBrand, tvPrice;
            VH(@NonNull View itemView) {
                super(itemView);
                tvName = itemView.findViewById(R.id.tvName);
                tvBrand = itemView.findViewById(R.id.tvBrand);
                tvPrice = itemView.findViewById(R.id.tvPrice);
            }
        }
    }
}