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


import com.clock.digital.widget.clockwidget.ContextKt;
import com.clock.digital.widget.clockwidget.PreferenceUtils;
import com.clock.digital.widget.clockwidget.R;
import com.clock.digital.widget.clockwidget.SetRemoteViewsKt;
import com.clock.digital.widget.clockwidget.activity.ClockEditorActivity;


public final class ClockStyle6ProviderReceiver extends AppWidgetProvider {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);


    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews getRemoteViews(Context context) {
            
            return new RemoteViews(context.getPackageName(), R.layout.clock_style_6);
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
        
        ContextKt.widgetClockStyle6Update(context);
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
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.clock_style_6);
            updateTexts(context, remoteViews);
            instance.updateAppWidget(updateAppWidget, remoteViews);
        }
    }

    private final void updateTexts(Context context, RemoteViews remoteViews) {
        PreferenceUtils instance = PreferenceUtils.INSTANCE.getInstance(context);
        
        Boolean bool = instance.get12or24FormatStyle6();
        
        String formattedTimeHour = ContextKt.getFormattedTimeHour(bool.booleanValue());
        Boolean hoursAlwaysAsTwoDigitStyle6 = instance.getHoursAlwaysAsTwoDigitStyle6();
        if (hoursAlwaysAsTwoDigitStyle6.booleanValue()) {
            formattedTimeHour = ContextKt.shouldBeInTWODigitFormat(formattedTimeHour);
        }
        String shouldBeInTWODigitFormat = ContextKt.shouldBeInTWODigitFormat(ContextKt.getFormattedTimeMinutes().toString());
        String formattedTimeIsAMorPM = ContextKt.getFormattedTimeIsAMorPM();
        String shortDay = ContextKt.getShortDay();
        String date = ContextKt.getDate();
        String shortMonth = ContextKt.getShortMonth();
        String year = ContextKt.getYear();
        Boolean bool2 = instance.get12or24FormatStyle6();

        if (bool2.booleanValue()) {
            Boolean aMorPMVisibilityStyle6 = instance.getAMorPMVisibilityStyle6();
            if (aMorPMVisibilityStyle6.booleanValue()) {
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
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_am_pm, ' ' + formattedTimeIsAMorPM);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_day, shortDay + ", ");
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_date, date + ' ' + shortMonth + ' ' + year);
        Integer hoursColorStyle6 = instance.getHoursColorStyle6();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_hours, hoursColorStyle6.intValue());
        Integer minuteColorStyle6 = instance.getMinuteColorStyle6();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_delimiter, minuteColorStyle6.intValue());
        Integer minuteColorStyle62 = instance.getMinuteColorStyle6();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_minute, minuteColorStyle62.intValue());
        Integer aMorPMColorStyle6 = instance.getAMorPMColorStyle6();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_am_pm, aMorPMColorStyle6.intValue());
        Integer dayColorStyle6 = instance.getDayColorStyle6();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_day, dayColorStyle6.intValue());
        Integer dateColorStyle6 = instance.getDateColorStyle6();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_date, dateColorStyle6.intValue());
        SetRemoteViewsKt.setBackgroundColors(remoteViews, R.id.widget_date_time_holder, ResourcesCompat.getColor(context.getResources(), R.color.colorTransparent, (Resources.Theme) null));
    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, getClass());
    }

    private final void setupAppOpenIntent(Context context, RemoteViews remoteViews) {
        Intent intent = new Intent(context, ClockEditorActivity.class);
        new Intent();
        remoteViews.setOnClickPendingIntent(R.id.widget_date_time_holder, PendingIntent.getActivity(context, 6, intent,  PendingIntent.FLAG_IMMUTABLE));
    }
}
