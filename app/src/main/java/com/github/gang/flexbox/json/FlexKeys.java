package com.github.gang.flexbox.json;

public class FlexKeys {
    public interface Head {
        String AD_FORMAT = "ad_format";
        String VERSION = "version";
        String FRAMEWORK_VERSION = "minFrameworkVersion";
        String DESC = "desc";

        String FLEX_DIRECTION = "flex_direction";
        String FLEX_WRAP = "flexWrap";
        String JUSTIFY_CONTENT = "justifyContent";
        String ALIGN_ITEMS = "alignItems";
        String ALIGN_CONTENT = "alignContent";
        String MAX_LINE = "maxLine";

        String SUB_VIEWS = "subviews";
    }

    public interface SubView {
        String MARGIN = "margin";
        String SIZE = "size";
        String TYPE = "type";
        String NAME = "name";
        String DIRECTION = "direction";
        String FONT_SIZE = "font_size";
        String FONT_COLOR = "font_color";
        String FONT_NAME = "font_name";
        String LINES = "lines";
        String LINE_HEIGHT = "line_height";
        String TEXT = "text";
        String FONT_STYLE = "font_style";

        String HEIGHT = "height";
        String WIDTH = "width";
        String BACKGROUND_COLOR = "background_color";
        String CORNER_RADIUS = "corner_radius";
        String EVENT_CLICK = "click";

        String SRC = "src";

        /**
         * int default @see FlexItem.ORDER_DEFAULT
         */
        String LAYOUT_ORDER = "layout_order";

        /**
         * float default @see FlexItem.FLEX_GROW_DEFAULT
         */
        String LAYOUT_FLEX_GROW = "layout_flexGrow";

        /**
         * float default @see FlexItem.FLEX_SHRINK_DEFAULT
         */
        String LAYOUT_FLEX_SHRINK = "layout_flexShrink";
        /**
         * float default @see FlexItem.FLEX_BASIS_PERCENT_DEFAULT
         */
        String LAYOUT_FLEX_BASIS_PERCENT = "layout_flexBasisPercent";
        String LAYOUT_ALIGN_SELF = "layout_alignSelf";
        String LAYOUT_MIN_WIDTH = "layout_minWidth";
        String LAYOUT_MIN_HEIGHT = "layout_minHeight";
        String LAYOUT_MAX_WIDTH = "layout_maxWidth";
        String LAYOUT_MAX_HEIGHT = "layout_maxHeight";
        /**
         * boolean default is false
         */
        String LAYOUT_WRAP_BEFORE = "layout_wrapBefore";
    }

    public interface FontStyle{
        String FONT_STYLE_DEFAULT = "NORMAL";
        String FONT_STYLE_BOLD = "BOLD";
        String FONT_STYLE_ITALIC = "ITALIC";
        String FONT_STYLE_BOLD_ITALIC = "BOLD_ITALIC";
    }

    public interface SubViewType{
        String LABEL = "label";
        String BUTTON = "button";
        String IMAGE = "imageView";
        String LOGO = "logoView";
        String CLOSE = "closeView";
        String SKIP = "skipView";
        String BRAND = "brand";
    }

}
