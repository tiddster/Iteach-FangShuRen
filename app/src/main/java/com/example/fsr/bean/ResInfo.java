package com.example.fsr.bean;

import android.annotation.SuppressLint;
import android.content.Context;

import com.example.fsr.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResInfo implements Serializable {
    private List<PictureInfo> mInfoList;

    public ResInfo(List<PictureInfo> infoList) {
        mInfoList = infoList;
    }

    @SuppressLint("NonConstantResourceId")
    public String returnResult(Context context){
        String string = "";
        for(PictureInfo pictureInfo : mInfoList){
            switch (pictureInfo.getId()){
                case R.drawable.fangzi1: string += context.getApplicationContext().getText(R.string.塔)+"\n"; break;
                /*
                case R.drawable.fangzi2: mStringBuilder.append(R.string.圆形房子).append("\n"); break;
                case R.drawable.fangzi3: mStringBuilder.append(R.string.童话房子).append("\n"); break;
                case R.drawable.fangzi4: mStringBuilder.append(R.string.现代化房子).append("\n"); break;
                case R.drawable.fangzi5: mStringBuilder.append(R.string.传统房子).append("\n"); break;
                case R.drawable.fangzi6: mStringBuilder.append(R.string.四合院型).append("\n"); break;
                case R.drawable.fangzi7: mStringBuilder.append(R.string.庙宇型).append("\n"); break;

                 */
            }
        }
        return string;
    }
}
