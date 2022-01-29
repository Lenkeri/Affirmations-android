package com.example.affirmations.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.affirmations.R;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    List<Affirmation> data;
    Context context;

    public ItemAdapter(Context context, List<Affirmation> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Affirmation item = data.get(position);
        TextView textView = holder.root.findViewById(R.id.item_title);
        String text = context.getResources().getString(item.textResourcedId);
        textView.setText(text);

        ImageView imageView = holder.root.findViewById(R.id.image_viewwq);
        String image = context.getResources().getString(item.picResourcedId);
        imageView.setImageURI(Uri.parse(image));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        View root;
        public  ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            root = itemView;
        }

    }

}
