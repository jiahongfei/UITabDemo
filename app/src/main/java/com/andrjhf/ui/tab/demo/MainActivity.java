package com.andrjhf.ui.tab.demo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

//将extends TabActiviy 修改成 FragmentActivity
public class MainActivity extends FragmentActivity {

    //将TabHost 修改成 FragmentTabHost
    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //将tabHost = getTabHost();修改成如下方式获取，并且调用tabHost.setup(xxxx);方法进行设置
        tabHost = findViewById(android.R.id.tabhost);
        tabHost.setup(this,getSupportFragmentManager(), android.R.id.tabcontent);

        //不需要设置tabSpec.setContent(xxxx);方法
        TabHost.TabSpec tabSpecA = tabHost
                .newTabSpec(AFragment.class.getSimpleName())
                .setIndicator(AFragment.class.getSimpleName());
        //tabHost.addTab(xxx);进行修改，增加Fragment.class,和Bundle参数
        tabHost.addTab(tabSpecA,AFragment.class,null);
        TabHost.TabSpec tabSpecB = tabHost
                .newTabSpec(BFragment.class.getSimpleName())
                .setIndicator(BFragment.class.getSimpleName());
        tabHost.addTab(tabSpecB, BFragment.class,null);

//        tabHost = getTabHost();
//        TabHost.TabSpec tabSpec1 = tabHost
//                .newTabSpec(AActivity.class.getSimpleName())
//                .setIndicator(AActivity.class.getSimpleName())
//                .setContent(new Intent(this, AActivity.class));
//        tabHost.addTab(tabSpec1);
//
//        TabHost.TabSpec tabSpec2 = tabHost
//                .newTabSpec(BActivity.class.getSimpleName())
//                .setIndicator(BActivity.class.getSimpleName())
//                .setContent(new Intent(this, BActivity.class));
//        tabHost.addTab(tabSpec2);

        //切换代码没有任何修改
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tabHost.setCurrentTab(0);
            }
        });

        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tabHost.setCurrentTab(1);

            }
        });
    }
}
