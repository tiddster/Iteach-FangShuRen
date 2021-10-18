package com.example.fsr;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageHolder>{
    private List<Integer> mImageIDList;

    public ImageAdapter(List<Integer> imageIDList) {
        mImageIDList = imageIDList;
    }

    @NonNull
    @Override
    public ImageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_cell, parent, false);
        ImageHolder imageHolder = new ImageHolder(view);
        imageHolder.setIsRecyclable(false);
        return imageHolder;
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onBindViewHolder(@NonNull ImageHolder holder, int position) {
        int id = mImageIDList.get(position);
        holder.bind(id);
    }

    @Override
    public int getItemCount() {
        return mImageIDList.size();
    }

    public class ImageHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        public ImageHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
        }

        public void bind(int id){
            mImageView.setImageResource(id);
        }
    }
}
