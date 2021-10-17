package com.example.fsr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fsr.bean.TabInfo;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private TabLayout mainTabLayout, subTabLayout;
    private TabInfo tabInfo = new TabInfo();
    private String[] Content;
    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private List<Fragment> mFragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.viewpager);

        initView();
        listener();
    }

    public void initView(){
        initTabLayout();
    }

    public void initTabLayout(){
        subTabLayout = findViewById(R.id.SubTitleTab);
        mainTabLayout = findViewById(R.id.MainTitleTab);
    }

    public void listener(){
        mainTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mFragmentList = new ArrayList<>();

                switch (tab.getPosition()){
                    case 0:
                        Content = tabInfo.getContentOfFang();
                        break;
                    case 1:
                        Content = tabInfo.getContentOfRen();
                        break;
                    case 2:
                        Content = tabInfo.getContentOfShu();
                        break;
                    case 3:
                        Content = new String[]{"附加物"};
                        break;
                    case 4:
                        finish();
                }
                subTabLayout.removeAllTabs();
                for(int i=0; i<Content.length; i++){
                    subTabLayout.addTab(subTabLayout.newTab().setText(Content[i]));
                    mFragmentList.add(new PagerFragment());
                }
                mPagerAdapter = new PagerAdapter(getSupportFragmentManager(),mFragmentList);
                mViewPager.setAdapter(mPagerAdapter);
                subTabLayout.setupWithViewPager(mViewPager);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
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
    }

}