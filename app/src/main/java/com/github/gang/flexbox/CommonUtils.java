package com.github.gang.flexbox;

import android.text.TextUtils;

import java.util.regex.Pattern;

public class CommonUtils {
    private static final Pattern REG_COLOR = Pattern.compile("^#([0-9a-fA-F]{6}|[0-9a-fA-F]{3})$");

    public static boolean isColor(String input){
        if (TextUtils.isEmpty(input)){
            return false;
        }
        return REG_COLOR.matcher(input).matches();
    }
}
