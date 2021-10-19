package com.example.fsr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.fsr.bean.TabInfo;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private ConstraintLayout mConstraintLayout;
    private TabLayout mainTabLayout, subTabLayout;
    private TabInfo tabInfo = new TabInfo();
    private String[] Content = tabInfo.getContentOfFang();
    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private List<Fragment> mFragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        listener();
    }

    public void initView(){
        mConstraintLayout = findViewById(R.id.stage);
        mViewPager = findViewById(R.id.viewpager);
        initTabLayout();
    }

    public void initTabLayout(){
        subTabLayout = findViewById(R.id.SubTitleTab);
        mainTabLayout = findViewById(R.id.MainTitleTab);
        initPagerAndTab();
    }

    public void listener(){
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
                        Content = new String[]{"附加物","背景"};
                        break;
                    case 4:
                        finish();
                }
                //先将上一次的tab清空
                subTabLayout.removeAllTabs();
                mFragmentList.clear();
                mViewPager = null;
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

    public void initPagerAndTab(){
        //根据标题的长度来设置tab和pager,并将title传到fragment中
        mViewPager = findViewById(R.id.viewpager);
        for(int i=0; i<Content.length; i++){
            subTabLayout.addTab(subTabLayout.newTab().setText(Content[i]));
            mFragmentList.add(new PagerFragment(Content[i], mConstraintLayout));
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

        @Override
        public CharSequence getPageTitle(int position) {
            return Content[position];
        }

        @Override
        public int getItemPosition(@NonNull Object object) {
            return PagerAdapter.POSITION_NONE;
        }

    }

}