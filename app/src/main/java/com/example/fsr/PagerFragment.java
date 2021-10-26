package com.example.fsr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fsr.bean.PictureInfo;

import java.util.ArrayList;
import java.util.List;

public class PagerFragment extends Fragment{
    private RecyclerView mRecyclerView;
    private List<PictureInfo> mPictureInfoList;
    private String title;
    private FrameLayout mFrameLayout;
    private List<PictureInfo> toBeAddedList = new ArrayList<>();

    int[] blank = new int[]{R.drawable.blank};
    int[] F_houses = new int[] { R.drawable.blank,R.drawable.fangzi1, R.drawable.fangzi2, R.drawable.fangzi3, R.drawable.fangzi4,
            R.drawable.fangzi5,R.drawable.fangzi6,R.drawable.fangzi7};
    int[] F_roots = new int[]{R.drawable.wuding1,R.drawable.wuding2,R.drawable.wuding3,R.drawable.wuding4,R.drawable.wuding5,R.drawable.wuding6,R.drawable.wuding7,R.drawable.wuding8,R.drawable.wuding9,R.drawable.wuding10,R.drawable.wuding11};
    int[] F_walls = new int[] { R.drawable.blank,R.drawable.qiang1, R.drawable.qiang2, R.drawable.qiang3,R.drawable.qiang4,R.drawable.qiang5,R.drawable.qiang6,R.drawable.qiang7,R.drawable.qiang8,R.drawable.qiang9,R.drawable.qiang10,R.drawable.qiang11,R.drawable.qiang12,R.drawable.qiang13,R.drawable.qiang14};
    int[] F_doors = new int[] { R.drawable.blank,R.drawable.men1, R.drawable.men2, R.drawable.men3, R.drawable.men4,R.drawable.men5,R.drawable.men6,R.drawable.men7,R.drawable.men8,R.drawable.men9,R.drawable.men10,R.drawable.men11};
    int[] F_windows = new int[] { R.drawable.blank,R.drawable.chuanghu1, R.drawable.chuanghu2, R.drawable.chuanghu3, R.drawable.chuanghu4,R.drawable.chuanghu5,R.drawable.chuanghu6,R.drawable.chuanghu7,R.drawable.chuanghu8,R.drawable.chuanghu9,R.drawable.chuanghu10,R.drawable.chuanghu11,R.drawable.chuanghu12,R.drawable.chuanghu13};
    int[] F_roads = new int[] { R.drawable.blank,R.drawable.lu1, R.drawable.lu2, R.drawable.lu3, R.drawable.lu4,R.drawable.lu5,};
    int[] F_chimney = new int[] { R.drawable.blank,R.drawable.yancong1, R.drawable.yancong2, R.drawable.yancong3, R.drawable.yancong4,};
    int[] S_tree = new int[]{R.drawable.shu1,R.drawable.shu2,R.drawable.shu3,R.drawable.shu4,R.drawable.shu5,R.drawable.shu6,R.drawable.shu7,R.drawable.shu8,R.drawable.shu9,R.drawable.shu10,R.drawable.shu11,R.drawable.shu12,R.drawable.shu13,R.drawable.shu14,R.drawable.shu15,R.drawable.shu16};
    int[] S_truck = new int[] { R.drawable.blank,R.drawable.shugan1, R.drawable.shugan2, R.drawable.shugan3, R.drawable.shugan4,R.drawable.shugan5, R.drawable.shugan6, R.drawable.shugan7, R.drawable.shugan8,R.drawable.shugan9, R.drawable.shugan10, R.drawable.shugan11, R.drawable.shugan12,R.drawable.shugan13, R.drawable.shugan14, R.drawable.shugan15,R.drawable.shugan16, R.drawable.shugan17,R.drawable.shugan18};
    int[] S_branch = new int[] { R.drawable.blank,R.drawable.shuzhi1, R.drawable.shuzhi2, R.drawable.shuzhi3, R.drawable.shuzhi4,R.drawable.shuzhi5, R.drawable.shuzhi6, R.drawable.shuzhi7, R.drawable.shuzhi8,R.drawable.shuzhi9, R.drawable.shuzhi10,R.drawable.shuzhi11,R.drawable.shuzhi12};
    int[] S_treetop = new int[] { R.drawable.blank,R.drawable.shuguan1, R.drawable.shuguan2, R.drawable.shuguan3, R.drawable.shuguan4,R.drawable.shuguan5};
    int[] S_leaves = new int[] { R.drawable.blank,R.drawable.shuye8, R.drawable.shuye2, R.drawable.shuye3, R.drawable.shuye4,R.drawable.shuye5, R.drawable.shuye6, R.drawable.shuye7,R.drawable.shuye8};
    int[] S_fruit = new int[] { R.drawable.blank,R.drawable.guoshi1, R.drawable.guoshi2, R.drawable.guoshi3, R.drawable.guoshi4,R.drawable.guoshi5, R.drawable.guoshi6,};
    int[] S_grain = new int[] { R.drawable.blank,R.drawable.wenlu1, R.drawable.wenlu2, R.drawable.wenlu3,};
    int[] R_person = new int[]{R.drawable.ren1,R.drawable.ren2,R.drawable.ren3};
    int[] R_hair = new int[] { R.drawable.blank,R.drawable.faxing1, R.drawable.faxing2, R.drawable.faxing3, R.drawable.faxing4,R.drawable.faxing5,R.drawable.faxing6,R.drawable.faxing7,R.drawable.faxing8,R.drawable.faxing9,R.drawable.faxing10,R.drawable.faxing11,R.drawable.faxing12,R.drawable.faxing13,R.drawable.faxing14,R.drawable.faxing15,R.drawable.faxing16,R.drawable.faxing17};
    int[] R_eyes = new int[] { R.drawable.blank,R.drawable.yanjing1, R.drawable.yanjing2, R.drawable.yanjing3, R.drawable.yanjing4,R.drawable.yanjing5,R.drawable.yanjing6,R.drawable.yanjing7,R.drawable.yanjing8,R.drawable.yanjing9,R.drawable.yanjing10,R.drawable.yanjing11};
    int[] R_ears = new int[] { R.drawable.blank,R.drawable.erduo1, R.drawable.erduo2, R.drawable.erduo3,R.drawable.erduo4,R.drawable.erduo5,};
    int[] R_nose = new int[] { R.drawable.blank,R.drawable.bizi1, R.drawable.bizi2, R.drawable.bizi3, R.drawable.bizi4,R.drawable.bizi5,R.drawable.bizi6,R.drawable.bizi7,};
    int[] R_mouth = new int[] { R.drawable.blank,R.drawable.zuiba1, R.drawable.zuiba2, R.drawable.zuiba3, R.drawable.zuiba4,R.drawable.zuiba5,R.drawable.zuiba6,R.drawable.zuiba7,R.drawable.zuiba8};
    int[] R_eyebrow = new int[] { R.drawable.blank,R.drawable.meimao1, R.drawable.meimao2, R.drawable.meimao3, R.drawable.meimao4,R.drawable.meimao5,R.drawable.meimao6,R.drawable.meimao7,R.drawable.meimao8,R.drawable.meimao9,R.drawable.meimao10,};
    int[] R_neck = new int[] { R.drawable.blank,R.drawable.bozi1, R.drawable.bozi2, R.drawable.bozi3,R.drawable.bozi4,R.drawable.bozi5};
    int[] R_body = new int[] { R.drawable.blank,R.drawable.qugan1, R.drawable.qugan2, R.drawable.qugan3, R.drawable.qugan4, R.drawable.qugan5, R.drawable.qugan6, R.drawable.qugan7,R.drawable.qugan8};
    int[] R_arms = new int[] { R.drawable.blank,R.drawable.shoubi1, R.drawable.shoubi2, R.drawable.shoubi3, R.drawable.shoubi4,};
    int[] R_legs = new int[] { R.drawable.blank,R.drawable.tui1, R.drawable.tui2, R.drawable.tui3, R.drawable.tui4,R.drawable.tui5,};
    int[] R_decor = new int[] { R.drawable.blank,R.drawable.shiping1, R.drawable.shiping2, R.drawable.shiping3, R.drawable.shiping4,R.drawable.shiping5,R.drawable.shiping6,R.drawable.shiping7,R.drawable.shiping8,R.drawable.shiping9,};
    int[] ElseThings = new int[] { R.drawable.blank,R.drawable.fujia1, R.drawable.fujia2, R.drawable.fujia3, R.drawable.fujia4,R.drawable.fujia5, R.drawable.fujia6, R.drawable.fujia7, R.drawable.fujia8,R.drawable.fujia9, R.drawable.fujia10,
            R.drawable.fujia11,R.drawable.fujia12,R.drawable.fujia13,R.drawable.fujia14,R.drawable.fujia15,R.drawable.fujia16,R.drawable.fujia17,R.drawable.fujia18,R.drawable.fujia19,R.drawable.fujia20,
            R.drawable.fujia21,R.drawable.fujia22,R.drawable.fujia23,R.drawable.fujia24,R.drawable.fujia25,R.drawable.fujia26,R.drawable.fujia27,R.drawable.fujia28,R.drawable.fujia29,R.drawable.fujia30};

    public PagerFragment(String title){
        this.title = title;
    }

    public PagerFragment(String title, FrameLayout frameLayout, List<PictureInfo> pictureInfos) {
        this.title = title;
        mFrameLayout = frameLayout;
        toBeAddedList = pictureInfos;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment,container,false);
        initView(view);
        initListAndAdapter(title);
        return view;
    }

    public void initView(View view){
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
    }

    //初始化fragment里面的列表和adapter
    public void initListAndAdapter(String title){
        int[] array = blank;
        mPictureInfoList = new ArrayList<>();
        switch (title){
            case "屋子": array = F_houses; break;
            case "屋顶": array = F_roots; break;
            case "墙": array = F_walls; break;
            case "门":  array = F_doors; break;
            case "窗户": array = F_windows; break;
            case "台阶和路": array = F_roads; break;
            case "烟囱": array = F_chimney; break;
            case "人": array = R_person; break;
            case "发型": array = R_hair; break;
            case "眼睛": array = R_eyes; break;
            case "耳朵": array = R_ears; break;
            case "鼻子": array = R_nose; break;
            case "嘴巴": array = R_mouth; break;
            case "眉毛": array = R_eyebrow; break;
            case "脖子": array = R_neck; break;
            case "躯干": array = R_body; break;
            case "手臂和手": array = R_arms; break;
            case "腿和脚": array = R_legs; break;
            case "饰品": array = R_decor; break;
            case "树": array = S_tree; break;
            case "树干": array = S_truck; break;
            case "树枝": array = S_branch; break;
            case "树冠": array = S_treetop; break;
            case "果实": array = S_fruit; break;
            case "树干纹路": array = S_grain; break;
            case "附加物": array = ElseThings; break;
            case "树叶": array = S_leaves; break;
            case "背景": break;
            default: array = blank;
        }

        for(int id : array) mPictureInfoList.add(new PictureInfo(id,title));

        if (mRecyclerView.getChildCount() > 0) {
            mRecyclerView.setAdapter(null);
        }
        ImageAdapter imageAdapter = new ImageAdapter(toBeAddedList, mPictureInfoList,mFrameLayout,getContext());
        mRecyclerView.setAdapter(imageAdapter);
    }


}
