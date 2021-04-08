package com.github.gang.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WrapperLayout extends FrameLayout {
    public WrapperLayout(@NonNull Context context) {
        super(context);
    }

    public WrapperLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WrapperLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        System.out.println("wtg wrapper dispatchTouchEvent:" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        System.out.println("wtg wrapper onInterceptTouchEvent:" + ev.getAction());
        if (ev.getAction() == MotionEvent.ACTION_UP){
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        System.out.println("wtg wrapper onTouchEvent:" + ev.getAction());
        return super.onTouchEvent(ev);
    }
}
