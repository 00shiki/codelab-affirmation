package com.example.affirmation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.affirmation.R;
import com.example.affirmation.model.Affirmation;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private final Context context;
    private final Affirmation[] dataset;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;

        public ItemViewHolder(@NonNull View view) {
            super(view);

            textView = view.findViewById(R.id.item_title);
            imageView = view.findViewById(R.id.item_image);
        }
    }

    public ItemAdapter(Context context, Affirmation[] dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new ItemViewHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Affirmation item = dataset[position];
        holder.textView.setText(context.getResources().getString(item.getStringResourceId()));
        holder.imageView.setImageDrawable(context.getResources().getDrawable(item.getImageResourceId()));
    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }
}
