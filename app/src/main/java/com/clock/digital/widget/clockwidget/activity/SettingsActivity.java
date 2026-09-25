package com.clock.digital.widget.clockwidget.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.clock.digital.widget.clockwidget.Ad.Common_Banner_google;

import com.clock.digital.widget.clockwidget.PublicMethod;
import com.clock.digital.widget.clockwidget.R;

public class SettingsActivity extends AppCompatActivity {
    ImageView back;
    TextView txt_app_version;
    String version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        LinearLayout banner = (LinearLayout) findViewById(R.id.adView);
        Common_Banner_google common_bannerad = new Common_Banner_google();
        common_bannerad.GoogleBannerAds(getApplicationContext(), banner);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        txt_app_version = findViewById(R.id.txt_app_version);

        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            version = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        txt_app_version.setText(version);

        CardView share = findViewById(R.id.shareapp);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PublicMethod.shareApp(SettingsActivity.this);
            }
        });

        CardView rate = findViewById(R.id.rateapp);
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PublicMethod.rateApp(SettingsActivity.this);
            }
        });

        CardView moreapp = findViewById(R.id.moreapps);
        moreapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PublicMethod.moreAppsPlayStore(SettingsActivity.this);
            }
        });

        CardView policy = findViewById(R.id.policyapp);
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PublicMethod.privacyPolicy(SettingsActivity.this);
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}