package com.example.fsr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fsr.bean.PictureInfo;
import com.example.fsr.bean.ResInfo;

import java.util.List;

public class FinishActivity extends AppCompatActivity {
    TextView gTextView,bTextView;
    ResInfo resInfo;
    List<PictureInfo> mPictureInfoList;
    FrameLayout mFrameLayout;
    TextView restart, main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);

        resInfo = (ResInfo) getIntent().getSerializableExtra("result");
        mPictureInfoList = (List<PictureInfo>) getIntent().getSerializableExtra("list");

        initView();
        listener();
        showView();
    }

    public void initView(){
        restart = findViewById(R.id.restart);
        main = findViewById(R.id.main);
        mFrameLayout = findViewById(R.id.resVeiw);
        gTextView = findViewById(R.id.Gresult);
        gTextView.setText(resInfo.returnGoodResult(this));
        bTextView = findViewById(R.id.Bresult);
        bTextView.setText(resInfo.returnBadResult(this));
    }

    public void listener(){
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinishActivity.this, StageActivity.class);
                finish();
                startActivity(intent);
            }
        });

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //返回主页面
            }
        });
    }

    public void showView(){
        for (PictureInfo pictureInfo : mPictureInfoList) {
            //初始化imageview和声明布局
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(pictureInfo.getId());

            FrameLayout.LayoutParams params1 = new FrameLayout.LayoutParams(pictureInfo.getWidth()/2, pictureInfo.getHeight()/2);
            params1.setMargins(pictureInfo.getLeft()/2, pictureInfo.getTop()/2, pictureInfo.getRight()/2, pictureInfo.getBottom()/2);
            mFrameLayout.addView(imageView, params1);
        }
    }
}
