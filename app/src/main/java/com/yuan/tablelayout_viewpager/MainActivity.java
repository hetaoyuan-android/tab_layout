package com.yuan.tablelayout_viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yuan.tablelayout_viewpager.adapter.ViewPagerAdapter;
import com.yuan.tablelayout_viewpager.fragment.MyFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private ArrayList<MyFragment> fragments;

    private ViewPagerAdapter adapter;

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tab_layout);
        //初始化数据
        fragments = new ArrayList<>();
        for (int i = 0; i < 12;i ++) {
            fragments.add(new MyFragment("标题" + i, "内容" + i));
        }
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        //关联
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
}
