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


public final class ClockStyle1ProviderReceiver extends AppWidgetProvider {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);


    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews getRemoteViews(Context context) {
            
            return new RemoteViews(context.getPackageName(), R.layout.clock_style_1);
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
        
        ContextKt.widgetClockStyle1Update(context);
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
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.clock_style_1);
            updateTexts(context, remoteViews);
            instance.updateAppWidget(updateAppWidget, remoteViews);
        }
    }

    private final void updateTexts(Context context, RemoteViews remoteViews) {
        PreferenceUtils instance = PreferenceUtils.INSTANCE.getInstance(context);
        Boolean bool = instance.get12or24FormatStyle1();
        String formattedTimeHour = ContextKt.getFormattedTimeHour(bool.booleanValue());
        Boolean hoursAlwaysAsTwoDigitStyle1 = instance.getHoursAlwaysAsTwoDigitStyle1();
        
        if (hoursAlwaysAsTwoDigitStyle1.booleanValue()) {
            formattedTimeHour = ContextKt.shouldBeInTWODigitFormat(formattedTimeHour);
        }
        String shouldBeInTWODigitFormat = ContextKt.shouldBeInTWODigitFormat(ContextKt.getFormattedTimeMinutes().toString());
        String formattedTimeIsAMorPM = ContextKt.getFormattedTimeIsAMorPM();
        String day = ContextKt.getDay();
        String date = ContextKt.getDate();
        String month = ContextKt.getMonth();
        ContextKt.getYear();
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_hours, formattedTimeHour);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_delimiter, ":");
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_minute, shouldBeInTWODigitFormat);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_am_pm, ' ' + formattedTimeIsAMorPM);
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(day, "null cannot be cast to non-null type java.lang.String");
        String upperCase = day.toUpperCase();
        sb.append(upperCase);
        sb.append(",  ");
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_day, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(date);
        sb2.append(' ');
        Objects.requireNonNull(month, "null cannot be cast to non-null type java.lang.String");
        String upperCase2 = month.toUpperCase();
        sb2.append(upperCase2);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_date, sb2.toString());
        Integer hoursColorStyle1 = instance.getHoursColorStyle1();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_hours, hoursColorStyle1.intValue());
        Integer minuteColorStyle1 = instance.getMinuteColorStyle1();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_delimiter, minuteColorStyle1.intValue());
        Integer minuteColorStyle12 = instance.getMinuteColorStyle1();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_minute, minuteColorStyle12.intValue());
        Integer aMorPMColorStyle1 = instance.getAMorPMColorStyle1();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_am_pm, aMorPMColorStyle1.intValue());
        Integer dayColorStyle1 = instance.getDayColorStyle1();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_day, dayColorStyle1.intValue());
        Integer dateColorStyle1 = instance.getDateColorStyle1();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_date, dateColorStyle1.intValue());
        SetRemoteViewsKt.setBackgroundColors(remoteViews, R.id.widget_date_time_holder, ResourcesCompat.getColor(context.getResources(), R.color.colorTransparent, (Resources.Theme) null));
    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, getClass());
    }

    private final void setupAppOpenIntent(Context context, RemoteViews remoteViews) {
        Intent intent = new Intent(context, ClockEditorActivity.class);
        new Intent();
        remoteViews.setOnClickPendingIntent(R.id.widget_date_time_holder, PendingIntent.getActivity(context, 1, intent,  PendingIntent.FLAG_IMMUTABLE));
    }
}
