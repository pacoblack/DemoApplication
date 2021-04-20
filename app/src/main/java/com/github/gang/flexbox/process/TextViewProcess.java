package com.github.gang.flexbox.process;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import com.github.gang.flexbox.DynamicViewComponent;

import org.json.JSONObject;

import static com.github.gang.flexbox.json.FlexKeys.FontStyle.FONT_STYLE_BOLD;
import static com.github.gang.flexbox.json.FlexKeys.FontStyle.FONT_STYLE_BOLD_ITALIC;
import static com.github.gang.flexbox.json.FlexKeys.FontStyle.FONT_STYLE_DEFAULT;
import static com.github.gang.flexbox.json.FlexKeys.FontStyle.FONT_STYLE_ITALIC;
import static com.github.gang.flexbox.json.FlexKeys.SubView.FONT_COLOR;
import static com.github.gang.flexbox.json.FlexKeys.SubView.FONT_NAME;
import static com.github.gang.flexbox.json.FlexKeys.SubView.FONT_SIZE;
import static com.github.gang.flexbox.json.FlexKeys.SubView.FONT_STYLE;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LINES;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LINE_HEIGHT;
import static com.github.gang.flexbox.json.FlexKeys.SubView.TEXT;

public class TextViewProcess extends BlankViewProcess implements DynamicViewComponent<TextView> {

    @Override
    public TextView createDynamicView(Context context, JSONObject jsonObject) {
        TextView textView = new TextView(context);
        return createDynamicView(textView, jsonObject);
    }

    @Override
    public TextView createDynamicView(TextView view, JSONObject jsonObject) {
        apply(view, jsonObject);
        return view;
    }

    @Override
    public View apply(View view, JSONObject params) {
        if(view instanceof TextView){
            if (params != null) {
                if (params.has(FONT_SIZE)){
                    ((TextView) view).setTextSize((float) params.optDouble(FONT_SIZE));
                }
                if (params.has(FONT_NAME)){
                    ((TextView) view).setTypeface(Typeface.create(params.optString(FONT_NAME), Typeface.NORMAL));
                }
                if (params.has(FONT_STYLE)){
                    String s = params.optString(FONT_STYLE);
                    int style = Typeface.NORMAL;
                    if (FONT_STYLE_DEFAULT.equalsIgnoreCase(s)){
                        style = Typeface.NORMAL;
                    } else if (FONT_STYLE_BOLD.equalsIgnoreCase(s)){
                        style = Typeface.BOLD;
                    } else if (FONT_STYLE_ITALIC.equalsIgnoreCase(s)){
                        style = Typeface.ITALIC;
                    } else if (FONT_STYLE_BOLD_ITALIC.equalsIgnoreCase(s)){
                        style = Typeface.BOLD_ITALIC;
                    }
                    ((TextView) view).setTypeface(Typeface.defaultFromStyle(style));
                }
                if (params.has(FONT_COLOR)){
                    ((TextView) view).setTextColor(Color.parseColor(params.optString(FONT_COLOR)));
                }
                if (params.has(LINES)){
                    ((TextView) view).setLines(params.optInt(LINES));
                }
                if (params.has(LINE_HEIGHT)){
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                        ((TextView) view).setLineHeight(params.optInt(LINE_HEIGHT));
                    } else {
                        setLineHeight((TextView) view, params.optInt(LINE_HEIGHT));
                    }
                }
                if (params.has(TEXT)){
                    ((TextView) view).setText(params.optString(TEXT));
                }
            }
        }
        return super.apply(view, params);
    }

    public static void setLineHeight(TextView textView, int lineHeight) {
        int fontHeight = textView.getPaint().getFontMetricsInt(null);
        textView.setLineSpacing(dpToPixel(textView.getContext(), lineHeight) - fontHeight, 1);
    }

    public static int dpToPixel(Context context, float dp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return (int) px;
    }
}
