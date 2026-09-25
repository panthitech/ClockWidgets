package com.clock.digital.widget.clockwidget;

import android.graphics.Color;
import android.view.View;
import android.widget.RemoteViews;


public final class SetRemoteViewsKt {
    public static final void setBackgroundColor(RemoteViews remoteViews, int i, int i2) {
        remoteViews.setInt(i, "setBackgroundColor", i2);
    }

    public static final void setTextSize(RemoteViews remoteViews, int i, float f) {
        remoteViews.setFloat(i, "setTextSize", f);
    }

    public static final void setText(RemoteViews remoteViews, int i, String str) {
        remoteViews.setTextViewText(i, str);
    }

    public static final void setTextColors(RemoteViews remoteViews, int i, int i2) {
        remoteViews.setTextColor(i, i2);
    }

    public static final void setBackgroundColors(RemoteViews remoteViews, int i, int i2) {
        setBackgroundColor(remoteViews, i, i2);
    }

    public static final void setVisibleOrGone(RemoteViews remoteViews, int i, boolean z) {
        remoteViews.setViewVisibility(i, z ? View.VISIBLE : View.GONE);
    }

    public static final void setVisibleOrInVisible(RemoteViews remoteViews, int i, boolean z) {
        remoteViews.setViewVisibility(i, z ? View.VISIBLE : View.INVISIBLE);
    }

    public static final void applyColorFilter(RemoteViews remoteViews, int i, int i2) {
        remoteViews.setInt(i, "setColorFilter", i2);
        remoteViews.setInt(i, "setImageAlpha", Color.alpha(i2));
    }

    public static final void setTimeBackground(RemoteViews remoteViews, int i, int i2) {
        setBackgroundColor(remoteViews, i, i2);
    }
}
