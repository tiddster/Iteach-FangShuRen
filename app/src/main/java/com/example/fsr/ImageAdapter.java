package com.example.fsr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageHolder>{
    private List<Integer> mImageIDList;
    private ConstraintLayout mConstraintLayout;
    private Context mContext;
    private PointF mPointF = new PointF();

    public ImageAdapter(List<Integer> imageIDList, ConstraintLayout constraintLayout, Context context) {
        mImageIDList = imageIDList;
        mConstraintLayout = constraintLayout;
        mContext = context;
    }

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
        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addView(id);
            }
        });
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

    @SuppressLint("ClickableViewAccessibility")
    public void addView(int id){
        //初始化图形并设置大小
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(id);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(100,100);

        imageView.setLayoutParams(params);

        mConstraintLayout.addView(imageView);

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageView view = (ImageView) v;
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        mPointF.set(event.getX(), event.getY());
                        break;

                    case MotionEvent.ACTION_MOVE:
                            //移动
                            int dx = (int) (event.getX() - mPointF.x);
                            int dy = (int) (event.getY() - mPointF.y);
                            view.layout(view.getLeft()+dx, view.getTop()+dy,view.getRight()+dx, view.getBottom()+dy);
                            break;

                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });
    }
}
