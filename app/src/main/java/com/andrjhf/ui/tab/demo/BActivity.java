package com.andrjhf.ui.tab.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * @author :  jiahongfei
 * @email : jiahongfeinew@163.com
 * @date : 2018/2/23
 * @desc :
 */

public class BActivity extends Activity {

    private static final String TAG = "BActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_b);
        Log.e(TAG,"onCreate");

    }

    @Override
    public void onStart() {
        super.onStart();

        Log.e(TAG,"onStart");

    }

    @Override
    public void onResume() {
        super.onResume();

        Log.e(TAG,"onResume");

    }

    @Override
    public void onPause() {
        super.onPause();

        Log.e(TAG,"onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG,"onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.e(TAG,"onDestroy");

    }
}
