package com.github.gang.flexbox;

import androidx.annotation.StringDef;

import com.github.gang.flexbox.json.FlexKeys;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@StringDef({FlexKeys.SubViewType.LABEL, FlexKeys.SubViewType.BUTTON,FlexKeys.SubViewType.IMAGE,
        FlexKeys.SubViewType.LOGO,FlexKeys.SubViewType.CLOSE, FlexKeys.SubViewType.SKIP,
        FlexKeys.SubViewType.BRAND})
@Retention(RetentionPolicy.SOURCE)
public @interface FlexViewType {
    int TYPE_UNKNOWN = 0;

    int TYPE_LABEL = 1;

    int TYPE_BUTTON = 2;

    int TYPE_IMAGE = 3;

    int TYPE_LOGO = 4;

    int TYPE_CLOSE = 5;

    int TYPE_SKIP = 6;

    int TYPE_BRAND = 7;
}

