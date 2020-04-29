package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class proAdapter extends RecyclerView.Adapter<proAdapter.programingViewHolder> {
    private String[] data;
    public proAdapter(){
        this.data = data;

    }

    @NonNull
    @Override
    public programingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_itam, parent , false);

        return new programingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull programingViewHolder holder, int position) {
        String title = data[position];
        holder.tvAppname.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class programingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView tvAppname;

        public programingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            tvAppname = itemView.findViewById(R.id.tvAppname);
        }
    }
}
