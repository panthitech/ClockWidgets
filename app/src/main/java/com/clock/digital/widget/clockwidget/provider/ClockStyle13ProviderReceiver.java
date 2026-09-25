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

public final class ClockStyle13ProviderReceiver extends AppWidgetProvider {
    public static final Companion Companion = new Companion(null);


    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews getRemoteViews(Context context) {

            return new RemoteViews(context.getPackageName(), R.layout.clock_style_13);
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

        ContextKt.widgetClockStyle13Update(context);
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
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.clock_style_13);
            updateTexts(context, remoteViews);
            instance.updateAppWidget(updateAppWidget, remoteViews);
        }
    }

    private final void updateTexts(Context context, RemoteViews remoteViews) {
        Context context2 = context;
        RemoteViews remoteViews2 = remoteViews;
        String formattedTimeHour = ContextKt.getFormattedTimeHour(false);
        String timeInWords = ContextKt.getTimeInWords(ContextKt.shouldBeInTWODigitFormat(ContextKt.getFormattedTimeMinutes().toString()));
        String formattedTimeIsAMorPM = ContextKt.getFormattedTimeIsAMorPM();
        String day = ContextKt.getDay();
        String date = ContextKt.getDate();
        String shortMonth = ContextKt.getShortMonth();
        String year = ContextKt.getYear();
        CharSequence charSequence = timeInWords;
        String str = " ";
        String rep = timeInWords.replace(" ", "\n");

//        if (StringsKt.contains(timeInWords, str, false, 2, null)) {
//            int indexOf$default = StringsKt.indexOf(timeInWords, " ", 0, false, 6, null);
//            String substring = timeInWords.substring(0, indexOf$default);
//            str = timeInWords.substring(indexOf$default + 1);
//            timeInWords = substring;
//        }
//
//        int lastPos = timeInWords.lastIndexOf(str);
//        str = timeInWords.substring(lastPos + 1);

        SetRemoteViewsKt.setText(remoteViews2, R.id.widget_time_hours, ContextKt.getTimeInWords(formattedTimeHour));
        SetRemoteViewsKt.setText(remoteViews2, R.id.widget_time_delimiter, timeInWords);
        SetRemoteViewsKt.setText(remoteViews2, R.id.widget_time_minute, str);
        SetRemoteViewsKt.setText(remoteViews2, R.id.widget_time_am_pm, formattedTimeIsAMorPM);
        SetRemoteViewsKt.setText(remoteViews2, R.id.widget_day, day);
        SetRemoteViewsKt.setText(remoteViews2, R.id.widget_date, date + ' ' + shortMonth + ' ' + year);
        PreferenceUtils instance = PreferenceUtils.INSTANCE.getInstance(context2);

        Integer hoursColorStyle13 = instance.getHoursColorStyle13();
        SetRemoteViewsKt.setTextColors(remoteViews2, R.id.widget_time_hours, hoursColorStyle13.intValue());
        PreferenceUtils instance2 = PreferenceUtils.INSTANCE.getInstance(context2);
        Integer minuteColorStyle13 = instance2.getMinuteColorStyle13();
        SetRemoteViewsKt.setTextColors(remoteViews2, R.id.widget_time_delimiter, minuteColorStyle13.intValue());
        PreferenceUtils instance3 = PreferenceUtils.INSTANCE.getInstance(context2);
        Integer minuteColorStyle132 = instance3.getMinuteColorStyle13();
        SetRemoteViewsKt.setTextColors(remoteViews2, R.id.widget_time_minute, minuteColorStyle132.intValue());
        PreferenceUtils instance4 = PreferenceUtils.INSTANCE.getInstance(context2);
        Integer aMorPMColorStyle13 = instance4.getAMorPMColorStyle13();
        SetRemoteViewsKt.setTextColors(remoteViews2, R.id.widget_time_am_pm, aMorPMColorStyle13.intValue());
        PreferenceUtils instance5 = PreferenceUtils.INSTANCE.getInstance(context2);
        Integer dayColorStyle13 = instance5.getDayColorStyle13();
        SetRemoteViewsKt.setTextColors(remoteViews2, R.id.widget_day, dayColorStyle13.intValue());
        PreferenceUtils instance6 = PreferenceUtils.INSTANCE.getInstance(context2);
        Integer dateColorStyle13 = instance6.getDateColorStyle13();
        SetRemoteViewsKt.setTextColors(remoteViews2, R.id.widget_date, dateColorStyle13.intValue());
        SetRemoteViewsKt.setBackgroundColors(remoteViews2, R.id.widget_date_time_holder, ResourcesCompat.getColor(context.getResources(), R.color.colorTransparent, (Resources.Theme) null));
    }

    private final ComponentName getComponentName(Context context) {
        return new ComponentName(context, getClass());
    }

    private final void setupAppOpenIntent(Context context, RemoteViews remoteViews) {
        Intent intent = new Intent(context, ClockEditorActivity.class);
        new Intent();
        remoteViews.setOnClickPendingIntent(R.id.widget_date_time_holder, PendingIntent.getActivity(context, 13, intent, PendingIntent.FLAG_IMMUTABLE));
    }
}
