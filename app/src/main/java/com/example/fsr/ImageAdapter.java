package com.example.fsr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.util.Log;
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
    private long lastClickTime;
    private int id = 0;         //用于记录图片的id，以切换伸缩按钮的显示
    private float oldDis = 0;
    private int situation = 0;
    private List<PictureInfo> mPictureInfoList;                 //viewpager里面的图片信息
    private List<PictureInfo> toBeAddedList = new ArrayList<>();    //画布上图片信息
    private FrameLayout mFrameLayout;
    private Context mContext;
    private PointF mPointF = new PointF();                  //触摸的点，用于移动图像

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
                /*
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

                if (!isAdded)

                 */
                toBeAddedList.add(pictureInfo);
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
        //所有image共用一个拉伸按钮
        ImageView enImage = new ImageView(mContext);
        ImageView deleteImage = new ImageView(mContext);
        enImage.setImageResource(R.drawable.en_circle_foreground);
        deleteImage.setImageResource(R.drawable.cancel_foreground);
        for (PictureInfo pictureInfo : pictureInfos) {
            //初始化imageview和声明布局
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(pictureInfo.getId());

            //param1是图片的布局  param2是伸缩按钮的布局
            FrameLayout.LayoutParams params1 = new FrameLayout.LayoutParams(pictureInfo.getWidth(), pictureInfo.getHeight());
            FrameLayout.LayoutParams params2 = new FrameLayout.LayoutParams(150, 150);
            FrameLayout.LayoutParams params3 = new FrameLayout.LayoutParams(150, 150);
            params1.setMargins(pictureInfo.getLeft(), pictureInfo.getTop(), pictureInfo.getRight(), pictureInfo.getBottom());
            params2.leftMargin = params1.leftMargin + params1.width - 30;
            params2.topMargin = params1.topMargin + params1.height - 30;
            params3.leftMargin = params1.leftMargin - 100;
            params3.topMargin = params1.topMargin - 100;
            mFrameLayout.addView(imageView, params1);

            //根据标签初始化布局
            /*
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
                case "树干": params = new FrameLayout.LayoutParams(400, 400); break;
                case "树枝": params = new FrameLayout.LayoutParams(500, 500); break;
                case "树冠": params = new FrameLayout.LayoutParams(300, 300); break;
                case "果实": params = new FrameLayout.LayoutParams(250, 250); break;
                case "树干纹路": params = new FrameLayout.LayoutParams(100, 100); break;
                case "树叶":params =  new FrameLayout.LayoutParams(300, 300); break;

                case "附加物": params = new FrameLayout.LayoutParams(100, 100); break;
                default: params = new FrameLayout.LayoutParams(100,100);
            }

             */

            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    ImageView view = (ImageView) v;
                    switch (event.getAction() & MotionEvent.ACTION_MASK) {

                        case MotionEvent.ACTION_DOWN:
                            mPointF.set(event.getX(), event.getY());
                            if(id != imageView.getId()){
                                mFrameLayout.removeView(enImage);
                                mFrameLayout.addView(enImage, params2);
                                mFrameLayout.removeView(deleteImage);
                                mFrameLayout.addView(deleteImage,params3);

                                //伸缩按钮的点击事件
                                enImage.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        ImageView view = (ImageView) v;
                                        switch (event.getAction() & MotionEvent.ACTION_MASK) {
                                            case MotionEvent.ACTION_DOWN:
                                                mPointF.set(event.getX(), event.getY());
                                                System.out.println(situation);
                                                long currentTimeMillis = SystemClock.uptimeMillis();
                                                //两次点击间隔时间小于300ms代表双击
                                                if (currentTimeMillis - lastClickTime < 300) {
                                                    mFrameLayout.removeView(imageView);
                                                    mFrameLayout.removeView(enImage);
                                                    mFrameLayout.removeView(deleteImage);
                                                    toBeAddedList.remove(pictureInfo);
                                                }
                                                lastClickTime = currentTimeMillis;

                                                break;

                                            case MotionEvent.ACTION_MOVE:
                                                float percent = imageView.getWidth() / imageView.getHeight();

                                                PointF pointF = new PointF(event.getX(), event.getY());
                                                int dx = (int) (pointF.x - mPointF.x) / 2;
                                                int dy = (int) (dx * percent);
                                                //int theDis = (int) ((newDis - oldDis) / 30);
                                                if(params1.height > 50 || params1.width > 50 || dx > 0) {
                                                    params1.setMargins(pictureInfo.getLeft(), pictureInfo.getTop(), pictureInfo.getRight(), pictureInfo.getBottom());
                                                    params1.height += dx;
                                                    params1.width += dy;
                                                    pictureInfo.setHeight(params1.height);
                                                    pictureInfo.setWidth(params1.width);
                                                    imageView.setLayoutParams(params1);
                                                    params2.leftMargin += dx;
                                                    params2.topMargin += dy;
                                                    enImage.setLayoutParams(params2);
                                                }

                                                break;

                                            case MotionEvent.ACTION_UP:
                                                break;
                                        }
                                        return true;
                                    }
                                });
                                //------------------------------------------
                                deleteImage.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        switch (event.getAction() & MotionEvent.ACTION_MASK){
                                            case MotionEvent.ACTION_DOWN:
                                                mFrameLayout.removeView(imageView);
                                                mFrameLayout.removeView(enImage);
                                                mFrameLayout.removeView(deleteImage);
                                                toBeAddedList.remove(pictureInfo);
                                        }
                                        return true;
                                    }
                                });

                            }
                            break;
/*
                        case MotionEvent.ACTION_POINTER_DOWN:
                            oldDis = CalculateDistance(event);
                            situation = 2;
                            System.out.println(situation);
                            break;
*/
                        case MotionEvent.ACTION_MOVE:

                            int dx = (int) (event.getX() - mPointF.x) / 2;
                            int dy = (int) (event.getY() - mPointF.y) / 2;
                            params1.leftMargin += dx;
                            params1.topMargin += dy;
                            imageView.setLayoutParams(params1);

                            pictureInfo.setLeft(view.getLeft());
                            pictureInfo.setRight(view.getRight());
                            pictureInfo.setTop(view.getTop());
                            pictureInfo.setBottom(view.getBottom());

                            params2.leftMargin += dx;
                            params2.topMargin += dy;
                            enImage.setLayoutParams(params2);
                            params3.leftMargin += dx;
                            params3.topMargin += dy;
                            deleteImage.setLayoutParams(params3);
                            /*
                            else if(situation == 2){
                                float newDis = CalculateDistance(event);
                                int theDis = (int)((newDis-oldDis)/30);
                                params1.setMargins(pictureInfo.getLeft(), pictureInfo.getTop(), pictureInfo.getRight(), pictureInfo.getBottom());
                                params1.height += theDis;
                                params1.width += theDis;
                                pictureInfo.setHeight(params1.height);
                                pictureInfo.setWidth(params1.width);
                                imageView.setLayoutParams(params1);
                            }

                             */
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
