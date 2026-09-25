package com.clock.digital.widget.clockwidget.configure;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;


import com.clock.digital.widget.clockwidget.provider.ClockStyle17ProviderReceiver;


public final class ClockStyle17Configure extends AppCompatActivity {
    private HashMap _$_findViewCache;
    private int appWidgetId;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = this;
        Intent intent = getIntent();
        
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.appWidgetId = extras.getInt("appWidgetId", 0);
        }
        if (this.appWidgetId == 0) {
            finish();
            return;
        }
        Intent intent2 = new Intent("android.appwidget.action.APPWIDGET_UPDATE", (Uri) null, context, ClockStyle17ProviderReceiver.class);
        intent2.putExtra("appWidgetIds", new int[]{this.appWidgetId});
        sendBroadcast(intent2);
        Intent intent3 = new Intent();
        intent3.putExtra("appWidgetId", this.appWidgetId);
        setResult(-1, intent3);
        finish();
    }

    
    public void onDestroy() {
        super.onDestroy();
    }
}
