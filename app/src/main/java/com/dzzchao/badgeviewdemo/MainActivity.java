package com.dzzchao.badgeviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;

import com.dzzchao.badgeviewdemo.widget.BadgeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BadgeView badgeView = new BadgeView(this);
        badgeView.setTargetView(findViewById(R.id.rl));
        badgeView.setBadgeGravity(Gravity.RIGHT | Gravity.CENTER);
        badgeView.setBadgeMargin(0, 0, 10, 0);
        badgeView.setText("NEW");

        BadgeView badgeView2 = new BadgeView(this);
        badgeView2.setTargetView(findViewById(R.id.rl2));
        badgeView2.setBadgeCount(9);
    }
}