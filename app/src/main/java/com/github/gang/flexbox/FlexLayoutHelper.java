package com.github.gang.flexbox;

import com.google.android.flexbox.AlignContent;
import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.AlignSelf;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.JustifyContent;

public class FlexLayoutHelper {

    public static final String AUTO = "auto";
    public static final String ROW = "row";
    public static final String COLUMN = "column";
    public static final String ROW_REVERSE = "row-reverse";
    public static final String COLUMN_REVERSE = "column-reverse";
    public static final String NOWRAP = "nowrap";
    public static final String WRAP = "wrap";
    public static final String WRAP_REVERSE = "wrap-reverse";
    public static final String FLEX_START = "flex-start";
    public static final String FLEX_END = "flex-end";
    public static final String CENTER = "center";
    public static final String BASELINE = "space-between";
    public static final String STRETCH = "stretch";
    public static final String SPACE_BETWEEN = "space-between";
    public static final String SPACE_AROUND = "space-around";
    public static final String SPACE_EVENLY = "space-evenly";

    @FlexDirection
    public static int flexDirection(String param){
        switch (param){
            case ROW_REVERSE:
                return FlexDirection.ROW_REVERSE;
            case COLUMN:
                return FlexDirection.COLUMN;
            case COLUMN_REVERSE:
                return FlexDirection.COLUMN_REVERSE;
            case ROW:
            default:
                return FlexDirection.ROW;
        }
    }

    public static int flexWrap(String param){
        switch (param){
            case WRAP:
                return FlexWrap.WRAP;
            case WRAP_REVERSE:
                return FlexWrap.WRAP_REVERSE;
            default:
                return FlexWrap.NOWRAP;
        }
    }

    public static int justifyContent(String param){
        switch (param){
            case FLEX_START:
                return JustifyContent.FLEX_START;
            case FLEX_END:
                return JustifyContent.FLEX_END;
            case SPACE_BETWEEN:
                return JustifyContent.SPACE_BETWEEN;
            case SPACE_AROUND:
                return JustifyContent.SPACE_AROUND;
            case SPACE_EVENLY:
                return JustifyContent.SPACE_EVENLY;
            default:
                return JustifyContent.CENTER;
        }
    }

    public static int alignItems(String param){
        switch (param){
            case FLEX_START:
                return AlignItems.FLEX_START;
            case FLEX_END:
                return AlignItems.FLEX_END;
            case BASELINE:
                return AlignItems.BASELINE;
            case STRETCH:
                return AlignItems.STRETCH;
            default:
                return AlignItems.CENTER;
        }
    }

    public static int alignContent(String param){
        switch (param){
            case FLEX_START:
                return AlignContent.FLEX_START;
            case FLEX_END:
                return AlignContent.FLEX_END;
            case SPACE_BETWEEN:
                return AlignContent.SPACE_BETWEEN;
            case STRETCH:
                return AlignContent.STRETCH;
            case SPACE_AROUND:
                return AlignContent.SPACE_AROUND;
            default:
                return AlignContent.CENTER;
        }
    }

    public static int layoutAlignSelf(String param){
        switch (param){
            case FLEX_START:
                return AlignSelf.FLEX_START;
            case FLEX_END:
                return AlignSelf.FLEX_END;
            case STRETCH:
                return AlignSelf.STRETCH;
            case CENTER:
                return AlignSelf.CENTER;
            case BASELINE:
                return AlignSelf.BASELINE;
            default:
                return AlignSelf.AUTO;
        }
    }

}
