package com.example.fsr;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fsr.bean.ResInfo;

public class FinishActivity extends AppCompatActivity {
    TextView mTextView;
    ResInfo resInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);

        resInfo = (ResInfo) getIntent().getSerializableExtra("result");

        initView();
        listener();
    }

    public void initView(){
        mTextView = findViewById(R.id.result);
        mTextView.setText(resInfo.returnResult(this));
    }

    public void listener(){

    }
}
