package com.clock.digital.widget.clockwidget;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.clock.digital.widget.clockwidget.Ad.AppOpenManager;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class App extends Application {
    private static App app;
    private Activity currentActivity;
    AppOpenManager appOpenManager;

    public static App getInstance() {
        return app;
    }

    public void onCreate() {
        super.onCreate();
        app = this;

        MobileAds.initialize(
                this,
                new OnInitializationCompleteListener() {
                    @Override
                    public void onInitializationComplete(InitializationStatus initializationStatus) {
                    }
                });
        appOpenManager = new AppOpenManager(this);

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                currentActivity = activity;
            }

            public void onActivityStarted(Activity activity) {
                currentActivity = activity;
            }

            public void onActivityResumed(Activity activity) {
                currentActivity = activity;
            }

            public void onActivityPaused(Activity activity) {
                if (currentActivity == activity) {
                    currentActivity = null;
                }
            }

            public void onActivityStopped(Activity activity) {
                if (currentActivity == activity) {
                    currentActivity = null;
                }
            }

            public void onActivityDestroyed(Activity activity) {
                if (currentActivity == activity) {
                    currentActivity = null;
                }
            }
        });
    }

    public void onTerminate() {
        super.onTerminate();
    }
}
