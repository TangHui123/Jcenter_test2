package com.jcenter.tanghui.jcenter_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jcenter.tanghui.mylibrary.HuiUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HuiUtils huiUtils = new HuiUtils();
        huiUtils.Tshow(this);
    }
}
