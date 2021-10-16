package com.example.fsr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fsr.bean.TabInfo;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{
    private TabLayout mainTabLayout, subTabLayout;
    private TabInfo tabInfo = new TabInfo();
    private String[] Content = tabInfo.getContentOfFang();
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView(){
        initTabLayout();
    }

    public void initTabLayout(){
        subTabLayout = findViewById(R.id.SubTitleTab);
        mainTabLayout = findViewById(R.id.MainTitleTab);

        for(int i=0; i<Content.length; i++){
            subTabLayout.addTab(subTabLayout.newTab().setText(Content[i]));
        }

        mainTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
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
                }
                subTabLayout.removeAllTabs();
                for(int i=0; i<Content.length; i++){
                    subTabLayout.addTab(subTabLayout.newTab().setText(Content[i]));
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}