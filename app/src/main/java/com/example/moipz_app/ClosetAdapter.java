package com.example.moipz_app;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ClosetAdapter extends RecyclerView.Adapter<ClosetAdapter.VH> {

    private final List<Uri> items = new ArrayList<>();

    public void add(Uri uri) {
        items.add(uri);
        notifyItemInserted(items.size() - 1);
    }

    @NonNull @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH((ViewGroup) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_6_item_clothing, parent, false));
    }

    @Override public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.image.setImageURI(items.get(position));
    }

    @Override public int getItemCount() { return items.size(); }

    static class VH extends RecyclerView.ViewHolder {
        final ImageView image;
        VH(@NonNull ViewGroup root) {
            super(root);
            image = root.findViewById(R.id.ivCloth);
        }
    }
}

}
