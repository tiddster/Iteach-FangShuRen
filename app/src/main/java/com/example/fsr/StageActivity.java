package com.example.fsr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.fsr.bean.PictureInfo;
import com.example.fsr.bean.ResInfo;
import com.example.fsr.bean.TabInfo;
import com.google.android.material.tabs.TabLayout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StageActivity extends AppCompatActivity{
    private TextView tips,ok;
    private FrameLayout mFrameLayout;                                  //布局对象，要传入到imageadapter中用作addview
    private ConstraintLayout mConstraintLayout;
    private TabLayout mainTabLayout, subTabLayout;
    private TabInfo tabInfo = new TabInfo();
    private String[] Content = tabInfo.getContentOfFang();             //tablayout的内容
    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private List<Fragment> mFragmentList = new ArrayList<>();          //viewpager里面的fragment
    private List<PictureInfo> toBeAddedList = new ArrayList<>();      //展示在画布上的图片，全部保存到这个list里

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        listener();
    }

    public void initView(){
        mConstraintLayout = findViewById(R.id.tipsContainer);
        mFrameLayout = findViewById(R.id.stage);
        mViewPager = findViewById(R.id.viewpager);
        subTabLayout = findViewById(R.id.SubTitleTab);
        mainTabLayout = findViewById(R.id.MainTitleTab);
        tips = findViewById(R.id.tips);
        ok = findViewById(R.id.ok);

        initPagerAndTab();
    }

    public void listener(){
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ok.setVisibility(View.GONE);
                tips.setVisibility(View.GONE);
                mConstraintLayout.setVisibility(View.GONE);
            }
        });


        //利用监听器来设置文本内容
        mainTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mFragmentList = new ArrayList<>();
                switch (tab.getPosition()){
                    case 0:
                        Content = tabInfo.getContentOfFang();
                        break;
                    case 1:
                        Content = tabInfo.getContentOfShu();
                        break;
                    case 2:
                        Content = tabInfo.getContentOfRen();
                        break;
                    case 3:
                        Content = new String[]{"附加物"};
                        break;
                    case 4:
                        ResInfo resInfo = new ResInfo(toBeAddedList);
                        Intent intent = new Intent(StageActivity.this,FinishActivity.class);

                        Bundle bundle = new Bundle();
                        bundle.putSerializable("result", (Serializable) resInfo);
                        bundle.putSerializable("list", (Serializable) toBeAddedList);
                        intent.putExtras(bundle);
                        finish();
                        startActivity(intent);
                }
                //先将上一次的tab清空
                subTabLayout.removeAllTabs();
                mFragmentList.clear();
                mViewPager = null;
                //再次加载新的tab
                initPagerAndTab();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    //初始化tablayout以及里面的内容，
    public void initPagerAndTab(){
        //根据标题的长度来设置tab和pager,并将title传到fragment中
        mViewPager = findViewById(R.id.viewpager);
        for(int i=0; i<Content.length; i++){
            subTabLayout.addTab(subTabLayout.newTab().setText(Content[i]));
            mFragmentList.add(new PagerFragment(Content[i], mFrameLayout, toBeAddedList));
        }

        //将pager和tab绑定起来
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager(),mFragmentList);
        mViewPager.setAdapter(mPagerAdapter);
        subTabLayout.setupWithViewPager(mViewPager);
    }

    public class PagerAdapter extends FragmentPagerAdapter {
        public List<Fragment> mFragmentList;
        public PagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            mFragmentList = fragments;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        //设置tab的标题，也就是文字设置
        @Override
        public CharSequence getPageTitle(int position) {
            return Content[position];
        }

        //利用hash码避免viewpager的缓存问题
        @Override
        public long getItemId(int position) {
            return getItem(position).hashCode();
        }

        @Override
        public int getItemPosition(@NonNull Object object) {
            return PagerAdapter.POSITION_NONE;
        }

    }

}