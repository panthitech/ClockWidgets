package com.clock.digital.widget.clockwidget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.Calendar;
import java.util.Objects;

import com.clock.digital.widget.clockwidget.provider.ClockStyle10ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle11ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle12ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle13ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle14ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle15ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle16ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle17ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle18ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle19ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle1ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle20ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle21ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle22ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle23ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle24ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle25ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle26ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle27ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle28ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle29ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle2ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle30ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle31ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle32ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle33ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle34ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle35ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle36ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle37ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle38ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle39ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle3ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle40ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle41ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle42ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle43ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle44ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle45ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle46ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle47ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle48ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle49ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle4ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle50ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle51ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle52ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle53ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle54ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle5ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle6ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle7ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle8ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle9ProviderReceiver;


public final class ContextKt {
    public static final String WIDGET_CLOCK_TYPE = "widget_clock_type";


    public static final int getWidgetID(int i) {
        switch (i) {
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 29;
            case 30:
                return 30;
            case 31:
                return 31;
            case 32:
                return 32;
            case 33:
                return 33;
            case 34:
                return 34;
            case 35:
                return 35;
            case 36:
                return 36;
            case 37:
                return 37;
            case 38:
                return 38;
            case 39:
                return 39;
            case 40:
                return 40;
            case 41:
                return 41;
            case 42:
                return 42;
            case 43:
                return 43;
            case 44:
                return 44;
            case 45:
                return 45;
            case 46:
                return 46;
            case 47:
                return 47;
            case 48:
                return 48;
            case 49:
                return 49;
            case 50:
                return 50;
            case 51:
                return 51;
            case 52:
                return 52;
            case 53:
                return 53;
            case 54:
                return 54;
            default:
                return 1;
        }
    }

    public static final String getAppName(Context context) {
        
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
    }

    public static final boolean isInternetAvailable(Context context) {
        
        Object systemService = context.getSystemService(Context.CONNECTIVITY_SERVICE);
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager != null) {
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            if (allNetworkInfo != null) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void widgetClockStyle1Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle1ProviderReceiver.class));
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_1_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle1ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle2Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle2ProviderReceiver.class));
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_2_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle2ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle3Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle3ProviderReceiver.class));
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_3_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle3ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle4Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle4ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_4_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle4ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle5Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle5ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_5_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle5ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle6Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle6ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_6_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle6ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle7Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle7ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_7_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle7ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle8Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle8ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_8_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle8ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle9Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle9ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_9_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle9ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle10Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle10ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_10_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle10ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle11Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle11ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_11_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle11ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle12Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle12ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_12_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle12ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle13Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle13ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_13_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle13ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle14Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle14ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_14_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle14ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle15Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle15ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_15_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle15ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle16Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle16ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_16_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle16ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle17Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle17ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_17_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle17ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle18Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle18ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_18_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle18ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle19Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle19ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_19_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle19ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle20Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle20ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_20_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle20ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle21Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle21ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_21_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle21ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle22Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle22ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_22_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle22ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle23Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle23ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_23_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle23ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle24Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle24ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_24_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle24ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle25Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle25ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_25_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle25ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle26Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle26ProviderReceiver.class));
        
        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.clock_style_26_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle26ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle27Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle27ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_1};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle27ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle28Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle28ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_2};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle28ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle29Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle29ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_3_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle29ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }
    public static final void widgetClockStyle30Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle30ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_4_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle30ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle31Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle31ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_5_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle31ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle32Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle32ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_6_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle32ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle33Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle33ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_7_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle33ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle34Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle34ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_8_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle34ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle35Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle35ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_9_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle35ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle36Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle36ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_10_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle36ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }


    public static final void widgetClockStyle37Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle37ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_11_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle37ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle38Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle38ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_12_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle38ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle39Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle39ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_13_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle39ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle40Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle40ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_14_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle40ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle41Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle41ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_15_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle41ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle42Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle42ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_16_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle42ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle43Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle43ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_17_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle43ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle44Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle44ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_free_clock_18_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle44ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle45Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle45ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_premium_clock_8_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle45ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle46Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle46ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_premium_clock_9_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle46ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle47Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle47ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_premium_clock_10_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle47ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle48Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle48ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_premium_clock_11_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle48ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle49Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle49ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_premium_clock_12_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle49ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle50Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle50ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_premium_clock_13_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle50ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle51Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle51ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_premium_clock_14_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle51ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle52Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle52ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.ad12_premium_clock_15_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle52ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle53Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle53ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.premium_clock_style_18_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle53ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final void widgetClockStyle54Update(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context.getApplicationContext(), ClockStyle54ProviderReceiver.class));

        if (!(appWidgetIds.length == 0)) {
            int[] iArr = {R.xml.premium_clock_style_19_info};
            Intent intent = new Intent(context.getApplicationContext(), ClockStyle54ProviderReceiver.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", iArr);
            context.sendBroadcast(intent);
        }
    }

    public static final String getFormattedTimeHour(boolean z) {
        if (z) {
            int i = Calendar.getInstance().get(10);
            if (i == 0) {
                return "12";
            }
            return "" + String.valueOf(i);
        } else {
            int i2 = Calendar.getInstance().get(11);
            if (i2 == 0) {
                return "12";
            }
            return "" + String.valueOf(i2);
        }
    }



    public static final String getFormattedTimeMinutes() {
        Calendar instance = Calendar.getInstance();
        return "" + String.valueOf(instance.get(12));
    }

    public static final String getFormattedTimeIsAMorPM() {
        return Calendar.getInstance().get(9) == 0 ? "AM" : "PM";
    }

    public static final String shouldBeInTWODigitFormat(String str) {
        if (str.length() != 1 || str.length() == 2) {
            return str;
        }
        return '0' + str;
    }

    public static final String getDate() {
        Calendar instance = Calendar.getInstance();
        return "" + instance.get(5);
    }

    public static final String getYear() {
        Calendar instance = Calendar.getInstance();
        return "" + instance.get(1);
    }

    public static final String getNumberMonth() {
        int i = Calendar.getInstance().get(2);
        if (i == 0) {
            return "1";
        }
        if (1 == i) {
            return "2";
        }
        if (2 == i) {
            return "3";
        }
        if (3 == i) {
            return "4";
        }
        if (4 == i) {
            return "5";
        }
        if (5 == i) {
            return "6";
        }
        if (6 == i) {
            return "7";
        }
        if (7 == i) {
            return "8";
        }
        if (8 == i) {
            return "9";
        }
        if (9 == i) {
            return "10";
        }
        if (10 == i) {
            return "11";
        }
        return 11 == i ? "12" : "";
    }

    public static final String getShortMonth() {
        int i = Calendar.getInstance().get(2);
        if (i == 0) {
            return "Jan";
        }
        if (1 == i) {
            return "Feb";
        }
        if (2 == i) {
            return "Mar";
        }
        if (3 == i) {
            return "Apr";
        }
        if (4 == i) {
            return "May";
        }
        if (5 == i) {
            return "Jun";
        }
        if (6 == i) {
            return "Jul";
        }
        if (7 == i) {
            return "Aug";
        }
        if (8 == i) {
            return "Sep";
        }
        if (9 == i) {
            return "Oct";
        }
        if (10 == i) {
            return "Nov";
        }
        return 11 == i ? "Dec" : "";
    }

    public static final String getMonth() {
        int i = Calendar.getInstance().get(2);
        if (i == 0) {
            return "January";
        }
        if (1 == i) {
            return "February";
        }
        if (2 == i) {
            return "March";
        }
        if (3 == i) {
            return "April";
        }
        if (4 == i) {
            return "May";
        }
        if (5 == i) {
            return "June";
        }
        if (6 == i) {
            return "July";
        }
        if (7 == i) {
            return "August";
        }
        if (8 == i) {
            return "September";
        }
        if (9 == i) {
            return "October";
        }
        if (10 == i) {
            return "November";
        }
        return 11 == i ? "December" : "";
    }

    public static final String getShortDay() {
        int i = Calendar.getInstance().get(7);
        if (2 == i) {
            return "Mon";
        }
        if (3 == i) {
            return "Tue";
        }
        if (4 == i) {
            return "Wed";
        }
        if (5 == i) {
            return "Thu";
        }
        if (6 == i) {
            return "Fri";
        }
        if (7 == i) {
            return "Sat";
        }
        return 1 == i ? "Sun" : "";
    }

    public static final String getDay() {
        int i = Calendar.getInstance().get(7);
        if (2 == i) {
            return "Monday";
        }
        if (3 == i) {
            return "Tuesday";
        }
        if (4 == i) {
            return "Wednesday";
        }
        if (5 == i) {
            return "Thursday";
        }
        if (6 == i) {
            return "Friday";
        }
        if (7 == i) {
            return "Saturday";
        }
        return 1 == i ? "Sunday" : "";
    }


    public static final String getTimeInWords(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 1722) {
            switch (hashCode) {
                case 49:
                    if (str.equals("01")) {
                        return "One";
                    }
                    break;
                case 50:
                    if (str.equals("02")) {
                        return "Two";
                    }
                    break;
                case 51:
                    if (str.equals("03")) {
                        return "Three";
                    }
                    break;
                case 52:
                    if (str.equals("04")) {
                        return "Four";
                    }
                    break;
                case 53:
                    if (str.equals("05")) {
                        return "Five";
                    }
                    break;
                case 54:
                    if (str.equals("06")) {
                        return "Six";
                    }
                    break;
                case 55:
                    if (str.equals("07")) {
                        return "Seven";
                    }
                    break;
                case 56:
                    if (str.equals("08")) {
                        return "Eight";
                    }
                    break;
                case 57:
                    if (str.equals("09")) {
                        return "Nine";
                    }
                    break;
                default:
                    switch (hashCode) {
                        case 1537:
                            if (str.equals("01")) {
                                return "One";
                            }
                            break;
                        case 1538:
                            if (str.equals("02")) {
                                return "Two";
                            }
                            break;
                        case 1539:
                            if (str.equals("03")) {
                                return "Three";
                            }
                            break;
                        case 1540:
                            if (str.equals("04")) {
                                return "Four";
                            }
                            break;
                        case 1541:
                            if (str.equals("05")) {
                                return "Five";
                            }
                            break;
                        case 1542:
                            if (str.equals("06")) {
                                return "Six";
                            }
                            break;
                        case 1543:
                            if (str.equals("07")) {
                                return "Seven";
                            }
                            break;
                        case 1544:
                            if (str.equals("08")) {
                                return "Eight";
                            }
                            break;
                        case 1545:
                            if (str.equals("09")) {
                                return "Nine";
                            }
                            break;
                        default:
                            switch (hashCode) {
                                case 1567:
                                    if (str.equals("10")) {
                                        return "Ten";
                                    }
                                    break;
                                case 1568:
                                    if (str.equals("11")) {
                                        return "Eleven";
                                    }
                                    break;
                                case 1569:
                                    if (str.equals("12")) {
                                        return "Twelve";
                                    }
                                    break;
                                case 1570:
                                    if (str.equals("13")) {
                                        return "Thirteen";
                                    }
                                    break;
                                case 1571:
                                    if (str.equals("14")) {
                                        return "Fourteen";
                                    }
                                    break;
                                case 1572:
                                    if (str.equals("15")) {
                                        return "Fifteen";
                                    }
                                    break;
                                case 1573:
                                    if (str.equals("16")) {
                                        return "Sixteen";
                                    }
                                    break;
                                case 1574:
                                    if (str.equals("17")) {
                                        return "Seventeen";
                                    }
                                    break;
                                case 1575:
                                    if (str.equals("18")) {
                                        return "Eighteen";
                                    }
                                    break;
                                case 1576:
                                    if (str.equals("19")) {
                                        return "Nineteen";
                                    }
                                    break;
                                default:
                                    switch (hashCode) {
                                        case 1598:
                                            if (str.equals("20")) {
                                                return "Twenty";
                                            }
                                            break;
                                        case 1599:
                                            if (str.equals("21")) {
                                                return "Twenty One";
                                            }
                                            break;
                                        case 1600:
                                            if (str.equals("22")) {
                                                return "Twenty Two";
                                            }
                                            break;
                                        case 1601:
                                            if (str.equals("23")) {
                                                return "Twenty Three";
                                            }
                                            break;
                                        case 1602:
                                            if (str.equals("24")) {
                                                return "Twenty Four";
                                            }
                                            break;
                                        case 1603:
                                            if (str.equals("25")) {
                                                return "Twenty Five";
                                            }
                                            break;
                                        case 1604:
                                            if (str.equals("26")) {
                                                return "Twenty Six";
                                            }
                                            break;
                                        case 1605:
                                            if (str.equals("27")) {
                                                return "Twenty Seven";
                                            }
                                            break;
                                        case 1606:
                                            if (str.equals("28")) {
                                                return "Twenty Eight";
                                            }
                                            break;
                                        case 1607:
                                            if (str.equals("29")) {
                                                return "Twenty Nine";
                                            }
                                            break;
                                        default:
                                            switch (hashCode) {
                                                case 1629:
                                                    if (str.equals("30")) {
                                                        return "Thirty";
                                                    }
                                                    break;
                                                case 1630:
                                                    if (str.equals("31")) {
                                                        return "Thirty One";
                                                    }
                                                    break;
                                                case 1631:
                                                    if (str.equals("32")) {
                                                        return "Thirty Two";
                                                    }
                                                    break;
                                                case 1632:
                                                    if (str.equals("33")) {
                                                        return "Thirty Three";
                                                    }
                                                    break;
                                                case 1633:
                                                    if (str.equals("34")) {
                                                        return "Thirty Four";
                                                    }
                                                    break;
                                                case 1634:
                                                    if (str.equals("35")) {
                                                        return "Thirty Five";
                                                    }
                                                    break;
                                                case 1635:
                                                    if (str.equals("36")) {
                                                        return "Thirty Six";
                                                    }
                                                    break;
                                                case 1636:
                                                    if (str.equals("37")) {
                                                        return "Thirty Seven";
                                                    }
                                                    break;
                                                case 1637:
                                                    if (str.equals("38")) {
                                                        return "Thirty Eight";
                                                    }
                                                    break;
                                                case 1638:
                                                    if (str.equals("39")) {
                                                        return "Thirty Nine";
                                                    }
                                                    break;
                                                default:
                                                    switch (hashCode) {
                                                        case 1660:
                                                            if (str.equals("40")) {
                                                                return "Forty";
                                                            }
                                                            break;
                                                        case 1661:
                                                            if (str.equals("41")) {
                                                                return "Forty One";
                                                            }
                                                            break;
                                                        case 1662:
                                                            if (str.equals("42")) {
                                                                return "Forty Two";
                                                            }
                                                            break;
                                                        case 1663:
                                                            if (str.equals("43")) {
                                                                return "Forty Three";
                                                            }
                                                            break;
                                                        case 1664:
                                                            if (str.equals("44")) {
                                                                return "Forty Four";
                                                            }
                                                            break;
                                                        case 1665:
                                                            if (str.equals("45")) {
                                                                return "Forty Five";
                                                            }
                                                            break;
                                                        case 1666:
                                                            if (str.equals("46")) {
                                                                return "Forty Six";
                                                            }
                                                            break;
                                                        case 1667:
                                                            if (str.equals("47")) {
                                                                return "Forty Seven";
                                                            }
                                                            break;
                                                        case 1668:
                                                            if (str.equals("48")) {
                                                                return "Forty Eight";
                                                            }
                                                            break;
                                                        case 1669:
                                                            if (str.equals("49")) {
                                                                return "Forty Nine";
                                                            }
                                                            break;
                                                        default:
                                                            switch (hashCode) {
                                                                case 1691:
                                                                    if (str.equals("50")) {
                                                                        return "Fifty";
                                                                    }
                                                                    break;
                                                                case 1692:
                                                                    if (str.equals("51")) {
                                                                        return "Fifty One";
                                                                    }
                                                                    break;
                                                                case 1693:
                                                                    if (str.equals("52")) {
                                                                        return "Fifty Two";
                                                                    }
                                                                    break;
                                                                case 1694:
                                                                    if (str.equals("53")) {
                                                                        return "Fifty Three";
                                                                    }
                                                                    break;
                                                                case 1695:
                                                                    if (str.equals("54")) {
                                                                        return "Fifty Four";
                                                                    }
                                                                    break;
                                                                case 1696:
                                                                    if (str.equals("55")) {
                                                                        return "Fifty Five";
                                                                    }
                                                                    break;
                                                                case 1697:
                                                                    if (str.equals("56")) {
                                                                        return "Fifty Six";
                                                                    }
                                                                    break;
                                                                case 1698:
                                                                    if (str.equals("57")) {
                                                                        return "Fifty Seven";
                                                                    }
                                                                    break;
                                                                case 1699:
                                                                    if (str.equals("58")) {
                                                                        return "Fifty Eight";
                                                                    }
                                                                    break;
                                                                case 1700:
                                                                    if (str.equals("59")) {
                                                                        return "Fifty Nine";
                                                                    }
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else if (str.equals("60")) {
            return "Sixty";
        }
        return "";
    }


}
