package com.example.fsr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Picture;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fsr.bean.PictureInfo;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageHolder> {
    private List<PictureInfo> mPictureInfoList;
    private List<PictureInfo> toBeAddedList = new ArrayList<>();
    private FrameLayout mFrameLayout;
    private Context mContext;
    private PointF mPointF = new PointF();

    public ImageAdapter(List<PictureInfo> toBeAddedList, List<PictureInfo> pictureInfoList, FrameLayout frameLayout, Context context) {
        this.toBeAddedList = toBeAddedList;
        mPictureInfoList = pictureInfoList;
        mFrameLayout = frameLayout;
        mContext = context;
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
        PictureInfo pictureInfo = mPictureInfoList.get(position);
        int id = pictureInfo.getId();
        holder.bind(id);
        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isAdded = false;
                for (PictureInfo toBeReplaced : toBeAddedList) {
                    if (pictureInfo.getTitle().equals(toBeReplaced.getTitle())) {
                        pictureInfo.setTop(toBeReplaced.getTop());
                        pictureInfo.setBottom(toBeReplaced.getBottom());
                        pictureInfo.setLeft(toBeReplaced.getLeft());
                        pictureInfo.setRight(toBeReplaced.getRight());
                        toBeAddedList.remove(toBeReplaced);
                        toBeAddedList.add(pictureInfo);
                        isAdded = true;
                        break;
                    }
                }
                if(!isAdded) toBeAddedList.add(pictureInfo);
                addView(toBeAddedList);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPictureInfoList.size();
    }

    public class ImageHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;

        public ImageHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
        }

        public void bind(int id) {
            mImageView.setImageResource(id);
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    public void addView(List<PictureInfo> pictureInfos) {
        mFrameLayout.removeAllViews();
        for (PictureInfo pictureInfo : pictureInfos) {
            //初始化imageview和声明布局
            ImageView imageView = new ImageView(mContext);
            FrameLayout.LayoutParams params;
            imageView.setImageResource(pictureInfo.getId());
            //根据标签初始化布局
            switch (pictureInfo.getTitle()){
                case "屋顶": params = new FrameLayout.LayoutParams(1000, 1000); break;
                case "墙": params = new FrameLayout.LayoutParams(1000, 1200); break;
                case "门":  params = new FrameLayout.LayoutParams(300, 500); break;
                case "窗户": params = new FrameLayout.LayoutParams(400, 400); break;
                case "台阶和路": params = new FrameLayout.LayoutParams(300, 1000); break;
                case "烟囱": params = new FrameLayout.LayoutParams(200, 200); break;

                case "发型": params = new FrameLayout.LayoutParams(200, 200); break;
                case "眼睛": params = new FrameLayout.LayoutParams(100, 100); break;
                case "耳朵": params = new FrameLayout.LayoutParams(130, 120); break;
                case "鼻子": params = new FrameLayout.LayoutParams(40, 40); break;
                case "嘴巴": params = new FrameLayout.LayoutParams(40, 30); break;
                case "眉毛": params = new FrameLayout.LayoutParams(100, 100); break;
                case "脖子": params = new FrameLayout.LayoutParams(100, 100); break;
                case "躯干": params = new FrameLayout.LayoutParams(100, 300); break;
                case "手臂和手": params = new FrameLayout.LayoutParams(100, 350); break;
                case "腿和脚": params = new FrameLayout.LayoutParams(100, 350); break;
                case "饰品": params = new FrameLayout.LayoutParams(150, 150); break;

                //大小调试完成
                case "树干": params = new FrameLayout.LayoutParams(500, 500); break;
                case "树枝": params = new FrameLayout.LayoutParams(500, 500); break;
                case "树冠": params = new FrameLayout.LayoutParams(300, 300); break;
                case "果实": params = new FrameLayout.LayoutParams(250, 250); break;
                case "树干纹路": params = new FrameLayout.LayoutParams(100, 100); break;
                case "树叶":params =  new FrameLayout.LayoutParams(300, 300); break;

                case "附加物": params = new FrameLayout.LayoutParams(100, 100); break;
                default: params = new FrameLayout.LayoutParams(100,100);
            }

            params.setMargins(pictureInfo.getLeft(), pictureInfo.getTop(), pictureInfo.getRight(), pictureInfo.getBottom());
            System.out.println(pictureInfo.getTop());
            mFrameLayout.addView(imageView,params);

            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    ImageView view = (ImageView) v;
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            mPointF.set(event.getX(), event.getY());
                            break;

                        case MotionEvent.ACTION_MOVE:
                            //移动
                            int dx = (int) (event.getX() - mPointF.x);
                            int dy = (int) (event.getY() - mPointF.y);
                            view.layout(view.getLeft() + dx, view.getTop() + dy, view.getRight() + dx, view.getBottom() + dy);
                            pictureInfo.setLeft(view.getLeft());
                            pictureInfo.setRight(view.getRight());
                            pictureInfo.setTop(view.getTop());
                            pictureInfo.setBottom(view.getBottom());
                            break;

                        case MotionEvent.ACTION_UP:
                            break;
                    }
                    return true;
                }
            });
        }
    }
}
