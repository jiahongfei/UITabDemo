package com.andrjhf.ui.tab.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author :  jiahongfei
 * @email : jiahongfeinew@163.com
 * @date : 2018/2/22
 * @desc :
 */

public class BFragment extends Fragment {

    private static final String TAG = "BFragment";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.e(TAG,"onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG,"onCreate");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.e(TAG,"onCreateView");

        return LayoutInflater.from(getContext()).inflate(R.layout.fragment_b,null);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.e(TAG,"onActivityCreated");

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
    public void onDestroyView() {
        super.onDestroyView();

        Log.e(TAG,"onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.e(TAG,"onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.e(TAG,"onDetach");

    }
}
