package com.clock.digital.widget.clockwidget.configure;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.clock.digital.widget.clockwidget.provider.ClockStyle44ProviderReceiver;
import com.clock.digital.widget.clockwidget.provider.ClockStyle47ProviderReceiver;


public final class ClockStyle47Configure extends AppCompatActivity {
    private int appWidgetId;

    
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
        Intent intent2 = new Intent("android.appwidget.action.APPWIDGET_UPDATE", (Uri) null, context, ClockStyle47ProviderReceiver.class);
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
