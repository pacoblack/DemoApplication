package com.github.gang.flexbox;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.github.gang.flexbox.process.BlankViewProcess;
import com.github.gang.flexbox.process.ButtonViewProcess;
import com.github.gang.flexbox.process.ImageViewProcess;
import com.github.gang.flexbox.process.TextViewProcess;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static com.github.gang.flexbox.json.FlexKeys.SubViewType.BRAND;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.BUTTON;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.CLOSE;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.IMAGE;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.LABEL;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.LOGO;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.SKIP;

public class FlexViewTypeHandler {
//    private static ImageViewProcess imageViewProcess = new ImageViewProcess();
//    private static TextViewProcess textViewProcess = new TextViewProcess();
//    private static ButtonViewProcess buttonViewProcess = new ButtonViewProcess();
//    private static BlankViewProcess unknownViewProcess = new BlankViewProcess();
//    private static CloseButtonViewProcess closeViewProcess = new CloseButtonViewProcess();
//    private static LogoViewProcess logoViewProcess = new LogoViewProcess();
//    private static SkipViewProcess skipViewProcess = new SkipViewProcess();
//    private static BrandViewProcess brandViewProcess = new BrandViewProcess();
//
//    private static Map<String, DynamicViewComponent> TYPE_HANDLER;
//
//    public static void registerTypeProcessor(@FlexViewType String type, DynamicViewComponent component) {
//        if (TYPE_HANDLER == null) {
//            TYPE_HANDLER = new HashMap<>();
//        }
//        TYPE_HANDLER.put(type, component);
//    }
//
//    public static int getViewType(String type){
//        switch (type){
//            case LABEL:
//                return FlexViewType.TYPE_LABEL;
//            case BUTTON:
//                return FlexViewType.TYPE_BUTTON;
//            case IMAGE:
//                return FlexViewType.TYPE_IMAGE;
//            case LOGO:
//                return FlexViewType.TYPE_LOGO;
//            case CLOSE:
//                return FlexViewType.TYPE_CLOSE;
//            case SKIP:
//                return FlexViewType.TYPE_SKIP;
//            case BRAND:
//                return FlexViewType.TYPE_BRAND;
//            default:
//                return FlexViewType.TYPE_UNKNOWN;
//        }
//    }
//
//    public static void fill(ViewGroup parent, JSONObject data, int subViewType, View root){
//        View subView;
//        switch (subViewType){
//            case FlexViewType.TYPE_LABEL:
//                subView = new TextView(parent.getContext());
//                parent.addView(subView);
//                textViewProcess.createDynamicView(subView, parent, data);
//                break;
//            case FlexViewType.TYPE_BUTTON:
//                subView = new Button(parent.getContext());
//                parent.addView(subView);
//                buttonViewProcess.createDynamicView(subView, parent, data);
//                break;
//            case FlexViewType.TYPE_IMAGE:
//                subView = new ImageView(parent.getContext());
//                parent.addView(subView);
//                imageViewProcess.createDynamicView(subView, parent, data);
//                break;
//            case FlexViewType.TYPE_LOGO:
//                subView = FlexViewFactory.newLogoView(parent.getContext());
//                parent.addView(subView);
//                logoViewProcess.createDynamicView(subView, parent, data);
//                break;
//            case FlexViewType.TYPE_CLOSE:
//                subView = FlexViewFactory.newCloseView(parent.getContext());
//                parent.addView(subView);
//                closeViewProcess.createDynamicView(subView, parent, data);
//                break;
//            case FlexViewType.TYPE_BRAND:
//                subView = FlexViewFactory.newBrandView(parent.getContext());
//                parent.addView(subView);
//                brandViewProcess.createDynamicView(subView, parent, data);
//                break;
//            case FlexViewType.TYPE_SKIP:
//                subView = FlexViewFactory.newSkipView(parent.getContext());
//                parent.addView(subView);
//                skipViewProcess.createDynamicView(subView, parent, data);
//                ((JadRectangleSkipView)subView).startCount();
//                break;
//            default:
//                unknownViewProcess.applyLayoutParams(parent, data);
//                ViewGroup.LayoutParams lp = parent.getLayoutParams();
//                if (lp != null) {
//                    int direction = getDirection(root);
//                    if (direction == FlexDirection.COLUMN || direction == FlexDirection.COLUMN_REVERSE) {
//                        lp.width = root.getMeasuredWidth();
//                    } else if (direction == FlexDirection.ROW || direction == FlexDirection.ROW_REVERSE){
//                        lp.height = root.getMeasuredHeight();
//                    }
//                }
//                parent.setLayoutParams(lp);
//                break;
//        }
//    }
//
//    private static int getDirection(View view){
//        if (view instanceof RecyclerView){
//            RecyclerView.LayoutManager lm = ((RecyclerView) view).getLayoutManager();
//            if (lm instanceof FlexboxLayoutManager) {
//                return ((FlexboxLayoutManager) lm).getFlexDirection();
//            }
//        }
//        return -1;
//    }
}

