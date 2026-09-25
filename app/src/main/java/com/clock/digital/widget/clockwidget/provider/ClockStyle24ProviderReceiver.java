package com.clock.digital.widget.clockwidget.provider;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.widget.RemoteViews;

import androidx.core.content.res.ResourcesCompat;

import java.util.Objects;


import com.clock.digital.widget.clockwidget.ContextKt;
import com.clock.digital.widget.clockwidget.PreferenceUtils;
import com.clock.digital.widget.clockwidget.R;
import com.clock.digital.widget.clockwidget.SetRemoteViewsKt;
import com.clock.digital.widget.clockwidget.activity.ClockEditorActivity;


public final class ClockStyle24ProviderReceiver extends AppWidgetProvider {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);


    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews getRemoteViews(Context context) {
            
            return new RemoteViews(context.getPackageName(), R.layout.clock_style_24);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        
        
        
        super.onUpdate(context, appWidgetManager, iArr);
        performUpdate(context);
    }

    public void onEnabled(Context context) {
        
        super.onEnabled(context);
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        
        
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        performUpdate(context);
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        
        ContextKt.widgetClockStyle24Update(context);
        performUpdate(context);
    }

    private final Bitmap getMultiplyColoredBitmap(int i, int i2, Context context) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i, options);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        new Canvas(decodeResource).drawBitmap(decodeResource, 0.0f, 0.0f, paint);
        
        return decodeResource;
    }

    public final void performUpdate(Context context) {
        
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = instance.getAppWidgetIds(getComponentName(context));
        
        for (int updateAppWidget : appWidgetIds) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.clock_style_24);
            updateTexts(context, remoteViews);
            instance.updateAppWidget(updateAppWidget, remoteViews);
        }
    }

    private final void updateTexts(Context context, RemoteViews remoteViews) {
        PreferenceUtils instance = PreferenceUtils.INSTANCE.getInstance(context);
        
        Boolean bool = instance.get12or24FormatStyle24();
        
        String formattedTimeHour = ContextKt.getFormattedTimeHour(bool.booleanValue());
        Boolean hoursAlwaysAsTwoDigitStyle24 = instance.getHoursAlwaysAsTwoDigitStyle24();
        if (hoursAlwaysAsTwoDigitStyle24.booleanValue()) {
            formattedTimeHour = ContextKt.shouldBeInTWODigitFormat(formattedTimeHour);
        }
        String shouldBeInTWODigitFormat = ContextKt.shouldBeInTWODigitFormat(ContextKt.getFormattedTimeMinutes().toString());
        String formattedTimeIsAMorPM = ContextKt.getFormattedTimeIsAMorPM();
        String shortDay = ContextKt.getShortDay();
        String date = ContextKt.getDate();
        String shortMonth = ContextKt.getShortMonth();
        ContextKt.getYear();
        Boolean bool2 = instance.get12or24FormatStyle24();
        
        if (bool2.booleanValue()) {
            Boolean aMorPMVisibilityStyle24 = instance.getAMorPMVisibilityStyle24();
            if (aMorPMVisibilityStyle24.booleanValue()) {
                SetRemoteViewsKt.setVisibleOrGone(remoteViews, R.id.widget_time_am_pm, true);
            } else {
                SetRemoteViewsKt.setVisibleOrGone(remoteViews, R.id.widget_time_am_pm, false);
            }
        } else {
            SetRemoteViewsKt.setVisibleOrGone(remoteViews, R.id.widget_time_am_pm, false);
        }
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_hours, formattedTimeHour);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_delimiter, ":");
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_minute, shouldBeInTWODigitFormat);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_am_pm, formattedTimeIsAMorPM + "  ");
        Objects.requireNonNull(shortDay, "null cannot be cast to non-null type java.lang.String");
        String upperCase = shortDay.toUpperCase();
        
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_day, upperCase);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_date, shortMonth + ' ' + date);
        Integer hoursColorStyle24 = instance.getHoursColorStyle24();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_hours, hoursColorStyle24.intValue());
        Integer minuteColorStyle24 = instance.getMinuteColorStyle24();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_delimiter, minuteColorStyle24.intValue());
        Integer minuteColorStyle242 = instance.getMinuteColorStyle24();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_minute, minuteColorStyle242.intValue());
        Integer aMorPMColorStyle24 = instance.getAMorPMColorStyle24();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_am_pm, aMorPMColorStyle24.intValue());
        Integer dayColorStyle24 = instance.getDayColorStyle24();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_day, dayColorStyle24.intValue());
        Integer dateColorStyle24 = instance.getDateColorStyle24();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_date, dateColorStyle24.intValue());
        Integer timeBackgroundColorStyle24 = instance.getTimeBackgroundColorStyle24();
        SetRemoteViewsKt.setTimeBackground(remoteViews, R.id.widget_date_time_background_color, timeBackgroundColorStyle24.intValue());
        SetRemoteViewsKt.setBackgroundColors(remoteViews, R.id.widget_date_time_holder, ResourcesCompat.getColor(context.getResources(), R.color.colorTransparent, (Resources.Theme) null));
    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, getClass());
    }

    private final void setupAppOpenIntent(Context context, RemoteViews remoteViews) {
        Intent intent = new Intent(context, ClockEditorActivity.class);
        new Intent();
        remoteViews.setOnClickPendingIntent(R.id.widget_date_time_holder, PendingIntent.getActivity(context, 24, intent, PendingIntent.FLAG_IMMUTABLE));
    }
}
