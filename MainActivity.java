package com.example.chocho64.clanner;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
                    TextView textView = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
                    textView.setTextColor(Color.parseColor("#aaaaaa"));
                    textView.setGravity(Gravity.CENTER);
                }
                TextView textView = (TextView) tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).findViewById(android.R.id.title);
                textView.setTextColor(Color.parseColor("#FFFFFF"));
                textView.setGravity(Gravity.CENTER);
            }
        });

        intent = new Intent(this, TableActivity.class);
        spec = tabHost.newTabSpec("tab1").setIndicator("시간표").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent(this, TimeActivity.class);
        spec = tabHost.newTabSpec("tab2").setIndicator("수업중").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent(this, DateActivity.class);
        spec = tabHost.newTabSpec("tab3").setIndicator("알림").setContent(intent);
        tabHost.addTab(spec);

        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            TextView textView = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            textView.setTextColor(Color.parseColor("#aaaaaa"));
            textView.setGravity(Gravity.CENTER);
        }
        TextView textView = (TextView) tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).findViewById(android.R.id.title);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setGravity(Gravity.CENTER);

        tabHost.setCurrentTab(0);
    }
}