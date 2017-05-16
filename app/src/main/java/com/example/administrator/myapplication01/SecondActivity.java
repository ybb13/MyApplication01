package com.example.administrator.myapplication01;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/5/16 0016.
 */

public class SecondActivity extends Activity {

    Unbinder mUnbinder;

    @BindView(R.id.btn_02)
    Button btn_02;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mUnbinder = ButterKnife.bind(this);
    }
}
