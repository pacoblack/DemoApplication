package com.github.gang;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public class ViewUtils {
    public static boolean isViewCovered(final View view) {
        View currentView = view;

        Rect currentViewRect = new Rect();
        boolean partVisible = currentView.getGlobalVisibleRect(currentViewRect);
        boolean totalHeightVisible = (currentViewRect.bottom - currentViewRect.top) >= view.getMeasuredHeight();
        boolean totalWidthVisible = (currentViewRect.right - currentViewRect.left) >= view.getMeasuredWidth();
        boolean totalViewVisible = partVisible && totalHeightVisible && totalWidthVisible;
        //被任意父View遮挡了就返回true
        if (!totalViewVisible) {
            return true;
        }

        while (currentView.getParent() instanceof ViewGroup) {
            ViewGroup currentParent = (ViewGroup) currentView.getParent();

            int start = indexOfViewInParent(currentView, currentParent);
            for (int i = start + 1; i < currentParent.getChildCount(); i++) {
                Rect viewRect = new Rect();
                view.getGlobalVisibleRect(viewRect);
                View otherView = currentParent.getChildAt(i);

                Rect otherViewRect = new Rect();
                otherView.getGlobalVisibleRect(otherViewRect);
                //如果与兄弟节点相交，返回true
                if (Rect.intersects(viewRect, otherViewRect)){
                    return true;
                }
            }
            currentView = currentParent;
        }
        return false;
    }

    private static int indexOfViewInParent(View view, ViewGroup parent) {
        int index;
        for (index = 0; index < parent.getChildCount(); index++) {
            if (parent.getChildAt(index) == view) {
                break;
            }
        }
        return index;
    }
}
