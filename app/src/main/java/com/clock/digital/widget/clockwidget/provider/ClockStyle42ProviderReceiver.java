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


public final class ClockStyle42ProviderReceiver extends AppWidgetProvider {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);


    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews getRemoteViews(Context context) {

            return new RemoteViews(context.getPackageName(), R.layout.ad12_free_clock_16);
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

        ContextKt.widgetClockStyle42Update(context);
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
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.ad12_free_clock_16);
            updateTexts(context, remoteViews);
            instance.updateAppWidget(updateAppWidget, remoteViews);
        }
    }

    private final void updateTexts(Context context, RemoteViews remoteViews) {
        PreferenceUtils instance = PreferenceUtils.INSTANCE.getInstance(context);

        Boolean bool = instance.get12or24FormatStyle42();

        String formattedTimeHour = ContextKt.getFormattedTimeHour(bool.booleanValue());
        Boolean hoursAlwaysAsTwoDigitStyle42 = instance.getHoursAlwaysAsTwoDigitStyle42();
        if (hoursAlwaysAsTwoDigitStyle42.booleanValue()) {
            formattedTimeHour = ContextKt.shouldBeInTWODigitFormat(formattedTimeHour);
        }
        String shouldBeInTWODigitFormat = ContextKt.shouldBeInTWODigitFormat(ContextKt.getFormattedTimeMinutes().toString());
        String formattedTimeIsAMorPM = ContextKt.getFormattedTimeIsAMorPM();
        String day = ContextKt.getShortDay();
        String date = ContextKt.getDate();
        String shortMonth = ContextKt.getShortMonth();
        String year = ContextKt.getYear();
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_hours, formattedTimeHour);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_delimiter, ":");
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_minute, shouldBeInTWODigitFormat);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_time_am_pm, ' ' + formattedTimeIsAMorPM);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_day, day);
        SetRemoteViewsKt.setText(remoteViews, R.id.widget_date, date);
        Integer hoursColorStyle42 = instance.getHoursColorStyle42();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_hours, hoursColorStyle42.intValue());
        Integer minuteColorStyle42 = instance.getMinuteColorStyle42();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_delimiter, minuteColorStyle42.intValue());
        Integer minuteColorStyle422 = instance.getMinuteColorStyle42();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_minute, minuteColorStyle422.intValue());
        Integer minuteColorStyle423 = instance.getSecondColorStyle42();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_second, minuteColorStyle423.intValue());
        Integer aMorPMColorStyle42 = instance.getAMorPMColorStyle42();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_time_am_pm, aMorPMColorStyle42.intValue());
        Integer dayColorStyle42 = instance.getDayColorStyle42();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_day, dayColorStyle42.intValue());
        Integer dateColorStyle42 = instance.getDateColorStyle42();
        SetRemoteViewsKt.setTextColors(remoteViews, R.id.widget_date, dateColorStyle42.intValue());
        SetRemoteViewsKt.setBackgroundColors(remoteViews, R.id.widget_date_time_holder, ResourcesCompat.getColor(context.getResources(), R.color.colorTransparent, (Resources.Theme) null));
    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, getClass());
    }

    private final void setupAppOpenIntent(Context context, RemoteViews remoteViews) {
        Intent intent = new Intent(context, ClockEditorActivity.class);
        new Intent();
        remoteViews.setOnClickPendingIntent(R.id.widget_date_time_holder, PendingIntent.getActivity(context, 42, intent, PendingIntent.FLAG_IMMUTABLE));
    }
}
