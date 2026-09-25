package com.clock.digital.widget.clockwidget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import androidx.core.content.res.ResourcesCompat;


public final class PreferenceUtils {
    public static final String DAYS_REQUIRED = "days_required";
    public static final PreferenceUtils INSTANCE = new PreferenceUtils();
    public static final String KEY_DO_NOT_SHOW_AGAIN = "dont_show_again";
    public static final String KEY_FIRST_LAUNCH_TIME = "first_launch_time";
    public static final String KEY_LAUNCH_COUNT = "launch_count";
    public static final String LAUNCHES_REQUIRED = "launches_required";
    public static final String PREF_12_OR_24_FORMAT_STYLE_1 = "pref_style_1_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_10 = "pref_style_10_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_11 = "pref_style_11_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_12 = "pref_style_12_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_13 = "pref_style_13_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_14 = "pref_style_14_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_15 = "pref_style_15_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_16 = "pref_style_16_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_17 = "pref_style_17_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_18 = "pref_style_18_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_19 = "pref_style_19_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_2 = "pref_style_2_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_20 = "pref_style_20_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_21 = "pref_style_21_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_22 = "pref_style_22_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_23 = "pref_style_23_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_24 = "pref_style_24_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_25 = "pref_style_25_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_26 = "pref_style_26_12_or_24_format";

    public static final String PREF_12_OR_24_FORMAT_STYLE_27 = "pref_style_27_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_28 = "pref_style_28_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_29 = "pref_style_29_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_30 = "pref_style_30_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_31 = "pref_style_31_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_32 = "pref_style_32_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_33 = "pref_style_33_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_34 = "pref_style_34_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_35 = "pref_style_35_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_36 = "pref_style_36_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_37 = "pref_style_37_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_38 = "pref_style_38_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_39 = "pref_style_39_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_40 = "pref_style_40_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_41 = "pref_style_41_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_42 = "pref_style_42_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_43 = "pref_style_43_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_44 = "pref_style_44_12_or_24_format";

    public static final String PREF_12_OR_24_FORMAT_STYLE_45 = "pref_style_45_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_46 = "pref_style_46_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_47 = "pref_style_47_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_48 = "pref_style_48_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_49 = "pref_style_49_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_50 = "pref_style_50_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_51 = "pref_style_51_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_52 = "pref_style_52_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_53 = "pref_style_53_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_54 = "pref_style_54_12_or_24_format";

    public static final String PREF_12_OR_24_FORMAT_STYLE_3 = "pref_style_3_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_4 = "pref_style_4_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_5 = "pref_style_5_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_6 = "pref_style_6_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_7 = "pref_style_7_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_8 = "pref_style_8_12_or_24_format";
    public static final String PREF_12_OR_24_FORMAT_STYLE_9 = "pref_style_9_12_or_24_format";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_1 = "pref_am_or_pm_color_style_1";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_10 = "pref_am_or_pm_color_style_10";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_11 = "pref_am_or_pm_color_style_11";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_12 = "pref_am_or_pm_color_style_12";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_13 = "pref_am_or_pm_color_style_13";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_14 = "pref_am_or_pm_color_style_14";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_15 = "pref_am_or_pm_color_style_15";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_16 = "pref_am_or_pm_color_style_16";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_17 = "pref_am_or_pm_color_style_17";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_18 = "pref_am_or_pm_color_style_18";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_19 = "pref_am_or_pm_color_style_19";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_2 = "pref_am_or_pm_color_style_2";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_20 = "pref_am_or_pm_color_style_20";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_21 = "pref_am_or_pm_color_style_21";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_22 = "pref_am_or_pm_color_style_22";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_23 = "pref_am_or_pm_color_style_23";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_24 = "pref_am_or_pm_color_style_24";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_25 = "pref_am_or_pm_color_style_25";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_26 = "pref_am_or_pm_color_style_26";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_27 = "pref_am_or_pm_color_style_27";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_28 = "pref_am_or_pm_color_style_28";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_29 = "pref_am_or_pm_color_style_29";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_30 = "pref_am_or_pm_color_style_30";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_31 = "pref_am_or_pm_color_style_31";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_32 = "pref_am_or_pm_color_style_32";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_33 = "pref_am_or_pm_color_style_33";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_34 = "pref_am_or_pm_color_style_34";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_35 = "pref_am_or_pm_color_style_35";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_36 = "pref_am_or_pm_color_style_36";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_37 = "pref_am_or_pm_color_style_37";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_38 = "pref_am_or_pm_color_style_38";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_39 = "pref_am_or_pm_color_style_39";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_40 = "pref_am_or_pm_color_style_40";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_41 = "pref_am_or_pm_color_style_41";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_42 = "pref_am_or_pm_color_style_42";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_43 = "pref_am_or_pm_color_style_43";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_44 = "pref_am_or_pm_color_style_44";

    public static final String PREF_AM_OR_PM_COLOR_STYLE_45 = "pref_am_or_pm_color_style_45";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_46 = "pref_am_or_pm_color_style_46";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_47 = "pref_am_or_pm_color_style_47";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_48 = "pref_am_or_pm_color_style_48";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_49 = "pref_am_or_pm_color_style_49";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_50 = "pref_am_or_pm_color_style_50";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_51 = "pref_am_or_pm_color_style_51";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_52 = "pref_am_or_pm_color_style_52";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_53 = "pref_am_or_pm_color_style_53";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_54 = "pref_am_or_pm_color_style_54";

    public static final String PREF_AM_OR_PM_COLOR_STYLE_3 = "pref_am_or_pm_color_style_3";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_4 = "pref_am_or_pm_color_style_4";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_5 = "pref_am_or_pm_color_style_5";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_6 = "pref_am_or_pm_color_style_6";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_7 = "pref_am_or_pm_color_style_7";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_8 = "pref_am_or_pm_color_style_8";
    public static final String PREF_AM_OR_PM_COLOR_STYLE_9 = "pref_am_or_pm_color_style_9";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_1 = "pref_am_or_pm_visibility_style_1";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_10 = "pref_am_or_pm_visibility_style_10";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_11 = "pref_am_or_pm_visibility_style_11";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_12 = "pref_am_or_pm_visibility_style_12";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_13 = "pref_am_or_pm_visibility_style_13";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_14 = "pref_am_or_pm_visibility_style_14";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_15 = "pref_am_or_pm_visibility_style_15";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_16 = "pref_am_or_pm_visibility_style_16";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_17 = "pref_am_or_pm_visibility_style_17";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_18 = "pref_am_or_pm_visibility_style_18";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_19 = "pref_am_or_pm_visibility_style_19";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_2 = "pref_am_or_pm_visibility_style_2";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_20 = "pref_am_or_pm_visibility_style_20";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_21 = "pref_am_or_pm_visibility_style_21";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_22 = "pref_am_or_pm_visibility_style_22";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_23 = "pref_am_or_pm_visibility_style_23";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_24 = "pref_am_or_pm_visibility_style_24";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_25 = "pref_am_or_pm_visibility_style_25";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_26 = "pref_am_or_pm_visibility_style_26";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_27 = "pref_am_or_pm_visibility_style_27";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_28 = "pref_am_or_pm_visibility_style_28";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_29 = "pref_am_or_pm_visibility_style_29";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_30 = "pref_am_or_pm_visibility_style_30";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_31 = "pref_am_or_pm_visibility_style_31";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_32 = "pref_am_or_pm_visibility_style_32";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_33 = "pref_am_or_pm_visibility_style_33";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_34 = "pref_am_or_pm_visibility_style_34";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_35 = "pref_am_or_pm_visibility_style_35";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_36 = "pref_am_or_pm_visibility_style_36";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_37 = "pref_am_or_pm_visibility_style_37";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_38 = "pref_am_or_pm_visibility_style_38";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_39 = "pref_am_or_pm_visibility_style_39";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_40 = "pref_am_or_pm_visibility_style_40";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_41 = "pref_am_or_pm_visibility_style_41";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_42 = "pref_am_or_pm_visibility_style_42";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_43 = "pref_am_or_pm_visibility_style_43";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_44 = "pref_am_or_pm_visibility_style_44";

    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_45 = "pref_am_or_pm_visibility_style_45";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_46 = "pref_am_or_pm_visibility_style_46";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_47 = "pref_am_or_pm_visibility_style_47";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_48 = "pref_am_or_pm_visibility_style_48";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_49 = "pref_am_or_pm_visibility_style_49";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_50 = "pref_am_or_pm_visibility_style_50";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_51 = "pref_am_or_pm_visibility_style_51";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_52 = "pref_am_or_pm_visibility_style_52";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_53 = "pref_am_or_pm_visibility_style_53";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_54 = "pref_am_or_pm_visibility_style_54";

    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_3 = "pref_am_or_pm_visibility_style_3";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_4 = "pref_am_or_pm_visibility_style_4";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_5 = "pref_am_or_pm_visibility_style_5";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_6 = "pref_am_or_pm_visibility_style_6";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_7 = "pref_am_or_pm_visibility_style_7";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_8 = "pref_am_or_pm_visibility_style_8";
    public static final String PREF_AM_OR_PM_VISIBILITY_STYLE_9 = "pref_am_or_pm_visibility_style_9";
    public static final String PREF_DATE_COLOR_STYLE_1 = "pref_date_color_style_1";
    public static final String PREF_DATE_COLOR_STYLE_10 = "pref_date_color_style_10";
    public static final String PREF_DATE_COLOR_STYLE_11 = "pref_date_color_style_11";
    public static final String PREF_DATE_COLOR_STYLE_12 = "pref_date_color_style_12";
    public static final String PREF_DATE_COLOR_STYLE_13 = "pref_date_color_style_13";
    public static final String PREF_DATE_COLOR_STYLE_14 = "pref_date_color_style_14";
    public static final String PREF_DATE_COLOR_STYLE_15 = "pref_date_color_style_15";
    public static final String PREF_DATE_COLOR_STYLE_16 = "pref_date_color_style_16";
    public static final String PREF_DATE_COLOR_STYLE_17 = "pref_date_color_style_17";
    public static final String PREF_DATE_COLOR_STYLE_18 = "pref_date_color_style_18";
    public static final String PREF_DATE_COLOR_STYLE_19 = "pref_date_color_style_19";
    public static final String PREF_DATE_COLOR_STYLE_2 = "pref_date_color_style_2";
    public static final String PREF_DATE_COLOR_STYLE_20 = "pref_date_color_style_20";
    public static final String PREF_DATE_COLOR_STYLE_21 = "pref_date_color_style_21";
    public static final String PREF_DATE_COLOR_STYLE_22 = "pref_date_color_style_22";
    public static final String PREF_DATE_COLOR_STYLE_23 = "pref_date_color_style_23";
    public static final String PREF_DATE_COLOR_STYLE_24 = "pref_date_color_style_24";
    public static final String PREF_DATE_COLOR_STYLE_25 = "pref_date_color_style_25";
    public static final String PREF_DATE_COLOR_STYLE_26 = "pref_date_color_style_26";
    public static final String PREF_DATE_COLOR_STYLE_27 = "pref_date_color_style_27";
    public static final String PREF_DATE_COLOR_STYLE_28 = "pref_date_color_style_28";
    public static final String PREF_DATE_COLOR_STYLE_29 = "pref_date_color_style_29";
    public static final String PREF_DATE_COLOR_STYLE_30 = "pref_date_color_style_30";
    public static final String PREF_DATE_COLOR_STYLE_31 = "pref_date_color_style_31";
    public static final String PREF_DATE_COLOR_STYLE_32 = "pref_date_color_style_32";
    public static final String PREF_DATE_COLOR_STYLE_33 = "pref_date_color_style_33";
    public static final String PREF_DATE_COLOR_STYLE_34 = "pref_date_color_style_34";
    public static final String PREF_DATE_COLOR_STYLE_35 = "pref_date_color_style_35";
    public static final String PREF_DATE_COLOR_STYLE_36 = "pref_date_color_style_36";
    public static final String PREF_DATE_COLOR_STYLE_37 = "pref_date_color_style_37";
    public static final String PREF_DATE_COLOR_STYLE_38 = "pref_date_color_style_38";
    public static final String PREF_DATE_COLOR_STYLE_39 = "pref_date_color_style_39";
    public static final String PREF_DATE_COLOR_STYLE_40 = "pref_date_color_style_40";
    public static final String PREF_DATE_COLOR_STYLE_41 = "pref_date_color_style_41";
    public static final String PREF_DATE_COLOR_STYLE_42 = "pref_date_color_style_42";
    public static final String PREF_DATE_COLOR_STYLE_43 = "pref_date_color_style_43";
    public static final String PREF_DATE_COLOR_STYLE_44 = "pref_date_color_style_44";
    public static final String PREF_DATE_COLOR_STYLE_45 = "pref_date_color_style_45";
    public static final String PREF_DATE_COLOR_STYLE_46 = "pref_date_color_style_46";
    public static final String PREF_DATE_COLOR_STYLE_47 = "pref_date_color_style_47";
    public static final String PREF_DATE_COLOR_STYLE_48 = "pref_date_color_style_48";
    public static final String PREF_DATE_COLOR_STYLE_49 = "pref_date_color_style_49";
    public static final String PREF_DATE_COLOR_STYLE_50 = "pref_date_color_style_50";
    public static final String PREF_DATE_COLOR_STYLE_51 = "pref_date_color_style_51";
    public static final String PREF_DATE_COLOR_STYLE_52 = "pref_date_color_style_52";
    public static final String PREF_DATE_COLOR_STYLE_53 = "pref_date_color_style_53";
    public static final String PREF_DATE_COLOR_STYLE_54 = "pref_date_color_style_54";
    public static final String PREF_DATE_COLOR_STYLE_3 = "pref_date_color_style_3";
    public static final String PREF_DATE_COLOR_STYLE_4 = "pref_date_color_style_4";
    public static final String PREF_DATE_COLOR_STYLE_5 = "pref_date_color_style_5";
    public static final String PREF_DATE_COLOR_STYLE_6 = "pref_date_color_style_6";
    public static final String PREF_DATE_COLOR_STYLE_7 = "pref_date_color_style_7";
    public static final String PREF_DATE_COLOR_STYLE_8 = "pref_date_color_style_8";
    public static final String PREF_DATE_COLOR_STYLE_9 = "pref_date_color_style_9";
    public static final String PREF_DAY_COLOR_STYLE_1 = "pref_day_color_style_1";
    public static final String PREF_DAY_COLOR_STYLE_10 = "pref_day_color_style_10";
    public static final String PREF_DAY_COLOR_STYLE_11 = "pref_day_color_style_11";
    public static final String PREF_DAY_COLOR_STYLE_12 = "pref_day_color_style_12";
    public static final String PREF_DAY_COLOR_STYLE_13 = "pref_day_color_style_13";
    public static final String PREF_DAY_COLOR_STYLE_14 = "pref_day_color_style_14";
    public static final String PREF_DAY_COLOR_STYLE_15 = "pref_day_color_style_15";
    public static final String PREF_DAY_COLOR_STYLE_16 = "pref_day_color_style_16";
    public static final String PREF_DAY_COLOR_STYLE_17 = "pref_day_color_style_17";
    public static final String PREF_DAY_COLOR_STYLE_18 = "pref_day_color_style_18";
    public static final String PREF_DAY_COLOR_STYLE_19 = "pref_day_color_style_19";
    public static final String PREF_DAY_COLOR_STYLE_2 = "pref_day_color_style_2";
    public static final String PREF_DAY_COLOR_STYLE_20 = "pref_day_color_style_20";
    public static final String PREF_DAY_COLOR_STYLE_21 = "pref_day_color_style_21";
    public static final String PREF_DAY_COLOR_STYLE_22 = "pref_day_color_style_22";
    public static final String PREF_DAY_COLOR_STYLE_23 = "pref_day_color_style_23";
    public static final String PREF_DAY_COLOR_STYLE_24 = "pref_day_color_style_24";
    public static final String PREF_DAY_COLOR_STYLE_25 = "pref_day_color_style_25";
    public static final String PREF_DAY_COLOR_STYLE_26 = "pref_day_color_style_26";
    public static final String PREF_DAY_COLOR_STYLE_27 = "pref_day_color_style_27";
    public static final String PREF_DAY_COLOR_STYLE_28 = "pref_day_color_style_28";
    public static final String PREF_DAY_COLOR_STYLE_29 = "pref_day_color_style_29";
    public static final String PREF_DAY_COLOR_STYLE_30 = "pref_day_color_style_30";
    public static final String PREF_DAY_COLOR_STYLE_31 = "pref_day_color_style_31";
    public static final String PREF_DAY_COLOR_STYLE_32 = "pref_day_color_style_32";
    public static final String PREF_DAY_COLOR_STYLE_33 = "pref_day_color_style_33";
    public static final String PREF_DAY_COLOR_STYLE_34 = "pref_day_color_style_34";
    public static final String PREF_DAY_COLOR_STYLE_35 = "pref_day_color_style_35";
    public static final String PREF_DAY_COLOR_STYLE_36 = "pref_day_color_style_36";
    public static final String PREF_DAY_COLOR_STYLE_37 = "pref_day_color_style_37";
    public static final String PREF_DAY_COLOR_STYLE_38 = "pref_day_color_style_38";
    public static final String PREF_DAY_COLOR_STYLE_39 = "pref_day_color_style_39";
    public static final String PREF_DAY_COLOR_STYLE_40 = "pref_day_color_style_40";
    public static final String PREF_DAY_COLOR_STYLE_41 = "pref_day_color_style_41";
    public static final String PREF_DAY_COLOR_STYLE_42 = "pref_day_color_style_42";
    public static final String PREF_DAY_COLOR_STYLE_43 = "pref_day_color_style_43";
    public static final String PREF_DAY_COLOR_STYLE_44 = "pref_day_color_style_44";
    public static final String PREF_DAY_COLOR_STYLE_45 = "pref_day_color_style_45";
    public static final String PREF_DAY_COLOR_STYLE_46 = "pref_day_color_style_46";
    public static final String PREF_DAY_COLOR_STYLE_47 = "pref_day_color_style_47";
    public static final String PREF_DAY_COLOR_STYLE_48 = "pref_day_color_style_48";
    public static final String PREF_DAY_COLOR_STYLE_49 = "pref_day_color_style_49";
    public static final String PREF_DAY_COLOR_STYLE_50 = "pref_day_color_style_50";
    public static final String PREF_DAY_COLOR_STYLE_51 = "pref_day_color_style_51";
    public static final String PREF_DAY_COLOR_STYLE_52 = "pref_day_color_style_52";
    public static final String PREF_DAY_COLOR_STYLE_53 = "pref_day_color_style_53";
    public static final String PREF_DAY_COLOR_STYLE_54 = "pref_day_color_style_54";
    public static final String PREF_DAY_COLOR_STYLE_3 = "pref_day_color_style_3";
    public static final String PREF_DAY_COLOR_STYLE_4 = "pref_day_color_style_4";
    public static final String PREF_DAY_COLOR_STYLE_5 = "pref_day_color_style_5";
    public static final String PREF_DAY_COLOR_STYLE_6 = "pref_day_color_style_6";
    public static final String PREF_DAY_COLOR_STYLE_7 = "pref_day_color_style_7";
    public static final String PREF_DAY_COLOR_STYLE_8 = "pref_day_color_style_8";
    public static final String PREF_DAY_COLOR_STYLE_9 = "pref_day_color_style_9";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_1 = "pref_hours_always_as_two_digit_style_1";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_10 = "pref_hours_always_as_two_digit_style_10";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_11 = "pref_hours_always_as_two_digit_style_11";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_12 = "pref_hours_always_as_two_digit_style_12";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_13 = "pref_hours_always_as_two_digit_style_13";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_14 = "pref_hours_always_as_two_digit_style_14";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_15 = "pref_hours_always_as_two_digit_style_15";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_16 = "pref_hours_always_as_two_digit_style_16";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_17 = "pref_hours_always_as_two_digit_style_17";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_18 = "pref_hours_always_as_two_digit_style_18";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_19 = "pref_hours_always_as_two_digit_style_19";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_2 = "pref_hours_always_as_two_digit_style_2";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_20 = "pref_hours_always_as_two_digit_style_20";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_21 = "pref_hours_always_as_two_digit_style_21";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_22 = "pref_hours_always_as_two_digit_style_22";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_23 = "pref_hours_always_as_two_digit_style_23";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_24 = "pref_hours_always_as_two_digit_style_24";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_25 = "pref_hours_always_as_two_digit_style_25";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_26 = "pref_hours_always_as_two_digit_style_26";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_27 = "pref_hours_always_as_two_digit_style_27";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_28 = "pref_hours_always_as_two_digit_style_28";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_29 = "pref_hours_always_as_two_digit_style_29";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_30 = "pref_hours_always_as_two_digit_style_30";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_31 = "pref_hours_always_as_two_digit_style_31";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_32 = "pref_hours_always_as_two_digit_style_32";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_33 = "pref_hours_always_as_two_digit_style_33";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_34 = "pref_hours_always_as_two_digit_style_34";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_35 = "pref_hours_always_as_two_digit_style_35";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_36 = "pref_hours_always_as_two_digit_style_36";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_37 = "pref_hours_always_as_two_digit_style_37";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_38 = "pref_hours_always_as_two_digit_style_38";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_39 = "pref_hours_always_as_two_digit_style_39";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_40 = "pref_hours_always_as_two_digit_style_40";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_41 = "pref_hours_always_as_two_digit_style_41";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_42 = "pref_hours_always_as_two_digit_style_42";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_43 = "pref_hours_always_as_two_digit_style_43";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_44 = "pref_hours_always_as_two_digit_style_44";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_45 = "pref_hours_always_as_two_digit_style_45";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_46 = "pref_hours_always_as_two_digit_style_46";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_47 = "pref_hours_always_as_two_digit_style_47";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_48 = "pref_hours_always_as_two_digit_style_48";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_49 = "pref_hours_always_as_two_digit_style_49";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_50 = "pref_hours_always_as_two_digit_style_50";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_51 = "pref_hours_always_as_two_digit_style_51";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_52 = "pref_hours_always_as_two_digit_style_52";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_53 = "pref_hours_always_as_two_digit_style_53";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_54 = "pref_hours_always_as_two_digit_style_54";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_3 = "pref_hours_always_as_two_digit_style_3";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_4 = "pref_hours_always_as_two_digit_style_4";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_5 = "pref_hours_always_as_two_digit_style_5";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_6 = "pref_hours_always_as_two_digit_style_6";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_7 = "pref_hours_always_as_two_digit_style_7";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_8 = "pref_hours_always_as_two_digit_style_8";
    public static final String PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_9 = "pref_hours_always_as_two_digit_style_9";
    public static final String PREF_HOURS_COLOR_STYLE_1 = "pref_hours_color_style_1";
    public static final String PREF_HOURS_COLOR_STYLE_10 = "pref_hours_color_style_10";
    public static final String PREF_HOURS_COLOR_STYLE_11 = "pref_hours_color_style_11";
    public static final String PREF_HOURS_COLOR_STYLE_12 = "pref_hours_color_style_12";
    public static final String PREF_HOURS_COLOR_STYLE_13 = "pref_hours_color_style_13";
    public static final String PREF_HOURS_COLOR_STYLE_14 = "pref_hours_color_style_14";
    public static final String PREF_HOURS_COLOR_STYLE_15 = "pref_hours_color_style_15";
    public static final String PREF_HOURS_COLOR_STYLE_16 = "pref_hours_color_style_16";
    public static final String PREF_HOURS_COLOR_STYLE_17 = "pref_hours_color_style_17";
    public static final String PREF_HOURS_COLOR_STYLE_18 = "pref_hours_color_style_18";
    public static final String PREF_HOURS_COLOR_STYLE_19 = "pref_hours_color_style_19";
    public static final String PREF_HOURS_COLOR_STYLE_2 = "pref_hours_color_style_2";
    public static final String PREF_HOURS_COLOR_STYLE_20 = "pref_hours_color_style_20";
    public static final String PREF_HOURS_COLOR_STYLE_21 = "pref_hours_color_style_21";
    public static final String PREF_HOURS_COLOR_STYLE_22 = "pref_hours_color_style_22";
    public static final String PREF_HOURS_COLOR_STYLE_23 = "pref_hours_color_style_23";
    public static final String PREF_HOURS_COLOR_STYLE_24 = "pref_hours_color_style_24";
    public static final String PREF_HOURS_COLOR_STYLE_25 = "pref_hours_color_style_25";
    public static final String PREF_HOURS_COLOR_STYLE_26 = "pref_hours_color_style_26";
    public static final String PREF_HOURS_COLOR_STYLE_27 = "pref_hours_color_style_27";
    public static final String PREF_HOURS_COLOR_STYLE_28 = "pref_hours_color_style_28";
    public static final String PREF_HOURS_COLOR_STYLE_29 = "pref_hours_color_style_29";
    public static final String PREF_HOURS_COLOR_STYLE_30 = "pref_hours_color_style_30";
    public static final String PREF_HOURS_COLOR_STYLE_31 = "pref_hours_color_style_31";
    public static final String PREF_HOURS_COLOR_STYLE_32 = "pref_hours_color_style_32";
    public static final String PREF_HOURS_COLOR_STYLE_33 = "pref_hours_color_style_33";
    public static final String PREF_HOURS_COLOR_STYLE_34 = "pref_hours_color_style_34";
    public static final String PREF_HOURS_COLOR_STYLE_35 = "pref_hours_color_style_35";
    public static final String PREF_HOURS_COLOR_STYLE_36 = "pref_hours_color_style_36";
    public static final String PREF_HOURS_COLOR_STYLE_37 = "pref_hours_color_style_37";
    public static final String PREF_HOURS_COLOR_STYLE_38 = "pref_hours_color_style_38";
    public static final String PREF_HOURS_COLOR_STYLE_39 = "pref_hours_color_style_39";
    public static final String PREF_HOURS_COLOR_STYLE_40 = "pref_hours_color_style_40";
    public static final String PREF_HOURS_COLOR_STYLE_41 = "pref_hours_color_style_41";
    public static final String PREF_HOURS_COLOR_STYLE_42 = "pref_hours_color_style_42";
    public static final String PREF_HOURS_COLOR_STYLE_43 = "pref_hours_color_style_43";
    public static final String PREF_HOURS_COLOR_STYLE_44 = "pref_hours_color_style_44";
    public static final String PREF_HOURS_COLOR_STYLE_45 = "pref_hours_color_style_45";
    public static final String PREF_HOURS_COLOR_STYLE_46 = "pref_hours_color_style_46";
    public static final String PREF_HOURS_COLOR_STYLE_47 = "pref_hours_color_style_47";
    public static final String PREF_HOURS_COLOR_STYLE_48 = "pref_hours_color_style_48";
    public static final String PREF_HOURS_COLOR_STYLE_49 = "pref_hours_color_style_49";
    public static final String PREF_HOURS_COLOR_STYLE_50 = "pref_hours_color_style_50";
    public static final String PREF_HOURS_COLOR_STYLE_51 = "pref_hours_color_style_51";
    public static final String PREF_HOURS_COLOR_STYLE_52 = "pref_hours_color_style_52";
    public static final String PREF_HOURS_COLOR_STYLE_53 = "pref_hours_color_style_53";
    public static final String PREF_HOURS_COLOR_STYLE_54 = "pref_hours_color_style_54";
    public static final String PREF_HOURS_COLOR_STYLE_3 = "pref_hours_color_style_3";
    public static final String PREF_HOURS_COLOR_STYLE_4 = "pref_hours_color_style_4";
    public static final String PREF_HOURS_COLOR_STYLE_5 = "pref_hours_color_style_5";
    public static final String PREF_HOURS_COLOR_STYLE_6 = "pref_hours_color_style_6";
    public static final String PREF_HOURS_COLOR_STYLE_7 = "pref_hours_color_style_7";
    public static final String PREF_HOURS_COLOR_STYLE_8 = "pref_hours_color_style_8";
    public static final String PREF_HOURS_COLOR_STYLE_9 = "pref_hours_color_style_9";
    public static final String PREF_IS_USER_GUIDE_SHOULD_SHOW_OR_NOT = "pref_is_user_guide_should_show_or_not";
    public static final String PREF_MINUTE_COLOR_STYLE_1 = "pref_minute_color_style_1";
    public static final String PREF_MINUTE_COLOR_STYLE_10 = "pref_minute_color_style_10";
    public static final String PREF_MINUTE_COLOR_STYLE_11 = "pref_minute_color_style_11";
    public static final String PREF_MINUTE_COLOR_STYLE_12 = "pref_minute_color_style_12";
    public static final String PREF_MINUTE_COLOR_STYLE_13 = "pref_minute_color_style_13";
    public static final String PREF_MINUTE_COLOR_STYLE_14 = "pref_minute_color_style_14";
    public static final String PREF_MINUTE_COLOR_STYLE_15 = "pref_minute_color_style_15";
    public static final String PREF_MINUTE_COLOR_STYLE_16 = "pref_minute_color_style_16";
    public static final String PREF_MINUTE_COLOR_STYLE_17 = "pref_minute_color_style_17";
    public static final String PREF_MINUTE_COLOR_STYLE_18 = "pref_minute_color_style_18";
    public static final String PREF_MINUTE_COLOR_STYLE_19 = "pref_minute_color_style_19";
    public static final String PREF_MINUTE_COLOR_STYLE_2 = "pref_minute_color_style_2";
    public static final String PREF_MINUTE_COLOR_STYLE_20 = "pref_minute_color_style_20";
    public static final String PREF_MINUTE_COLOR_STYLE_21 = "pref_minute_color_style_21";
    public static final String PREF_MINUTE_COLOR_STYLE_22 = "pref_minute_color_style_22";
    public static final String PREF_MINUTE_COLOR_STYLE_23 = "pref_minute_color_style_23";
    public static final String PREF_MINUTE_COLOR_STYLE_24 = "pref_minute_color_style_24";
    public static final String PREF_MINUTE_COLOR_STYLE_25 = "pref_minute_color_style_25";
    public static final String PREF_MINUTE_COLOR_STYLE_26 = "pref_minute_color_style_26";
    public static final String PREF_MINUTE_COLOR_STYLE_27 = "pref_minute_color_style_27";
    public static final String PREF_MINUTE_COLOR_STYLE_28 = "pref_minute_color_style_28";
    public static final String PREF_MINUTE_COLOR_STYLE_29 = "pref_minute_color_style_29";
    public static final String PREF_MINUTE_COLOR_STYLE_30 = "pref_minute_color_style_30";
    public static final String PREF_MINUTE_COLOR_STYLE_31 = "pref_minute_color_style_31";
    public static final String PREF_MINUTE_COLOR_STYLE_32 = "pref_minute_color_style_32";
    public static final String PREF_MINUTE_COLOR_STYLE_33 = "pref_minute_color_style_33";
    public static final String PREF_MINUTE_COLOR_STYLE_34 = "pref_minute_color_style_34";
    public static final String PREF_MINUTE_COLOR_STYLE_35 = "pref_minute_color_style_35";
    public static final String PREF_MINUTE_COLOR_STYLE_36 = "pref_minute_color_style_36";
    public static final String PREF_MINUTE_COLOR_STYLE_37 = "pref_minute_color_style_37";
    public static final String PREF_MINUTE_COLOR_STYLE_38 = "pref_minute_color_style_38";
    public static final String PREF_MINUTE_COLOR_STYLE_39 = "pref_minute_color_style_39";
    public static final String PREF_MINUTE_COLOR_STYLE_40 = "pref_minute_color_style_40";
    public static final String PREF_MINUTE_COLOR_STYLE_41 = "pref_minute_color_style_41";
    public static final String PREF_MINUTE_COLOR_STYLE_42 = "pref_minute_color_style_42";
    public static final String PREF_MINUTE_COLOR_STYLE_43 = "pref_minute_color_style_43";
    public static final String PREF_MINUTE_COLOR_STYLE_44 = "pref_minute_color_style_44";
    public static final String PREF_MINUTE_COLOR_STYLE_45 = "pref_minute_color_style_45";
    public static final String PREF_MINUTE_COLOR_STYLE_46 = "pref_minute_color_style_46";
    public static final String PREF_MINUTE_COLOR_STYLE_47 = "pref_minute_color_style_47";
    public static final String PREF_MINUTE_COLOR_STYLE_48 = "pref_minute_color_style_48";
    public static final String PREF_MINUTE_COLOR_STYLE_49 = "pref_minute_color_style_49";
    public static final String PREF_MINUTE_COLOR_STYLE_50 = "pref_minute_color_style_50";
    public static final String PREF_MINUTE_COLOR_STYLE_51 = "pref_minute_color_style_51";
    public static final String PREF_MINUTE_COLOR_STYLE_52 = "pref_minute_color_style_52";
    public static final String PREF_MINUTE_COLOR_STYLE_53 = "pref_minute_color_style_53";
    public static final String PREF_MINUTE_COLOR_STYLE_54 = "pref_minute_color_style_54";
    public static final String PREF_MINUTE_COLOR_STYLE_3 = "pref_minute_color_style_3";
    public static final String PREF_MINUTE_COLOR_STYLE_4 = "pref_minute_color_style_4";
    public static final String PREF_MINUTE_COLOR_STYLE_5 = "pref_minute_color_style_5";
    public static final String PREF_MINUTE_COLOR_STYLE_6 = "pref_minute_color_style_6";
    public static final String PREF_MINUTE_COLOR_STYLE_7 = "pref_minute_color_style_7";
    public static final String PREF_MINUTE_COLOR_STYLE_8 = "pref_minute_color_style_8";
    public static final String PREF_MINUTE_COLOR_STYLE_9 = "pref_minute_color_style_9";

    public static final String PREF_SECOND_COLOR_STYLE_42 = "pref_second_color_style_42";
    public static final String PREF_NAME = "DigitalClockWidget";
    public static final String PREF_SHOULD_WALLPAPER_SHOW_OR_NOT = "pref_should_wallpaper_show_or_not";
    public static final String PREF_TIME_BACKGROUND_COLOR_STYLE_18 = "pref_time_background_color_style_18";
    public static final String PREF_TIME_BACKGROUND_COLOR_STYLE_49 = "pref_time_background_color_style_49";
    public static final String PREF_TIME_BACKGROUND_COLOR_STYLE_22 = "pref_time_background_color_style_22";
    public static final String PREF_TIME_BACKGROUND_COLOR_STYLE_24 = "pref_time_background_color_style_24";
    private static Context contexts;
    private static SharedPreferences.Editor editor;
    private static SharedPreferences pref;

    private PreferenceUtils() {
    }

    public final SharedPreferences getPref() {
        return pref;
    }

    public final void setPref(SharedPreferences sharedPreferences) {
        pref = sharedPreferences;
    }

    public final SharedPreferences.Editor getEditor() {
        return editor;
    }

    public final void setEditor(SharedPreferences.Editor editor2) {
        editor = editor2;
    }

    public final Context getContexts() {
        return contexts;
    }

    public final void setContexts(Context context) {
        contexts = context;
    }

    public final PreferenceUtils getInstance(Context context) {
        contexts = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
        pref = sharedPreferences;
        editor = sharedPreferences.edit();
        return this;
    }

    public final Boolean getUserGuideShowOrNot() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_IS_USER_GUIDE_SHOULD_SHOW_OR_NOT, true));
    }

    public final void setUserGudeShowOrNot(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_IS_USER_GUIDE_SHOULD_SHOW_OR_NOT, bool.booleanValue()).apply();
    }

    public final Boolean getWallpaperShownOrNot() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_SHOULD_WALLPAPER_SHOW_OR_NOT, true));
    }

    public final void setWallpaperShownOrNot(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_SHOULD_WALLPAPER_SHOW_OR_NOT, bool.booleanValue()).apply();
    }

    public final Boolean get12or24FormatStyle1() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_1, true));
    }

    public final void set12or24FormatStyle1(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_1, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle1() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_1, false));
    }

    public final void setAMorPMVisibilityStyle1(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_1, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle1() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_1, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle1(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_1, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle1() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_1, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle1(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_1, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle1() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_1, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle1(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_1, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle1() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_1, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle1(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_1, num.intValue()).apply();
    }

    public final Integer getDayColorStyle1() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_1, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle1(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_1, num.intValue()).apply();
    }

    public final Integer getDateColorStyle1() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_1, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle1(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_1, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle2() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_2, true));
    }

    public final void set12or24FormatStyle2(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_2, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle2() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_2, true));
    }

    public final void setAMorPMVisibilityStyle2(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_2, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle2() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_2, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle2(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_2, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle2() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_2, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle2(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_2, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle2() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_2, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle2(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_2, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle2() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_2, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle2(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_2, num.intValue()).apply();
    }

    public final Integer getDayColorStyle2() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_2, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle2(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_2, num.intValue()).apply();
    }

    public final Integer getDateColorStyle2() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_2, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle2(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_2, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle3() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_3, true));
    }

    public final void set12or24FormatStyle3(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_3, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle3() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_3, true));
    }

    public final void setAMorPMVisibilityStyle3(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_3, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle3() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_3, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle3(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_3, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle3() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_3, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle3(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_3, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle3() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_3, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle3(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_3, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle3() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_3, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle3(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_3, num.intValue()).apply();
    }

    public final Integer getDayColorStyle3() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_3, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle3(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_3, num.intValue()).apply();
    }

    public final Integer getDateColorStyle3() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_3, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle3(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_3, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle4() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_4, true));
    }

    public final void set12or24FormatStyle4(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_4, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle4() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_4, true));
    }

    public final void setAMorPMVisibilityStyle4(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_4, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle4() {
        SharedPreferences sharedPreferences = pref;
        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_4, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle4(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_4, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle4() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_4, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle4(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_4, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle4() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_4, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle4(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_4, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle4() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_4, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle4(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_4, num.intValue()).apply();
    }

    public final Integer getDayColorStyle4() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_4, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle4(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_4, num.intValue()).apply();
    }

    public final Integer getDateColorStyle4() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_4, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle4(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_4, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle5() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_5, false));
    }

    public final void set12or24FormatStyle5(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_5, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle5() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_5, false));
    }

    public final void setAMorPMVisibilityStyle5(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_5, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle5() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_5, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle5(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_5, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle5() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_5, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle5(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_5, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle5() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_5, ResourcesCompat.getColor(context.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle5(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_5, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle5() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_5, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle5(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_5, num.intValue()).apply();
    }

    public final Integer getDayColorStyle5() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_5, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setDayColorStyle5(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_5, num.intValue()).apply();
    }

    public final Integer getDateColorStyle5() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_5, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle5(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_5, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle6() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_6, true));
    }

    public final void set12or24FormatStyle6(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_6, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle6() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_6, true));
    }

    public final void setAMorPMVisibilityStyle6(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_6, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle6() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_6, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle6(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_6, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle6() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_6, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle6(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_6, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle6() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_6, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle6(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_6, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle6() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_6, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle6(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_6, num.intValue()).apply();
    }

    public final Integer getDayColorStyle6() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_6, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle6(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_6, num.intValue()).apply();
    }

    public final Integer getDateColorStyle6() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_6, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle6(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_6, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle7() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_7, true));
    }

    public final void set12or24FormatStyle7(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_7, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle7() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_7, false));
    }

    public final void setAMorPMVisibilityStyle7(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_7, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle7() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_7, false));
    }

    public final void setHoursAlwaysAsTwoDigitStyle7(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_7, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle7() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_7, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle7(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_7, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle7() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_7, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle7(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_7, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle7() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_7, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle7(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_7, num.intValue()).apply();
    }

    public final Integer getDayColorStyle7() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_7, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setDayColorStyle7(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_7, num.intValue()).apply();
    }

    public final Integer getDateColorStyle7() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_7, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle7(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_7, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle8() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_8, true));
    }

    public final void set12or24FormatStyle8(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_8, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle8() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_8, true));
    }

    public final void setAMorPMVisibilityStyle8(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_8, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle8() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_8, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle8(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_8, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle8() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_8, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle8(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_8, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle8() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_8, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle8(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_8, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle8() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_8, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle8(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_8, num.intValue()).apply();
    }

    public final Integer getDayColorStyle8() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_8, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle8(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_8, num.intValue()).apply();
    }

    public final Integer getDateColorStyle8() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_8, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle8(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_8, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle9() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_9, true));
    }

    public final void set12or24FormatStyle9(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_9, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle9() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_9, false));
    }

    public final void setAMorPMVisibilityStyle9(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_9, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle9() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_9, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle9(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_9, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle9() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_9, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle9(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_9, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle9() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_9, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle9(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_9, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle9() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_9, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle9(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_9, num.intValue()).apply();
    }

    public final Integer getDayColorStyle9() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_9, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle9(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_9, num.intValue()).apply();
    }

    public final Integer getDateColorStyle9() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_9, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle9(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_9, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle10() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_10, true));
    }

    public final void set12or24FormatStyle10(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_10, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle10() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_10, true));
    }

    public final void setAMorPMVisibilityStyle10(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_10, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle10() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_10, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle10(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_10, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle10() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_10, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle10(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_10, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle10() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_10, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle10(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_10, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle10() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_10, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle10(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_10, num.intValue()).apply();
    }

    public final Integer getDayColorStyle10() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_10, ResourcesCompat.getColor(context.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
    }

    public final void setDayColorStyle10(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_10, num.intValue()).apply();
    }

    public final Integer getDateColorStyle10() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_10, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle10(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_10, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle11() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_11, true));
    }

    public final void set12or24FormatStyle11(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_11, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle11() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_11, false));
    }

    public final void setAMorPMVisibilityStyle11(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_11, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle11() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_11, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle11(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_11, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle11() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_11, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle11(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_11, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle11() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_11, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle11(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_11, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle11() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_11, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle11(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_11, num.intValue()).apply();
    }

    public final Integer getDayColorStyle11() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_11, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setDayColorStyle11(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_11, num.intValue()).apply();
    }

    public final Integer getDateColorStyle11() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_11, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle11(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_11, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle12() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_12, true));
    }

    public final void set12or24FormatStyle12(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_12, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle12() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_12, true));
    }

    public final void setAMorPMVisibilityStyle12(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_12, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle12() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_12, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle12(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_12, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle12() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_12, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle12(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_12, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle12() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_12, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle12(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_12, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle12() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_12, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle12(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_12, num.intValue()).apply();
    }

    public final Integer getDayColorStyle12() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_12, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setDayColorStyle12(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_12, num.intValue()).apply();
    }

    public final Integer getDateColorStyle12() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_12, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle12(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_12, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle13() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_13, true));
    }

    public final void set12or24FormatStyle13(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_13, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle13() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_13, true));
    }

    public final void setAMorPMVisibilityStyle13(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_13, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle13() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_13, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle13(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_13, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle13() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_13, ResourcesCompat.getColor(context.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle13(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_13, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle13() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_13, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle13(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_13, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle13() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_13, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle13(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_13, num.intValue()).apply();
    }

    public final Integer getDayColorStyle13() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_13, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle13(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_13, num.intValue()).apply();
    }

    public final Integer getDateColorStyle13() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_13, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle13(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_13, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle14() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_14, true));
    }

    public final void set12or24FormatStyle14(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_14, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle14() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_14, false));
    }

    public final void setAMorPMVisibilityStyle14(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_14, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle14() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_14, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle14(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_14, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle14() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_14, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle14(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_14, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle14() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_14, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle14(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_14, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle14() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_14, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle14(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_14, num.intValue()).apply();
    }

    public final Integer getDayColorStyle14() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_14, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle14(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_14, num.intValue()).apply();
    }

    public final Integer getDateColorStyle14() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_14, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle14(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_14, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle15() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_15, true));
    }

    public final void set12or24FormatStyle15(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_15, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle15() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_15, true));
    }

    public final void setAMorPMVisibilityStyle15(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_15, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle15() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_15, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle15(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_15, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle15() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_15, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle15(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_15, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle15() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_15, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle15(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_15, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle15() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_15, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle15(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_15, num.intValue()).apply();
    }

    public final Integer getDayColorStyle15() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_15, ResourcesCompat.getColor(context.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
    }

    public final void setDayColorStyle15(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_15, num.intValue()).apply();
    }

    public final Integer getDateColorStyle15() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_15, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle15(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_15, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle16() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_16, true));
    }

    public final void set12or24FormatStyle16(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_16, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle16() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_16, false));
    }

    public final void setAMorPMVisibilityStyle16(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_16, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle16() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_16, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle16(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_16, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle16() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_16, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle16(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_16, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle16() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_16, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle16(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_16, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle16() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_16, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle16(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_16, num.intValue()).apply();
    }

    public final Integer getDayColorStyle16() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_16, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle16(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_16, num.intValue()).apply();
    }

    public final Integer getDateColorStyle16() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_16, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle16(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_16, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle17() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_17, true));
    }

    public final void set12or24FormatStyle17(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_17, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle17() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_17, false));
    }

    public final void setAMorPMVisibilityStyle17(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_17, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle17() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_17, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle17(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_17, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle17() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_17, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle17(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_17, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle17() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_17, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle17(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_17, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle17() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_17, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle17(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_17, num.intValue()).apply();
    }

    public final Integer getDayColorStyle17() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_17, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setDayColorStyle17(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_17, num.intValue()).apply();
    }

    public final Integer getDateColorStyle17() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_17, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle17(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_17, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle18() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_18, true));
    }

    public final void set12or24FormatStyle18(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_18, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle18() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_18, true));
    }

    public final void setAMorPMVisibilityStyle18(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_18, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle18() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_18, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle18(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_18, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle18() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_18, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle18(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_18, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle18() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_18, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle18(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_18, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle18() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_18, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle18(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_18, num.intValue()).apply();
    }

    public final Integer getDayColorStyle18() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_18, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle18(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_18, num.intValue()).apply();
    }

    public final Integer getDateColorStyle18() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_18, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle18(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_18, num.intValue()).apply();
    }

    public final Integer getTimeBackgroundColorStyle18() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_TIME_BACKGROUND_COLOR_STYLE_18, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setTimeBackgroundColorStyle18(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_TIME_BACKGROUND_COLOR_STYLE_18, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle19() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_19, true));
    }

    public final void set12or24FormatStyle19(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_19, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle19() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_19, true));
    }

    public final void setAMorPMVisibilityStyle19(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_19, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle19() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_19, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle19(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_19, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle19() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_19, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle19(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_19, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle19() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_19, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle19(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_19, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle19() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_19, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle19(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_19, num.intValue()).apply();
    }

    public final Integer getDayColorStyle19() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_19, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle19(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_19, num.intValue()).apply();
    }

    public final Integer getDateColorStyle19() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_19, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle19(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_19, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle20() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_20, true));
    }

    public final void set12or24FormatStyle20(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_20, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle20() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_20, false));
    }

    public final void setAMorPMVisibilityStyle20(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_20, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle20() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_20, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle20(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_20, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle20() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_20, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle20(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_20, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle20() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_20, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle20(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_20, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle20() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_20, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle20(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_20, num.intValue()).apply();
    }

    public final Integer getDayColorStyle20() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_20, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setDayColorStyle20(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_20, num.intValue()).apply();
    }

    public final Integer getDateColorStyle20() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_20, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle20(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_20, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle21() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_21, true));
    }

    public final void set12or24FormatStyle21(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_21, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle21() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_21, false));
    }

    public final void setAMorPMVisibilityStyle21(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_21, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle21() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_21, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle21(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_21, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle21() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_21, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle21(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_21, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle21() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_21, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle21(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_21, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle21() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_21, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle21(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_21, num.intValue()).apply();
    }

    public final Integer getDayColorStyle21() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_21, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle21(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_21, num.intValue()).apply();
    }

    public final Integer getDateColorStyle21() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_21, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle21(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_21, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle22() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_22, true));
    }

    public final void set12or24FormatStyle22(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_22, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle22() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_22, false));
    }

    public final void setAMorPMVisibilityStyle22(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_22, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle22() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_22, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle22(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_22, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle22() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_22, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle22(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_22, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle22() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_22, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle22(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_22, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle22() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_22, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle22(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_22, num.intValue()).apply();
    }

    public final Integer getDayColorStyle22() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_22, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle22(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_22, num.intValue()).apply();
    }

    public final Integer getDateColorStyle22() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_22, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle22(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_22, num.intValue()).apply();
    }

    public final Integer getTimeBackgroundColorStyle22() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_TIME_BACKGROUND_COLOR_STYLE_22, ResourcesCompat.getColor(context.getResources(), R.color.colorRed, (Resources.Theme) null)));
    }

    public final void setTimeBackgroundColorStyle22(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_TIME_BACKGROUND_COLOR_STYLE_22, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle23() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_23, true));
    }

    public final void set12or24FormatStyle23(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_23, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle23() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_23, false));
    }

    public final void setAMorPMVisibilityStyle23(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_23, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle23() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_23, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle23(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_23, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle23() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_23, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle23(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_23, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle23() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_23, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle23(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_23, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle23() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_23, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle23(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_23, num.intValue()).apply();
    }

    public final Integer getDayColorStyle23() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_23, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setDayColorStyle23(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_23, num.intValue()).apply();
    }

    public final Integer getDateColorStyle23() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_23, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle23(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_23, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle24() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_24, true));
    }

    public final void set12or24FormatStyle24(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_24, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle24() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_24, true));
    }

    public final void setAMorPMVisibilityStyle24(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_24, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle24() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_24, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle24(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_24, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle24() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_24, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle24(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_24, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle24() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_24, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle24(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_24, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle24() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_24, ResourcesCompat.getColor(context.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle24(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_24, num.intValue()).apply();
    }

    public final Integer getDayColorStyle24() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_24, ResourcesCompat.getColor(context.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
    }

    public final void setDayColorStyle24(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_24, num.intValue()).apply();
    }

    public final Integer getDateColorStyle24() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_24, ResourcesCompat.getColor(context.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
    }

    public final void setDateColorStyle24(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_24, num.intValue()).apply();
    }

    public final Integer getTimeBackgroundColorStyle24() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_TIME_BACKGROUND_COLOR_STYLE_24, ResourcesCompat.getColor(context.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
    }

    public final void setTimeBackgroundColorStyle24(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_TIME_BACKGROUND_COLOR_STYLE_24, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle25() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_25, true));
    }

    public final void set12or24FormatStyle25(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_25, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle25() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_25, true));
    }

    public final void setAMorPMVisibilityStyle25(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_25, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle25() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_25, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle25(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_25, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle25() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_25, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle25(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_HOURS_COLOR_STYLE_25, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle25() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_25, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle25(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_MINUTE_COLOR_STYLE_25, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle25() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_25, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle25(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_25, num.intValue()).apply();
    }

    public final Integer getDayColorStyle25() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_25, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle25(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DAY_COLOR_STYLE_25, num.intValue()).apply();
    }

    public final Integer getDateColorStyle25() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_25, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle25(Integer num) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putInt(PREF_DATE_COLOR_STYLE_25, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle26() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_26, true));
    }

    public final void set12or24FormatStyle26(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_26, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle26() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_26, true));
    }

    public final void setAMorPMVisibilityStyle26(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_26, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle26() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_26, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle26(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_26, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle26() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_26, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle26(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_26, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle26() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_26, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle26(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_26, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle26() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_26, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle26(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_26, num.intValue()).apply();
    }

    public final Integer getDayColorStyle26() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_26, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setDayColorStyle26(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_26, num.intValue()).apply();
    }

    public final Integer getDateColorStyle26() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_26, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setDateColorStyle26(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_26, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle27() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_27, true));
    }

    public final void set12or24FormatStyle27(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_27, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle27() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_27, true));
    }

    public final void setAMorPMVisibilityStyle27(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_27, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle27() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_27, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle27(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_27, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle27() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_27, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle27(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_27, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle27() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_27, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle27(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_27, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle27() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_27, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle27(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_27, num.intValue()).apply();
    }

    public final Integer getDayColorStyle27() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_27, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setDayColorStyle27(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_27, num.intValue()).apply();
    }

    public final Integer getDateColorStyle27() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_27, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle27(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_27, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle28() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_28, true));
    }

    public final void set12or24FormatStyle28(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_28, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle28() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_28, true));
    }

    public final void setAMorPMVisibilityStyle28(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_28, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle28() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_28, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle28(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_28, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle28() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_28, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle28(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_28, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle28() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_28, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle28(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_28, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle28() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_28, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle28(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_28, num.intValue()).apply();
    }

    public final Integer getDayColorStyle28() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_28, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle28(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_28, num.intValue()).apply();
    }

    public final Integer getDateColorStyle28() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_28, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle28(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_28, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle29() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_29, true));
    }

    public final void set12or24FormatStyle29(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_29, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle29() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_29, true));
    }

    public final void setAMorPMVisibilityStyle29(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_29, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle29() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_29, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle29(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_29, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle29() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_29, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle29(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_29, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle29() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_29, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle29(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_29, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle29() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_29, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle29(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_29, num.intValue()).apply();
    }

    public final Integer getDayColorStyle29() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_29, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle29(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_29, num.intValue()).apply();
    }

    public final Integer getDateColorStyle29() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_29, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle29(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_29, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle30() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_30, true));
    }

    public final void set12or24FormatStyle30(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_30, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle30() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_30, true));
    }

    public final void setAMorPMVisibilityStyle30(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_30, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle30() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_30, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle30(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_30, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle30() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_30, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle30(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_30, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle30() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_30, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle30(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_30, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle30() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_30, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle30(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_30, num.intValue()).apply();
    }

    public final Integer getDayColorStyle30() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_30, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle30(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_30, num.intValue()).apply();
    }

    public final Integer getDateColorStyle30() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_30, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle30(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_30, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle31() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_31, true));
    }

    public final void set12or24FormatStyle31(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_31, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle31() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_31, true));
    }

    public final void setAMorPMVisibilityStyle31(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_31, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle31() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_31, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle31(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_31, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle31() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_31, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle31(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_31, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle31() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_31, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle31(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_31, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle31() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_31, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle31(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_31, num.intValue()).apply();
    }

    public final Integer getDayColorStyle31() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_31, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setDayColorStyle31(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_31, num.intValue()).apply();
    }

    public final Integer getDateColorStyle31() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_31, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle31(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_31, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle32() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_32, true));
    }

    public final void set12or24FormatStyle32(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_32, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle32() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_32, true));
    }

    public final void setAMorPMVisibilityStyle32(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_32, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle32() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_32, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle32(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_32, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle32() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_32, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle32(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_32, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle32() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_32, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle32(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_32, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle32() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_32, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle32(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_32, num.intValue()).apply();
    }

    public final Integer getDayColorStyle32() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_32, ResourcesCompat.getColor(context.getResources(), R.color.colorMediumRed, (Resources.Theme) null)));
    }

    public final void setDayColorStyle32(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_32, num.intValue()).apply();
    }

    public final Integer getDateColorStyle32() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_32, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle32(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_32, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle33() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_33, true));
    }

    public final void set12or24FormatStyle33(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_33, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle33() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_33, true));
    }

    public final void setAMorPMVisibilityStyle33(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_33, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle33() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_33, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle33(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_33, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle33() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_33, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle33(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_33, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle33() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_33, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle33(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_33, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle33() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_33, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle33(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_33, num.intValue()).apply();
    }

    public final Integer getDayColorStyle33() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_33, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle33(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_33, num.intValue()).apply();
    }

    public final Integer getDateColorStyle33() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_33, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle33(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_33, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle34() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_34, true));
    }

    public final void set12or24FormatStyle34(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_34, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle34() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_34, true));
    }

    public final void setAMorPMVisibilityStyle34(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_34, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle34() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_34, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle34(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_34, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle34() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_34, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle34(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_34, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle34() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_34, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle34(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_34, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle34() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_34, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle34(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_34, num.intValue()).apply();
    }

    public final Integer getDayColorStyle34() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_34, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle34(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_34, num.intValue()).apply();
    }

    public final Integer getDateColorStyle34() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_34, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle34(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_34, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle35() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_35, true));
    }

    public final void set12or24FormatStyle35(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_35, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle35() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_35, true));
    }

    public final void setAMorPMVisibilityStyle35(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_35, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle35() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_35, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle35(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_35, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle35() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_35, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle35(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_35, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle35() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_35, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle35(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_35, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle35() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_35, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle35(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_35, num.intValue()).apply();
    }

    public final Integer getDayColorStyle35() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_35, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle35(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_35, num.intValue()).apply();
    }

    public final Integer getDateColorStyle35() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_35, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle35(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_35, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle36() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_36, true));
    }

    public final void set12or24FormatStyle36(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_36, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle36() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_36, true));
    }

    public final void setAMorPMVisibilityStyle36(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_36, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle36() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_36, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle36(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_36, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle36() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_36, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle36(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_36, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle36() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_36, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle36(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_36, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle36() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_36, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle36(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_36, num.intValue()).apply();
    }

    public final Integer getDayColorStyle36() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_36, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setDayColorStyle36(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_36, num.intValue()).apply();
    }

    public final Integer getDateColorStyle36() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_36, ResourcesCompat.getColor(context.getResources(), R.color.colorNeon, (Resources.Theme) null)));
    }

    public final void setDateColorStyle36(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_36, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle37() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_37, true));
    }

    public final void set12or24FormatStyle37(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_37, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle37() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_37, true));
    }

    public final void setAMorPMVisibilityStyle37(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_37, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle37() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_37, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle37(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_37, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle37() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_37, ResourcesCompat.getColor(context.getResources(), R.color.colorOffWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle37(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_37, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle37() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_37, ResourcesCompat.getColor(context.getResources(), R.color.clock_17_minute_transparent, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle37(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_37, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle37() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_37, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle37(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_37, num.intValue()).apply();
    }

    public final Integer getDayColorStyle37() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_37, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle37(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_37, num.intValue()).apply();
    }

    public final Integer getDateColorStyle37() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_37, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle37(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_37, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle38() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_38, true));
    }

    public final void set12or24FormatStyle38(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_38, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle38() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_38, true));
    }

    public final void setAMorPMVisibilityStyle38(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_38, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle38() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_38, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle38(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_38, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle38() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_38, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle38(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_38, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle38() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_38, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle38(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_38, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle38() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_38, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle38(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_38, num.intValue()).apply();
    }

    public final Integer getDayColorStyle38() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_38, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle38(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_38, num.intValue()).apply();
    }

    public final Integer getDateColorStyle38() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_38, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle38(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_38, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle39() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_39, true));
    }

    public final void set12or24FormatStyle39(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_39, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle39() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_39, true));
    }

    public final void setAMorPMVisibilityStyle39(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_39, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle39() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_39, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle39(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_39, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle39() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_39, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle39(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_39, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle39() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_39, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle39(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_39, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle39() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_39, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle39(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_39, num.intValue()).apply();
    }

    public final Integer getDayColorStyle39() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_39, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle39(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_39, num.intValue()).apply();
    }

    public final Integer getDateColorStyle39() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_39, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle39(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_39, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle40() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_40, true));
    }

    public final void set12or24FormatStyle40(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_40, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle40() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_40, true));
    }

    public final void setAMorPMVisibilityStyle40(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_40, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle40() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_40, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle40(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_40, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle40() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_40, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle40(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_40, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle40() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_40, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle40(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_40, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle40() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_40, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle40(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_40, num.intValue()).apply();
    }

    public final Integer getDayColorStyle40() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_40, ResourcesCompat.getColor(context.getResources(), R.color.colorYellow, (Resources.Theme) null)));
    }

    public final void setDayColorStyle40(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_40, num.intValue()).apply();
    }

    public final Integer getDateColorStyle40() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_40, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle40(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_40, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle41() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_41, true));
    }

    public final void set12or24FormatStyle41(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_41, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle41() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_41, true));
    }

    public final void setAMorPMVisibilityStyle41(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_41, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle41() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_41, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle41(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_41, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle41() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_41, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle41(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_41, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle41() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_41, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle41(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_41, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle41() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_41, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle41(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_41, num.intValue()).apply();
    }

    public final Integer getDayColorStyle41() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_41, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle41(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_41, num.intValue()).apply();
    }

    public final Integer getDateColorStyle41() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_41, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle41(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_41, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle42() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_42, true));
    }

    public final void set12or24FormatStyle42(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_42, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle42() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_42, true));
    }

    public final void setAMorPMVisibilityStyle42(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_42, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle42() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_42, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle42(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_42, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle42() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_42, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle42(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_42, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle42() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_42, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle42(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_42, num.intValue()).apply();
    }

    public final Integer getSecondColorStyle42() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_SECOND_COLOR_STYLE_42, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setSecondColorStyle42(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_SECOND_COLOR_STYLE_42, num.intValue()).apply();
    }


    public final Integer getAMorPMColorStyle42() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_42, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle42(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_42, num.intValue()).apply();
    }

    public final Integer getDayColorStyle42() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_42, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle42(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_42, num.intValue()).apply();
    }

    public final Integer getDateColorStyle42() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_42, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle42(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_42, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle43() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_43, true));
    }

    public final void set12or24FormatStyle43(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_43, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle43() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_43, true));
    }

    public final void setAMorPMVisibilityStyle43(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_43, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle43() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_43, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle43(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_43, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle43() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_43, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle43(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_43, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle43() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_43, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle43(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_43, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle43() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_43, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle43(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_43, num.intValue()).apply();
    }

    public final Integer getDayColorStyle43() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_43, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle43(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_43, num.intValue()).apply();
    }

    public final Integer getDateColorStyle43() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_43, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle43(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_43, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle44() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_44, true));
    }

    public final void set12or24FormatStyle44(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_44, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle44() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_44, true));
    }

    public final void setAMorPMVisibilityStyle44(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_44, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle44() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_44, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle44(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_44, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle44() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_44, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle44(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_44, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle44() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_44, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle44(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_44, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle44() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_44, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle44(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_44, num.intValue()).apply();
    }

    public final Integer getDayColorStyle44() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_44, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle44(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_44, num.intValue()).apply();
    }

    public final Integer getDateColorStyle44() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_44, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle44(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_44, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle45() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_45, true));
    }

    public final void set12or24FormatStyle45(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_45, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle45() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_45, true));
    }

    public final void setAMorPMVisibilityStyle45(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_45, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle45() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_45, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle45(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_45, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle45() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_45, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle45(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_45, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle45() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_45, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle45(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_45, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle45() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_45, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle45(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_45, num.intValue()).apply();
    }

    public final Integer getDayColorStyle45() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_45, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle45(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_45, num.intValue()).apply();
    }

    public final Integer getDateColorStyle45() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_45, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle45(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_45, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle46() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_46, true));
    }

    public final void set12or24FormatStyle46(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_46, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle46() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_46, true));
    }

    public final void setAMorPMVisibilityStyle46(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_46, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle46() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_46, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle46(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_46, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle46() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_46, ResourcesCompat.getColor(context.getResources(), R.color.colorRed, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle46(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_46, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle46() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_46, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle46(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_46, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle46() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_46, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle46(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_46, num.intValue()).apply();
    }

    public final Integer getDayColorStyle46() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_46, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle46(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_46, num.intValue()).apply();
    }

    public final Integer getDateColorStyle46() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_46, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle46(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_46, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle47() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_47, true));
    }

    public final void set12or24FormatStyle47(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_47, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle47() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_47, true));
    }

    public final void setAMorPMVisibilityStyle47(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_47, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle47() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_47, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle47(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_47, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle47() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_47, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle47(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_47, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle47() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_47, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle47(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_47, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle47() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_47, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle47(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_47, num.intValue()).apply();
    }

    public final Integer getDayColorStyle47() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_47, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle47(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_47, num.intValue()).apply();
    }

    public final Integer getDateColorStyle47() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_47, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle47(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_47, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle48() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_48, true));
    }

    public final void set12or24FormatStyle48(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_48, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle48() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_48, true));
    }

    public final void setAMorPMVisibilityStyle48(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_48, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle48() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_48, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle48(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_48, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle48() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_48, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle48(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_48, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle48() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_48, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle48(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_48, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle48() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_48, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle48(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_48, num.intValue()).apply();
    }

    public final Integer getDayColorStyle48() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_48, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle48(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_48, num.intValue()).apply();
    }

    public final Integer getDateColorStyle48() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_48, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle48(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_48, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle49() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_49, true));
    }

    public final void set12or24FormatStyle49(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_49, bool.booleanValue()).apply();
    }

    public final Integer getTimeBackgroundColorStyle49() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_TIME_BACKGROUND_COLOR_STYLE_49, ResourcesCompat.getColor(context.getResources(), R.color.colorRed, (Resources.Theme) null)));
    }

    public final void setTimeBackgroundColorStyle49(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_TIME_BACKGROUND_COLOR_STYLE_49, num.intValue()).apply();
    }


    public final Boolean getAMorPMVisibilityStyle49() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_49, true));
    }

    public final void setAMorPMVisibilityStyle49(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_49, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle49() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_49, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle49(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_49, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle49() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_49, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle49(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_49, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle49() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_49, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle49(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_49, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle49() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_49, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle49(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_49, num.intValue()).apply();
    }

    public final Integer getDayColorStyle49() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_49, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle49(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_49, num.intValue()).apply();
    }

    public final Integer getDateColorStyle49() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_49, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle49(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_49, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle50() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_50, true));
    }

    public final void set12or24FormatStyle50(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_50, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle50() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_50, true));
    }

    public final void setAMorPMVisibilityStyle50(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_50, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle50() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_50, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle50(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_50, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle50() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_50, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle50(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_50, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle50() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_50, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle50(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_50, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle50() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_50, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle50(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_50, num.intValue()).apply();
    }

    public final Integer getDayColorStyle50() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_50, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle50(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_50, num.intValue()).apply();
    }

    public final Integer getDateColorStyle50() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_50, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle50(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_50, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle51() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_51, true));
    }

    public final void set12or24FormatStyle51(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_51, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle51() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_51, true));
    }

    public final void setAMorPMVisibilityStyle51(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_51, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle51() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_51, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle51(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_51, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle51() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_51, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle51(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_51, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle51() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_51, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle51(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_51, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle51() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_51, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle51(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_51, num.intValue()).apply();
    }

    public final Integer getDayColorStyle51() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_51, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle51(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_51, num.intValue()).apply();
    }

    public final Integer getDateColorStyle51() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_51, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle51(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_51, num.intValue()).apply();
    }


    public final Boolean get12or24FormatStyle52() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_52, true));
    }

    public final void set12or24FormatStyle52(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_52, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle52() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_52, true));
    }

    public final void setAMorPMVisibilityStyle52(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_52, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle52() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_52, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle52(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_52, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle52() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_52, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle52(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_52, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle52() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_52, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle52(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_52, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle52() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_52, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle52(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_52, num.intValue()).apply();
    }

    public final Integer getDayColorStyle52() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_52, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDayColorStyle52(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_52, num.intValue()).apply();
    }

    public final Integer getDateColorStyle52() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_52, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle52(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_52, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle53() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_53, true));
    }

    public final void set12or24FormatStyle53(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_53, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle53() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_53, true));
    }

    public final void setAMorPMVisibilityStyle53(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_53, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle53() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_53, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle53(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_53, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle53() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_53, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle53(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_53, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle53() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_53, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle53(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_53, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle53() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_53, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle53(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_53, num.intValue()).apply();
    }

    public final Integer getDayColorStyle53() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_53, ResourcesCompat.getColor(context.getResources(), R.color.colorMediumRed, (Resources.Theme) null)));
    }

    public final void setDayColorStyle53(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_53, num.intValue()).apply();
    }

    public final Integer getDateColorStyle53() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_53, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setDateColorStyle53(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_53, num.intValue()).apply();
    }

    public final Boolean get12or24FormatStyle54() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_12_OR_24_FORMAT_STYLE_54, true));
    }

    public final void set12or24FormatStyle54(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_12_OR_24_FORMAT_STYLE_54, bool.booleanValue()).apply();
    }

    public final Boolean getAMorPMVisibilityStyle54() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_54, true));
    }

    public final void setAMorPMVisibilityStyle54(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_AM_OR_PM_VISIBILITY_STYLE_54, bool.booleanValue()).apply();
    }

    public final Boolean getHoursAlwaysAsTwoDigitStyle54() {
        SharedPreferences sharedPreferences = pref;

        return Boolean.valueOf(sharedPreferences.getBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_54, true));
    }

    public final void setHoursAlwaysAsTwoDigitStyle54(Boolean bool) {
        SharedPreferences.Editor editor2 = editor;


        editor2.putBoolean(PREF_HOURS_ALWAYS_AS_TWO_DIGIT_STYLE_54, bool.booleanValue()).apply();
    }

    public final Integer getHoursColorStyle54() {
        SharedPreferences sharedPreferences = pref;

        Context context = contexts;

        return Integer.valueOf(sharedPreferences.getInt(PREF_HOURS_COLOR_STYLE_54, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setHoursColorStyle54(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_HOURS_COLOR_STYLE_54, num.intValue()).apply();
    }

    public final Integer getMinuteColorStyle54() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_MINUTE_COLOR_STYLE_54, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setMinuteColorStyle54(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_MINUTE_COLOR_STYLE_54, num.intValue()).apply();
    }

    public final Integer getAMorPMColorStyle54() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_AM_OR_PM_COLOR_STYLE_54, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setAMorPMColorStyle54(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_AM_OR_PM_COLOR_STYLE_54, num.intValue()).apply();
    }

    public final Integer getDayColorStyle54() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DAY_COLOR_STYLE_54, ResourcesCompat.getColor(context.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
    }

    public final void setDayColorStyle54(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DAY_COLOR_STYLE_54, num.intValue()).apply();
    }

    public final Integer getDateColorStyle54() {
        SharedPreferences sharedPreferences = pref;
        Context context = contexts;
        return Integer.valueOf(sharedPreferences.getInt(PREF_DATE_COLOR_STYLE_54, ResourcesCompat.getColor(context.getResources(), R.color.colorWhite, (Resources.Theme) null)));
    }

    public final void setDateColorStyle54(Integer num) {
        SharedPreferences.Editor editor2 = editor;
        editor2.putInt(PREF_DATE_COLOR_STYLE_54, num.intValue()).apply();
    }
}
