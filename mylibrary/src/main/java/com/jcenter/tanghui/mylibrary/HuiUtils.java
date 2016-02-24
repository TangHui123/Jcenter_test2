package com.jcenter.tanghui.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class HuiUtils {
    private String string = "";
    public HuiUtils() {
        string = "hui";
    }
    public void Tshow(Context context) {
        Toast.makeText(context,"llll",Toast.LENGTH_LONG).show();
    }
}
