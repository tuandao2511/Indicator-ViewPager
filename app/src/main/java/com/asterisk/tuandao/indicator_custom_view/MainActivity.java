package com.asterisk.tuandao.indicator_custom_view;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.asterisk.tuandao.indicator.IndicatorView;
import com.asterisk.tuandao.indicator.PagesLessException;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    IndicatorView indicatorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        indicatorView = (IndicatorView) findViewById(R.id.indicator);
        PagerAdapter adapter = new PagerAdapter(this);
        viewPager.setAdapter(adapter);
        try {
            indicatorView.setViewPager(viewPager);
        } catch (PagesLessException e) {
            e.printStackTrace();
        }

    }
}
