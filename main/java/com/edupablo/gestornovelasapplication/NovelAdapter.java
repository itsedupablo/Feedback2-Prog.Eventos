package com.edupablo.gestornovelasapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NovelAdapter extends RecyclerView.Adapter<NovelAdapter.NovelViewHolder> {
    private List<Novel> novels;

    public void setNovels(List<Novel> novels) {
        this.novels = novels;
        notifyDataSetChanged(); // Notifica al adapter que los datos han cambiado
    }

    @NonNull
    @Override
    public NovelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Infla el layout para cada item del RecyclerView
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_2, parent, false);
        return new NovelViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NovelViewHolder holder, int position) {
        // Vincula los datos de la novela con las vistas
        Novel currentNovel = novels.get(position);
        holder.titleTextView.setText(currentNovel.getTitle());
        holder.authorTextView.setText(currentNovel.getAuthor());
    }

    @Override
    public int getItemCount() {
        return novels == null ? 0 : novels.size();
    }

    static class NovelViewHolder extends RecyclerView.ViewHolder {
        private final TextView titleTextView;
        private final TextView authorTextView;

        private NovelViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(android.R.id.text1);
            authorTextView = itemView.findViewById(android.R.id.text2);
        }
    }
}


