package com.clock.digital.widget.clockwidget.Ad;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.clock.digital.widget.clockwidget.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;


public class Common_Banner_google {


    public void GoogleBannerAds(Context context,LinearLayout adViewBanner){
        AdView adView = new AdView(context);
        adView.setVisibility(View.VISIBLE);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(context.getResources().getString(R.string.banner_preview));
        adView.loadAd(new AdRequest.Builder().build());
        adViewBanner.setVisibility(View.VISIBLE);
        adViewBanner.addView(adView);
    }
}
