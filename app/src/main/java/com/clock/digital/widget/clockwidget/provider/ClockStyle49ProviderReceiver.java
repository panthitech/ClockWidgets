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


public final class ClockStyle49ProviderReceiver extends AppWidgetProvider {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);


    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews getRemoteViews(Context context) {

            return new RemoteViews(context.getPackageName(), R.layout.ad12_premium_clock_12);
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

        ContextKt.widgetClockStyle49Update(context);
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
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.ad12_premium_clock_12);
            updateTexts(context, remoteViews);
            instance.updateAppWidget(updateAppWidget, remoteViews);
        }
    }

    private final void updateTexts(Context context, RemoteViews remoteViews) {
        PreferenceUtils instance = PreferenceUtils.INSTANCE.getInstance(context);

        Boolean bool = instance.get12or24FormatStyle49();

        String formattedTimeHour = ContextKt.getFormattedTimeHour(bool.booleanValue());
        Boolean hoursAlwaysAsTwoDigitStyle49 = instance.getHoursAlwaysAsTwoDigitStyle49();
        if (hoursAlwaysAsTwoDigitStyle49.booleanValue()) {
            formattedTimeHour = ContextKt.shouldBeInTWODigitFormat(formattedTimeHour);
        }
        String shouldBeInTWODigitFormat = ContextKt.shouldBeInTWODigitFormat(ContextKt.getFormattedTimeMinutes().toString());
        String formattedTimeIsAMorPM = ContextKt.getFormattedTimeIsAMorPM();
        String day = ContextKt.getDay();
        String date = ContextKt.getDate();
        String shortMonth = ContextKt.getMonth();
        String year = ContextKt.getYear();

        Boolean bool2 = instance.get12or24FormatStyle49();
        if (bool2.booleanValue()) {
            Boolean aMorPMVisibilityStyle49 = instance.getAMorPMVisibilityStyle49();
            if (aMorPMVisibilityStyle49.booleanValue()) {
                SetRemoteViewsKt.setVisibleOrInVisible(remoteViews, R.id.widget_time_am_pm, true);
            } else {
                SetRemoteViewsKt.setVisibleOrInVisible(remoteViews, R.id.widget_time_am_pm, false);
            }
        } else {
            SetRemoteViewsKt.setVisibleOrInVisible(remoteViews, R.id.widget_time_am_pm, false);
        }

        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_hours, formattedTimeHour);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_delimiter, "X");
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_minute, shouldBeInTWODigitFormat);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_am_pm, ' ' + formattedTimeIsAMorPM);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_day, day);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_date, day + ", " + shortMonth + " " + date);
        Integer hoursColorStyle49 = instance.getHoursColorStyle49();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_hours, hoursColorStyle49.intValue());
        Integer minuteColorStyle49 = instance.getTimeBackgroundColorStyle49();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_delimiter, minuteColorStyle49.intValue());
        Integer minuteColorStyle492 = instance.getMinuteColorStyle49();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_minute, minuteColorStyle492.intValue());
        Integer aMorPMColorStyle49 = instance.getAMorPMColorStyle49();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_am_pm, aMorPMColorStyle49.intValue());
        Integer dayColorStyle49 = instance.getDayColorStyle49();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_day, dayColorStyle49.intValue());
        Integer dateColorStyle49 = instance.getDateColorStyle49();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_date, dateColorStyle49.intValue());
        PreferenceUtils instance2 = PreferenceUtils.INSTANCE.getInstance(context);
        Integer timeBackgroundColorStyle49 = instance2.getTimeBackgroundColorStyle49();
        SetRemoteViewsKt.setTimeBackground(remoteViews, R.id.widget_date_time_background_color, timeBackgroundColorStyle49.intValue());
        SetRemoteViewsKt.setBackgroundColors(remoteViews, R.id.widget_date_time_holder, ResourcesCompat.getColor(context.getResources(), R.color.colorTransparent, (Resources.Theme) null));
    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, getClass());
    }

    private final void setupAppOpenIntent(Context context, RemoteViews remoteViews) {
        Intent intent = new Intent(context, ClockEditorActivity.class);
        new Intent();
        remoteViews.setOnClickPendingIntent(R.id.widget_date_time_holder, PendingIntent.getActivity(context, 49, intent, PendingIntent.FLAG_IMMUTABLE));
    }
}
