package com.clock.digital.widget.clockwidget.activity;

import android.Manifest;
import android.app.Dialog;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;

import com.clock.digital.widget.clockwidget.Ad.Common_Banner_google;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jaredrummler.android.colorpicker.ColorPickerDialog;
import com.jaredrummler.android.colorpicker.ColorPickerDialogListener;


//import kotlin.jvm.internal.Intrinsics;
import com.clock.digital.widget.clockwidget.ContextKt;
import com.clock.digital.widget.clockwidget.PreferenceUtils;
import com.clock.digital.widget.clockwidget.R;
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
import com.kaopiz.kprogresshud.KProgressHUD;


public final class ClockEditorActivity extends AppCompatActivity implements ColorPickerDialogListener {
    public int BROADCAST_ID = 123456;
    private FloatingActionButton addAutomaticallyFebBtn;
    private CheckBox cb12or24HourFormat;
    private CheckBox cbAMorPMVisibility;
    private CheckBox cbBackgroundWallpaper;
    private CheckBox cbHourAlwaysTwoDigits;
    private int colorAMorPM;
    private int colorDate;
    private int colorDay;
    private int colorHours;
    private int colorMinute;
    private int colorPickerType = 1001;
    private int colorTimeBackground;
    public Context context;
    private CardView cvAMorPMColorIndicator;
    private CardView cvDateColorIndicator;
    private CardView cvDayColorIndicator;
    private CardView cvHourColorIndicator;
    private CardView cvMinuteColorIndicator;
    private CardView cvTimeBackgroundColorIndicator;
    public ImageView ivBackWallpaper;
    private LinearLayout lly12or24FormatOption;
    private LinearLayout llyAMorPMColorOption;
    private LinearLayout llyAMorPMVisibilityOption;
    private LinearLayout llyDateColorOption;
    private LinearLayout llyDayColorOption;
    private LinearLayout llyDelimiterColorOption;
    private LinearLayout llyHourAlwaysTwoDigitsOption;
    private LinearLayout llyHourColorOption;
    private LinearLayout llyMinuteColorOption;
    private LinearLayout llyResetAllOption;
    private LinearLayout llyTimeBackgroundColor;
    private LinearLayout llyTimeBackgroundColorOption;
    private LinearLayout llyViewStabContainer;
    private Boolean[] option12or24FormatArray = {true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            , true, true, true, true, true, true, true, true, true, true};
    private Boolean[] optionAMorPMColorArray = {false, true, true, true, false, true, false, true, false, true, false, true, false, false, true, false, false, true, true, false, false, false, false, true, true, false, false, true,
            false, true, true, false, true, true, false, true, false, true, true, false, false, false, true, false
            , true, false, true, false, true, true, true, true, true, true};
    private Boolean[] optionAMorPMVisibilityArray = {false, true, true, true, false, true, false, true, false, true, false, true, false, false, true, false, false, true, true, false, false, false, false, true, true, false, false, true,
            false, true, true, false, true, true, false, true, false, true, true, false, false, false, true, false
            , true, false, true, false, true, true, true, true, true, true};
    private Boolean[] optionDateColorArray = {true, true, true, true, true, false, true, false, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
            true, false, true, true, false, false, false, true, true, true, true, true, true, true, true, true
            , true, true, true, true, true, true, true, true, true, true};
    private Boolean[] optionDayColorArray = {true, true, true, true, false, false, true, false, true, true, false, true, false, true, true, true, false, true, true, true, false, true, false, true, true, true, true, true,
            false, false, true, true, false, false, false, true, false, true, true, true, false, false, false, false
            , true, false, false, true, false, false, false, false, true, true};
    private Boolean[] optionHourAlwaysTwoDigitsArray = {true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            , true, true, true, true, true, true, true, true, true, true};
    private Boolean[] optionTimeBackgroundColorArray = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, true, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            , false, false, false, false, true, false, false, false, false, false};
    public PreferenceUtils preferenceUtils;
    private Toolbar toolbar;
    private TextView tvAMorPM;
    private TextView tvDate;
    TextClock tvDate2, tvDate4;
    private TextView tvDateColorHeading;
    private TextView tvDateColorMsg;
    private TextView tvDay;
    private TextView tvDelimiter;
    private TextView tvHour;
    private TextView tvMinute;
    private ViewStub viewStub;
    private int widgetStyleNumber;

    Context contexts1 = PreferenceUtils.INSTANCE.getContexts();
    private String TAG = getClass().getSimpleName();
    public static InterstitialAd interstitialAd;
    public static boolean adIsLoading;
    public KProgressHUD hud;

    public void onDialogDismissed(int i) {
    }

    public ClockEditorActivity() {
    }


    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_clock_customization);
        this.context = getApplicationContext();

        LinearLayout banner = (LinearLayout) findViewById(R.id.adView);
        Common_Banner_google common_bannerad = new Common_Banner_google();
        common_bannerad.GoogleBannerAds(getApplicationContext(), banner);

        this.hud = KProgressHUD.create(this).setStyle(KProgressHUD.Style.SPIN_INDETERMINATE).setLabel("Loading AD").setCancellable(true).setAnimationSpeed(2).setDimAmount(0.5f).show();

        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, getResources().getString(R.string.interstitial_my_creation), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                ClockEditorActivity.this.interstitialAd = interstitialAd;
                adIsLoading = false;
                Log.e(TAG, "onAdLoaded");
                if (interstitialAd != null) {
                    interstitialAd.show(ClockEditorActivity.this);
                    if (hud != null) {
                        hud.dismiss();
                    }
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
                interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        if (hud != null) {
                            hud.dismiss();
                        }
                        ClockEditorActivity.this.interstitialAd = null;
                        Log.e("TAG", "The ad was dismissed.");
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        ClockEditorActivity.this.interstitialAd = null;
                        Log.e("TAG", "The ad failed to show.");
                        if (hud != null) {
                            hud.dismiss();
                        }
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        Log.e("TAG", "The ad was shown.");
                        if (hud != null) {
                            hud.dismiss();
                        }
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                Log.e(TAG, loadAdError.getMessage());
                interstitialAd = null;
                adIsLoading = false;
                if (hud != null) {
                    hud.dismiss();
                }
                String error = String.format(java.util.Locale.US, "domain: %s, code: %d, message: %s", loadAdError.getDomain(), loadAdError.getCode(), loadAdError.getMessage());
//                Toast.makeText(SimNetwork_StartActivity.this, "onAdFailedToLoad() with error: " + error, Toast.LENGTH_SHORT).show();
            }
        });


        initViews();

        setSupportActionBar(this.toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_white_arraow));
        supportActionBar.setTitle((CharSequence) getResources().getString(R.string.activity_toolbar_title_customization));

        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(-1, new Intent());
                finish();
            }
        });


        this.preferenceUtils = PreferenceUtils.INSTANCE.getInstance(context);
        this.widgetStyleNumber = getIntent().getIntExtra(ContextKt.WIDGET_CLOCK_TYPE, 1);
        setLayoutWidgetCustomizationPreview();
        initViewsPreview();
        setOptionsVisibilityForParticularClockStyle();
        setLayoutsAndOptionsAccordingToStoredPreferences();
        getSavedColorAndApplyToPreviewAndOptionLayout();

        tvHour.setTextColor(this.colorHours);
        int i = this.widgetStyleNumber;
        if (i == 49) {
            tvDelimiter.setTextColor(colorTimeBackground);
        } else {
            tvDelimiter.setTextColor(this.colorMinute);
        }
        tvMinute.setTextColor(this.colorMinute);
        tvAMorPM.setTextColor(this.colorAMorPM);
        tvDay.setTextColor(this.colorDay);
        tvDate.setTextColor(this.colorDate);
        if (i == 45 || i == 53) {
            tvDate2.setTextColor(colorDate);
            tvDate4.setTextColor(this.colorDate);
        }


        if (i == 18 || i == 22 || i == 24 || i == 49) {
            llyTimeBackgroundColor.setBackgroundColor(this.colorTimeBackground);
        }


        cvHourColorIndicator.setCardBackgroundColor(this.colorHours);
        cvMinuteColorIndicator.setCardBackgroundColor(this.colorMinute);
        cvAMorPMColorIndicator.setCardBackgroundColor(this.colorAMorPM);
        cvDayColorIndicator.setCardBackgroundColor(this.colorDay);
        cvDateColorIndicator.setCardBackgroundColor(this.colorDate);
        cvTimeBackgroundColorIndicator.setCardBackgroundColor(this.colorTimeBackground);

        String[] PERMISSIONS = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.READ_MEDIA_AUDIO,
                Manifest.permission.READ_MEDIA_IMAGES,
                Manifest.permission.READ_MEDIA_VIDEO
        };
        cbBackgroundWallpaper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
//                    if (ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
//                        ActivityCompat.requestPermissions(ClockEditorActivity.this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1234);
//                        return;
//                    }
//                    WallpaperManager instance = WallpaperManager.getInstance(context);
                    ivBackWallpaper.setImageDrawable(getResources().getDrawable(R.drawable.bgs));
                    preferenceUtils.setWallpaperShownOrNot(Boolean.valueOf(isChecked));
                    return;
                }

                preferenceUtils.setWallpaperShownOrNot(Boolean.valueOf(isChecked));
                ivBackWallpaper.setImageDrawable((Drawable) null);
                ivBackWallpaper.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorGray, (Resources.Theme) null));

            }
        });
        cb12or24HourFormat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                set12or24Format(isChecked);
            }
        });
        cbAMorPMVisibility.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setAMorPMVisibility(isChecked);
            }
        });
        cbHourAlwaysTwoDigits.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setHourAlwaysTwoDigits(isChecked);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            addAutomaticallyFebBtn.setVisibility(View.VISIBLE);
        } else {
            addAutomaticallyFebBtn.setVisibility(View.GONE);
        }

        llyHourColorOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorPickerDialog();
                colorPickerType = 1001;
            }
        });
        llyMinuteColorOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorPickerDialog();
                colorPickerType = 1002;
            }
        });
        llyAMorPMColorOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorPickerDialog();
                colorPickerType = 1003;
            }
        });
        llyDayColorOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorPickerDialog();
                colorPickerType = 1004;
            }
        });
        llyDateColorOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorPickerDialog();
                colorPickerType = 1005;
            }
        });
        llyTimeBackgroundColorOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorPickerDialog();
                colorPickerType = 1006;
            }
        });
        addAutomaticallyFebBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BROADCAST_ID = (int) Math.random();
                autoPinnedWidgetToHomeScreen();
            }
        });
        llyResetAllOption.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(ClockEditorActivity.this);
                dialog.setContentView(R.layout.dialog_reset_all);
                dialog.setCancelable(true);
                dialog.setCanceledOnTouchOutside(true);


                TextView dialog_reset = dialog.findViewById(R.id.dialog_reset_tv_reset_all);
                dialog_reset.setOnClickListener(new View.OnClickListener() {

                    public final void onClick(View view) {
                        resetAll();
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

//        if (ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
//            ActivityCompat.requestPermissions(ClockEditorActivity.this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1234);
//        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1234) {
//            WallpaperManager instance = WallpaperManager.getInstance(this.context);
//            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(ClockEditorActivity.this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1234);
//            }
            ivBackWallpaper.setImageDrawable(getResources().getDrawable(R.drawable.bgs));
            preferenceUtils.setWallpaperShownOrNot(true);
            cbBackgroundWallpaper.setChecked(true);
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            cbBackgroundWallpaper.setChecked(false);
            preferenceUtils.setWallpaperShownOrNot(false);
            ivBackWallpaper.setImageDrawable((Drawable) null);
            ivBackWallpaper.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorGray, (Resources.Theme) null));
            return;
        }
        ivBackWallpaper.setImageDrawable(getResources().getDrawable(R.drawable.bgs));
        preferenceUtils.setWallpaperShownOrNot(true);
        cbBackgroundWallpaper.setChecked(true);
    }


    public void onColorSelected(int i, int i2) {
        int i3 = this.colorPickerType;
        if (i3 == 1001) {
            this.colorHours = i2;
            tvHour.setTextColor(i2);
            cvHourColorIndicator.setCardBackgroundColor(i2);
            saveColor(i2, 1001);
        } else if (i3 == 1002) {
            this.colorMinute = i2;
            tvDelimiter.setTextColor(i2);
            tvMinute.setTextColor(i2);
            cvMinuteColorIndicator.setCardBackgroundColor(i2);
            saveColor(i2, 1002);
        } else if (i3 == 1003) {
            this.colorAMorPM = i2;
            tvAMorPM.setTextColor(i2);
            cvAMorPMColorIndicator.setCardBackgroundColor(i2);
            saveColor(i2, 1003);
        } else if (i3 == 1004) {
            this.colorDay = i2;
            tvDay.setTextColor(i2);
            cvDayColorIndicator.setCardBackgroundColor(i2);
            saveColor(i2, 1004);
        } else if (i3 == 1005) {
            this.colorDate = i2;
            tvDate.setTextColor(i2);
            int i1 = this.widgetStyleNumber;
            if (i1 == 45 || i1 == 53) {
                tvDate2.setTextColor(colorDate);
                tvDate4.setTextColor(this.colorDate);
            }
            cvDateColorIndicator.setCardBackgroundColor(i2);
            saveColor(i2, 1005);
        } else if (i3 == 1006) {
            this.colorTimeBackground = i2;
            int i5 = this.widgetStyleNumber;
            if (i5 == 49) {
                tvDelimiter.setTextColor(i2);
            }
            llyTimeBackgroundColor.setBackgroundColor(i2);
            cvTimeBackgroundColorIndicator.setCardBackgroundColor(i2);
            saveColor(i2, 1006);
        }
    }

    public final int getInitialColorForPickerView() {
        switch (this.colorPickerType) {
            case 1001:
                return this.colorHours;
            case 1002:
                return this.colorMinute;
            case 1003:
                return this.colorAMorPM;
            case 1004:
                return this.colorDay;
            case 1005:
                return this.colorDate;
            case 1006:
                return this.colorTimeBackground;
            default:
                return ResourcesCompat.getColor(getResources(), R.color.colorWhite, (Resources.Theme) null);
        }
    }

    public final void showColorPickerDialog() {
        ColorPickerDialog.newBuilder()
                .setColor(getInitialColorForPickerView())
                .setShowColorShades(true)
                .setAllowCustom(true)
                .setAllowPresets(true)
                .setColorShape(1)
                .setDialogType(ColorPickerDialog.TYPE_CUSTOM)
                .setShowAlphaSlider(true).show(this);
    }

    public final void saveColor(int i, int i2) {
        switch (this.widgetStyleNumber) {
            case 1:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle1(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle1(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle1(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle1(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle1(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 2:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle2(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle2(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle2(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle2(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle2(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 3:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle3(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle3(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle3(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle3(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle3(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 4:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle4(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle4(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle4(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle4(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle4(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 5:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle5(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle5(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle5(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle5(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle5(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 6:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle6(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle6(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle6(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle6(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle6(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 7:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle7(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle7(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle7(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle7(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle7(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 8:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle8(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle8(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle8(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle8(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle8(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 9:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle9(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle9(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle9(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle9(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle9(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 10:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle10(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle10(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle10(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle10(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle10(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 11:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle11(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle11(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle11(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle11(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle11(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 12:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle12(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle12(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle12(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle12(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle12(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 13:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle13(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle13(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle13(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle13(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle13(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 14:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle14(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle14(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle14(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle14(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle14(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 15:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle15(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle15(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle15(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle15(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle15(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 16:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle16(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle16(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle16(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle16(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle16(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 17:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle17(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle17(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle17(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle17(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle17(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 18:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle18(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle18(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle18(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle18(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle18(Integer.valueOf(i));
                    return;
                } else if (i2 == 1006) {
                    preferenceUtils.setTimeBackgroundColorStyle18(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 19:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle19(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle19(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle19(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle19(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle19(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 20:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle20(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle20(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle20(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle20(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle20(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 21:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle21(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle21(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle21(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle21(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle21(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 22:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle22(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle22(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle22(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle22(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle22(Integer.valueOf(i));
                    return;
                } else if (i2 == 1006) {
                    preferenceUtils.setTimeBackgroundColorStyle22(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 23:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle23(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle23(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle23(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle23(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle23(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 24:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle24(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle24(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle24(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle24(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle24(Integer.valueOf(i));
                    return;
                } else if (i2 == 1006) {
                    preferenceUtils.setTimeBackgroundColorStyle24(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 25:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle25(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle25(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle25(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle25(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle25(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 26:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle26(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle26(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle26(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle26(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle26(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 27:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle27(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle27(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle27(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle27(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle27(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 28:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle28(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle28(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle28(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle28(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle28(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 29:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle29(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle29(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle29(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle29(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle29(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 30:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle30(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle30(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle30(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle30(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle30(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 31:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle31(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle31(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle31(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle31(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle31(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 32:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle32(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle32(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle32(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle32(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle32(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 33:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle33(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle33(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle33(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle33(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle33(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 34:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle34(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle34(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle34(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle34(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle34(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 35:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle35(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle35(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle35(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle35(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle35(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 36:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle36(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle36(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle36(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle36(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle36(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 37:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle37(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle37(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle37(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle37(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle37(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 38:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle38(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle38(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle38(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle38(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle38(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 39:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle39(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle39(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle39(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle39(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle39(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 40:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle40(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle40(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle40(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle40(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle40(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 41:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle41(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle41(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle41(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle41(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle41(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 42:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle42(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle42(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle42(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle42(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle42(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 43:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle43(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle43(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle43(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle43(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle43(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 44:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle44(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle44(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle44(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle44(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle44(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 45:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle45(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle45(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle45(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle45(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle45(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 46:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle46(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle46(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle46(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle46(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle46(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 47:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle47(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle47(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle47(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle47(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle47(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 48:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle48(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle48(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle48(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle48(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle48(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 49:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle49(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle49(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle49(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle49(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle49(Integer.valueOf(i));
                    return;
                } else if (i2 == 1006) {
                    preferenceUtils.setTimeBackgroundColorStyle49(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 50:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle50(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle50(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle50(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle50(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle50(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 51:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle51(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle51(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle51(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle51(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle51(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 52:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle52(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle52(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle52(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle52(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle52(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 53:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle53(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle53(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle53(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle53(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle53(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }
            case 54:
                if (i2 == 1001) {
                    preferenceUtils.setHoursColorStyle54(Integer.valueOf(i));
                    return;
                } else if (i2 == 1002) {
                    preferenceUtils.setMinuteColorStyle54(Integer.valueOf(i));
                    return;
                } else if (i2 == 1003) {
                    preferenceUtils.setAMorPMColorStyle54(Integer.valueOf(i));
                    return;
                } else if (i2 == 1004) {
                    preferenceUtils.setDayColorStyle54(Integer.valueOf(i));
                    return;
                } else if (i2 == 1005) {
                    preferenceUtils.setDateColorStyle54(Integer.valueOf(i));
                    return;
                } else {
                    return;
                }

            default:
                return;
        }
    }

    public final void set12or24Format(boolean z) {
        if (z) {
            if (cbHourAlwaysTwoDigits.isChecked()) {
                tvHour.setText(R.string.text_08);
            } else {
                tvHour.setText(R.string.text_8);
            }
            if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {

                llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                if (cbAMorPMVisibility.isChecked()) {
                    tvAMorPM.setVisibility(View.VISIBLE);
                } else {
                    setAMorPMVisibilityINVISIBLEorGONE();
                }
            } else {
                setAMorPMVisibilityINVISIBLEorGONE();
                llyAMorPMVisibilityOption.setVisibility(View.GONE);
            }
        } else {
            setAMorPMVisibilityINVISIBLEorGONE();
            llyAMorPMVisibilityOption.setVisibility(View.GONE);
            tvHour.setText(R.string.text_20);
        }
        switch (this.widgetStyleNumber) {
            case 1:
                preferenceUtils.set12or24FormatStyle1(Boolean.valueOf(z));
                return;
            case 2:
                preferenceUtils.set12or24FormatStyle2(Boolean.valueOf(z));
                return;
            case 3:
                preferenceUtils.set12or24FormatStyle3(Boolean.valueOf(z));
                return;
            case 4:
                preferenceUtils.set12or24FormatStyle4(Boolean.valueOf(z));
                return;
            case 5:
                preferenceUtils.set12or24FormatStyle5(Boolean.valueOf(z));
                return;
            case 6:
                preferenceUtils.set12or24FormatStyle6(Boolean.valueOf(z));
                return;
            case 7:
                preferenceUtils.set12or24FormatStyle7(Boolean.valueOf(z));
                return;
            case 8:
                preferenceUtils.set12or24FormatStyle8(Boolean.valueOf(z));
                return;
            case 9:
                preferenceUtils.set12or24FormatStyle9(Boolean.valueOf(z));
                return;
            case 10:
                preferenceUtils.set12or24FormatStyle10(Boolean.valueOf(z));
                return;
            case 11:
                preferenceUtils.set12or24FormatStyle11(Boolean.valueOf(z));
                return;
            case 12:
                preferenceUtils.set12or24FormatStyle12(Boolean.valueOf(z));
                return;
            case 13:
                preferenceUtils.set12or24FormatStyle13(Boolean.valueOf(z));
                return;
            case 14:
                preferenceUtils.set12or24FormatStyle14(Boolean.valueOf(z));
                return;
            case 15:
                preferenceUtils.set12or24FormatStyle15(Boolean.valueOf(z));
                return;
            case 16:
                preferenceUtils.set12or24FormatStyle16(Boolean.valueOf(z));
                return;
            case 17:
                preferenceUtils.set12or24FormatStyle17(Boolean.valueOf(z));
                return;
            case 18:
                preferenceUtils.set12or24FormatStyle18(Boolean.valueOf(z));
                return;
            case 19:
                preferenceUtils.set12or24FormatStyle19(Boolean.valueOf(z));
                return;
            case 20:
                preferenceUtils.set12or24FormatStyle20(Boolean.valueOf(z));
                return;
            case 21:
                preferenceUtils.set12or24FormatStyle21(Boolean.valueOf(z));
                return;
            case 22:
                preferenceUtils.set12or24FormatStyle22(Boolean.valueOf(z));
                return;
            case 23:
                preferenceUtils.set12or24FormatStyle23(Boolean.valueOf(z));
                return;
            case 24:
                preferenceUtils.set12or24FormatStyle24(Boolean.valueOf(z));
                return;
            case 25:
                preferenceUtils.set12or24FormatStyle25(Boolean.valueOf(z));
                return;
            case 26:
                preferenceUtils.set12or24FormatStyle26(Boolean.valueOf(z));
                return;
            case 27:
                preferenceUtils.set12or24FormatStyle27(Boolean.valueOf(z));
                return;
            case 28:
                preferenceUtils.set12or24FormatStyle28(Boolean.valueOf(z));
                return;
            case 29:
                preferenceUtils.set12or24FormatStyle29(Boolean.valueOf(z));
                return;
            case 30:
                preferenceUtils.set12or24FormatStyle30(Boolean.valueOf(z));
                return;
            case 31:
                preferenceUtils.set12or24FormatStyle31(Boolean.valueOf(z));
                return;
            case 32:
                preferenceUtils.set12or24FormatStyle32(Boolean.valueOf(z));
                return;
            case 33:
                preferenceUtils.set12or24FormatStyle33(Boolean.valueOf(z));
                return;
            case 34:
                preferenceUtils.set12or24FormatStyle34(Boolean.valueOf(z));
                return;
            case 35:
                preferenceUtils.set12or24FormatStyle35(Boolean.valueOf(z));
                return;
            case 36:
                preferenceUtils.set12or24FormatStyle36(Boolean.valueOf(z));
                return;
            case 37:
                preferenceUtils.set12or24FormatStyle37(Boolean.valueOf(z));
                return;
            case 38:
                preferenceUtils.set12or24FormatStyle38(Boolean.valueOf(z));
                return;
            case 39:
                preferenceUtils.set12or24FormatStyle39(Boolean.valueOf(z));
                return;
            case 40:
                preferenceUtils.set12or24FormatStyle40(Boolean.valueOf(z));
                return;
            case 41:
                preferenceUtils.set12or24FormatStyle41(Boolean.valueOf(z));
                return;
            case 42:
                preferenceUtils.set12or24FormatStyle42(Boolean.valueOf(z));
                return;
            case 43:
                preferenceUtils.set12or24FormatStyle43(Boolean.valueOf(z));
                return;
            case 44:
                preferenceUtils.set12or24FormatStyle44(Boolean.valueOf(z));
                return;
            case 45:
                preferenceUtils.set12or24FormatStyle45(Boolean.valueOf(z));
                return;
            case 46:
                preferenceUtils.set12or24FormatStyle46(Boolean.valueOf(z));
                return;
            case 47:
                preferenceUtils.set12or24FormatStyle47(Boolean.valueOf(z));
                return;
            case 48:
                preferenceUtils.set12or24FormatStyle48(Boolean.valueOf(z));
                return;
            case 49:
                preferenceUtils.set12or24FormatStyle49(Boolean.valueOf(z));
                return;
            case 50:
                preferenceUtils.set12or24FormatStyle50(Boolean.valueOf(z));
                return;
            case 51:
                preferenceUtils.set12or24FormatStyle51(Boolean.valueOf(z));
                return;
            case 52:
                preferenceUtils.set12or24FormatStyle52(Boolean.valueOf(z));
                return;
            case 53:
                preferenceUtils.set12or24FormatStyle53(Boolean.valueOf(z));
                return;
            case 54:
                preferenceUtils.set12or24FormatStyle54(Boolean.valueOf(z));
                return;
            default:
                return;
        }
    }

    public final void setAMorPMVisibility(boolean z) {
        if (z) {
            tvAMorPM.setVisibility(View.VISIBLE);
        } else {
            setAMorPMVisibilityINVISIBLEorGONE();
        }
        switch (this.widgetStyleNumber) {
            case 1:
                preferenceUtils.setAMorPMVisibilityStyle1(Boolean.valueOf(z));
                return;
            case 2:
                preferenceUtils.setAMorPMVisibilityStyle2(Boolean.valueOf(z));
                return;
            case 3:
                preferenceUtils.setAMorPMVisibilityStyle3(Boolean.valueOf(z));
                return;
            case 4:
                preferenceUtils.setAMorPMVisibilityStyle4(Boolean.valueOf(z));
                return;
            case 5:
                preferenceUtils.setAMorPMVisibilityStyle5(Boolean.valueOf(z));
                return;
            case 6:
                preferenceUtils.setAMorPMVisibilityStyle6(Boolean.valueOf(z));
                return;
            case 7:
                preferenceUtils.setAMorPMVisibilityStyle7(Boolean.valueOf(z));
                return;
            case 8:
                preferenceUtils.setAMorPMVisibilityStyle8(Boolean.valueOf(z));
                return;
            case 9:
                preferenceUtils.setAMorPMVisibilityStyle9(Boolean.valueOf(z));
                return;
            case 10:
                preferenceUtils.setAMorPMVisibilityStyle10(Boolean.valueOf(z));
                return;
            case 11:
                preferenceUtils.setAMorPMVisibilityStyle11(Boolean.valueOf(z));
                return;
            case 12:
                preferenceUtils.setAMorPMVisibilityStyle12(Boolean.valueOf(z));
                return;
            case 13:
                preferenceUtils.setAMorPMVisibilityStyle13(Boolean.valueOf(z));
                return;
            case 14:
                preferenceUtils.setAMorPMVisibilityStyle14(Boolean.valueOf(z));
                return;
            case 15:
                preferenceUtils.setAMorPMVisibilityStyle15(Boolean.valueOf(z));
                return;
            case 16:
                preferenceUtils.setAMorPMVisibilityStyle16(Boolean.valueOf(z));
                return;
            case 17:
                preferenceUtils.setAMorPMVisibilityStyle17(Boolean.valueOf(z));
                return;
            case 18:
                preferenceUtils.setAMorPMVisibilityStyle18(Boolean.valueOf(z));
                return;
            case 19:
                preferenceUtils.setAMorPMVisibilityStyle19(Boolean.valueOf(z));
                return;
            case 20:
                preferenceUtils.setAMorPMVisibilityStyle20(Boolean.valueOf(z));
                return;
            case 21:
                preferenceUtils.setAMorPMVisibilityStyle21(Boolean.valueOf(z));
                return;
            case 22:
                preferenceUtils.setAMorPMVisibilityStyle22(Boolean.valueOf(z));
                return;
            case 23:
                preferenceUtils.setAMorPMVisibilityStyle23(Boolean.valueOf(z));
                return;
            case 24:
                preferenceUtils.setAMorPMVisibilityStyle24(Boolean.valueOf(z));
                return;
            case 25:
                preferenceUtils.setAMorPMVisibilityStyle25(Boolean.valueOf(z));
                return;
            case 26:
                preferenceUtils.setAMorPMVisibilityStyle26(Boolean.valueOf(z));
                return;
            case 27:
                preferenceUtils.setAMorPMVisibilityStyle27(Boolean.valueOf(z));
                return;
            case 28:
                preferenceUtils.setAMorPMVisibilityStyle28(Boolean.valueOf(z));
                return;
            case 29:
                preferenceUtils.setAMorPMVisibilityStyle29(Boolean.valueOf(z));
                return;
            case 30:
                preferenceUtils.setAMorPMVisibilityStyle30(Boolean.valueOf(z));
                return;
            case 31:
                preferenceUtils.setAMorPMVisibilityStyle31(Boolean.valueOf(z));
                return;
            case 32:
                preferenceUtils.setAMorPMVisibilityStyle32(Boolean.valueOf(z));
                return;
            case 33:
                preferenceUtils.setAMorPMVisibilityStyle33(Boolean.valueOf(z));
                return;
            case 34:
                preferenceUtils.setAMorPMVisibilityStyle34(Boolean.valueOf(z));
                return;
            case 35:
                preferenceUtils.setAMorPMVisibilityStyle35(Boolean.valueOf(z));
                return;
            case 36:
                preferenceUtils.setAMorPMVisibilityStyle36(Boolean.valueOf(z));
                return;
            case 37:
                preferenceUtils.setAMorPMVisibilityStyle37(Boolean.valueOf(z));
                return;
            case 38:
                preferenceUtils.setAMorPMVisibilityStyle38(Boolean.valueOf(z));
                return;
            case 39:
                preferenceUtils.setAMorPMVisibilityStyle39(Boolean.valueOf(z));
                return;
            case 40:
                preferenceUtils.setAMorPMVisibilityStyle40(Boolean.valueOf(z));
                return;
            case 41:
                preferenceUtils.setAMorPMVisibilityStyle41(Boolean.valueOf(z));
                return;
            case 42:
                preferenceUtils.setAMorPMVisibilityStyle42(Boolean.valueOf(z));
                return;
            case 43:
                preferenceUtils.setAMorPMVisibilityStyle43(Boolean.valueOf(z));
                return;
            case 44:
                preferenceUtils.setAMorPMVisibilityStyle44(Boolean.valueOf(z));
                return;
            case 45:
                preferenceUtils.setAMorPMVisibilityStyle45(Boolean.valueOf(z));
                return;
            case 46:
                preferenceUtils.setAMorPMVisibilityStyle46(Boolean.valueOf(z));
                return;
            case 47:
                preferenceUtils.setAMorPMVisibilityStyle47(Boolean.valueOf(z));
                return;
            case 48:
                preferenceUtils.setAMorPMVisibilityStyle48(Boolean.valueOf(z));
                return;
            case 49:
                preferenceUtils.setAMorPMVisibilityStyle49(Boolean.valueOf(z));
                return;
            case 50:
                preferenceUtils.setAMorPMVisibilityStyle50(Boolean.valueOf(z));
                return;
            case 51:
                preferenceUtils.setAMorPMVisibilityStyle51(Boolean.valueOf(z));
                return;
            case 52:
                preferenceUtils.setAMorPMVisibilityStyle52(Boolean.valueOf(z));
                return;
            case 53:
                preferenceUtils.setAMorPMVisibilityStyle53(Boolean.valueOf(z));
                return;
            case 54:
                preferenceUtils.setAMorPMVisibilityStyle54(Boolean.valueOf(z));
                return;
            default:
                return;
        }
    }

    public final void setHourAlwaysTwoDigits(boolean z) {
        CheckBox checkBox = this.cb12or24HourFormat;
        if (checkBox.isChecked()) {
            if (z) {
                tvHour.setText(R.string.text_08);
            } else {
                tvHour.setText(R.string.text_8);
            }
        }
        switch (this.widgetStyleNumber) {
            case 1:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle1(Boolean.valueOf(z));
                return;
            case 2:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle2(Boolean.valueOf(z));
                return;
            case 3:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle3(Boolean.valueOf(z));
                return;
            case 4:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle4(Boolean.valueOf(z));
                return;
            case 5:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle5(Boolean.valueOf(z));
                return;
            case 6:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle6(Boolean.valueOf(z));
                return;
            case 7:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle7(Boolean.valueOf(z));
                return;
            case 8:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle8(Boolean.valueOf(z));
                return;
            case 9:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle9(Boolean.valueOf(z));
                return;
            case 10:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle10(Boolean.valueOf(z));
                return;
            case 11:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle11(Boolean.valueOf(z));
                return;
            case 12:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle12(Boolean.valueOf(z));
                return;
            case 13:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle13(Boolean.valueOf(z));
                return;
            case 14:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle14(Boolean.valueOf(z));
                return;
            case 15:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle15(Boolean.valueOf(z));
                return;
            case 16:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle16(Boolean.valueOf(z));
                return;
            case 17:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle17(Boolean.valueOf(z));
                return;
            case 18:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle18(Boolean.valueOf(z));
                return;
            case 19:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle19(Boolean.valueOf(z));
                return;
            case 20:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle20(Boolean.valueOf(z));
                return;
            case 21:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle21(Boolean.valueOf(z));
                return;
            case 22:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle22(Boolean.valueOf(z));
                return;
            case 23:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle23(Boolean.valueOf(z));
                return;
            case 24:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle24(Boolean.valueOf(z));
                return;
            case 25:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle25(Boolean.valueOf(z));
                return;
            case 26:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle26(Boolean.valueOf(z));
                return;
            case 27:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle27(Boolean.valueOf(z));
                return;
            case 28:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle28(Boolean.valueOf(z));
                return;
            case 29:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle29(Boolean.valueOf(z));
                return;
            case 30:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle30(Boolean.valueOf(z));
                return;
            case 31:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle31(Boolean.valueOf(z));
                return;
            case 32:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle32(Boolean.valueOf(z));
                return;
            case 33:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle33(Boolean.valueOf(z));
                return;
            case 34:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle34(Boolean.valueOf(z));
                return;
            case 35:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle35(Boolean.valueOf(z));
                return;
            case 36:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle36(Boolean.valueOf(z));
                return;
            case 37:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle37(Boolean.valueOf(z));
                return;
            case 38:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle38(Boolean.valueOf(z));
                return;
            case 39:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle39(Boolean.valueOf(z));
                return;
            case 40:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle40(Boolean.valueOf(z));
                return;
            case 41:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle41(Boolean.valueOf(z));
                return;
            case 42:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle42(Boolean.valueOf(z));
                return;
            case 43:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle43(Boolean.valueOf(z));
                return;
            case 44:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle44(Boolean.valueOf(z));
                return;
            case 45:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle45(Boolean.valueOf(z));
                return;
            case 46:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle46(Boolean.valueOf(z));
                return;
            case 47:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle47(Boolean.valueOf(z));
                return;
            case 48:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle48(Boolean.valueOf(z));
                return;
            case 49:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle49(Boolean.valueOf(z));
                return;
            case 50:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle50(Boolean.valueOf(z));
                return;
            case 51:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle51(Boolean.valueOf(z));
                return;
            case 52:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle52(Boolean.valueOf(z));
                return;
            case 53:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle53(Boolean.valueOf(z));
                return;
            case 54:
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle54(Boolean.valueOf(z));
                return;
            default:
                return;
        }
    }

    public final void setAMorPMVisibilityINVISIBLEorGONE() {
        int i = this.widgetStyleNumber;
        if (i == 2 || i == 3 || i == 18 || i == 19 || i == 25 || i == 52) {
            tvAMorPM.setVisibility(View.INVISIBLE);
            return;
        }
        tvAMorPM.setVisibility(View.GONE);
    }

    public final void setLayoutsAndOptionsAccordingToStoredPreferences() {

        Boolean wallpaperShownOrNot = preferenceUtils.getWallpaperShownOrNot();
        cbBackgroundWallpaper.setChecked(wallpaperShownOrNot.booleanValue());

        if (wallpaperShownOrNot.booleanValue()) {
//            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
//                ActivityCompat.requestPermissions(ClockEditorActivity.this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1234);
//            } else {
//                WallpaperManager instance = WallpaperManager.getInstance(this.context);
            ivBackWallpaper.setImageDrawable(getResources().getDrawable(R.drawable.bgs));
//            }
        } else {
            ivBackWallpaper.setImageDrawable((Drawable) null);
            ivBackWallpaper.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorGray, (Resources.Theme) null));
        }
        switch (this.widgetStyleNumber) {
            case 1:
                Boolean bool = preferenceUtils.get12or24FormatStyle1();

                cb12or24HourFormat.setChecked(bool.booleanValue());
                Boolean bool2 = preferenceUtils.get12or24FormatStyle1();

                if (bool2.booleanValue()) {
                    Boolean hoursAlwaysAsTwoDigitStyle1 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle1();

                    if (hoursAlwaysAsTwoDigitStyle1.booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    Boolean bool3 = preferenceUtils.get12or24FormatStyle1();
                    if (bool3.booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    Boolean aMorPMVisibilityStyle1 = preferenceUtils.getAMorPMVisibilityStyle1();
                    cbAMorPMVisibility.setChecked(aMorPMVisibilityStyle1.booleanValue());
                    Boolean bool4 = preferenceUtils.get12or24FormatStyle1();
                    if (bool4.booleanValue()) {
                        Boolean aMorPMVisibilityStyle12 = preferenceUtils.getAMorPMVisibilityStyle1();
                        if (aMorPMVisibilityStyle12.booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                Boolean hoursAlwaysAsTwoDigitStyle12 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle1();
                cbHourAlwaysTwoDigits.setChecked(hoursAlwaysAsTwoDigitStyle12.booleanValue());
                return;
            case 2:
                CheckBox checkBox5 = this.cb12or24HourFormat;
                Boolean bool5 = preferenceUtils.get12or24FormatStyle2();
                checkBox5.setChecked(bool5.booleanValue());
                Boolean bool6 = preferenceUtils.get12or24FormatStyle2();
                if (bool6.booleanValue()) {
                    Boolean hoursAlwaysAsTwoDigitStyle2 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle2();
                    if (hoursAlwaysAsTwoDigitStyle2.booleanValue()) {
                        TextView textView6 = this.tvHour;
                        textView6.setText(R.string.text_08);
                    } else {
                        TextView textView7 = this.tvHour;
                        textView7.setText(R.string.text_8);
                    }
                } else {
                    TextView textView8 = this.tvHour;
                    textView8.setText(R.string.text_20);
                }
                TextView textView9 = this.tvMinute;
                textView9.setText(R.string.text_45);
                Boolean[] boolArr2 = this.optionAMorPMVisibilityArray;
                if (boolArr2[this.widgetStyleNumber - 1].booleanValue()) {
                    Boolean bool7 = preferenceUtils.get12or24FormatStyle2();
                    if (bool7.booleanValue()) {
                        LinearLayout linearLayout3 = this.llyAMorPMVisibilityOption;
                        linearLayout3.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout4 = this.llyAMorPMVisibilityOption;
                        linearLayout4.setVisibility(View.GONE);
                    }
                    CheckBox checkBox6 = this.cbAMorPMVisibility;
                    Boolean aMorPMVisibilityStyle2 = preferenceUtils.getAMorPMVisibilityStyle2();
                    checkBox6.setChecked(aMorPMVisibilityStyle2.booleanValue());
                    Boolean bool8 = preferenceUtils.get12or24FormatStyle2();
                    if (bool8.booleanValue()) {
                        Boolean aMorPMVisibilityStyle22 = preferenceUtils.getAMorPMVisibilityStyle2();
                        if (aMorPMVisibilityStyle22.booleanValue()) {
                            TextView textView10 = this.tvAMorPM;
                            textView10.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox7 = this.cbHourAlwaysTwoDigits;
                Boolean hoursAlwaysAsTwoDigitStyle22 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle2();
                checkBox7.setChecked(hoursAlwaysAsTwoDigitStyle22.booleanValue());
                return;
            case 3:
                CheckBox checkBox8 = this.cb12or24HourFormat;
                Boolean bool9 = preferenceUtils.get12or24FormatStyle3();
                checkBox8.setChecked(bool9.booleanValue());
                Boolean bool10 = preferenceUtils.get12or24FormatStyle3();
                if (bool10.booleanValue()) {
                    Boolean hoursAlwaysAsTwoDigitStyle3 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle3();
                    if (hoursAlwaysAsTwoDigitStyle3.booleanValue()) {
                        TextView textView11 = this.tvHour;
                        textView11.setText(R.string.text_08);
                    } else {
                        TextView textView12 = this.tvHour;
                        textView12.setText(R.string.text_8);
                    }
                } else {
                    TextView textView13 = this.tvHour;
                    textView13.setText(R.string.text_20);
                }
                TextView textView14 = this.tvMinute;
                textView14.setText(R.string.text_45);
                Boolean[] boolArr3 = this.optionAMorPMVisibilityArray;
                if (boolArr3[this.widgetStyleNumber - 1].booleanValue()) {
                    Boolean bool11 = preferenceUtils.get12or24FormatStyle3();
                    if (bool11.booleanValue()) {
                        LinearLayout linearLayout5 = this.llyAMorPMVisibilityOption;
                        linearLayout5.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout6 = this.llyAMorPMVisibilityOption;
                        linearLayout6.setVisibility(View.GONE);
                    }
                    CheckBox checkBox9 = this.cbAMorPMVisibility;
                    Boolean aMorPMVisibilityStyle3 = preferenceUtils.getAMorPMVisibilityStyle3();
                    checkBox9.setChecked(aMorPMVisibilityStyle3.booleanValue());
                    Boolean bool12 = preferenceUtils.get12or24FormatStyle3();
                    if (bool12.booleanValue()) {
                        Boolean aMorPMVisibilityStyle32 = preferenceUtils.getAMorPMVisibilityStyle3();
                        if (aMorPMVisibilityStyle32.booleanValue()) {
                            TextView textView15 = this.tvAMorPM;
                            textView15.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox10 = this.cbHourAlwaysTwoDigits;
                Boolean hoursAlwaysAsTwoDigitStyle32 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle3();
                checkBox10.setChecked(hoursAlwaysAsTwoDigitStyle32.booleanValue());
                return;
            case 4:
                CheckBox checkBox11 = this.cb12or24HourFormat;
                Boolean bool13 = preferenceUtils.get12or24FormatStyle4();
                checkBox11.setChecked(bool13.booleanValue());
                Boolean bool14 = preferenceUtils.get12or24FormatStyle4();
                if (bool14.booleanValue()) {
                    Boolean hoursAlwaysAsTwoDigitStyle4 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle4();
                    if (hoursAlwaysAsTwoDigitStyle4.booleanValue()) {
                        TextView textView16 = this.tvHour;
                        textView16.setText(R.string.text_08);
                    } else {
                        TextView textView17 = this.tvHour;
                        textView17.setText(R.string.text_8);
                    }
                } else {
                    TextView textView18 = this.tvHour;
                    textView18.setText(R.string.text_20);
                }
                TextView textView19 = this.tvMinute;
                textView19.setText(R.string.text_45);
                Boolean[] boolArr4 = this.optionAMorPMVisibilityArray;
                if (boolArr4[this.widgetStyleNumber - 1].booleanValue()) {
                    Boolean bool15 = preferenceUtils.get12or24FormatStyle4();
                    if (bool15.booleanValue()) {
                        LinearLayout linearLayout7 = this.llyAMorPMVisibilityOption;
                        linearLayout7.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout8 = this.llyAMorPMVisibilityOption;
                        linearLayout8.setVisibility(View.GONE);
                    }
                    CheckBox checkBox12 = this.cbAMorPMVisibility;
                    Boolean aMorPMVisibilityStyle4 = preferenceUtils.getAMorPMVisibilityStyle4();
                    checkBox12.setChecked(aMorPMVisibilityStyle4.booleanValue());
                    Boolean bool16 = preferenceUtils.get12or24FormatStyle4();
                    if (bool16.booleanValue()) {
                        Boolean aMorPMVisibilityStyle42 = preferenceUtils.getAMorPMVisibilityStyle4();
                        if (aMorPMVisibilityStyle42.booleanValue()) {
                            TextView textView20 = this.tvAMorPM;
                            textView20.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox13 = this.cbHourAlwaysTwoDigits;
                Boolean hoursAlwaysAsTwoDigitStyle42 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle4();
                checkBox13.setChecked(hoursAlwaysAsTwoDigitStyle42.booleanValue());
                return;
            case 5:
                CheckBox checkBox14 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils36 = this.preferenceUtils;
                Boolean bool17 = preferenceUtils36.get12or24FormatStyle5();
                checkBox14.setChecked(bool17.booleanValue());
                PreferenceUtils preferenceUtils37 = this.preferenceUtils;
                Boolean bool18 = preferenceUtils37.get12or24FormatStyle5();
                if (bool18.booleanValue()) {
                    PreferenceUtils preferenceUtils38 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle5 = preferenceUtils38.getHoursAlwaysAsTwoDigitStyle5();
                    if (hoursAlwaysAsTwoDigitStyle5.booleanValue()) {
                        TextView textView21 = this.tvHour;
                        textView21.setText(R.string.text_08);
                    } else {
                        TextView textView22 = this.tvHour;
                        textView22.setText(R.string.text_8);
                    }
                } else {
                    TextView textView23 = this.tvHour;
                    textView23.setText(R.string.text_20);
                }
                TextView textView24 = this.tvMinute;
                textView24.setText(R.string.text_45);
                Boolean[] boolArr5 = this.optionAMorPMVisibilityArray;
                if (boolArr5[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils39 = this.preferenceUtils;
                    Boolean bool19 = preferenceUtils39.get12or24FormatStyle5();
                    if (bool19.booleanValue()) {
                        LinearLayout linearLayout9 = this.llyAMorPMVisibilityOption;
                        linearLayout9.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout10 = this.llyAMorPMVisibilityOption;
                        linearLayout10.setVisibility(View.GONE);
                    }
                    CheckBox checkBox15 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils40 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle5 = preferenceUtils40.getAMorPMVisibilityStyle5();
                    checkBox15.setChecked(aMorPMVisibilityStyle5.booleanValue());
                    PreferenceUtils preferenceUtils41 = this.preferenceUtils;
                    Boolean bool20 = preferenceUtils41.get12or24FormatStyle5();
                    if (bool20.booleanValue()) {
                        PreferenceUtils preferenceUtils42 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle52 = preferenceUtils42.getAMorPMVisibilityStyle5();
                        if (aMorPMVisibilityStyle52.booleanValue()) {
                            TextView textView25 = this.tvAMorPM;
                            textView25.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox16 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils43 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle52 = preferenceUtils43.getHoursAlwaysAsTwoDigitStyle5();
                checkBox16.setChecked(hoursAlwaysAsTwoDigitStyle52.booleanValue());
                return;
            case 6:
                CheckBox checkBox17 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils44 = this.preferenceUtils;
                Boolean bool21 = preferenceUtils44.get12or24FormatStyle6();
                checkBox17.setChecked(bool21.booleanValue());
                PreferenceUtils preferenceUtils45 = this.preferenceUtils;
                Boolean bool22 = preferenceUtils45.get12or24FormatStyle6();
                if (bool22.booleanValue()) {
                    PreferenceUtils preferenceUtils46 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle6 = preferenceUtils46.getHoursAlwaysAsTwoDigitStyle6();
                    if (hoursAlwaysAsTwoDigitStyle6.booleanValue()) {
                        TextView textView26 = this.tvHour;
                        textView26.setText(R.string.text_08);
                    } else {
                        TextView textView27 = this.tvHour;
                        textView27.setText(R.string.text_8);
                    }
                } else {
                    TextView textView28 = this.tvHour;
                    textView28.setText(R.string.text_20);
                }
                TextView textView29 = this.tvMinute;
                textView29.setText(R.string.text_45);
                Boolean[] boolArr6 = this.optionAMorPMVisibilityArray;
                if (boolArr6[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils47 = this.preferenceUtils;
                    Boolean bool23 = preferenceUtils47.get12or24FormatStyle6();
                    if (bool23.booleanValue()) {
                        LinearLayout linearLayout11 = this.llyAMorPMVisibilityOption;
                        linearLayout11.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout12 = this.llyAMorPMVisibilityOption;
                        linearLayout12.setVisibility(View.GONE);
                    }
                    CheckBox checkBox18 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils48 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle6 = preferenceUtils48.getAMorPMVisibilityStyle6();
                    checkBox18.setChecked(aMorPMVisibilityStyle6.booleanValue());
                    PreferenceUtils preferenceUtils49 = this.preferenceUtils;
                    Boolean bool24 = preferenceUtils49.get12or24FormatStyle6();
                    if (bool24.booleanValue()) {
                        PreferenceUtils preferenceUtils50 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle62 = preferenceUtils50.getAMorPMVisibilityStyle6();
                        if (aMorPMVisibilityStyle62.booleanValue()) {
                            TextView textView30 = this.tvAMorPM;
                            textView30.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox19 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils51 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle62 = preferenceUtils51.getHoursAlwaysAsTwoDigitStyle6();
                checkBox19.setChecked(hoursAlwaysAsTwoDigitStyle62.booleanValue());
                return;
            case 7:
                CheckBox checkBox20 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils52 = this.preferenceUtils;
                Boolean bool25 = preferenceUtils52.get12or24FormatStyle7();
                checkBox20.setChecked(bool25.booleanValue());
                PreferenceUtils preferenceUtils53 = this.preferenceUtils;
                Boolean bool26 = preferenceUtils53.get12or24FormatStyle7();
                if (bool26.booleanValue()) {
                    PreferenceUtils preferenceUtils54 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle7 = preferenceUtils54.getHoursAlwaysAsTwoDigitStyle7();
                    if (hoursAlwaysAsTwoDigitStyle7.booleanValue()) {
                        TextView textView31 = this.tvHour;
                        textView31.setText(R.string.text_08);
                    } else {
                        TextView textView32 = this.tvHour;
                        textView32.setText(R.string.text_8);
                    }
                } else {
                    TextView textView33 = this.tvHour;
                    textView33.setText(R.string.text_20);
                }
                TextView textView34 = this.tvMinute;
                textView34.setText(R.string.text_45);
                Boolean[] boolArr7 = this.optionAMorPMVisibilityArray;
                if (boolArr7[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils55 = this.preferenceUtils;
                    Boolean bool27 = preferenceUtils55.get12or24FormatStyle7();
                    if (bool27.booleanValue()) {
                        LinearLayout linearLayout13 = this.llyAMorPMVisibilityOption;
                        linearLayout13.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout14 = this.llyAMorPMVisibilityOption;
                        linearLayout14.setVisibility(View.GONE);
                    }
                    CheckBox checkBox21 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils56 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle7 = preferenceUtils56.getAMorPMVisibilityStyle7();
                    checkBox21.setChecked(aMorPMVisibilityStyle7.booleanValue());
                    PreferenceUtils preferenceUtils57 = this.preferenceUtils;
                    Boolean bool28 = preferenceUtils57.get12or24FormatStyle7();
                    if (bool28.booleanValue()) {
                        PreferenceUtils preferenceUtils58 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle72 = preferenceUtils58.getAMorPMVisibilityStyle7();
                        if (aMorPMVisibilityStyle72.booleanValue()) {
                            TextView textView35 = this.tvAMorPM;
                            textView35.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox22 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils59 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle72 = preferenceUtils59.getHoursAlwaysAsTwoDigitStyle7();
                checkBox22.setChecked(hoursAlwaysAsTwoDigitStyle72.booleanValue());
                return;
            case 8:
                CheckBox checkBox23 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils60 = this.preferenceUtils;
                Boolean bool29 = preferenceUtils60.get12or24FormatStyle8();
                checkBox23.setChecked(bool29.booleanValue());
                PreferenceUtils preferenceUtils61 = this.preferenceUtils;
                Boolean bool30 = preferenceUtils61.get12or24FormatStyle8();
                if (bool30.booleanValue()) {
                    PreferenceUtils preferenceUtils62 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle8 = preferenceUtils62.getHoursAlwaysAsTwoDigitStyle8();
                    if (hoursAlwaysAsTwoDigitStyle8.booleanValue()) {
                        TextView textView36 = this.tvHour;
                        textView36.setText(R.string.text_08);
                    } else {
                        TextView textView37 = this.tvHour;
                        textView37.setText(R.string.text_8);
                    }
                } else {
                    TextView textView38 = this.tvHour;
                    textView38.setText(R.string.text_20);
                }
                TextView textView39 = this.tvMinute;
                textView39.setText(R.string.text_45);
                Boolean[] boolArr8 = this.optionAMorPMVisibilityArray;
                if (boolArr8[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils63 = this.preferenceUtils;
                    Boolean bool31 = preferenceUtils63.get12or24FormatStyle8();
                    if (bool31.booleanValue()) {
                        LinearLayout linearLayout15 = this.llyAMorPMVisibilityOption;
                        linearLayout15.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout16 = this.llyAMorPMVisibilityOption;
                        linearLayout16.setVisibility(View.GONE);
                    }
                    CheckBox checkBox24 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils64 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle8 = preferenceUtils64.getAMorPMVisibilityStyle8();
                    checkBox24.setChecked(aMorPMVisibilityStyle8.booleanValue());
                    PreferenceUtils preferenceUtils65 = this.preferenceUtils;
                    Boolean bool32 = preferenceUtils65.get12or24FormatStyle8();
                    if (bool32.booleanValue()) {
                        PreferenceUtils preferenceUtils66 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle82 = preferenceUtils66.getAMorPMVisibilityStyle8();
                        if (aMorPMVisibilityStyle82.booleanValue()) {
                            TextView textView40 = this.tvAMorPM;
                            textView40.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox25 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils67 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle82 = preferenceUtils67.getHoursAlwaysAsTwoDigitStyle8();
                checkBox25.setChecked(hoursAlwaysAsTwoDigitStyle82.booleanValue());
                return;
            case 9:
                CheckBox checkBox26 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils68 = this.preferenceUtils;
                Boolean bool33 = preferenceUtils68.get12or24FormatStyle9();
                checkBox26.setChecked(bool33.booleanValue());
                PreferenceUtils preferenceUtils69 = this.preferenceUtils;
                Boolean bool34 = preferenceUtils69.get12or24FormatStyle9();
                if (bool34.booleanValue()) {
                    PreferenceUtils preferenceUtils70 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle9 = preferenceUtils70.getHoursAlwaysAsTwoDigitStyle9();
                    if (hoursAlwaysAsTwoDigitStyle9.booleanValue()) {
                        TextView textView41 = this.tvHour;
                        textView41.setText(R.string.text_08);
                    } else {
                        TextView textView42 = this.tvHour;
                        textView42.setText(R.string.text_8);
                    }
                } else {
                    TextView textView43 = this.tvHour;
                    textView43.setText(R.string.text_20);
                }
                TextView textView44 = this.tvMinute;
                textView44.setText("10");
                Boolean[] boolArr9 = this.optionAMorPMVisibilityArray;
                if (boolArr9[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils71 = this.preferenceUtils;
                    Boolean bool35 = preferenceUtils71.get12or24FormatStyle9();
                    if (bool35.booleanValue()) {
                        LinearLayout linearLayout17 = this.llyAMorPMVisibilityOption;
                        linearLayout17.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout18 = this.llyAMorPMVisibilityOption;
                        linearLayout18.setVisibility(View.GONE);
                    }
                    CheckBox checkBox27 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils72 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle9 = preferenceUtils72.getAMorPMVisibilityStyle9();
                    checkBox27.setChecked(aMorPMVisibilityStyle9.booleanValue());
                    PreferenceUtils preferenceUtils73 = this.preferenceUtils;
                    Boolean bool36 = preferenceUtils73.get12or24FormatStyle9();
                    if (bool36.booleanValue()) {
                        PreferenceUtils preferenceUtils74 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle92 = preferenceUtils74.getAMorPMVisibilityStyle9();
                        if (aMorPMVisibilityStyle92.booleanValue()) {
                            TextView textView45 = this.tvAMorPM;
                            textView45.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox28 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils75 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle92 = preferenceUtils75.getHoursAlwaysAsTwoDigitStyle9();
                checkBox28.setChecked(hoursAlwaysAsTwoDigitStyle92.booleanValue());
                return;
            case 10:
                CheckBox checkBox29 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils76 = this.preferenceUtils;
                Boolean bool37 = preferenceUtils76.get12or24FormatStyle10();
                checkBox29.setChecked(bool37.booleanValue());
                PreferenceUtils preferenceUtils77 = this.preferenceUtils;
                Boolean bool38 = preferenceUtils77.get12or24FormatStyle10();
                if (bool38.booleanValue()) {
                    PreferenceUtils preferenceUtils78 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle10 = preferenceUtils78.getHoursAlwaysAsTwoDigitStyle10();
                    if (hoursAlwaysAsTwoDigitStyle10.booleanValue()) {
                        TextView textView46 = this.tvHour;
                        textView46.setText(R.string.text_08);
                    } else {
                        TextView textView47 = this.tvHour;
                        textView47.setText(R.string.text_8);
                    }
                } else {
                    TextView textView48 = this.tvHour;
                    textView48.setText(R.string.text_20);
                }
                TextView textView49 = this.tvMinute;
                textView49.setText(R.string.text_45);
                Boolean[] boolArr10 = this.optionAMorPMVisibilityArray;
                if (boolArr10[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils79 = this.preferenceUtils;
                    Boolean bool39 = preferenceUtils79.get12or24FormatStyle10();
                    if (bool39.booleanValue()) {
                        LinearLayout linearLayout19 = this.llyAMorPMVisibilityOption;
                        linearLayout19.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout20 = this.llyAMorPMVisibilityOption;
                        linearLayout20.setVisibility(View.GONE);
                    }
                    CheckBox checkBox30 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils80 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle10 = preferenceUtils80.getAMorPMVisibilityStyle10();
                    checkBox30.setChecked(aMorPMVisibilityStyle10.booleanValue());
                    PreferenceUtils preferenceUtils81 = this.preferenceUtils;
                    Boolean bool40 = preferenceUtils81.get12or24FormatStyle10();
                    if (bool40.booleanValue()) {
                        PreferenceUtils preferenceUtils82 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle102 = preferenceUtils82.getAMorPMVisibilityStyle10();
                        if (aMorPMVisibilityStyle102.booleanValue()) {
                            TextView textView50 = this.tvAMorPM;
                            textView50.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox31 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils83 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle102 = preferenceUtils83.getHoursAlwaysAsTwoDigitStyle10();
                checkBox31.setChecked(hoursAlwaysAsTwoDigitStyle102.booleanValue());
                return;
            case 11:
                CheckBox checkBox32 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils84 = this.preferenceUtils;
                Boolean bool41 = preferenceUtils84.get12or24FormatStyle11();
                checkBox32.setChecked(bool41.booleanValue());
                PreferenceUtils preferenceUtils85 = this.preferenceUtils;
                Boolean bool42 = preferenceUtils85.get12or24FormatStyle11();
                if (bool42.booleanValue()) {
                    PreferenceUtils preferenceUtils86 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle11 = preferenceUtils86.getHoursAlwaysAsTwoDigitStyle11();
                    if (hoursAlwaysAsTwoDigitStyle11.booleanValue()) {
                        TextView textView51 = this.tvHour;
                        textView51.setText(R.string.text_08);
                    } else {
                        TextView textView52 = this.tvHour;
                        textView52.setText(R.string.text_8);
                    }
                } else {
                    TextView textView53 = this.tvHour;
                    textView53.setText(R.string.text_20);
                }
                TextView textView54 = this.tvMinute;
                textView54.setText(R.string.text_45);
                Boolean[] boolArr11 = this.optionAMorPMVisibilityArray;
                if (boolArr11[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils87 = this.preferenceUtils;
                    Boolean bool43 = preferenceUtils87.get12or24FormatStyle11();
                    if (bool43.booleanValue()) {
                        LinearLayout linearLayout21 = this.llyAMorPMVisibilityOption;
                        linearLayout21.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout22 = this.llyAMorPMVisibilityOption;
                        linearLayout22.setVisibility(View.GONE);
                    }
                    CheckBox checkBox33 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils88 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle11 = preferenceUtils88.getAMorPMVisibilityStyle11();
                    checkBox33.setChecked(aMorPMVisibilityStyle11.booleanValue());
                    PreferenceUtils preferenceUtils89 = this.preferenceUtils;
                    Boolean bool44 = preferenceUtils89.get12or24FormatStyle11();
                    if (bool44.booleanValue()) {
                        PreferenceUtils preferenceUtils90 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle112 = preferenceUtils90.getAMorPMVisibilityStyle11();
                        if (aMorPMVisibilityStyle112.booleanValue()) {
                            TextView textView55 = this.tvAMorPM;
                            textView55.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox34 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils91 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle112 = preferenceUtils91.getHoursAlwaysAsTwoDigitStyle11();
                checkBox34.setChecked(hoursAlwaysAsTwoDigitStyle112.booleanValue());
                return;
            case 12:
                CheckBox checkBox35 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils92 = this.preferenceUtils;
                Boolean bool45 = preferenceUtils92.get12or24FormatStyle12();
                checkBox35.setChecked(bool45.booleanValue());
                PreferenceUtils preferenceUtils93 = this.preferenceUtils;
                Boolean bool46 = preferenceUtils93.get12or24FormatStyle12();
                if (bool46.booleanValue()) {
                    PreferenceUtils preferenceUtils94 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle122 = preferenceUtils94.getHoursAlwaysAsTwoDigitStyle12();
                    if (hoursAlwaysAsTwoDigitStyle122.booleanValue()) {
                        TextView textView56 = this.tvHour;
                        textView56.setText(R.string.text_08);
                    } else {
                        TextView textView57 = this.tvHour;
                        textView57.setText(R.string.text_8);
                    }
                } else {
                    TextView textView58 = this.tvHour;
                    textView58.setText(R.string.text_20);
                }
                TextView textView59 = this.tvMinute;
                textView59.setText(R.string.text_45);
                Boolean[] boolArr12 = this.optionAMorPMVisibilityArray;
                if (boolArr12[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils95 = this.preferenceUtils;
                    Boolean bool47 = preferenceUtils95.get12or24FormatStyle12();
                    if (bool47.booleanValue()) {
                        LinearLayout linearLayout23 = this.llyAMorPMVisibilityOption;
                        linearLayout23.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout24 = this.llyAMorPMVisibilityOption;
                        linearLayout24.setVisibility(View.GONE);
                    }
                    CheckBox checkBox36 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils96 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle122 = preferenceUtils96.getAMorPMVisibilityStyle12();
                    checkBox36.setChecked(aMorPMVisibilityStyle122.booleanValue());
                    PreferenceUtils preferenceUtils97 = this.preferenceUtils;
                    Boolean bool48 = preferenceUtils97.get12or24FormatStyle12();
                    if (bool48.booleanValue()) {
                        PreferenceUtils preferenceUtils98 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle123 = preferenceUtils98.getAMorPMVisibilityStyle12();
                        if (aMorPMVisibilityStyle123.booleanValue()) {
                            TextView textView60 = this.tvAMorPM;
                            textView60.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox37 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils99 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle123 = preferenceUtils99.getHoursAlwaysAsTwoDigitStyle12();
                checkBox37.setChecked(hoursAlwaysAsTwoDigitStyle123.booleanValue());
                return;
            case 13:
                TextView textView61 = this.tvHour;
                textView61.setText("Eight");
                TextView textView62 = this.tvDelimiter;
                textView62.setText("Forty");
                TextView textView63 = this.tvMinute;
                textView63.setText("Five");
                return;
            case 14:
                CheckBox checkBox38 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils100 = this.preferenceUtils;
                Boolean bool49 = preferenceUtils100.get12or24FormatStyle14();
                checkBox38.setChecked(bool49.booleanValue());
                PreferenceUtils preferenceUtils101 = this.preferenceUtils;
                Boolean bool50 = preferenceUtils101.get12or24FormatStyle14();
                if (bool50.booleanValue()) {
                    PreferenceUtils preferenceUtils102 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle14 = preferenceUtils102.getHoursAlwaysAsTwoDigitStyle14();
                    if (hoursAlwaysAsTwoDigitStyle14.booleanValue()) {
                        TextView textView64 = this.tvHour;
                        textView64.setText(R.string.text_08);
                    } else {
                        TextView textView65 = this.tvHour;
                        textView65.setText(R.string.text_8);
                    }
                } else {
                    TextView textView66 = this.tvHour;
                    textView66.setText(R.string.text_20);
                }
                TextView textView67 = this.tvMinute;
                textView67.setText(R.string.text_45);
                Boolean[] boolArr13 = this.optionAMorPMVisibilityArray;
                if (boolArr13[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils103 = this.preferenceUtils;
                    Boolean bool51 = preferenceUtils103.get12or24FormatStyle14();
                    if (bool51.booleanValue()) {
                        LinearLayout linearLayout25 = this.llyAMorPMVisibilityOption;
                        linearLayout25.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout26 = this.llyAMorPMVisibilityOption;
                        linearLayout26.setVisibility(View.GONE);
                    }
                    CheckBox checkBox39 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils104 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle14 = preferenceUtils104.getAMorPMVisibilityStyle14();
                    checkBox39.setChecked(aMorPMVisibilityStyle14.booleanValue());
                    PreferenceUtils preferenceUtils105 = this.preferenceUtils;
                    Boolean bool52 = preferenceUtils105.get12or24FormatStyle14();
                    if (bool52.booleanValue()) {
                        PreferenceUtils preferenceUtils106 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle142 = preferenceUtils106.getAMorPMVisibilityStyle14();
                        if (aMorPMVisibilityStyle142.booleanValue()) {
                            TextView textView68 = this.tvAMorPM;
                            textView68.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox40 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils107 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle142 = preferenceUtils107.getHoursAlwaysAsTwoDigitStyle14();
                checkBox40.setChecked(hoursAlwaysAsTwoDigitStyle142.booleanValue());
                return;
            case 15:
                CheckBox checkBox41 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils108 = this.preferenceUtils;
                Boolean bool53 = preferenceUtils108.get12or24FormatStyle15();
                checkBox41.setChecked(bool53.booleanValue());
                PreferenceUtils preferenceUtils109 = this.preferenceUtils;
                Boolean bool54 = preferenceUtils109.get12or24FormatStyle15();
                if (bool54.booleanValue()) {
                    PreferenceUtils preferenceUtils110 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle15 = preferenceUtils110.getHoursAlwaysAsTwoDigitStyle15();
                    if (hoursAlwaysAsTwoDigitStyle15.booleanValue()) {
                        TextView textView69 = this.tvHour;
                        textView69.setText(R.string.text_08);
                    } else {
                        TextView textView70 = this.tvHour;
                        textView70.setText(R.string.text_8);
                    }
                } else {
                    TextView textView71 = this.tvHour;
                    textView71.setText(R.string.text_20);
                }
                TextView textView72 = this.tvMinute;
                textView72.setText(R.string.text_45);
                Boolean[] boolArr14 = this.optionAMorPMVisibilityArray;
                if (boolArr14[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils111 = this.preferenceUtils;
                    Boolean bool55 = preferenceUtils111.get12or24FormatStyle15();
                    if (bool55.booleanValue()) {
                        LinearLayout linearLayout27 = this.llyAMorPMVisibilityOption;
                        linearLayout27.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout28 = this.llyAMorPMVisibilityOption;
                        linearLayout28.setVisibility(View.GONE);
                    }
                    CheckBox checkBox42 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils112 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle15 = preferenceUtils112.getAMorPMVisibilityStyle15();
                    checkBox42.setChecked(aMorPMVisibilityStyle15.booleanValue());
                    PreferenceUtils preferenceUtils113 = this.preferenceUtils;
                    Boolean bool56 = preferenceUtils113.get12or24FormatStyle15();
                    if (bool56.booleanValue()) {
                        PreferenceUtils preferenceUtils114 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle152 = preferenceUtils114.getAMorPMVisibilityStyle15();
                        if (aMorPMVisibilityStyle152.booleanValue()) {
                            TextView textView73 = this.tvAMorPM;
                            textView73.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox43 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils115 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle152 = preferenceUtils115.getHoursAlwaysAsTwoDigitStyle15();
                checkBox43.setChecked(hoursAlwaysAsTwoDigitStyle152.booleanValue());
                return;
            case 16:
                CheckBox checkBox44 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils116 = this.preferenceUtils;
                Boolean bool57 = preferenceUtils116.get12or24FormatStyle16();
                checkBox44.setChecked(bool57.booleanValue());
                PreferenceUtils preferenceUtils117 = this.preferenceUtils;
                Boolean bool58 = preferenceUtils117.get12or24FormatStyle16();
                if (bool58.booleanValue()) {
                    PreferenceUtils preferenceUtils118 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle16 = preferenceUtils118.getHoursAlwaysAsTwoDigitStyle16();
                    if (hoursAlwaysAsTwoDigitStyle16.booleanValue()) {
                        TextView textView74 = this.tvHour;
                        textView74.setText(R.string.text_08);
                    } else {
                        TextView textView75 = this.tvHour;
                        textView75.setText(R.string.text_8);
                    }
                } else {
                    TextView textView76 = this.tvHour;
                    textView76.setText(R.string.text_20);
                }
                TextView textView77 = this.tvMinute;
                textView77.setText(R.string.text_45);
                Boolean[] boolArr15 = this.optionAMorPMVisibilityArray;
                if (boolArr15[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils119 = this.preferenceUtils;
                    Boolean bool59 = preferenceUtils119.get12or24FormatStyle16();
                    if (bool59.booleanValue()) {
                        LinearLayout linearLayout29 = this.llyAMorPMVisibilityOption;
                        linearLayout29.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout30 = this.llyAMorPMVisibilityOption;
                        linearLayout30.setVisibility(View.GONE);
                    }
                    CheckBox checkBox45 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils120 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle16 = preferenceUtils120.getAMorPMVisibilityStyle16();
                    checkBox45.setChecked(aMorPMVisibilityStyle16.booleanValue());
                    PreferenceUtils preferenceUtils121 = this.preferenceUtils;
                    Boolean bool60 = preferenceUtils121.get12or24FormatStyle16();
                    if (bool60.booleanValue()) {
                        PreferenceUtils preferenceUtils122 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle162 = preferenceUtils122.getAMorPMVisibilityStyle16();
                        if (aMorPMVisibilityStyle162.booleanValue()) {
                            TextView textView78 = this.tvAMorPM;
                            textView78.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox46 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils123 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle162 = preferenceUtils123.getHoursAlwaysAsTwoDigitStyle16();
                checkBox46.setChecked(hoursAlwaysAsTwoDigitStyle162.booleanValue());
                return;
            case 17:
                CheckBox checkBox47 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils124 = this.preferenceUtils;
                Boolean bool61 = preferenceUtils124.get12or24FormatStyle17();
                checkBox47.setChecked(bool61.booleanValue());
                PreferenceUtils preferenceUtils125 = this.preferenceUtils;
                Boolean bool62 = preferenceUtils125.get12or24FormatStyle17();
                if (bool62.booleanValue()) {
                    PreferenceUtils preferenceUtils126 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle17 = preferenceUtils126.getHoursAlwaysAsTwoDigitStyle17();
                    if (hoursAlwaysAsTwoDigitStyle17.booleanValue()) {
                        TextView textView79 = this.tvHour;
                        textView79.setText(R.string.text_08);
                    } else {
                        TextView textView80 = this.tvHour;
                        textView80.setText(R.string.text_8);
                    }
                } else {
                    TextView textView81 = this.tvHour;
                    textView81.setText(R.string.text_20);
                }
                TextView textView82 = this.tvMinute;
                textView82.setText(":45");
                Boolean[] boolArr16 = this.optionAMorPMVisibilityArray;
                if (boolArr16[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils127 = this.preferenceUtils;
                    Boolean bool63 = preferenceUtils127.get12or24FormatStyle17();
                    if (bool63.booleanValue()) {
                        LinearLayout linearLayout31 = this.llyAMorPMVisibilityOption;
                        linearLayout31.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout32 = this.llyAMorPMVisibilityOption;
                        linearLayout32.setVisibility(View.GONE);
                    }
                    CheckBox checkBox48 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils128 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle17 = preferenceUtils128.getAMorPMVisibilityStyle17();
                    checkBox48.setChecked(aMorPMVisibilityStyle17.booleanValue());
                    PreferenceUtils preferenceUtils129 = this.preferenceUtils;
                    Boolean bool64 = preferenceUtils129.get12or24FormatStyle17();
                    if (bool64.booleanValue()) {
                        PreferenceUtils preferenceUtils130 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle172 = preferenceUtils130.getAMorPMVisibilityStyle17();
                        if (aMorPMVisibilityStyle172.booleanValue()) {
                            TextView textView83 = this.tvAMorPM;
                            textView83.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox49 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils131 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle172 = preferenceUtils131.getHoursAlwaysAsTwoDigitStyle17();
                checkBox49.setChecked(hoursAlwaysAsTwoDigitStyle172.booleanValue());
                return;
            case 18:
                CheckBox checkBox50 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils132 = this.preferenceUtils;
                Boolean bool65 = preferenceUtils132.get12or24FormatStyle18();
                checkBox50.setChecked(bool65.booleanValue());
                PreferenceUtils preferenceUtils133 = this.preferenceUtils;
                Boolean bool66 = preferenceUtils133.get12or24FormatStyle18();
                if (bool66.booleanValue()) {
                    PreferenceUtils preferenceUtils134 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle18 = preferenceUtils134.getHoursAlwaysAsTwoDigitStyle18();
                    if (hoursAlwaysAsTwoDigitStyle18.booleanValue()) {
                        TextView textView84 = this.tvHour;
                        textView84.setText(R.string.text_08);
                    } else {
                        TextView textView85 = this.tvHour;
                        textView85.setText(R.string.text_8);
                    }
                } else {
                    TextView textView86 = this.tvHour;
                    textView86.setText(R.string.text_20);
                }
                TextView textView87 = this.tvMinute;
                textView87.setText(R.string.text_45);
                Boolean[] boolArr17 = this.optionAMorPMVisibilityArray;
                if (boolArr17[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils135 = this.preferenceUtils;
                    Boolean bool67 = preferenceUtils135.get12or24FormatStyle18();
                    if (bool67.booleanValue()) {
                        LinearLayout linearLayout33 = this.llyAMorPMVisibilityOption;
                        linearLayout33.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout34 = this.llyAMorPMVisibilityOption;
                        linearLayout34.setVisibility(View.GONE);
                    }
                    CheckBox checkBox51 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils136 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle18 = preferenceUtils136.getAMorPMVisibilityStyle18();
                    checkBox51.setChecked(aMorPMVisibilityStyle18.booleanValue());
                    PreferenceUtils preferenceUtils137 = this.preferenceUtils;
                    Boolean bool68 = preferenceUtils137.get12or24FormatStyle18();
                    if (bool68.booleanValue()) {
                        PreferenceUtils preferenceUtils138 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle182 = preferenceUtils138.getAMorPMVisibilityStyle18();
                        if (aMorPMVisibilityStyle182.booleanValue()) {
                            TextView textView88 = this.tvAMorPM;
                            textView88.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox52 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils139 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle182 = preferenceUtils139.getHoursAlwaysAsTwoDigitStyle18();
                checkBox52.setChecked(hoursAlwaysAsTwoDigitStyle182.booleanValue());
                return;
            case 19:
                CheckBox checkBox53 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils140 = this.preferenceUtils;
                Boolean bool69 = preferenceUtils140.get12or24FormatStyle19();
                checkBox53.setChecked(bool69.booleanValue());
                PreferenceUtils preferenceUtils141 = this.preferenceUtils;
                Boolean bool70 = preferenceUtils141.get12or24FormatStyle19();
                if (bool70.booleanValue()) {
                    PreferenceUtils preferenceUtils142 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle19 = preferenceUtils142.getHoursAlwaysAsTwoDigitStyle19();
                    if (hoursAlwaysAsTwoDigitStyle19.booleanValue()) {
                        TextView textView89 = this.tvHour;
                        textView89.setText(R.string.text_08);
                    } else {
                        TextView textView90 = this.tvHour;
                        textView90.setText(R.string.text_8);
                    }
                } else {
                    TextView textView91 = this.tvHour;
                    textView91.setText(R.string.text_20);
                }
                TextView textView92 = this.tvMinute;
                textView92.setText(R.string.text_45);
                Boolean[] boolArr18 = this.optionAMorPMVisibilityArray;
                if (boolArr18[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils143 = this.preferenceUtils;
                    Boolean bool71 = preferenceUtils143.get12or24FormatStyle19();
                    if (bool71.booleanValue()) {
                        LinearLayout linearLayout35 = this.llyAMorPMVisibilityOption;
                        linearLayout35.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout36 = this.llyAMorPMVisibilityOption;
                        linearLayout36.setVisibility(View.GONE);
                    }
                    CheckBox checkBox54 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils144 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle19 = preferenceUtils144.getAMorPMVisibilityStyle19();
                    checkBox54.setChecked(aMorPMVisibilityStyle19.booleanValue());
                    PreferenceUtils preferenceUtils145 = this.preferenceUtils;
                    Boolean bool72 = preferenceUtils145.get12or24FormatStyle19();
                    if (bool72.booleanValue()) {
                        PreferenceUtils preferenceUtils146 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle192 = preferenceUtils146.getAMorPMVisibilityStyle19();
                        if (aMorPMVisibilityStyle192.booleanValue()) {
                            TextView textView93 = this.tvAMorPM;
                            textView93.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox55 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils147 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle192 = preferenceUtils147.getHoursAlwaysAsTwoDigitStyle19();
                checkBox55.setChecked(hoursAlwaysAsTwoDigitStyle192.booleanValue());
                return;
            case 20:
                CheckBox checkBox56 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils148 = this.preferenceUtils;
                Boolean bool73 = preferenceUtils148.get12or24FormatStyle20();
                checkBox56.setChecked(bool73.booleanValue());
                PreferenceUtils preferenceUtils149 = this.preferenceUtils;
                Boolean bool74 = preferenceUtils149.get12or24FormatStyle20();
                if (bool74.booleanValue()) {
                    PreferenceUtils preferenceUtils150 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle20 = preferenceUtils150.getHoursAlwaysAsTwoDigitStyle20();
                    if (hoursAlwaysAsTwoDigitStyle20.booleanValue()) {
                        TextView textView94 = this.tvHour;
                        textView94.setText(R.string.text_08);
                    } else {
                        TextView textView95 = this.tvHour;
                        textView95.setText(R.string.text_8);
                    }
                } else {
                    TextView textView96 = this.tvHour;
                    textView96.setText(R.string.text_20);
                }
                TextView textView97 = this.tvMinute;
                textView97.setText(R.string.text_45);
                Boolean[] boolArr19 = this.optionAMorPMVisibilityArray;
                if (boolArr19[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils151 = this.preferenceUtils;
                    Boolean bool75 = preferenceUtils151.get12or24FormatStyle20();
                    if (bool75.booleanValue()) {
                        LinearLayout linearLayout37 = this.llyAMorPMVisibilityOption;
                        linearLayout37.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout38 = this.llyAMorPMVisibilityOption;
                        linearLayout38.setVisibility(View.GONE);
                    }
                    CheckBox checkBox57 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils152 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle20 = preferenceUtils152.getAMorPMVisibilityStyle20();
                    checkBox57.setChecked(aMorPMVisibilityStyle20.booleanValue());
                    PreferenceUtils preferenceUtils153 = this.preferenceUtils;
                    Boolean bool76 = preferenceUtils153.get12or24FormatStyle20();
                    if (bool76.booleanValue()) {
                        PreferenceUtils preferenceUtils154 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle202 = preferenceUtils154.getAMorPMVisibilityStyle20();
                        if (aMorPMVisibilityStyle202.booleanValue()) {
                            TextView textView98 = this.tvAMorPM;
                            textView98.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox58 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils155 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle202 = preferenceUtils155.getHoursAlwaysAsTwoDigitStyle20();
                checkBox58.setChecked(hoursAlwaysAsTwoDigitStyle202.booleanValue());
                return;
            case 21:
                CheckBox checkBox59 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils156 = this.preferenceUtils;
                Boolean bool77 = preferenceUtils156.get12or24FormatStyle21();
                checkBox59.setChecked(bool77.booleanValue());
                PreferenceUtils preferenceUtils157 = this.preferenceUtils;
                Boolean bool78 = preferenceUtils157.get12or24FormatStyle21();
                if (bool78.booleanValue()) {
                    PreferenceUtils preferenceUtils158 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle21 = preferenceUtils158.getHoursAlwaysAsTwoDigitStyle21();
                    if (hoursAlwaysAsTwoDigitStyle21.booleanValue()) {
                        TextView textView99 = this.tvHour;
                        textView99.setText(R.string.text_08);
                    } else {
                        TextView textView100 = this.tvHour;
                        textView100.setText(R.string.text_8);
                    }
                } else {
                    TextView textView101 = this.tvHour;
                    textView101.setText(R.string.text_20);
                }
                TextView textView102 = this.tvMinute;
                textView102.setText(R.string.text_45);
                Boolean[] boolArr20 = this.optionAMorPMVisibilityArray;
                if (boolArr20[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils159 = this.preferenceUtils;
                    Boolean bool79 = preferenceUtils159.get12or24FormatStyle21();
                    if (bool79.booleanValue()) {
                        LinearLayout linearLayout39 = this.llyAMorPMVisibilityOption;
                        linearLayout39.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout40 = this.llyAMorPMVisibilityOption;
                        linearLayout40.setVisibility(View.GONE);
                    }
                    CheckBox checkBox60 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils160 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle21 = preferenceUtils160.getAMorPMVisibilityStyle21();
                    checkBox60.setChecked(aMorPMVisibilityStyle21.booleanValue());
                    PreferenceUtils preferenceUtils161 = this.preferenceUtils;
                    Boolean bool80 = preferenceUtils161.get12or24FormatStyle21();
                    if (bool80.booleanValue()) {
                        PreferenceUtils preferenceUtils162 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle212 = preferenceUtils162.getAMorPMVisibilityStyle21();
                        if (aMorPMVisibilityStyle212.booleanValue()) {
                            TextView textView103 = this.tvAMorPM;
                            textView103.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox61 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils163 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle212 = preferenceUtils163.getHoursAlwaysAsTwoDigitStyle21();
                checkBox61.setChecked(hoursAlwaysAsTwoDigitStyle212.booleanValue());
                return;
            case 22:
                CheckBox checkBox62 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils164 = this.preferenceUtils;
                Boolean bool81 = preferenceUtils164.get12or24FormatStyle22();
                checkBox62.setChecked(bool81.booleanValue());
                PreferenceUtils preferenceUtils165 = this.preferenceUtils;
                Boolean bool82 = preferenceUtils165.get12or24FormatStyle22();
                if (bool82.booleanValue()) {
                    PreferenceUtils preferenceUtils166 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle222 = preferenceUtils166.getHoursAlwaysAsTwoDigitStyle22();
                    if (hoursAlwaysAsTwoDigitStyle222.booleanValue()) {
                        TextView textView104 = this.tvHour;
                        textView104.setText(R.string.text_08);
                    } else {
                        TextView textView105 = this.tvHour;
                        textView105.setText(R.string.text_8);
                    }
                } else {
                    TextView textView106 = this.tvHour;
                    textView106.setText(R.string.text_20);
                }
                TextView textView107 = this.tvMinute;
                textView107.setText(R.string.text_45);
                Boolean[] boolArr21 = this.optionAMorPMVisibilityArray;
                if (boolArr21[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils167 = this.preferenceUtils;
                    Boolean bool83 = preferenceUtils167.get12or24FormatStyle22();
                    if (bool83.booleanValue()) {
                        LinearLayout linearLayout41 = this.llyAMorPMVisibilityOption;
                        linearLayout41.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout42 = this.llyAMorPMVisibilityOption;
                        linearLayout42.setVisibility(View.GONE);
                    }
                    CheckBox checkBox63 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils168 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle222 = preferenceUtils168.getAMorPMVisibilityStyle22();
                    checkBox63.setChecked(aMorPMVisibilityStyle222.booleanValue());
                    PreferenceUtils preferenceUtils169 = this.preferenceUtils;
                    Boolean bool84 = preferenceUtils169.get12or24FormatStyle22();
                    if (bool84.booleanValue()) {
                        PreferenceUtils preferenceUtils170 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle223 = preferenceUtils170.getAMorPMVisibilityStyle22();
                        if (aMorPMVisibilityStyle223.booleanValue()) {
                            TextView textView108 = this.tvAMorPM;
                            textView108.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox64 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils171 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle223 = preferenceUtils171.getHoursAlwaysAsTwoDigitStyle22();
                checkBox64.setChecked(hoursAlwaysAsTwoDigitStyle223.booleanValue());
                return;
            case 23:
                CheckBox checkBox65 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils172 = this.preferenceUtils;
                Boolean bool85 = preferenceUtils172.get12or24FormatStyle23();
                checkBox65.setChecked(bool85.booleanValue());
                PreferenceUtils preferenceUtils173 = this.preferenceUtils;
                Boolean bool86 = preferenceUtils173.get12or24FormatStyle23();
                if (bool86.booleanValue()) {
                    PreferenceUtils preferenceUtils174 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle23 = preferenceUtils174.getHoursAlwaysAsTwoDigitStyle23();
                    if (hoursAlwaysAsTwoDigitStyle23.booleanValue()) {
                        TextView textView109 = this.tvHour;
                        textView109.setText(R.string.text_08);
                    } else {
                        TextView textView110 = this.tvHour;
                        textView110.setText(R.string.text_8);
                    }
                } else {
                    TextView textView111 = this.tvHour;
                    textView111.setText(R.string.text_20);
                }
                TextView textView112 = this.tvMinute;
                textView112.setText(R.string.text_45);
                Boolean[] boolArr22 = this.optionAMorPMVisibilityArray;
                if (boolArr22[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils175 = this.preferenceUtils;
                    Boolean bool87 = preferenceUtils175.get12or24FormatStyle23();
                    if (bool87.booleanValue()) {
                        LinearLayout linearLayout43 = this.llyAMorPMVisibilityOption;
                        linearLayout43.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout44 = this.llyAMorPMVisibilityOption;
                        linearLayout44.setVisibility(View.GONE);
                    }
                    CheckBox checkBox66 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils176 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle23 = preferenceUtils176.getAMorPMVisibilityStyle23();
                    checkBox66.setChecked(aMorPMVisibilityStyle23.booleanValue());
                    PreferenceUtils preferenceUtils177 = this.preferenceUtils;
                    Boolean bool88 = preferenceUtils177.get12or24FormatStyle23();
                    if (bool88.booleanValue()) {
                        PreferenceUtils preferenceUtils178 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle232 = preferenceUtils178.getAMorPMVisibilityStyle23();
                        if (aMorPMVisibilityStyle232.booleanValue()) {
                            TextView textView113 = this.tvAMorPM;
                            textView113.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox67 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils179 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle232 = preferenceUtils179.getHoursAlwaysAsTwoDigitStyle23();
                checkBox67.setChecked(hoursAlwaysAsTwoDigitStyle232.booleanValue());
                return;
            case 24:
                CheckBox checkBox68 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils180 = this.preferenceUtils;
                Boolean bool89 = preferenceUtils180.get12or24FormatStyle24();
                checkBox68.setChecked(bool89.booleanValue());
                PreferenceUtils preferenceUtils181 = this.preferenceUtils;
                Boolean bool90 = preferenceUtils181.get12or24FormatStyle24();
                if (bool90.booleanValue()) {
                    PreferenceUtils preferenceUtils182 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle24 = preferenceUtils182.getHoursAlwaysAsTwoDigitStyle24();
                    if (hoursAlwaysAsTwoDigitStyle24.booleanValue()) {
                        TextView textView114 = this.tvHour;
                        textView114.setText(R.string.text_08);
                    } else {
                        TextView textView115 = this.tvHour;
                        textView115.setText(R.string.text_8);
                    }
                } else {
                    TextView textView116 = this.tvHour;
                    textView116.setText(R.string.text_20);
                }
                TextView textView117 = this.tvMinute;
                textView117.setText(R.string.text_45);
                Boolean[] boolArr23 = this.optionAMorPMVisibilityArray;
                if (boolArr23[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils183 = this.preferenceUtils;
                    Boolean bool91 = preferenceUtils183.get12or24FormatStyle24();
                    if (bool91.booleanValue()) {
                        LinearLayout linearLayout45 = this.llyAMorPMVisibilityOption;
                        linearLayout45.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout46 = this.llyAMorPMVisibilityOption;
                        linearLayout46.setVisibility(View.GONE);
                    }
                    CheckBox checkBox69 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils184 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle24 = preferenceUtils184.getAMorPMVisibilityStyle24();
                    checkBox69.setChecked(aMorPMVisibilityStyle24.booleanValue());
                    PreferenceUtils preferenceUtils185 = this.preferenceUtils;
                    Boolean bool92 = preferenceUtils185.get12or24FormatStyle24();
                    if (bool92.booleanValue()) {
                        PreferenceUtils preferenceUtils186 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle242 = preferenceUtils186.getAMorPMVisibilityStyle24();
                        if (aMorPMVisibilityStyle242.booleanValue()) {
                            TextView textView118 = this.tvAMorPM;
                            textView118.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox70 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils187 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle242 = preferenceUtils187.getHoursAlwaysAsTwoDigitStyle24();
                checkBox70.setChecked(hoursAlwaysAsTwoDigitStyle242.booleanValue());
                return;
            case 25:
                CheckBox checkBox71 = this.cb12or24HourFormat;
                PreferenceUtils preferenceUtils188 = this.preferenceUtils;
                Boolean bool93 = preferenceUtils188.get12or24FormatStyle25();
                checkBox71.setChecked(bool93.booleanValue());
                PreferenceUtils preferenceUtils189 = this.preferenceUtils;
                Boolean bool94 = preferenceUtils189.get12or24FormatStyle25();
                if (bool94.booleanValue()) {
                    PreferenceUtils preferenceUtils190 = this.preferenceUtils;
                    Boolean hoursAlwaysAsTwoDigitStyle25 = preferenceUtils190.getHoursAlwaysAsTwoDigitStyle25();
                    if (hoursAlwaysAsTwoDigitStyle25.booleanValue()) {
                        TextView textView119 = this.tvHour;
                        textView119.setText(R.string.text_08);
                    } else {
                        TextView textView120 = this.tvHour;
                        textView120.setText(R.string.text_8);
                    }
                } else {
                    TextView textView121 = this.tvHour;
                    textView121.setText(R.string.text_20);
                }
                TextView textView122 = this.tvMinute;
                textView122.setText(R.string.text_45);
                Boolean[] boolArr24 = this.optionAMorPMVisibilityArray;
                if (boolArr24[this.widgetStyleNumber - 1].booleanValue()) {
                    PreferenceUtils preferenceUtils191 = this.preferenceUtils;
                    Boolean bool95 = preferenceUtils191.get12or24FormatStyle25();
                    if (bool95.booleanValue()) {
                        LinearLayout linearLayout47 = this.llyAMorPMVisibilityOption;
                        linearLayout47.setVisibility(View.VISIBLE);
                    } else {
                        LinearLayout linearLayout48 = this.llyAMorPMVisibilityOption;
                        linearLayout48.setVisibility(View.GONE);
                    }
                    CheckBox checkBox72 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils192 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle25 = preferenceUtils192.getAMorPMVisibilityStyle25();
                    checkBox72.setChecked(aMorPMVisibilityStyle25.booleanValue());
                    PreferenceUtils preferenceUtils193 = this.preferenceUtils;
                    Boolean bool96 = preferenceUtils193.get12or24FormatStyle25();
                    if (bool96.booleanValue()) {
                        PreferenceUtils preferenceUtils194 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle252 = preferenceUtils194.getAMorPMVisibilityStyle25();
                        if (aMorPMVisibilityStyle252.booleanValue()) {
                            TextView textView123 = this.tvAMorPM;
                            textView123.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox73 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils195 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle252 = preferenceUtils195.getHoursAlwaysAsTwoDigitStyle25();
                checkBox73.setChecked(hoursAlwaysAsTwoDigitStyle252.booleanValue());
                return;
            case 26:

                Boolean bool97 = preferenceUtils.get12or24FormatStyle26();
                cb12or24HourFormat.setChecked(bool97.booleanValue());
                Boolean bool98 = preferenceUtils.get12or24FormatStyle26();

                if (bool98.booleanValue()) {

                    Boolean hoursAlwaysAsTwoDigitStyle26 = preferenceUtils.getHoursAlwaysAsTwoDigitStyle26();
                    if (hoursAlwaysAsTwoDigitStyle26.booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                Boolean[] boolArr25 = this.optionAMorPMVisibilityArray;
                if (boolArr25[this.widgetStyleNumber - 1].booleanValue()) {
                    Boolean bool99 = preferenceUtils.get12or24FormatStyle26();
                    if (bool99.booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    CheckBox checkBox75 = this.cbAMorPMVisibility;
                    PreferenceUtils preferenceUtils200 = this.preferenceUtils;
                    Boolean aMorPMVisibilityStyle26 = preferenceUtils200.getAMorPMVisibilityStyle26();
                    checkBox75.setChecked(aMorPMVisibilityStyle26.booleanValue());
                    PreferenceUtils preferenceUtils201 = this.preferenceUtils;
                    Boolean bool100 = preferenceUtils201.get12or24FormatStyle26();
                    if (bool100.booleanValue()) {
                        PreferenceUtils preferenceUtils202 = this.preferenceUtils;
                        Boolean aMorPMVisibilityStyle262 = preferenceUtils202.getAMorPMVisibilityStyle26();
                        if (aMorPMVisibilityStyle262.booleanValue()) {
                            TextView textView128 = this.tvAMorPM;
                            textView128.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                CheckBox checkBox76 = this.cbHourAlwaysTwoDigits;
                PreferenceUtils preferenceUtils203 = this.preferenceUtils;
                Boolean hoursAlwaysAsTwoDigitStyle262 = preferenceUtils203.getHoursAlwaysAsTwoDigitStyle26();
                checkBox76.setChecked(hoursAlwaysAsTwoDigitStyle262.booleanValue());
                return;
            case 27:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle27().booleanValue());
                if (preferenceUtils.get12or24FormatStyle27().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle27().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle27().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle27().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle27().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle27().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle27().booleanValue());
                return;
            case 28:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle28().booleanValue());
                if (preferenceUtils.get12or24FormatStyle28().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle28().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle28().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle28().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle28().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle28().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle28().booleanValue());
                return;
            case 29:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle29().booleanValue());
                if (preferenceUtils.get12or24FormatStyle29().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle29().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle29().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle29().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle29().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle29().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle29().booleanValue());
                return;
            case 30:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle30().booleanValue());
                if (preferenceUtils.get12or24FormatStyle30().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle30().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle30().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle30().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle30().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle30().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle30().booleanValue());
                return;

            case 31:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle31().booleanValue());
                if (preferenceUtils.get12or24FormatStyle31().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle31().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle31().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle31().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle31().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle31().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle31().booleanValue());
                return;

            case 32:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle32().booleanValue());
                if (preferenceUtils.get12or24FormatStyle32().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle32().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle32().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle32().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle32().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle32().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle32().booleanValue());
                return;

            case 33:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle33().booleanValue());
                if (preferenceUtils.get12or24FormatStyle33().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle33().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle33().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle33().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle33().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle33().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle33().booleanValue());
                return;

            case 34:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle34().booleanValue());
                if (preferenceUtils.get12or24FormatStyle34().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle34().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle34().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle34().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle34().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle34().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle34().booleanValue());
                return;

            case 35:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle35().booleanValue());
                if (preferenceUtils.get12or24FormatStyle35().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle35().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle35().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle35().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle35().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle35().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle35().booleanValue());
                return;

            case 36:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle36().booleanValue());
                if (preferenceUtils.get12or24FormatStyle36().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle36().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle36().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle36().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle36().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle36().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle36().booleanValue());
                return;

            case 37:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle37().booleanValue());
                if (preferenceUtils.get12or24FormatStyle37().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle37().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle37().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle37().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle37().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle37().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle37().booleanValue());
                return;

            case 38:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle38().booleanValue());
                if (preferenceUtils.get12or24FormatStyle38().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle38().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle38().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle38().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle38().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle38().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle38().booleanValue());
                return;

            case 39:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle39().booleanValue());
                if (preferenceUtils.get12or24FormatStyle39().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle39().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle39().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle39().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle39().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle39().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle39().booleanValue());
                return;

            case 40:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle40().booleanValue());
                if (preferenceUtils.get12or24FormatStyle40().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle40().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle40().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle40().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle40().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle40().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle40().booleanValue());
                return;

            case 41:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle41().booleanValue());
                if (preferenceUtils.get12or24FormatStyle41().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle41().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle41().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle41().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle41().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle41().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle41().booleanValue());
                return;

            case 42:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle42().booleanValue());
                if (preferenceUtils.get12or24FormatStyle42().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle42().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle42().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle42().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle42().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle42().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle42().booleanValue());
                return;

            case 43:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle43().booleanValue());
                if (preferenceUtils.get12or24FormatStyle43().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle43().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle43().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle43().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle43().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle43().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle43().booleanValue());
                return;

            case 44:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle44().booleanValue());
                if (preferenceUtils.get12or24FormatStyle44().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle44().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle44().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle44().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle44().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle44().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle44().booleanValue());
                return;
            case 45:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle45().booleanValue());
                if (preferenceUtils.get12or24FormatStyle45().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle45().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle45().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle45().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle45().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle45().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle45().booleanValue());
                return;
            case 46:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle46().booleanValue());
                if (preferenceUtils.get12or24FormatStyle46().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle46().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle46().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle46().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle46().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle46().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle46().booleanValue());
                return;
            case 47:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle47().booleanValue());
                if (preferenceUtils.get12or24FormatStyle47().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle47().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle47().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle47().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle47().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle47().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle47().booleanValue());
                return;
            case 48:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle48().booleanValue());
                if (preferenceUtils.get12or24FormatStyle48().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle48().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle48().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle48().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle48().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle48().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle48().booleanValue());
                return;
            case 49:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle49().booleanValue());
                if (preferenceUtils.get12or24FormatStyle49().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle49().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle49().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle49().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle49().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle49().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle49().booleanValue());
                return;
            case 50:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle50().booleanValue());
                if (preferenceUtils.get12or24FormatStyle50().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle50().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle50().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle50().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle50().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle50().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle50().booleanValue());
                return;
            case 51:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle51().booleanValue());
                if (preferenceUtils.get12or24FormatStyle51().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle51().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle51().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle51().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle51().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle51().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle51().booleanValue());
                return;
            case 52:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle52().booleanValue());
                if (preferenceUtils.get12or24FormatStyle52().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle52().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle52().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle52().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle52().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle52().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle52().booleanValue());
                return;
            case 53:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle53().booleanValue());
                if (preferenceUtils.get12or24FormatStyle53().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle53().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle53().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle53().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle53().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle53().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle53().booleanValue());
                return;
            case 54:
                cb12or24HourFormat.setChecked(preferenceUtils.get12or24FormatStyle54().booleanValue());
                if (preferenceUtils.get12or24FormatStyle54().booleanValue()) {
                    if (preferenceUtils.getHoursAlwaysAsTwoDigitStyle54().booleanValue()) {
                        tvHour.setText(R.string.text_08);
                    } else {
                        tvHour.setText(R.string.text_8);
                    }
                } else {
                    tvHour.setText(R.string.text_20);
                }
                tvMinute.setText(R.string.text_45);
                if (optionAMorPMVisibilityArray[this.widgetStyleNumber - 1].booleanValue()) {
                    if (preferenceUtils.get12or24FormatStyle54().booleanValue()) {
                        llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
                    } else {
                        llyAMorPMVisibilityOption.setVisibility(View.GONE);
                    }
                    cbAMorPMVisibility.setChecked(preferenceUtils.getAMorPMVisibilityStyle54().booleanValue());
                    if (preferenceUtils.get12or24FormatStyle54().booleanValue()) {
                        if (preferenceUtils.getAMorPMVisibilityStyle54().booleanValue()) {
                            tvAMorPM.setVisibility(View.VISIBLE);
                        } else {
                            setAMorPMVisibilityINVISIBLEorGONE();
                        }
                    } else {
                        setAMorPMVisibilityINVISIBLEorGONE();
                    }
                }
                cbHourAlwaysTwoDigits.setChecked(preferenceUtils.getHoursAlwaysAsTwoDigitStyle54().booleanValue());
                return;

            default:
                return;
        }
    }

    public final void setOptionsVisibilityForParticularClockStyle() {
        Boolean[] boolArr = this.option12or24FormatArray;
        if (boolArr[this.widgetStyleNumber - 1].booleanValue()) {
            lly12or24FormatOption.setVisibility(View.VISIBLE);
        } else {
            lly12or24FormatOption.setVisibility(View.GONE);
        }
        Boolean[] boolArr2 = this.optionAMorPMVisibilityArray;
        if (boolArr2[this.widgetStyleNumber - 1].booleanValue()) {
            llyAMorPMVisibilityOption.setVisibility(View.VISIBLE);
        } else {
            llyAMorPMVisibilityOption.setVisibility(View.GONE);
        }
        Boolean[] boolArr3 = this.optionAMorPMColorArray;
        if (boolArr3[this.widgetStyleNumber - 1].booleanValue()) {
            llyAMorPMColorOption.setVisibility(View.VISIBLE);
        } else {
            llyAMorPMColorOption.setVisibility(View.GONE);
        }
        Boolean[] boolArr4 = this.optionDayColorArray;
        if (boolArr4[this.widgetStyleNumber - 1].booleanValue()) {
            llyDayColorOption.setVisibility(View.VISIBLE);
        } else {
            llyDayColorOption.setVisibility(View.GONE);
        }
        Boolean[] boolArr5 = this.optionDateColorArray;
        if (boolArr5[this.widgetStyleNumber - 1].booleanValue()) {
            llyDateColorOption.setVisibility(View.VISIBLE);
        } else {
            llyDateColorOption.setVisibility(View.GONE);
        }
        Boolean[] boolArr6 = this.optionHourAlwaysTwoDigitsArray;
        if (boolArr6[this.widgetStyleNumber - 1].booleanValue()) {
            llyHourAlwaysTwoDigitsOption.setVisibility(View.VISIBLE);
        } else {
            llyHourAlwaysTwoDigitsOption.setVisibility(View.GONE);
        }
        Boolean[] boolArr7 = this.optionTimeBackgroundColorArray;
        if (boolArr7[this.widgetStyleNumber - 1].booleanValue()) {
            llyTimeBackgroundColorOption.setVisibility(View.VISIBLE);
        } else {
            llyTimeBackgroundColorOption.setVisibility(View.GONE);
        }
        Boolean[] boolArr8 = this.optionTimeBackgroundColorArray;
        if (boolArr8[this.widgetStyleNumber - 1].booleanValue()) {
            llyTimeBackgroundColorOption.setVisibility(View.VISIBLE);
        } else {
            llyTimeBackgroundColorOption.setVisibility(View.GONE);
        }
        int i = this.widgetStyleNumber;
        if (i == 5 || i == 17 || i == 23 || i == 29 || i == 37 || i == 41 || i == 42 || i == 43 || i == 52 || i == 51 || i == 50 || i == 49 || i == 46) {
            tvDateColorHeading.setText("Day & Date Color");
            tvDateColorMsg.setText("Select your favorite day & date color");
            return;
        }
        tvDateColorHeading.setText("Date Color");
        tvDateColorMsg.setText("Select your favorite date color");
    }

    private final void setLayoutWidgetCustomizationPreview() {
        switch (this.widgetStyleNumber) {
            case 1:
                viewStub.setLayoutResource(R.layout.clock_style_1);
                viewStub.inflate();
                return;
            case 2:
                viewStub.setLayoutResource(R.layout.clock_style_2);
                viewStub.inflate();
                return;
            case 3:
                viewStub.setLayoutResource(R.layout.clock_style_3);
                viewStub.inflate();
                return;
            case 4:
                viewStub.setLayoutResource(R.layout.clock_style_4);
                viewStub.inflate();
                return;
            case 5:
                viewStub.setLayoutResource(R.layout.clock_style_5);
                viewStub.inflate();
                return;
            case 6:
                viewStub.setLayoutResource(R.layout.clock_style_6);
                viewStub.inflate();
                return;
            case 7:
                viewStub.setLayoutResource(R.layout.clock_style_7);
                viewStub.inflate();
                return;
            case 8:
                viewStub.setLayoutResource(R.layout.clock_style_8);
                viewStub.inflate();
                return;
            case 9:
                viewStub.setLayoutResource(R.layout.clock_style_9);
                viewStub.inflate();
                return;
            case 10:
                viewStub.setLayoutResource(R.layout.clock_style_10);
                viewStub.inflate();
                return;
            case 11:
                viewStub.setLayoutResource(R.layout.clock_style_11);
                viewStub.inflate();
                return;
            case 12:
                viewStub.setLayoutResource(R.layout.clock_style_12);
                viewStub.inflate();
                return;
            case 13:
                viewStub.setLayoutResource(R.layout.clock_style_13);
                viewStub.inflate();
                return;
            case 14:
                viewStub.setLayoutResource(R.layout.clock_style_14);
                viewStub.inflate();
                return;
            case 15:
                viewStub.setLayoutResource(R.layout.clock_style_15);
                viewStub.inflate();
                return;
            case 16:
                viewStub.setLayoutResource(R.layout.clock_style_16);
                viewStub.inflate();
                return;
            case 17:
                viewStub.setLayoutResource(R.layout.clock_style_17);
                viewStub.inflate();
                return;
            case 18:
                viewStub.setLayoutResource(R.layout.clock_style_18);
                viewStub.inflate();
                return;
            case 19:
                viewStub.setLayoutResource(R.layout.clock_style_19);
                viewStub.inflate();
                return;
            case 20:
                viewStub.setLayoutResource(R.layout.clock_style_20);
                viewStub.inflate();
                return;
            case 21:
                viewStub.setLayoutResource(R.layout.clock_style_21);
                viewStub.inflate();
                return;
            case 22:
                llyViewStabContainer.setPadding(40, 0, 40, 0);
                viewStub.setLayoutResource(R.layout.clock_style_22);
                viewStub.inflate();
                return;
            case 23:
                viewStub.setLayoutResource(R.layout.clock_style_23);
                viewStub.inflate();
                return;
            case 24:
                viewStub.setLayoutResource(R.layout.clock_style_24);
                viewStub.inflate();
                return;
            case 25:
                viewStub.setLayoutResource(R.layout.clock_style_25);
                viewStub.inflate();
                return;
            case 26:
                viewStub.setLayoutResource(R.layout.clock_style_26);
                viewStub.inflate();
                return;
            case 27:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_1);
                viewStub.inflate();
                return;
            case 28:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_2);
                viewStub.inflate();
                return;
            case 29:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_3);
                viewStub.inflate();
                return;
            case 30:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_4);
                viewStub.inflate();
                return;
            case 31:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_5);
                viewStub.inflate();
                return;
            case 32:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_6);
                viewStub.inflate();
                return;
            case 33:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_7);
                viewStub.inflate();
                return;
            case 34:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_8);
                viewStub.inflate();
                return;
            case 35:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_9);
                viewStub.inflate();
                return;
            case 36:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_10);
                viewStub.inflate();
                return;
            case 37:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_11);
                viewStub.inflate();
                return;
            case 38:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_12);
                viewStub.inflate();
                return;
            case 39:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_13);
                viewStub.inflate();
                return;
            case 40:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_14);
                viewStub.inflate();
                return;
            case 41:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_15);
                viewStub.inflate();
                return;
            case 42:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_16);
                viewStub.inflate();
                return;
            case 43:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_17);
                viewStub.inflate();
                return;
            case 44:
                viewStub.setLayoutResource(R.layout.ad12_free_clock_18);
                viewStub.inflate();
                return;
            case 45:
                viewStub.setLayoutResource(R.layout.ad12_premium_clock_8);
                viewStub.inflate();
                return;
            case 46:
                viewStub.setLayoutResource(R.layout.ad12_premium_clock_9);
                viewStub.inflate();
                return;
            case 47:
                viewStub.setLayoutResource(R.layout.ad12_premium_clock_10);
                viewStub.inflate();
                return;
            case 48:
                viewStub.setLayoutResource(R.layout.ad12_premium_clock_11);
                viewStub.inflate();
                return;
            case 49:
                viewStub.setLayoutResource(R.layout.ad12_premium_clock_12);
                viewStub.inflate();
                return;
            case 50:
                viewStub.setLayoutResource(R.layout.ad12_premium_clock_13);
                viewStub.inflate();
                return;
            case 51:
                viewStub.setLayoutResource(R.layout.ad12_premium_clock_14);
                viewStub.inflate();
                return;
            case 52:
                viewStub.setLayoutResource(R.layout.ad12_premium_clock_15);
                viewStub.inflate();
                return;
            case 53:
                viewStub.setLayoutResource(R.layout.premium_clock_style_18);
                viewStub.inflate();
                return;
            case 54:
                viewStub.setLayoutResource(R.layout.premium_clock_style_19);
                viewStub.inflate();
                return;


            default:
                return;
        }
    }

    public final void getSavedColorAndApplyToPreviewAndOptionLayout() {
        switch (this.widgetStyleNumber) {
            case 1:
                Integer hoursColorStyle1 = preferenceUtils.getHoursColorStyle1();
                this.colorHours = hoursColorStyle1.intValue();
                Integer minuteColorStyle1 = preferenceUtils.getMinuteColorStyle1();
                this.colorMinute = minuteColorStyle1.intValue();
                Integer aMorPMColorStyle1 = preferenceUtils.getAMorPMColorStyle1();
                this.colorAMorPM = aMorPMColorStyle1.intValue();
                Integer dayColorStyle1 = preferenceUtils.getDayColorStyle1();
                this.colorDay = dayColorStyle1.intValue();
                Integer dateColorStyle1 = preferenceUtils.getDateColorStyle1();
                this.colorDate = dateColorStyle1.intValue();
                return;
            case 2:
                Integer hoursColorStyle2 = preferenceUtils.getHoursColorStyle2();
                this.colorHours = hoursColorStyle2.intValue();
                Integer minuteColorStyle2 = preferenceUtils.getMinuteColorStyle2();
                this.colorMinute = minuteColorStyle2.intValue();
                Integer aMorPMColorStyle2 = preferenceUtils.getAMorPMColorStyle2();
                this.colorAMorPM = aMorPMColorStyle2.intValue();
                Integer dayColorStyle2 = preferenceUtils.getDayColorStyle2();
                this.colorDay = dayColorStyle2.intValue();
                Integer dateColorStyle2 = preferenceUtils.getDateColorStyle2();
                this.colorDate = dateColorStyle2.intValue();
                return;
            case 3:
                Integer hoursColorStyle3 = preferenceUtils.getHoursColorStyle3();
                this.colorHours = hoursColorStyle3.intValue();
                Integer minuteColorStyle3 = preferenceUtils.getMinuteColorStyle3();
                this.colorMinute = minuteColorStyle3.intValue();
                Integer aMorPMColorStyle3 = preferenceUtils.getAMorPMColorStyle3();
                this.colorAMorPM = aMorPMColorStyle3.intValue();
                Integer dayColorStyle3 = preferenceUtils.getDayColorStyle3();
                this.colorDay = dayColorStyle3.intValue();
                Integer dateColorStyle3 = preferenceUtils.getDateColorStyle3();
                this.colorDate = dateColorStyle3.intValue();
                return;
            case 4:
                Integer hoursColorStyle4 = preferenceUtils.getHoursColorStyle4();
                this.colorHours = hoursColorStyle4.intValue();
                Integer minuteColorStyle4 = preferenceUtils.getMinuteColorStyle4();
                this.colorMinute = minuteColorStyle4.intValue();
                Integer aMorPMColorStyle4 = preferenceUtils.getAMorPMColorStyle4();
                this.colorAMorPM = aMorPMColorStyle4.intValue();
                Integer dayColorStyle4 = preferenceUtils.getDayColorStyle4();
                this.colorDay = dayColorStyle4.intValue();
                Integer dateColorStyle4 = preferenceUtils.getDateColorStyle4();
                this.colorDate = dateColorStyle4.intValue();
                return;
            case 5:
                Integer hoursColorStyle5 = preferenceUtils.getHoursColorStyle5();
                this.colorHours = hoursColorStyle5.intValue();
                Integer minuteColorStyle5 = preferenceUtils.getMinuteColorStyle5();
                this.colorMinute = minuteColorStyle5.intValue();
                Integer aMorPMColorStyle5 = preferenceUtils.getAMorPMColorStyle5();
                this.colorAMorPM = aMorPMColorStyle5.intValue();
                Integer dayColorStyle5 = preferenceUtils.getDayColorStyle5();
                this.colorDay = dayColorStyle5.intValue();
                Integer dateColorStyle5 = preferenceUtils.getDateColorStyle5();
                this.colorDate = dateColorStyle5.intValue();
                return;
            case 6:
                Integer hoursColorStyle6 = preferenceUtils.getHoursColorStyle6();
                this.colorHours = hoursColorStyle6.intValue();
                Integer minuteColorStyle6 = preferenceUtils.getMinuteColorStyle6();
                this.colorMinute = minuteColorStyle6.intValue();
                Integer aMorPMColorStyle6 = preferenceUtils.getAMorPMColorStyle6();
                this.colorAMorPM = aMorPMColorStyle6.intValue();
                Integer dayColorStyle6 = preferenceUtils.getDayColorStyle6();
                this.colorDay = dayColorStyle6.intValue();
                Integer dateColorStyle6 = preferenceUtils.getDateColorStyle6();
                this.colorDate = dateColorStyle6.intValue();
                return;
            case 7:
                Integer hoursColorStyle7 = preferenceUtils.getHoursColorStyle7();
                this.colorHours = hoursColorStyle7.intValue();
                Integer minuteColorStyle7 = preferenceUtils.getMinuteColorStyle7();
                this.colorMinute = minuteColorStyle7.intValue();
                Integer aMorPMColorStyle7 = preferenceUtils.getAMorPMColorStyle7();
                this.colorAMorPM = aMorPMColorStyle7.intValue();
                Integer dayColorStyle7 = preferenceUtils.getDayColorStyle7();
                this.colorDay = dayColorStyle7.intValue();
                Integer dateColorStyle7 = preferenceUtils.getDateColorStyle7();
                this.colorDate = dateColorStyle7.intValue();
                return;
            case 8:
                Integer hoursColorStyle8 = preferenceUtils.getHoursColorStyle8();
                this.colorHours = hoursColorStyle8.intValue();
                Integer minuteColorStyle8 = preferenceUtils.getMinuteColorStyle8();
                this.colorMinute = minuteColorStyle8.intValue();
                Integer aMorPMColorStyle8 = preferenceUtils.getAMorPMColorStyle8();
                this.colorAMorPM = aMorPMColorStyle8.intValue();
                Integer dayColorStyle8 = preferenceUtils.getDayColorStyle8();
                this.colorDay = dayColorStyle8.intValue();
                Integer dateColorStyle8 = preferenceUtils.getDateColorStyle8();
                this.colorDate = dateColorStyle8.intValue();
                return;
            case 9:
                Integer hoursColorStyle9 = preferenceUtils.getHoursColorStyle9();
                this.colorHours = hoursColorStyle9.intValue();
                Integer minuteColorStyle9 = preferenceUtils.getMinuteColorStyle9();
                this.colorMinute = minuteColorStyle9.intValue();
                Integer aMorPMColorStyle9 = preferenceUtils.getAMorPMColorStyle9();
                this.colorAMorPM = aMorPMColorStyle9.intValue();
                Integer dayColorStyle9 = preferenceUtils.getDayColorStyle9();
                this.colorDay = dayColorStyle9.intValue();
                Integer dateColorStyle9 = preferenceUtils.getDateColorStyle9();
                this.colorDate = dateColorStyle9.intValue();
                return;
            case 10:
                Integer hoursColorStyle10 = preferenceUtils.getHoursColorStyle10();
                this.colorHours = hoursColorStyle10.intValue();
                Integer minuteColorStyle10 = preferenceUtils.getMinuteColorStyle10();
                this.colorMinute = minuteColorStyle10.intValue();
                Integer aMorPMColorStyle10 = preferenceUtils.getAMorPMColorStyle10();
                this.colorAMorPM = aMorPMColorStyle10.intValue();
                Integer dayColorStyle10 = preferenceUtils.getDayColorStyle10();
                this.colorDay = dayColorStyle10.intValue();
                Integer dateColorStyle10 = preferenceUtils.getDateColorStyle10();
                this.colorDate = dateColorStyle10.intValue();
                return;
            case 11:
                Integer hoursColorStyle11 = preferenceUtils.getHoursColorStyle11();
                this.colorHours = hoursColorStyle11.intValue();
                Integer minuteColorStyle11 = preferenceUtils.getMinuteColorStyle11();
                this.colorMinute = minuteColorStyle11.intValue();
                Integer aMorPMColorStyle11 = preferenceUtils.getAMorPMColorStyle11();
                this.colorAMorPM = aMorPMColorStyle11.intValue();
                Integer dayColorStyle11 = preferenceUtils.getDayColorStyle11();
                this.colorDay = dayColorStyle11.intValue();
                Integer dateColorStyle11 = preferenceUtils.getDateColorStyle11();
                this.colorDate = dateColorStyle11.intValue();
                return;
            case 12:
                Integer hoursColorStyle12 = preferenceUtils.getHoursColorStyle12();
                this.colorHours = hoursColorStyle12.intValue();
                Integer minuteColorStyle12 = preferenceUtils.getMinuteColorStyle12();
                this.colorMinute = minuteColorStyle12.intValue();
                Integer aMorPMColorStyle12 = preferenceUtils.getAMorPMColorStyle12();
                this.colorAMorPM = aMorPMColorStyle12.intValue();
                Integer dayColorStyle12 = preferenceUtils.getDayColorStyle12();
                this.colorDay = dayColorStyle12.intValue();
                Integer dateColorStyle12 = preferenceUtils.getDateColorStyle12();
                this.colorDate = dateColorStyle12.intValue();
                return;
            case 13:
                Integer hoursColorStyle13 = preferenceUtils.getHoursColorStyle13();
                this.colorHours = hoursColorStyle13.intValue();
                Integer minuteColorStyle13 = preferenceUtils.getMinuteColorStyle13();
                this.colorMinute = minuteColorStyle13.intValue();
                Integer aMorPMColorStyle13 = preferenceUtils.getAMorPMColorStyle13();
                this.colorAMorPM = aMorPMColorStyle13.intValue();
                Integer dayColorStyle13 = preferenceUtils.getDayColorStyle13();
                this.colorDay = dayColorStyle13.intValue();
                Integer dateColorStyle13 = preferenceUtils.getDateColorStyle13();
                this.colorDate = dateColorStyle13.intValue();
                return;
            case 14:
                Integer hoursColorStyle14 = preferenceUtils.getHoursColorStyle14();
                this.colorHours = hoursColorStyle14.intValue();
                Integer minuteColorStyle14 = preferenceUtils.getMinuteColorStyle14();
                this.colorMinute = minuteColorStyle14.intValue();
                Integer aMorPMColorStyle14 = preferenceUtils.getAMorPMColorStyle14();
                this.colorAMorPM = aMorPMColorStyle14.intValue();
                Integer dayColorStyle14 = preferenceUtils.getDayColorStyle14();
                this.colorDay = dayColorStyle14.intValue();
                Integer dateColorStyle14 = preferenceUtils.getDateColorStyle14();
                this.colorDate = dateColorStyle14.intValue();
                return;
            case 15:
                Integer hoursColorStyle15 = preferenceUtils.getHoursColorStyle15();
                this.colorHours = hoursColorStyle15.intValue();
                Integer minuteColorStyle15 = preferenceUtils.getMinuteColorStyle15();
                this.colorMinute = minuteColorStyle15.intValue();
                Integer aMorPMColorStyle15 = preferenceUtils.getAMorPMColorStyle15();
                this.colorAMorPM = aMorPMColorStyle15.intValue();
                Integer dayColorStyle15 = preferenceUtils.getDayColorStyle15();
                this.colorDay = dayColorStyle15.intValue();
                Integer dateColorStyle15 = preferenceUtils.getDateColorStyle15();
                this.colorDate = dateColorStyle15.intValue();
                return;
            case 16:
                Integer hoursColorStyle16 = preferenceUtils.getHoursColorStyle16();
                this.colorHours = hoursColorStyle16.intValue();
                Integer minuteColorStyle16 = preferenceUtils.getMinuteColorStyle16();
                this.colorMinute = minuteColorStyle16.intValue();
                Integer aMorPMColorStyle16 = preferenceUtils.getAMorPMColorStyle16();
                this.colorAMorPM = aMorPMColorStyle16.intValue();
                Integer dayColorStyle16 = preferenceUtils.getDayColorStyle16();
                this.colorDay = dayColorStyle16.intValue();
                Integer dateColorStyle16 = preferenceUtils.getDateColorStyle16();
                this.colorDate = dateColorStyle16.intValue();
                return;
            case 17:
                Integer hoursColorStyle17 = preferenceUtils.getHoursColorStyle17();
                this.colorHours = hoursColorStyle17.intValue();
                Integer minuteColorStyle17 = preferenceUtils.getMinuteColorStyle17();
                this.colorMinute = minuteColorStyle17.intValue();
                Integer aMorPMColorStyle17 = preferenceUtils.getAMorPMColorStyle17();
                this.colorAMorPM = aMorPMColorStyle17.intValue();
                Integer dayColorStyle17 = preferenceUtils.getDayColorStyle17();
                this.colorDay = dayColorStyle17.intValue();
                Integer dateColorStyle17 = preferenceUtils.getDateColorStyle17();
                this.colorDate = dateColorStyle17.intValue();
                return;
            case 18:
                Integer hoursColorStyle18 = preferenceUtils.getHoursColorStyle18();
                this.colorHours = hoursColorStyle18.intValue();
                Integer minuteColorStyle18 = preferenceUtils.getMinuteColorStyle18();
                this.colorMinute = minuteColorStyle18.intValue();
                Integer aMorPMColorStyle18 = preferenceUtils.getAMorPMColorStyle18();
                this.colorAMorPM = aMorPMColorStyle18.intValue();
                Integer dayColorStyle18 = preferenceUtils.getDayColorStyle18();
                this.colorDay = dayColorStyle18.intValue();
                Integer dateColorStyle18 = preferenceUtils.getDateColorStyle18();
                this.colorDate = dateColorStyle18.intValue();
                Integer timeBackgroundColorStyle18 = preferenceUtils.getTimeBackgroundColorStyle18();
                this.colorTimeBackground = timeBackgroundColorStyle18.intValue();
                return;
            case 19:
                Integer hoursColorStyle19 = preferenceUtils.getHoursColorStyle19();
                this.colorHours = hoursColorStyle19.intValue();
                Integer minuteColorStyle19 = preferenceUtils.getMinuteColorStyle19();
                this.colorMinute = minuteColorStyle19.intValue();
                Integer aMorPMColorStyle19 = preferenceUtils.getAMorPMColorStyle19();
                this.colorAMorPM = aMorPMColorStyle19.intValue();
                Integer dayColorStyle19 = preferenceUtils.getDayColorStyle19();
                this.colorDay = dayColorStyle19.intValue();
                Integer dateColorStyle19 = preferenceUtils.getDateColorStyle19();
                this.colorDate = dateColorStyle19.intValue();
                return;
            case 20:
                Integer hoursColorStyle20 = preferenceUtils.getHoursColorStyle20();
                this.colorHours = hoursColorStyle20.intValue();
                Integer minuteColorStyle20 = preferenceUtils.getMinuteColorStyle20();
                this.colorMinute = minuteColorStyle20.intValue();
                Integer aMorPMColorStyle20 = preferenceUtils.getAMorPMColorStyle20();
                this.colorAMorPM = aMorPMColorStyle20.intValue();
                Integer dayColorStyle20 = preferenceUtils.getDayColorStyle20();
                this.colorDay = dayColorStyle20.intValue();
                Integer dateColorStyle20 = preferenceUtils.getDateColorStyle20();
                this.colorDate = dateColorStyle20.intValue();
                return;
            case 21:
                Integer hoursColorStyle21 = preferenceUtils.getHoursColorStyle21();
                this.colorHours = hoursColorStyle21.intValue();
                Integer minuteColorStyle21 = preferenceUtils.getMinuteColorStyle21();
                this.colorMinute = minuteColorStyle21.intValue();
                Integer aMorPMColorStyle21 = preferenceUtils.getAMorPMColorStyle21();
                this.colorAMorPM = aMorPMColorStyle21.intValue();
                Integer dayColorStyle21 = preferenceUtils.getDayColorStyle21();
                this.colorDay = dayColorStyle21.intValue();
                Integer dateColorStyle21 = preferenceUtils.getDateColorStyle21();
                this.colorDate = dateColorStyle21.intValue();
                return;
            case 22:
                Integer hoursColorStyle22 = preferenceUtils.getHoursColorStyle22();
                this.colorHours = hoursColorStyle22.intValue();
                Integer minuteColorStyle22 = preferenceUtils.getMinuteColorStyle22();
                this.colorMinute = minuteColorStyle22.intValue();
                Integer aMorPMColorStyle22 = preferenceUtils.getAMorPMColorStyle22();
                this.colorAMorPM = aMorPMColorStyle22.intValue();
                Integer dayColorStyle22 = preferenceUtils.getDayColorStyle22();
                this.colorDay = dayColorStyle22.intValue();
                Integer dateColorStyle22 = preferenceUtils.getDateColorStyle22();
                this.colorDate = dateColorStyle22.intValue();
                Integer timeBackgroundColorStyle22 = preferenceUtils.getTimeBackgroundColorStyle22();
                this.colorTimeBackground = timeBackgroundColorStyle22.intValue();
                return;
            case 23:
                Integer hoursColorStyle23 = preferenceUtils.getHoursColorStyle23();
                this.colorHours = hoursColorStyle23.intValue();
                Integer minuteColorStyle23 = preferenceUtils.getMinuteColorStyle23();
                this.colorMinute = minuteColorStyle23.intValue();
                Integer aMorPMColorStyle23 = preferenceUtils.getAMorPMColorStyle23();
                this.colorAMorPM = aMorPMColorStyle23.intValue();
                Integer dayColorStyle23 = preferenceUtils.getDayColorStyle23();
                this.colorDay = dayColorStyle23.intValue();
                Integer dateColorStyle23 = preferenceUtils.getDateColorStyle23();
                this.colorDate = dateColorStyle23.intValue();
                return;
            case 24:
                Integer hoursColorStyle24 = preferenceUtils.getHoursColorStyle24();
                this.colorHours = hoursColorStyle24.intValue();
                Integer minuteColorStyle24 = preferenceUtils.getMinuteColorStyle24();
                this.colorMinute = minuteColorStyle24.intValue();
                Integer aMorPMColorStyle24 = preferenceUtils.getAMorPMColorStyle24();
                this.colorAMorPM = aMorPMColorStyle24.intValue();
                Integer dayColorStyle24 = preferenceUtils.getDayColorStyle24();
                this.colorDay = dayColorStyle24.intValue();
                Integer dateColorStyle24 = preferenceUtils.getDateColorStyle24();
                this.colorDate = dateColorStyle24.intValue();
                Integer timeBackgroundColorStyle24 = preferenceUtils.getTimeBackgroundColorStyle24();
                this.colorTimeBackground = timeBackgroundColorStyle24.intValue();
                return;
            case 25:
                Integer hoursColorStyle25 = preferenceUtils.getHoursColorStyle25();
                this.colorHours = hoursColorStyle25.intValue();
                Integer minuteColorStyle25 = preferenceUtils.getMinuteColorStyle25();
                this.colorMinute = minuteColorStyle25.intValue();
                Integer aMorPMColorStyle25 = preferenceUtils.getAMorPMColorStyle25();
                this.colorAMorPM = aMorPMColorStyle25.intValue();
                Integer dayColorStyle25 = preferenceUtils.getDayColorStyle25();
                this.colorDay = dayColorStyle25.intValue();
                Integer dateColorStyle25 = preferenceUtils.getDateColorStyle25();
                this.colorDate = dateColorStyle25.intValue();
                return;
            case 26:
                Integer hoursColorStyle26 = preferenceUtils.getHoursColorStyle26();
                this.colorHours = hoursColorStyle26.intValue();
                Integer minuteColorStyle26 = preferenceUtils.getMinuteColorStyle26();
                this.colorMinute = minuteColorStyle26.intValue();
                Integer aMorPMColorStyle26 = preferenceUtils.getAMorPMColorStyle26();
                this.colorAMorPM = aMorPMColorStyle26.intValue();
                Integer dayColorStyle26 = preferenceUtils.getDayColorStyle26();
                this.colorDay = dayColorStyle26.intValue();
                Integer dateColorStyle26 = preferenceUtils.getDateColorStyle26();
                this.colorDate = dateColorStyle26.intValue();
                return;
            case 27:
                Integer hoursColorStyle27 = preferenceUtils.getHoursColorStyle27();
                this.colorHours = hoursColorStyle27.intValue();
                Integer minuteColorStyle27 = preferenceUtils.getMinuteColorStyle27();
                this.colorMinute = minuteColorStyle27.intValue();
                Integer aMorPMColorStyle27 = preferenceUtils.getAMorPMColorStyle27();
                this.colorAMorPM = aMorPMColorStyle27.intValue();
                Integer dayColorStyle27 = preferenceUtils.getDayColorStyle27();
                this.colorDay = dayColorStyle27.intValue();
                Integer dateColorStyle27 = preferenceUtils.getDateColorStyle27();
                this.colorDate = dateColorStyle27.intValue();
                return;
            case 28:
                Integer hoursColorStyle28 = preferenceUtils.getHoursColorStyle28();
                this.colorHours = hoursColorStyle28.intValue();
                Integer minuteColorStyle28 = preferenceUtils.getMinuteColorStyle28();
                this.colorMinute = minuteColorStyle28.intValue();
                Integer aMorPMColorStyle28 = preferenceUtils.getAMorPMColorStyle28();
                this.colorAMorPM = aMorPMColorStyle28.intValue();
                Integer dayColorStyle28 = preferenceUtils.getDayColorStyle28();
                this.colorDay = dayColorStyle28.intValue();
                Integer dateColorStyle28 = preferenceUtils.getDateColorStyle28();
                this.colorDate = dateColorStyle28.intValue();
                return;
            case 29:
                Integer hoursColorStyle29 = preferenceUtils.getHoursColorStyle29();
                this.colorHours = hoursColorStyle29.intValue();
                Integer minuteColorStyle29 = preferenceUtils.getMinuteColorStyle29();
                this.colorMinute = minuteColorStyle29.intValue();
                Integer aMorPMColorStyle29 = preferenceUtils.getAMorPMColorStyle29();
                this.colorAMorPM = aMorPMColorStyle29.intValue();
                Integer dayColorStyle29 = preferenceUtils.getDayColorStyle29();
                this.colorDay = dayColorStyle29.intValue();
                Integer dateColorStyle29 = preferenceUtils.getDateColorStyle29();
                this.colorDate = dateColorStyle29.intValue();
                return;
            case 30:
                Integer hoursColorStyle30 = preferenceUtils.getHoursColorStyle30();
                this.colorHours = hoursColorStyle30.intValue();
                Integer minuteColorStyle30 = preferenceUtils.getMinuteColorStyle30();
                this.colorMinute = minuteColorStyle30.intValue();
                Integer aMorPMColorStyle30 = preferenceUtils.getAMorPMColorStyle30();
                this.colorAMorPM = aMorPMColorStyle30.intValue();
                Integer dayColorStyle30 = preferenceUtils.getDayColorStyle30();
                this.colorDay = dayColorStyle30.intValue();
                Integer dateColorStyle30 = preferenceUtils.getDateColorStyle30();
                this.colorDate = dateColorStyle30.intValue();
                return;
            case 31:
                Integer hoursColorStyle31 = preferenceUtils.getHoursColorStyle31();
                this.colorHours = hoursColorStyle31.intValue();
                Integer minuteColorStyle31 = preferenceUtils.getMinuteColorStyle31();
                this.colorMinute = minuteColorStyle31.intValue();
                Integer aMorPMColorStyle31 = preferenceUtils.getAMorPMColorStyle31();
                this.colorAMorPM = aMorPMColorStyle31.intValue();
                Integer dayColorStyle31 = preferenceUtils.getDayColorStyle31();
                this.colorDay = dayColorStyle31.intValue();
                Integer dateColorStyle31 = preferenceUtils.getDateColorStyle31();
                this.colorDate = dateColorStyle31.intValue();
                return;
            case 32:
                Integer hoursColorStyle32 = preferenceUtils.getHoursColorStyle32();
                this.colorHours = hoursColorStyle32.intValue();
                Integer minuteColorStyle32 = preferenceUtils.getMinuteColorStyle32();
                this.colorMinute = minuteColorStyle32.intValue();
                Integer aMorPMColorStyle32 = preferenceUtils.getAMorPMColorStyle32();
                this.colorAMorPM = aMorPMColorStyle32.intValue();
                Integer dayColorStyle32 = preferenceUtils.getDayColorStyle32();
                this.colorDay = dayColorStyle32.intValue();
                Integer dateColorStyle32 = preferenceUtils.getDateColorStyle32();
                this.colorDate = dateColorStyle32.intValue();
                return;
            case 33:
                Integer hoursColorStyle33 = preferenceUtils.getHoursColorStyle33();
                this.colorHours = hoursColorStyle33.intValue();
                Integer minuteColorStyle33 = preferenceUtils.getMinuteColorStyle33();
                this.colorMinute = minuteColorStyle33.intValue();
                Integer aMorPMColorStyle33 = preferenceUtils.getAMorPMColorStyle33();
                this.colorAMorPM = aMorPMColorStyle33.intValue();
                Integer dayColorStyle33 = preferenceUtils.getDayColorStyle33();
                this.colorDay = dayColorStyle33.intValue();
                Integer dateColorStyle33 = preferenceUtils.getDateColorStyle33();
                this.colorDate = dateColorStyle33.intValue();
                return;
            case 34:
                Integer hoursColorStyle34 = preferenceUtils.getHoursColorStyle34();
                this.colorHours = hoursColorStyle34.intValue();
                Integer minuteColorStyle34 = preferenceUtils.getMinuteColorStyle34();
                this.colorMinute = minuteColorStyle34.intValue();
                Integer aMorPMColorStyle34 = preferenceUtils.getAMorPMColorStyle34();
                this.colorAMorPM = aMorPMColorStyle34.intValue();
                Integer dayColorStyle34 = preferenceUtils.getDayColorStyle34();
                this.colorDay = dayColorStyle34.intValue();
                Integer dateColorStyle34 = preferenceUtils.getDateColorStyle34();
                this.colorDate = dateColorStyle34.intValue();
                return;
            case 35:
                Integer hoursColorStyle35 = preferenceUtils.getHoursColorStyle35();
                this.colorHours = hoursColorStyle35.intValue();
                Integer minuteColorStyle35 = preferenceUtils.getMinuteColorStyle35();
                this.colorMinute = minuteColorStyle35.intValue();
                Integer aMorPMColorStyle35 = preferenceUtils.getAMorPMColorStyle35();
                this.colorAMorPM = aMorPMColorStyle35.intValue();
                Integer dayColorStyle35 = preferenceUtils.getDayColorStyle35();
                this.colorDay = dayColorStyle35.intValue();
                Integer dateColorStyle35 = preferenceUtils.getDateColorStyle35();
                this.colorDate = dateColorStyle35.intValue();
                return;
            case 36:
                Integer hoursColorStyle36 = preferenceUtils.getHoursColorStyle36();
                this.colorHours = hoursColorStyle36.intValue();
                Integer minuteColorStyle36 = preferenceUtils.getMinuteColorStyle36();
                this.colorMinute = minuteColorStyle36.intValue();
                Integer aMorPMColorStyle36 = preferenceUtils.getAMorPMColorStyle36();
                this.colorAMorPM = aMorPMColorStyle36.intValue();
                Integer dayColorStyle36 = preferenceUtils.getDayColorStyle36();
                this.colorDay = dayColorStyle36.intValue();
                Integer dateColorStyle36 = preferenceUtils.getDateColorStyle36();
                this.colorDate = dateColorStyle36.intValue();
                return;
            case 37:
                Integer hoursColorStyle37 = preferenceUtils.getHoursColorStyle37();
                this.colorHours = hoursColorStyle37.intValue();
                Integer minuteColorStyle37 = preferenceUtils.getMinuteColorStyle37();
                this.colorMinute = minuteColorStyle37.intValue();
                Integer aMorPMColorStyle37 = preferenceUtils.getAMorPMColorStyle37();
                this.colorAMorPM = aMorPMColorStyle37.intValue();
                Integer dayColorStyle37 = preferenceUtils.getDayColorStyle37();
                this.colorDay = dayColorStyle37.intValue();
                Integer dateColorStyle37 = preferenceUtils.getDateColorStyle37();
                this.colorDate = dateColorStyle37.intValue();
                return;
            case 38:
                Integer hoursColorStyle38 = preferenceUtils.getHoursColorStyle38();
                this.colorHours = hoursColorStyle38.intValue();
                Integer minuteColorStyle38 = preferenceUtils.getMinuteColorStyle38();
                this.colorMinute = minuteColorStyle38.intValue();
                Integer aMorPMColorStyle38 = preferenceUtils.getAMorPMColorStyle38();
                this.colorAMorPM = aMorPMColorStyle38.intValue();
                Integer dayColorStyle38 = preferenceUtils.getDayColorStyle38();
                this.colorDay = dayColorStyle38.intValue();
                Integer dateColorStyle38 = preferenceUtils.getDateColorStyle38();
                this.colorDate = dateColorStyle38.intValue();
                return;
            case 39:
                Integer hoursColorStyle39 = preferenceUtils.getHoursColorStyle39();
                this.colorHours = hoursColorStyle39.intValue();
                Integer minuteColorStyle39 = preferenceUtils.getMinuteColorStyle39();
                this.colorMinute = minuteColorStyle39.intValue();
                Integer aMorPMColorStyle39 = preferenceUtils.getAMorPMColorStyle39();
                this.colorAMorPM = aMorPMColorStyle39.intValue();
                Integer dayColorStyle39 = preferenceUtils.getDayColorStyle39();
                this.colorDay = dayColorStyle39.intValue();
                Integer dateColorStyle39 = preferenceUtils.getDateColorStyle39();
                this.colorDate = dateColorStyle39.intValue();
                return;
            case 40:
                Integer hoursColorStyle40 = preferenceUtils.getHoursColorStyle40();
                this.colorHours = hoursColorStyle40.intValue();
                Integer minuteColorStyle40 = preferenceUtils.getMinuteColorStyle40();
                this.colorMinute = minuteColorStyle40.intValue();
                Integer aMorPMColorStyle40 = preferenceUtils.getAMorPMColorStyle40();
                this.colorAMorPM = aMorPMColorStyle40.intValue();
                Integer dayColorStyle40 = preferenceUtils.getDayColorStyle40();
                this.colorDay = dayColorStyle40.intValue();
                Integer dateColorStyle40 = preferenceUtils.getDateColorStyle40();
                this.colorDate = dateColorStyle40.intValue();
                return;
            case 41:
                Integer hoursColorStyle41 = preferenceUtils.getHoursColorStyle41();
                this.colorHours = hoursColorStyle41.intValue();
                Integer minuteColorStyle41 = preferenceUtils.getMinuteColorStyle41();
                this.colorMinute = minuteColorStyle41.intValue();
                Integer aMorPMColorStyle41 = preferenceUtils.getAMorPMColorStyle41();
                this.colorAMorPM = aMorPMColorStyle41.intValue();
                Integer dayColorStyle41 = preferenceUtils.getDayColorStyle41();
                this.colorDay = dayColorStyle41.intValue();
                Integer dateColorStyle41 = preferenceUtils.getDateColorStyle41();
                this.colorDate = dateColorStyle41.intValue();
                return;
            case 42:
                Integer hoursColorStyle42 = preferenceUtils.getHoursColorStyle42();
                this.colorHours = hoursColorStyle42.intValue();
                Integer minuteColorStyle42 = preferenceUtils.getMinuteColorStyle42();
                this.colorMinute = minuteColorStyle42.intValue();
                Integer aMorPMColorStyle42 = preferenceUtils.getAMorPMColorStyle42();
                this.colorAMorPM = aMorPMColorStyle42.intValue();
                Integer dayColorStyle42 = preferenceUtils.getDayColorStyle42();
                this.colorDay = dayColorStyle42.intValue();
                Integer dateColorStyle42 = preferenceUtils.getDateColorStyle42();
                this.colorDate = dateColorStyle42.intValue();
                return;
            case 43:
                Integer hoursColorStyle43 = preferenceUtils.getHoursColorStyle43();
                this.colorHours = hoursColorStyle43.intValue();
                Integer minuteColorStyle43 = preferenceUtils.getMinuteColorStyle43();
                this.colorMinute = minuteColorStyle43.intValue();
                Integer aMorPMColorStyle43 = preferenceUtils.getAMorPMColorStyle43();
                this.colorAMorPM = aMorPMColorStyle43.intValue();
                Integer dayColorStyle43 = preferenceUtils.getDayColorStyle43();
                this.colorDay = dayColorStyle43.intValue();
                Integer dateColorStyle43 = preferenceUtils.getDateColorStyle43();
                this.colorDate = dateColorStyle43.intValue();
                return;
            case 44:
                Integer hoursColorStyle44 = preferenceUtils.getHoursColorStyle44();
                this.colorHours = hoursColorStyle44.intValue();
                Integer minuteColorStyle44 = preferenceUtils.getMinuteColorStyle44();
                this.colorMinute = minuteColorStyle44.intValue();
                Integer aMorPMColorStyle44 = preferenceUtils.getAMorPMColorStyle44();
                this.colorAMorPM = aMorPMColorStyle44.intValue();
                Integer dayColorStyle44 = preferenceUtils.getDayColorStyle44();
                this.colorDay = dayColorStyle44.intValue();
                Integer dateColorStyle44 = preferenceUtils.getDateColorStyle44();
                this.colorDate = dateColorStyle44.intValue();
                return;
            case 45:
                Integer hoursColorStyle45 = preferenceUtils.getHoursColorStyle45();
                this.colorHours = hoursColorStyle45.intValue();
                Integer minuteColorStyle45 = preferenceUtils.getMinuteColorStyle45();
                this.colorMinute = minuteColorStyle45.intValue();
                Integer aMorPMColorStyle45 = preferenceUtils.getAMorPMColorStyle45();
                this.colorAMorPM = aMorPMColorStyle45.intValue();
                Integer dayColorStyle45 = preferenceUtils.getDayColorStyle45();
                this.colorDay = dayColorStyle45.intValue();
                Integer dateColorStyle45 = preferenceUtils.getDateColorStyle45();
                this.colorDate = dateColorStyle45.intValue();
                return;
            case 46:
                Integer hoursColorStyle46 = preferenceUtils.getHoursColorStyle46();
                this.colorHours = hoursColorStyle46.intValue();
                Integer minuteColorStyle46 = preferenceUtils.getMinuteColorStyle46();
                this.colorMinute = minuteColorStyle46.intValue();
                Integer aMorPMColorStyle46 = preferenceUtils.getAMorPMColorStyle46();
                this.colorAMorPM = aMorPMColorStyle46.intValue();
                Integer dayColorStyle46 = preferenceUtils.getDayColorStyle46();
                this.colorDay = dayColorStyle46.intValue();
                Integer dateColorStyle46 = preferenceUtils.getDateColorStyle46();
                this.colorDate = dateColorStyle46.intValue();
                return;
            case 47:
                Integer hoursColorStyle47 = preferenceUtils.getHoursColorStyle47();
                this.colorHours = hoursColorStyle47.intValue();
                Integer minuteColorStyle47 = preferenceUtils.getMinuteColorStyle47();
                this.colorMinute = minuteColorStyle47.intValue();
                Integer aMorPMColorStyle47 = preferenceUtils.getAMorPMColorStyle47();
                this.colorAMorPM = aMorPMColorStyle47.intValue();
                Integer dayColorStyle47 = preferenceUtils.getDayColorStyle47();
                this.colorDay = dayColorStyle47.intValue();
                Integer dateColorStyle47 = preferenceUtils.getDateColorStyle47();
                this.colorDate = dateColorStyle47.intValue();
                return;
            case 48:
                Integer hoursColorStyle48 = preferenceUtils.getHoursColorStyle48();
                this.colorHours = hoursColorStyle48.intValue();
                Integer minuteColorStyle48 = preferenceUtils.getMinuteColorStyle48();
                this.colorMinute = minuteColorStyle48.intValue();
                Integer aMorPMColorStyle48 = preferenceUtils.getAMorPMColorStyle48();
                this.colorAMorPM = aMorPMColorStyle48.intValue();
                Integer dayColorStyle48 = preferenceUtils.getDayColorStyle48();
                this.colorDay = dayColorStyle48.intValue();
                Integer dateColorStyle48 = preferenceUtils.getDateColorStyle48();
                this.colorDate = dateColorStyle48.intValue();
                return;
            case 49:
                Integer hoursColorStyle49 = preferenceUtils.getHoursColorStyle49();
                this.colorHours = hoursColorStyle49.intValue();
                Integer minuteColorStyle49 = preferenceUtils.getMinuteColorStyle49();
                this.colorMinute = minuteColorStyle49.intValue();
                Integer aMorPMColorStyle49 = preferenceUtils.getAMorPMColorStyle49();
                this.colorAMorPM = aMorPMColorStyle49.intValue();
                Integer dayColorStyle49 = preferenceUtils.getDayColorStyle49();
                this.colorDay = dayColorStyle49.intValue();
                Integer dateColorStyle49 = preferenceUtils.getDateColorStyle49();
                this.colorDate = dateColorStyle49.intValue();
                Integer timeBackgroundColorStyle49 = preferenceUtils.getTimeBackgroundColorStyle49();
                this.colorTimeBackground = timeBackgroundColorStyle49.intValue();
                return;
            case 50:
                Integer hoursColorStyle50 = preferenceUtils.getHoursColorStyle50();
                this.colorHours = hoursColorStyle50.intValue();
                Integer minuteColorStyle50 = preferenceUtils.getMinuteColorStyle50();
                this.colorMinute = minuteColorStyle50.intValue();
                Integer aMorPMColorStyle50 = preferenceUtils.getAMorPMColorStyle50();
                this.colorAMorPM = aMorPMColorStyle50.intValue();
                Integer dayColorStyle50 = preferenceUtils.getDayColorStyle50();
                this.colorDay = dayColorStyle50.intValue();
                Integer dateColorStyle50 = preferenceUtils.getDateColorStyle50();
                this.colorDate = dateColorStyle50.intValue();
                return;
            case 51:
                Integer hoursColorStyle51 = preferenceUtils.getHoursColorStyle51();
                this.colorHours = hoursColorStyle51.intValue();
                Integer minuteColorStyle51 = preferenceUtils.getMinuteColorStyle51();
                this.colorMinute = minuteColorStyle51.intValue();
                Integer aMorPMColorStyle51 = preferenceUtils.getAMorPMColorStyle51();
                this.colorAMorPM = aMorPMColorStyle51.intValue();
                Integer dayColorStyle51 = preferenceUtils.getDayColorStyle51();
                this.colorDay = dayColorStyle51.intValue();
                Integer dateColorStyle51 = preferenceUtils.getDateColorStyle51();
                this.colorDate = dateColorStyle51.intValue();
                return;
            case 52:
                Integer hoursColorStyle52 = preferenceUtils.getHoursColorStyle52();
                this.colorHours = hoursColorStyle52.intValue();
                Integer minuteColorStyle52 = preferenceUtils.getMinuteColorStyle52();
                this.colorMinute = minuteColorStyle52.intValue();
                Integer aMorPMColorStyle52 = preferenceUtils.getAMorPMColorStyle52();
                this.colorAMorPM = aMorPMColorStyle52.intValue();
                Integer dayColorStyle52 = preferenceUtils.getDayColorStyle52();
                this.colorDay = dayColorStyle52.intValue();
                Integer dateColorStyle52 = preferenceUtils.getDateColorStyle52();
                this.colorDate = dateColorStyle52.intValue();
                return;
            case 53:
                Integer hoursColorStyle53 = preferenceUtils.getHoursColorStyle53();
                this.colorHours = hoursColorStyle53.intValue();
                Integer minuteColorStyle53 = preferenceUtils.getMinuteColorStyle53();
                this.colorMinute = minuteColorStyle53.intValue();
                Integer aMorPMColorStyle53 = preferenceUtils.getAMorPMColorStyle53();
                this.colorAMorPM = aMorPMColorStyle53.intValue();
                Integer dayColorStyle53 = preferenceUtils.getDayColorStyle53();
                this.colorDay = dayColorStyle53.intValue();
                Integer dateColorStyle53 = preferenceUtils.getDateColorStyle53();
                this.colorDate = dateColorStyle53.intValue();
                return;
            case 54:
                Integer hoursColorStyle54 = preferenceUtils.getHoursColorStyle54();
                this.colorHours = hoursColorStyle54.intValue();
                Integer minuteColorStyle54 = preferenceUtils.getMinuteColorStyle54();
                this.colorMinute = minuteColorStyle54.intValue();
                Integer aMorPMColorStyle54 = preferenceUtils.getAMorPMColorStyle54();
                this.colorAMorPM = aMorPMColorStyle54.intValue();
                Integer dayColorStyle54 = preferenceUtils.getDayColorStyle54();
                this.colorDay = dayColorStyle54.intValue();
                Integer dateColorStyle54 = preferenceUtils.getDateColorStyle54();
                this.colorDate = dateColorStyle54.intValue();
                return;
            default:
                return;
        }
    }


    public final void resetAll() {
        preferenceUtils.setWallpaperShownOrNot(false);
        switch (this.widgetStyleNumber) {
            case 1:
                preferenceUtils.set12or24FormatStyle1(true);
                preferenceUtils.setAMorPMVisibilityStyle1(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle1(true);
                preferenceUtils.setHoursColorStyle1(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle1(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle1(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle1(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle1(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 2:
                preferenceUtils.set12or24FormatStyle2(true);
                preferenceUtils.setAMorPMVisibilityStyle2(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle2(true);
                preferenceUtils.setHoursColorStyle2(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle2(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle2(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle2(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle2(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 3:
                preferenceUtils.set12or24FormatStyle3(true);
                preferenceUtils.setAMorPMVisibilityStyle3(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle3(true);
                preferenceUtils.setHoursColorStyle3(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle3(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle3(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle3(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle3(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 4:
                preferenceUtils.set12or24FormatStyle4(true);
                preferenceUtils.setAMorPMVisibilityStyle4(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle4(true);
                preferenceUtils.setHoursColorStyle4(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle4(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle4(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle4(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle4(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 5:
                preferenceUtils.set12or24FormatStyle5(false);
                preferenceUtils.setAMorPMVisibilityStyle5(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle5(true);
                preferenceUtils.setHoursColorStyle5(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle5(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle5(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle5(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle5(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 6:
                preferenceUtils.set12or24FormatStyle6(true);
                preferenceUtils.setAMorPMVisibilityStyle6(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle6(true);
                preferenceUtils.setHoursColorStyle6(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle6(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle6(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle6(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle6(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 7:
                preferenceUtils.set12or24FormatStyle7(true);
                preferenceUtils.setAMorPMVisibilityStyle7(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle7(true);
                preferenceUtils.setHoursColorStyle7(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle7(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle7(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle7(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle7(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 8:
                preferenceUtils.set12or24FormatStyle8(true);
                preferenceUtils.setAMorPMVisibilityStyle8(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle8(true);
                preferenceUtils.setHoursColorStyle8(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle8(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle8(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle8(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle8(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 9:
                preferenceUtils.set12or24FormatStyle9(true);
                preferenceUtils.setAMorPMVisibilityStyle9(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle9(true);
                preferenceUtils.setHoursColorStyle9(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle9(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle9(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle9(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle9(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 10:
                preferenceUtils.set12or24FormatStyle10(true);
                preferenceUtils.setAMorPMVisibilityStyle10(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle10(true);
                preferenceUtils.setHoursColorStyle10(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle10(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle10(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle10(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle10(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 11:
                preferenceUtils.set12or24FormatStyle11(true);
                preferenceUtils.setAMorPMVisibilityStyle11(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle11(true);
                preferenceUtils.setHoursColorStyle11(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle11(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle11(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle11(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle11(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 12:
                preferenceUtils.set12or24FormatStyle12(true);
                preferenceUtils.setAMorPMVisibilityStyle12(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle12(true);
                preferenceUtils.setHoursColorStyle12(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle12(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle12(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle12(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle12(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 13:
                preferenceUtils.set12or24FormatStyle13(true);
                preferenceUtils.setAMorPMVisibilityStyle13(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle13(true);
                preferenceUtils.setHoursColorStyle13(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle13(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle13(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle13(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle13(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 14:
                preferenceUtils.set12or24FormatStyle14(true);
                preferenceUtils.setAMorPMVisibilityStyle14(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle14(true);
                preferenceUtils.setHoursColorStyle14(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle14(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle14(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle14(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle14(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 15:
                preferenceUtils.set12or24FormatStyle15(true);
                preferenceUtils.setAMorPMVisibilityStyle15(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle15(true);
                preferenceUtils.setHoursColorStyle15(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle15(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle15(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle15(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle15(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 16:
                preferenceUtils.set12or24FormatStyle16(true);
                preferenceUtils.setAMorPMVisibilityStyle16(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle16(true);
                preferenceUtils.setHoursColorStyle16(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle16(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle16(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle16(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle16(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 17:
                preferenceUtils.set12or24FormatStyle17(true);
                preferenceUtils.setAMorPMVisibilityStyle17(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle17(true);
                preferenceUtils.setHoursColorStyle17(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle17(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle17(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle17(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle17(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 18:
                preferenceUtils.set12or24FormatStyle18(true);
                preferenceUtils.setAMorPMVisibilityStyle18(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle18(true);
                preferenceUtils.setHoursColorStyle18(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle18(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle18(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle18(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle18(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setTimeBackgroundColorStyle18(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                break;
            case 19:
                preferenceUtils.set12or24FormatStyle19(true);
                preferenceUtils.setAMorPMVisibilityStyle19(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle19(true);
                preferenceUtils.setHoursColorStyle19(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle19(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle19(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle19(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle19(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 20:
                preferenceUtils.set12or24FormatStyle20(true);
                preferenceUtils.setAMorPMVisibilityStyle20(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle20(true);
                preferenceUtils.setHoursColorStyle20(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle20(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle20(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle20(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle20(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 21:
                preferenceUtils.set12or24FormatStyle21(true);
                preferenceUtils.setAMorPMVisibilityStyle21(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle21(true);
                preferenceUtils.setHoursColorStyle21(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle21(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle21(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle21(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle21(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 22:
                preferenceUtils.set12or24FormatStyle22(true);
                preferenceUtils.setAMorPMVisibilityStyle22(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle22(true);
                preferenceUtils.setHoursColorStyle22(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle22(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle22(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle22(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle22(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setTimeBackgroundColorStyle22(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorRed, (Resources.Theme) null)));
                break;
            case 23:
                preferenceUtils.set12or24FormatStyle23(true);
                preferenceUtils.setAMorPMVisibilityStyle23(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle23(true);
                preferenceUtils.setHoursColorStyle23(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle23(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle23(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle23(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle23(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 24:
                preferenceUtils.set12or24FormatStyle24(true);
                preferenceUtils.setAMorPMVisibilityStyle24(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle24(true);
                preferenceUtils.setHoursColorStyle24(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle24(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle24(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle24(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle24(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
                preferenceUtils.setTimeBackgroundColorStyle24(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorPopaty, (Resources.Theme) null)));
                break;
            case 25:
                preferenceUtils.set12or24FormatStyle25(true);
                preferenceUtils.setAMorPMVisibilityStyle25(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle25(true);
                preferenceUtils.setHoursColorStyle25(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle25(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle25(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle25(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle25(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 26:
                preferenceUtils.set12or24FormatStyle26(true);
                preferenceUtils.setAMorPMVisibilityStyle26(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle26(true);
                preferenceUtils.setHoursColorStyle26(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle26(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle26(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle26(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle26(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 27:
                preferenceUtils.set12or24FormatStyle27(true);
                preferenceUtils.setAMorPMVisibilityStyle27(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle27(true);
                preferenceUtils.setHoursColorStyle27(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle27(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle27(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle27(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle27(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 28:
                preferenceUtils.set12or24FormatStyle28(true);
                preferenceUtils.setAMorPMVisibilityStyle28(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle28(true);
                preferenceUtils.setHoursColorStyle28(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle28(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle28(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle28(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle28(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 29:
                preferenceUtils.set12or24FormatStyle29(true);
                preferenceUtils.setAMorPMVisibilityStyle29(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle29(true);
                preferenceUtils.setHoursColorStyle29(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle29(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorNeon, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle29(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle29(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle29(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 30:
                preferenceUtils.set12or24FormatStyle30(true);
                preferenceUtils.setAMorPMVisibilityStyle30(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle30(true);
                preferenceUtils.setHoursColorStyle30(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle30(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle30(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle30(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle30(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 31:
                preferenceUtils.set12or24FormatStyle31(true);
                preferenceUtils.setAMorPMVisibilityStyle31(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle31(true);
                preferenceUtils.setHoursColorStyle31(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle31(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle31(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle31(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorNeon, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle31(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 32:
                preferenceUtils.set12or24FormatStyle32(true);
                preferenceUtils.setAMorPMVisibilityStyle32(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle32(true);
                preferenceUtils.setHoursColorStyle32(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle32(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle32(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle32(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorMediumRed, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle32(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 33:
                preferenceUtils.set12or24FormatStyle33(true);
                preferenceUtils.setAMorPMVisibilityStyle33(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle33(true);
                preferenceUtils.setHoursColorStyle33(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle33(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle33(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle33(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle33(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 34:
                preferenceUtils.set12or24FormatStyle34(true);
                preferenceUtils.setAMorPMVisibilityStyle34(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle34(true);
                preferenceUtils.setHoursColorStyle34(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle34(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle34(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle34(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle34(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 35:
                preferenceUtils.set12or24FormatStyle35(true);
                preferenceUtils.setAMorPMVisibilityStyle35(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle35(true);
                preferenceUtils.setHoursColorStyle35(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle35(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorNeon, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle35(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle35(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle35(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 36:
                preferenceUtils.set12or24FormatStyle36(true);
                preferenceUtils.setAMorPMVisibilityStyle36(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle36(true);
                preferenceUtils.setHoursColorStyle36(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorNeon, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle36(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorNeon, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle36(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorNeon, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle36(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorNeon, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle36(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorNeon, (Resources.Theme) null)));
                break;
            case 37:
                preferenceUtils.set12or24FormatStyle37(true);
                preferenceUtils.setAMorPMVisibilityStyle37(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle37(true);
                preferenceUtils.setHoursColorStyle37(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorOffWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle37(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.clock_17_minute_transparent, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle37(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle37(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle37(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 38:
                preferenceUtils.set12or24FormatStyle38(true);
                preferenceUtils.setAMorPMVisibilityStyle38(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle38(true);
                preferenceUtils.setHoursColorStyle38(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle38(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle38(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle38(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle38(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 39:
                preferenceUtils.set12or24FormatStyle39(true);
                preferenceUtils.setAMorPMVisibilityStyle39(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle39(true);
                preferenceUtils.setHoursColorStyle39(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle39(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle39(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle39(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle39(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 40:
                preferenceUtils.set12or24FormatStyle40(true);
                preferenceUtils.setAMorPMVisibilityStyle40(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle40(true);
                preferenceUtils.setHoursColorStyle40(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle40(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle40(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle40(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorYellow, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle40(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 41:
                preferenceUtils.set12or24FormatStyle41(true);
                preferenceUtils.setAMorPMVisibilityStyle41(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle41(true);
                preferenceUtils.setHoursColorStyle41(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle41(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle41(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle41(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle41(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 42:
                preferenceUtils.set12or24FormatStyle42(true);
                preferenceUtils.setAMorPMVisibilityStyle42(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle42(true);
                preferenceUtils.setHoursColorStyle42(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle42(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle42(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle42(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle42(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 43:
                preferenceUtils.set12or24FormatStyle43(true);
                preferenceUtils.setAMorPMVisibilityStyle43(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle43(true);
                preferenceUtils.setHoursColorStyle43(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle43(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle43(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle43(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle43(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 44:
                preferenceUtils.set12or24FormatStyle44(true);
                preferenceUtils.setAMorPMVisibilityStyle44(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle44(true);
                preferenceUtils.setHoursColorStyle44(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle44(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle44(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle44(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle44(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 45:
                preferenceUtils.set12or24FormatStyle45(true);
                preferenceUtils.setAMorPMVisibilityStyle45(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle45(true);
                preferenceUtils.setHoursColorStyle45(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle45(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle45(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle45(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle45(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 46:
                preferenceUtils.set12or24FormatStyle46(true);
                preferenceUtils.setAMorPMVisibilityStyle46(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle46(true);
                preferenceUtils.setHoursColorStyle46(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorRed, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle46(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle46(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle46(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle46(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 47:
                preferenceUtils.set12or24FormatStyle47(true);
                preferenceUtils.setAMorPMVisibilityStyle47(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle47(true);
                preferenceUtils.setHoursColorStyle47(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle47(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle47(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle47(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle47(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 48:
                preferenceUtils.set12or24FormatStyle48(true);
                preferenceUtils.setAMorPMVisibilityStyle48(false);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle48(true);
                preferenceUtils.setHoursColorStyle48(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle48(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle48(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle48(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle48(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 49:
                preferenceUtils.set12or24FormatStyle49(true);
                preferenceUtils.setAMorPMVisibilityStyle49(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle49(true);
                preferenceUtils.setHoursColorStyle49(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle49(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle49(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle49(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle49(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setTimeBackgroundColorStyle49(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorRed, (Resources.Theme) null)));
                break;
            case 50:
                preferenceUtils.set12or24FormatStyle50(true);
                preferenceUtils.setAMorPMVisibilityStyle50(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle50(true);
                preferenceUtils.setHoursColorStyle50(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle50(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle50(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle50(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle50(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 51:
                preferenceUtils.set12or24FormatStyle51(true);
                preferenceUtils.setAMorPMVisibilityStyle51(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle51(true);
                preferenceUtils.setHoursColorStyle51(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle51(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle51(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle51(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle51(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 52:
                preferenceUtils.set12or24FormatStyle52(true);
                preferenceUtils.setAMorPMVisibilityStyle52(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle52(true);
                preferenceUtils.setHoursColorStyle52(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle52(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle52(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle52(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle52(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;
            case 53:
                preferenceUtils.set12or24FormatStyle53(true);
                preferenceUtils.setAMorPMVisibilityStyle53(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle53(true);
                preferenceUtils.setHoursColorStyle53(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle53(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle53(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle53(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorMediumRed, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle53(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                break;
            case 54:
                preferenceUtils.set12or24FormatStyle54(true);
                preferenceUtils.setAMorPMVisibilityStyle54(true);
                preferenceUtils.setHoursAlwaysAsTwoDigitStyle54(true);
                preferenceUtils.setHoursColorStyle54(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setMinuteColorStyle54(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setAMorPMColorStyle54(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setDayColorStyle54(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorLiteBlack, (Resources.Theme) null)));
                preferenceUtils.setDateColorStyle54(Integer.valueOf(ResourcesCompat.getColor(contexts1.getResources(), R.color.colorWhite, (Resources.Theme) null)));
                break;

        }
        setOptionsVisibilityForParticularClockStyle();
        setLayoutsAndOptionsAccordingToStoredPreferences();
        getSavedColorAndApplyToPreviewAndOptionLayout();
        tvHour.setTextColor(this.colorHours);
        int i = this.widgetStyleNumber;
        if (i == 49) {
            tvDelimiter.setTextColor(colorTimeBackground);
        } else {
            tvDelimiter.setTextColor(this.colorMinute);
        }
        tvMinute.setTextColor(this.colorMinute);
        tvAMorPM.setTextColor(this.colorAMorPM);
        tvDay.setTextColor(this.colorDay);
        tvDate.setTextColor(this.colorDate);

        if (i == 45 || i == 53) {
            tvDate2.setTextColor(colorDate);
            tvDate4.setTextColor(this.colorDate);
        }

        if (i == 18 || i == 22 || i == 24 || i == 49) {
            llyTimeBackgroundColor.setBackgroundColor(this.colorTimeBackground);
        }
        cvHourColorIndicator.setCardBackgroundColor(this.colorHours);
        cvMinuteColorIndicator.setCardBackgroundColor(this.colorMinute);
        cvAMorPMColorIndicator.setCardBackgroundColor(this.colorAMorPM);
        cvDayColorIndicator.setCardBackgroundColor(this.colorDay);
        cvDateColorIndicator.setCardBackgroundColor(this.colorDate);
        cvTimeBackgroundColorIndicator.setCardBackgroundColor(this.colorTimeBackground);
    }

    public final void initViews() {
        this.addAutomaticallyFebBtn = (FloatingActionButton) findViewById(R.id.activity_clock_customization_add_automatically_fab_btn);
        this.toolbar = (Toolbar) findViewById(R.id.activity_clock_customization_toolbar);
        this.tvDateColorHeading = (TextView) findViewById(R.id.activity_clock_customization_option_tv_date_color_heading);
        this.tvDateColorMsg = (TextView) findViewById(R.id.activity_clock_customization_option_tv_date_color_msg);
        this.viewStub = (ViewStub) findViewById(R.id.activity_clock_customization_include_view);
        this.cbBackgroundWallpaper = (CheckBox) findViewById(R.id.activity_clock_customization_option_wallpaper_shown_or_not_check_box);
        this.cb12or24HourFormat = (CheckBox) findViewById(R.id.activity_clock_customization_option_12_or_24_format_check_box);
        this.cbAMorPMVisibility = (CheckBox) findViewById(R.id.activity_clock_customization_option_am_or_pm_visibility_check_box);
        this.cbHourAlwaysTwoDigits = (CheckBox) findViewById(R.id.activity_clock_customization_option_hour_always_two_digits_check_box);
        this.llyViewStabContainer = (LinearLayout) findViewById(R.id.activity_clock_customization_lly_viewstub);
        this.lly12or24FormatOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_12_or_24_format_lly);
        this.llyAMorPMVisibilityOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_am_or_pm_visibility_lly);
        this.llyHourColorOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_hour_color_lly);
        this.llyMinuteColorOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_minute_color_lly);
        this.llyAMorPMColorOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_am_or_pm_color_lly);
        this.llyDayColorOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_day_color_lly);
        this.llyDateColorOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_date_color_lly);
        this.llyTimeBackgroundColorOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_time_background_color_lly);
        this.llyHourAlwaysTwoDigitsOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_two_digits_hour_lly);
        this.llyResetAllOption = (LinearLayout) findViewById(R.id.activity_clock_customization_option_reset_all_lly);
        this.ivBackWallpaper = (ImageView) findViewById(R.id.activity_clock_customization_preview_iv_wallpaper);
        this.cvHourColorIndicator = (CardView) findViewById(R.id.activity_clock_customization_option_cv_hour_color_indicator);
        this.cvMinuteColorIndicator = (CardView) findViewById(R.id.activity_clock_customization_option_cv_minute_color_indicator);
        this.cvAMorPMColorIndicator = (CardView) findViewById(R.id.activity_clock_customization_option_cv_am_or_pm_color_indicator);
        this.cvDayColorIndicator = (CardView) findViewById(R.id.activity_clock_customization_option_cv_day_color_indicator);
        this.cvDateColorIndicator = (CardView) findViewById(R.id.activity_clock_customization_option_cv_date_color_indicator);
        this.cvTimeBackgroundColorIndicator = (CardView) findViewById(R.id.activity_clock_customization_option_cv_time_background_color_indicator);
    }

    public final void initViewsPreview() {
        this.tvHour = (TextView) findViewById(R.id.widget_time_hours);
        this.tvDelimiter = (TextView) findViewById(R.id.widget_time_delimiter);
        this.tvMinute = (TextView) findViewById(R.id.widget_time_minute);
        this.tvAMorPM = (TextView) findViewById(R.id.widget_time_am_pm);
        this.tvDay = (TextView) findViewById(R.id.widget_day);
        this.tvDate = (TextView) findViewById(R.id.widget_date);
        this.tvDate4 = findViewById(R.id.widget_date_3_clock_premium);
        this.tvDate2 = findViewById(R.id.widget_date_2_clock_premium);
        int i = this.widgetStyleNumber;
        if (i == 18 || i == 22 || i == 24 || i == 49) {
            this.llyTimeBackgroundColor = (LinearLayout) findViewById(R.id.widget_date_time_background_color);
        }
    }

    public void onBackPressed() {
        setResult(-1, new Intent());
        finish();
    }

    public final void autoPinnedWidgetToHomeScreen() {
        switch (this.widgetStyleNumber) {
            case 1:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance = AppWidgetManager.getInstance(context);
                    ComponentName componentName = new ComponentName(context, ClockStyle1ProviderReceiver.class);
                    if (!instance.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle1ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle1ProviderReceiver.Companion companion = ClockStyle1ProviderReceiver.Companion;
                    RemoteViews remoteViews = companion.getRemoteViews(context);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("appWidgetPreview", remoteViews);
                    instance.requestPinAppWidget(componentName, bundle, broadcast);
                    return;
                }
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance2 = AppWidgetManager.getInstance(context);
                    ComponentName componentName2 = new ComponentName(context, ClockStyle2ProviderReceiver.class);
                    if (!instance2.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle2ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle2ProviderReceiver.Companion companion2 = ClockStyle2ProviderReceiver.Companion;
                    RemoteViews remoteViews2 = companion2.getRemoteViews(context);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("appWidgetPreview", remoteViews2);
                    instance2.requestPinAppWidget(componentName2, bundle2, broadcast2);
                    return;
                }
                return;
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance3 = AppWidgetManager.getInstance(context);
                    ComponentName componentName3 = new ComponentName(context, ClockStyle3ProviderReceiver.class);
                    if (!instance3.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast3 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle3ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle3ProviderReceiver.Companion companion3 = ClockStyle3ProviderReceiver.Companion;
                    RemoteViews remoteViews3 = companion3.getRemoteViews(context);
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("appWidgetPreview", remoteViews3);
                    instance3.requestPinAppWidget(componentName3, bundle3, broadcast3);
                    return;
                }
                return;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance4 = AppWidgetManager.getInstance(context);
                    ComponentName componentName4 = new ComponentName(context, ClockStyle4ProviderReceiver.class);
                    if (!instance4.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast4 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle4ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle4ProviderReceiver.Companion companion4 = ClockStyle4ProviderReceiver.Companion;
                    RemoteViews remoteViews4 = companion4.getRemoteViews(context);
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable("appWidgetPreview", remoteViews4);
                    instance4.requestPinAppWidget(componentName4, bundle4, broadcast4);
                    return;
                }
                return;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance5 = AppWidgetManager.getInstance(context);
                    ComponentName componentName5 = new ComponentName(context, ClockStyle5ProviderReceiver.class);
                    if (!instance5.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast5 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle5ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle5ProviderReceiver.Companion companion5 = ClockStyle5ProviderReceiver.Companion;
                    RemoteViews remoteViews5 = companion5.getRemoteViews(context);
                    Bundle bundle5 = new Bundle();
                    bundle5.putParcelable("appWidgetPreview", remoteViews5);
                    instance5.requestPinAppWidget(componentName5, bundle5, broadcast5);
                    return;
                }
                return;
            case 6:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance6 = AppWidgetManager.getInstance(context);
                    ComponentName componentName6 = new ComponentName(context, ClockStyle6ProviderReceiver.class);
                    if (!instance6.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast6 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle6ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle6ProviderReceiver.Companion companion6 = ClockStyle6ProviderReceiver.Companion;
                    RemoteViews remoteViews6 = companion6.getRemoteViews(context);
                    Bundle bundle6 = new Bundle();
                    bundle6.putParcelable("appWidgetPreview", remoteViews6);
                    instance6.requestPinAppWidget(componentName6, bundle6, broadcast6);
                    return;
                }
                return;
            case 7:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance7 = AppWidgetManager.getInstance(context);
                    ComponentName componentName7 = new ComponentName(context, ClockStyle7ProviderReceiver.class);
                    if (!instance7.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast7 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle7ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle7ProviderReceiver.Companion companion7 = ClockStyle7ProviderReceiver.Companion;
                    RemoteViews remoteViews7 = companion7.getRemoteViews(context);
                    Bundle bundle7 = new Bundle();
                    bundle7.putParcelable("appWidgetPreview", remoteViews7);
                    instance7.requestPinAppWidget(componentName7, bundle7, broadcast7);
                    return;
                }
                return;
            case 8:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance8 = AppWidgetManager.getInstance(context);
                    ComponentName componentName8 = new ComponentName(context, ClockStyle8ProviderReceiver.class);
                    if (!instance8.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast8 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle8ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle8ProviderReceiver.Companion companion8 = ClockStyle8ProviderReceiver.Companion;
                    RemoteViews remoteViews8 = companion8.getRemoteViews(context);
                    Bundle bundle8 = new Bundle();
                    bundle8.putParcelable("appWidgetPreview", remoteViews8);
                    instance8.requestPinAppWidget(componentName8, bundle8, broadcast8);
                    return;
                }
                return;
            case 9:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance9 = AppWidgetManager.getInstance(context);
                    ComponentName componentName9 = new ComponentName(context, ClockStyle9ProviderReceiver.class);
                    if (!instance9.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast9 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle9ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle9ProviderReceiver.Companion companion9 = ClockStyle9ProviderReceiver.Companion;
                    RemoteViews remoteViews9 = companion9.getRemoteViews(context);
                    Bundle bundle9 = new Bundle();
                    bundle9.putParcelable("appWidgetPreview", remoteViews9);
                    instance9.requestPinAppWidget(componentName9, bundle9, broadcast9);
                    return;
                }
                return;
            case 10:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance10 = AppWidgetManager.getInstance(context);
                    ComponentName componentName10 = new ComponentName(context, ClockStyle10ProviderReceiver.class);
                    if (!instance10.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast10 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle10ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle10ProviderReceiver.Companion companion10 = ClockStyle10ProviderReceiver.Companion;
                    RemoteViews remoteViews10 = companion10.getRemoteViews(context);
                    Bundle bundle10 = new Bundle();
                    bundle10.putParcelable("appWidgetPreview", remoteViews10);
                    instance10.requestPinAppWidget(componentName10, bundle10, broadcast10);
                    return;
                }
                return;
            case 11:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance11 = AppWidgetManager.getInstance(context);
                    ComponentName componentName11 = new ComponentName(context, ClockStyle11ProviderReceiver.class);
                    if (!instance11.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast11 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle11ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle11ProviderReceiver.Companion companion11 = ClockStyle11ProviderReceiver.Companion;
                    RemoteViews remoteViews11 = companion11.getRemoteViews(context);
                    Bundle bundle11 = new Bundle();
                    bundle11.putParcelable("appWidgetPreview", remoteViews11);
                    instance11.requestPinAppWidget(componentName11, bundle11, broadcast11);
                    return;
                } else {
                    return;
                }
            case 12:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance12 = AppWidgetManager.getInstance(context);
                    ComponentName componentName12 = new ComponentName(context, ClockStyle12ProviderReceiver.class);
                    if (!instance12.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast12 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle12ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle12ProviderReceiver.Companion companion12 = ClockStyle12ProviderReceiver.Companion;
                    RemoteViews remoteViews12 = companion12.getRemoteViews(context);
                    Bundle bundle12 = new Bundle();
                    bundle12.putParcelable("appWidgetPreview", remoteViews12);
                    instance12.requestPinAppWidget(componentName12, bundle12, broadcast12);
                    return;
                } else {
                    return;
                }
            case 13:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance13 = AppWidgetManager.getInstance(context);
                    ComponentName componentName13 = new ComponentName(context, ClockStyle13ProviderReceiver.class);
                    if (!instance13.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast13 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle13ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle13ProviderReceiver.Companion companion13 = ClockStyle13ProviderReceiver.Companion;
                    RemoteViews remoteViews13 = companion13.getRemoteViews(context);
                    Bundle bundle13 = new Bundle();
                    bundle13.putParcelable("appWidgetPreview", remoteViews13);
                    instance13.requestPinAppWidget(componentName13, bundle13, broadcast13);
                    return;
                } else {
                    return;
                }
            case 14:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance14 = AppWidgetManager.getInstance(context);
                    ComponentName componentName14 = new ComponentName(context, ClockStyle14ProviderReceiver.class);
                    if (!instance14.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast14 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle14ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle14ProviderReceiver.Companion companion14 = ClockStyle14ProviderReceiver.Companion;
                    RemoteViews remoteViews14 = companion14.getRemoteViews(context);
                    Bundle bundle14 = new Bundle();
                    bundle14.putParcelable("appWidgetPreview", remoteViews14);
                    instance14.requestPinAppWidget(componentName14, bundle14, broadcast14);
                    return;
                } else {
                    return;
                }
            case 15:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance15 = AppWidgetManager.getInstance(context);
                    ComponentName componentName15 = new ComponentName(context, ClockStyle15ProviderReceiver.class);
                    if (!instance15.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast15 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle15ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle15ProviderReceiver.Companion companion15 = ClockStyle15ProviderReceiver.Companion;
                    RemoteViews remoteViews15 = companion15.getRemoteViews(context);
                    Bundle bundle15 = new Bundle();
                    bundle15.putParcelable("appWidgetPreview", remoteViews15);
                    instance15.requestPinAppWidget(componentName15, bundle15, broadcast15);
                    return;
                } else {
                    return;
                }
            case 16:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance16 = AppWidgetManager.getInstance(context);
                    ComponentName componentName16 = new ComponentName(context, ClockStyle16ProviderReceiver.class);

                    if (!instance16.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast16 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle16ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle16ProviderReceiver.Companion companion16 = ClockStyle16ProviderReceiver.Companion;
                    RemoteViews remoteViews16 = companion16.getRemoteViews(context);
                    Bundle bundle16 = new Bundle();
                    bundle16.putParcelable("appWidgetPreview", remoteViews16);
                    instance16.requestPinAppWidget(componentName16, bundle16, broadcast16);
                    return;
                } else {
                    return;
                }
            case 17:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance17 = AppWidgetManager.getInstance(context);
                    ComponentName componentName17 = new ComponentName(context, ClockStyle17ProviderReceiver.class);
                    if (!instance17.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast17 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle17ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle17ProviderReceiver.Companion companion17 = ClockStyle17ProviderReceiver.Companion;
                    RemoteViews remoteViews17 = companion17.getRemoteViews(context);
                    Bundle bundle17 = new Bundle();
                    bundle17.putParcelable("appWidgetPreview", remoteViews17);
                    instance17.requestPinAppWidget(componentName17, bundle17, broadcast17);
                    return;
                } else {
                    return;
                }
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance18 = AppWidgetManager.getInstance(context);
                    ComponentName componentName18 = new ComponentName(context, ClockStyle18ProviderReceiver.class);
                    if (!instance18.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast18 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle18ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle18ProviderReceiver.Companion companion18 = ClockStyle18ProviderReceiver.Companion;
                    RemoteViews remoteViews18 = companion18.getRemoteViews(context);
                    Bundle bundle18 = new Bundle();
                    bundle18.putParcelable("appWidgetPreview", remoteViews18);
                    instance18.requestPinAppWidget(componentName18, bundle18, broadcast18);
                    return;
                } else {
                    return;
                }
            case 19:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance19 = AppWidgetManager.getInstance(context);
                    ComponentName componentName19 = new ComponentName(context, ClockStyle19ProviderReceiver.class);
                    if (!instance19.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast19 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle19ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle19ProviderReceiver.Companion companion19 = ClockStyle19ProviderReceiver.Companion;
                    RemoteViews remoteViews19 = companion19.getRemoteViews(context);
                    Bundle bundle19 = new Bundle();
                    bundle19.putParcelable("appWidgetPreview", remoteViews19);
                    instance19.requestPinAppWidget(componentName19, bundle19, broadcast19);
                    return;
                } else {
                    return;
                }
            case 20:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance20 = AppWidgetManager.getInstance(context);
                    ComponentName componentName20 = new ComponentName(context, ClockStyle20ProviderReceiver.class);
                    if (!instance20.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast20 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle20ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle20ProviderReceiver.Companion companion20 = ClockStyle20ProviderReceiver.Companion;
                    RemoteViews remoteViews20 = companion20.getRemoteViews(context);
                    Bundle bundle20 = new Bundle();
                    bundle20.putParcelable("appWidgetPreview", remoteViews20);
                    instance20.requestPinAppWidget(componentName20, bundle20, broadcast20);
                    return;
                } else {
                    return;
                }
            case 21:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance21 = AppWidgetManager.getInstance(context);
                    ComponentName componentName21 = new ComponentName(context, ClockStyle21ProviderReceiver.class);
                    if (!instance21.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast21 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle21ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle21ProviderReceiver.Companion companion21 = ClockStyle21ProviderReceiver.Companion;
                    RemoteViews remoteViews21 = companion21.getRemoteViews(context);
                    Bundle bundle21 = new Bundle();
                    bundle21.putParcelable("appWidgetPreview", remoteViews21);
                    instance21.requestPinAppWidget(componentName21, bundle21, broadcast21);
                    return;
                } else {
                    return;
                }
            case 22:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance22 = AppWidgetManager.getInstance(context);
                    ComponentName componentName22 = new ComponentName(context, ClockStyle22ProviderReceiver.class);
                    if (!instance22.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast22 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle22ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle22ProviderReceiver.Companion companion22 = ClockStyle22ProviderReceiver.Companion;
                    RemoteViews remoteViews22 = companion22.getRemoteViews(context);
                    Bundle bundle22 = new Bundle();
                    bundle22.putParcelable("appWidgetPreview", remoteViews22);
                    instance22.requestPinAppWidget(componentName22, bundle22, broadcast22);
                    return;
                } else {
                    return;
                }
            case 23:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance23 = AppWidgetManager.getInstance(context);
                    ComponentName componentName23 = new ComponentName(context, ClockStyle23ProviderReceiver.class);
                    if (!instance23.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast23 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle23ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle23ProviderReceiver.Companion companion23 = ClockStyle23ProviderReceiver.Companion;
                    RemoteViews remoteViews23 = companion23.getRemoteViews(context);
                    Bundle bundle23 = new Bundle();
                    bundle23.putParcelable("appWidgetPreview", remoteViews23);
                    instance23.requestPinAppWidget(componentName23, bundle23, broadcast23);
                    return;
                } else {
                    return;
                }
            case 24:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance24 = AppWidgetManager.getInstance(context);
                    ComponentName componentName24 = new ComponentName(context, ClockStyle24ProviderReceiver.class);
                    if (!instance24.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast24 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle24ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle24ProviderReceiver.Companion companion24 = ClockStyle24ProviderReceiver.Companion;
                    RemoteViews remoteViews24 = companion24.getRemoteViews(context);
                    Bundle bundle24 = new Bundle();
                    bundle24.putParcelable("appWidgetPreview", remoteViews24);
                    instance24.requestPinAppWidget(componentName24, bundle24, broadcast24);
                    return;
                } else {
                    return;
                }
            case 25:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance25 = AppWidgetManager.getInstance(context);
                    ComponentName componentName25 = new ComponentName(context, ClockStyle25ProviderReceiver.class);
                    if (!instance25.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast25 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle25ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle25ProviderReceiver.Companion companion25 = ClockStyle25ProviderReceiver.Companion;
                    RemoteViews remoteViews25 = companion25.getRemoteViews(context);
                    Bundle bundle25 = new Bundle();
                    bundle25.putParcelable("appWidgetPreview", remoteViews25);
                    instance25.requestPinAppWidget(componentName25, bundle25, broadcast25);
                    return;
                } else {
                    return;
                }
            case 26:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance26 = AppWidgetManager.getInstance(context);
                    ComponentName componentName26 = new ComponentName(context, ClockStyle26ProviderReceiver.class);
                    if (!instance26.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast26 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle26ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle26ProviderReceiver.Companion companion26 = ClockStyle26ProviderReceiver.Companion;
                    RemoteViews remoteViews26 = companion26.getRemoteViews(context);
                    Bundle bundle26 = new Bundle();
                    bundle26.putParcelable("appWidgetPreview", remoteViews26);
                    instance26.requestPinAppWidget(componentName26, bundle26, broadcast26);
                    return;
                } else {
                    return;
                }
            case 27:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance27 = AppWidgetManager.getInstance(context);
                    ComponentName componentName27 = new ComponentName(context, ClockStyle27ProviderReceiver.class);
                    if (!instance27.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast27 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle27ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle27ProviderReceiver.Companion companion27 = ClockStyle27ProviderReceiver.Companion;
                    RemoteViews remoteViews27 = companion27.getRemoteViews(context);
                    Bundle bundle27 = new Bundle();
                    bundle27.putParcelable("appWidgetPreview", remoteViews27);
                    instance27.requestPinAppWidget(componentName27, bundle27, broadcast27);
                    return;
                } else {
                    return;
                }
            case 28:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance28 = AppWidgetManager.getInstance(context);
                    ComponentName componentName28 = new ComponentName(context, ClockStyle28ProviderReceiver.class);
                    if (!instance28.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast28 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle28ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle28ProviderReceiver.Companion companion28 = ClockStyle28ProviderReceiver.Companion;
                    RemoteViews remoteViews28 = companion28.getRemoteViews(context);
                    Bundle bundle28 = new Bundle();
                    bundle28.putParcelable("appWidgetPreview", remoteViews28);
                    instance28.requestPinAppWidget(componentName28, bundle28, broadcast28);
                    return;
                } else {
                    return;
                }
            case 29:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance29 = AppWidgetManager.getInstance(context);
                    ComponentName componentName29 = new ComponentName(context, ClockStyle29ProviderReceiver.class);
                    if (!instance29.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast29 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle29ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle29ProviderReceiver.Companion companion29 = ClockStyle29ProviderReceiver.Companion;
                    RemoteViews remoteViews29 = companion29.getRemoteViews(context);
                    Bundle bundle29 = new Bundle();
                    bundle29.putParcelable("appWidgetPreview", remoteViews29);
                    instance29.requestPinAppWidget(componentName29, bundle29, broadcast29);
                    return;
                } else {
                    return;
                }
            case 30:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance30 = AppWidgetManager.getInstance(context);
                    ComponentName componentName30 = new ComponentName(context, ClockStyle30ProviderReceiver.class);
                    if (!instance30.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast30 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle30ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle30ProviderReceiver.Companion companion30 = ClockStyle30ProviderReceiver.Companion;
                    RemoteViews remoteViews30 = companion30.getRemoteViews(context);
                    Bundle bundle30 = new Bundle();
                    bundle30.putParcelable("appWidgetPreview", remoteViews30);
                    instance30.requestPinAppWidget(componentName30, bundle30, broadcast30);
                    return;
                } else {
                    return;
                }
            case 31:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance31 = AppWidgetManager.getInstance(context);
                    ComponentName componentName31 = new ComponentName(context, ClockStyle31ProviderReceiver.class);
                    if (!instance31.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast31 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle31ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle31ProviderReceiver.Companion companion31 = ClockStyle31ProviderReceiver.Companion;
                    RemoteViews remoteViews31 = companion31.getRemoteViews(context);
                    Bundle bundle31 = new Bundle();
                    bundle31.putParcelable("appWidgetPreview", remoteViews31);
                    instance31.requestPinAppWidget(componentName31, bundle31, broadcast31);
                    return;
                } else {
                    return;
                }
            case 32:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance32 = AppWidgetManager.getInstance(context);
                    ComponentName componentName32 = new ComponentName(context, ClockStyle32ProviderReceiver.class);
                    if (!instance32.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast32 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle32ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle32ProviderReceiver.Companion companion32 = ClockStyle32ProviderReceiver.Companion;
                    RemoteViews remoteViews32 = companion32.getRemoteViews(context);
                    Bundle bundle32 = new Bundle();
                    bundle32.putParcelable("appWidgetPreview", remoteViews32);
                    instance32.requestPinAppWidget(componentName32, bundle32, broadcast32);
                    return;
                } else {
                    return;
                }
            case 33:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance33 = AppWidgetManager.getInstance(context);
                    ComponentName componentName33 = new ComponentName(context, ClockStyle33ProviderReceiver.class);
                    if (!instance33.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast33 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle33ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle33ProviderReceiver.Companion companion33 = ClockStyle33ProviderReceiver.Companion;
                    RemoteViews remoteViews33 = companion33.getRemoteViews(context);
                    Bundle bundle33 = new Bundle();
                    bundle33.putParcelable("appWidgetPreview", remoteViews33);
                    instance33.requestPinAppWidget(componentName33, bundle33, broadcast33);
                    return;
                } else {
                    return;
                }
            case 34:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance34 = AppWidgetManager.getInstance(context);
                    ComponentName componentName34 = new ComponentName(context, ClockStyle34ProviderReceiver.class);
                    if (!instance34.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast34 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle34ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle34ProviderReceiver.Companion companion34 = ClockStyle34ProviderReceiver.Companion;
                    RemoteViews remoteViews34 = companion34.getRemoteViews(context);
                    Bundle bundle34 = new Bundle();
                    bundle34.putParcelable("appWidgetPreview", remoteViews34);
                    instance34.requestPinAppWidget(componentName34, bundle34, broadcast34);
                    return;
                } else {
                    return;
                }
            case 35:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance35 = AppWidgetManager.getInstance(context);
                    ComponentName componentName35 = new ComponentName(context, ClockStyle35ProviderReceiver.class);
                    if (!instance35.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast35 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle35ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle35ProviderReceiver.Companion companion35 = ClockStyle35ProviderReceiver.Companion;
                    RemoteViews remoteViews35 = companion35.getRemoteViews(context);
                    Bundle bundle35 = new Bundle();
                    bundle35.putParcelable("appWidgetPreview", remoteViews35);
                    instance35.requestPinAppWidget(componentName35, bundle35, broadcast35);
                    return;
                } else {
                    return;
                }
            case 36:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance36 = AppWidgetManager.getInstance(context);
                    ComponentName componentName36 = new ComponentName(context, ClockStyle36ProviderReceiver.class);
                    if (!instance36.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast36 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle36ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle36ProviderReceiver.Companion companion36 = ClockStyle36ProviderReceiver.Companion;
                    RemoteViews remoteViews36 = companion36.getRemoteViews(context);
                    Bundle bundle36 = new Bundle();
                    bundle36.putParcelable("appWidgetPreview", remoteViews36);
                    instance36.requestPinAppWidget(componentName36, bundle36, broadcast36);
                    return;
                } else {
                    return;
                }
            case 37:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance37 = AppWidgetManager.getInstance(context);
                    ComponentName componentName37 = new ComponentName(context, ClockStyle37ProviderReceiver.class);
                    if (!instance37.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast37 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle37ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle37ProviderReceiver.Companion companion37 = ClockStyle37ProviderReceiver.Companion;
                    RemoteViews remoteViews37 = companion37.getRemoteViews(context);
                    Bundle bundle37 = new Bundle();
                    bundle37.putParcelable("appWidgetPreview", remoteViews37);
                    instance37.requestPinAppWidget(componentName37, bundle37, broadcast37);
                    return;
                } else {
                    return;
                }
            case 38:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance38 = AppWidgetManager.getInstance(context);
                    ComponentName componentName38 = new ComponentName(context, ClockStyle38ProviderReceiver.class);
                    if (!instance38.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast38 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle38ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle38ProviderReceiver.Companion companion38 = ClockStyle38ProviderReceiver.Companion;
                    RemoteViews remoteViews38 = companion38.getRemoteViews(context);
                    Bundle bundle38 = new Bundle();
                    bundle38.putParcelable("appWidgetPreview", remoteViews38);
                    instance38.requestPinAppWidget(componentName38, bundle38, broadcast38);
                    return;
                } else {
                    return;
                }
            case 39:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance39 = AppWidgetManager.getInstance(context);
                    ComponentName componentName39 = new ComponentName(context, ClockStyle39ProviderReceiver.class);
                    if (!instance39.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast39 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle39ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle39ProviderReceiver.Companion companion39 = ClockStyle39ProviderReceiver.Companion;
                    RemoteViews remoteViews39 = companion39.getRemoteViews(context);
                    Bundle bundle39 = new Bundle();
                    bundle39.putParcelable("appWidgetPreview", remoteViews39);
                    instance39.requestPinAppWidget(componentName39, bundle39, broadcast39);
                    return;
                } else {
                    return;
                }
            case 40:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance40 = AppWidgetManager.getInstance(context);
                    ComponentName componentName40 = new ComponentName(context, ClockStyle40ProviderReceiver.class);
                    if (!instance40.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast40 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle40ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle40ProviderReceiver.Companion companion40 = ClockStyle40ProviderReceiver.Companion;
                    RemoteViews remoteViews40 = companion40.getRemoteViews(context);
                    Bundle bundle40 = new Bundle();
                    bundle40.putParcelable("appWidgetPreview", remoteViews40);
                    instance40.requestPinAppWidget(componentName40, bundle40, broadcast40);
                    return;
                } else {
                    return;
                }
            case 41:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance41 = AppWidgetManager.getInstance(context);
                    ComponentName componentName41 = new ComponentName(context, ClockStyle41ProviderReceiver.class);
                    if (!instance41.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast41 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle41ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle41ProviderReceiver.Companion companion41 = ClockStyle41ProviderReceiver.Companion;
                    RemoteViews remoteViews41 = companion41.getRemoteViews(context);
                    Bundle bundle41 = new Bundle();
                    bundle41.putParcelable("appWidgetPreview", remoteViews41);
                    instance41.requestPinAppWidget(componentName41, bundle41, broadcast41);
                    return;
                } else {
                    return;
                }
            case 42:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance42 = AppWidgetManager.getInstance(context);
                    ComponentName componentName42 = new ComponentName(context, ClockStyle42ProviderReceiver.class);
                    if (!instance42.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast42 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle42ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle42ProviderReceiver.Companion companion42 = ClockStyle42ProviderReceiver.Companion;
                    RemoteViews remoteViews42 = companion42.getRemoteViews(context);
                    Bundle bundle42 = new Bundle();
                    bundle42.putParcelable("appWidgetPreview", remoteViews42);
                    instance42.requestPinAppWidget(componentName42, bundle42, broadcast42);
                    return;
                } else {
                    return;
                }
            case 43:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance43 = AppWidgetManager.getInstance(context);
                    ComponentName componentName43 = new ComponentName(context, ClockStyle43ProviderReceiver.class);
                    if (!instance43.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast43 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle43ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle43ProviderReceiver.Companion companion43 = ClockStyle43ProviderReceiver.Companion;
                    RemoteViews remoteViews43 = companion43.getRemoteViews(context);
                    Bundle bundle43 = new Bundle();
                    bundle43.putParcelable("appWidgetPreview", remoteViews43);
                    instance43.requestPinAppWidget(componentName43, bundle43, broadcast43);
                    return;
                } else {
                    return;
                }
            case 44:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance44 = AppWidgetManager.getInstance(context);
                    ComponentName componentName44 = new ComponentName(context, ClockStyle44ProviderReceiver.class);
                    if (!instance44.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast44 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle44ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle44ProviderReceiver.Companion companion44 = ClockStyle44ProviderReceiver.Companion;
                    RemoteViews remoteViews44 = companion44.getRemoteViews(context);
                    Bundle bundle44 = new Bundle();
                    bundle44.putParcelable("appWidgetPreview", remoteViews44);
                    instance44.requestPinAppWidget(componentName44, bundle44, broadcast44);
                    return;
                } else {
                    return;
                }
            case 45:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance45 = AppWidgetManager.getInstance(context);
                    ComponentName componentName45 = new ComponentName(context, ClockStyle45ProviderReceiver.class);
                    if (!instance45.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast45 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle45ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle45ProviderReceiver.Companion companion45 = ClockStyle45ProviderReceiver.Companion;
                    RemoteViews remoteViews45 = companion45.getRemoteViews(context);
                    Bundle bundle45 = new Bundle();
                    bundle45.putParcelable("appWidgetPreview", remoteViews45);
                    instance45.requestPinAppWidget(componentName45, bundle45, broadcast45);
                    return;
                } else {
                    return;
                }
            case 46:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance46 = AppWidgetManager.getInstance(context);
                    ComponentName componentName46 = new ComponentName(context, ClockStyle46ProviderReceiver.class);
                    if (!instance46.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast46 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle46ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle46ProviderReceiver.Companion companion46 = ClockStyle46ProviderReceiver.Companion;
                    RemoteViews remoteViews46 = companion46.getRemoteViews(context);
                    Bundle bundle46 = new Bundle();
                    bundle46.putParcelable("appWidgetPreview", remoteViews46);
                    instance46.requestPinAppWidget(componentName46, bundle46, broadcast46);
                    return;
                } else {
                    return;
                }
            case 47:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance47 = AppWidgetManager.getInstance(context);
                    ComponentName componentName47 = new ComponentName(context, ClockStyle47ProviderReceiver.class);
                    if (!instance47.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast47 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle47ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle47ProviderReceiver.Companion companion47 = ClockStyle47ProviderReceiver.Companion;
                    RemoteViews remoteViews47 = companion47.getRemoteViews(context);
                    Bundle bundle47 = new Bundle();
                    bundle47.putParcelable("appWidgetPreview", remoteViews47);
                    instance47.requestPinAppWidget(componentName47, bundle47, broadcast47);
                    return;
                } else {
                    return;
                }
            case 48:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance48 = AppWidgetManager.getInstance(context);
                    ComponentName componentName48 = new ComponentName(context, ClockStyle48ProviderReceiver.class);
                    if (!instance48.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast48 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle48ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle48ProviderReceiver.Companion companion48 = ClockStyle48ProviderReceiver.Companion;
                    RemoteViews remoteViews48 = companion48.getRemoteViews(context);
                    Bundle bundle48 = new Bundle();
                    bundle48.putParcelable("appWidgetPreview", remoteViews48);
                    instance48.requestPinAppWidget(componentName48, bundle48, broadcast48);
                    return;
                } else {
                    return;
                }
            case 49:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance49 = AppWidgetManager.getInstance(context);
                    ComponentName componentName49 = new ComponentName(context, ClockStyle49ProviderReceiver.class);
                    if (!instance49.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast49 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle49ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle49ProviderReceiver.Companion companion49 = ClockStyle49ProviderReceiver.Companion;
                    RemoteViews remoteViews49 = companion49.getRemoteViews(context);
                    Bundle bundle49 = new Bundle();
                    bundle49.putParcelable("appWidgetPreview", remoteViews49);
                    instance49.requestPinAppWidget(componentName49, bundle49, broadcast49);
                    return;
                } else {
                    return;
                }
            case 50:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance50 = AppWidgetManager.getInstance(context);
                    ComponentName componentName50 = new ComponentName(context, ClockStyle50ProviderReceiver.class);
                    if (!instance50.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast50 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle50ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle50ProviderReceiver.Companion companion50 = ClockStyle50ProviderReceiver.Companion;
                    RemoteViews remoteViews50 = companion50.getRemoteViews(context);
                    Bundle bundle50 = new Bundle();
                    bundle50.putParcelable("appWidgetPreview", remoteViews50);
                    instance50.requestPinAppWidget(componentName50, bundle50, broadcast50);
                    return;
                } else {
                    return;
                }
            case 51:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance51 = AppWidgetManager.getInstance(context);
                    ComponentName componentName51 = new ComponentName(context, ClockStyle51ProviderReceiver.class);
                    if (!instance51.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast51 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle51ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle51ProviderReceiver.Companion companion51 = ClockStyle51ProviderReceiver.Companion;
                    RemoteViews remoteViews51 = companion51.getRemoteViews(context);
                    Bundle bundle51 = new Bundle();
                    bundle51.putParcelable("appWidgetPreview", remoteViews51);
                    instance51.requestPinAppWidget(componentName51, bundle51, broadcast51);
                    return;
                } else {
                    return;
                }
            case 52:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance52 = AppWidgetManager.getInstance(context);
                    ComponentName componentName52 = new ComponentName(context, ClockStyle52ProviderReceiver.class);
                    if (!instance52.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast52 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle52ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle52ProviderReceiver.Companion companion52 = ClockStyle52ProviderReceiver.Companion;
                    RemoteViews remoteViews52 = companion52.getRemoteViews(context);
                    Bundle bundle52 = new Bundle();
                    bundle52.putParcelable("appWidgetPreview", remoteViews52);
                    instance52.requestPinAppWidget(componentName52, bundle52, broadcast52);
                    return;
                } else {
                    return;
                }
            case 53:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance53 = AppWidgetManager.getInstance(context);
                    ComponentName componentName53 = new ComponentName(context, ClockStyle53ProviderReceiver.class);
                    if (!instance53.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast53 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle53ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle53ProviderReceiver.Companion companion53 = ClockStyle53ProviderReceiver.Companion;
                    RemoteViews remoteViews53 = companion53.getRemoteViews(context);
                    Bundle bundle53 = new Bundle();
                    bundle53.putParcelable("appWidgetPreview", remoteViews53);
                    instance53.requestPinAppWidget(componentName53, bundle53, broadcast53);
                    return;
                } else {
                    return;
                }
            case 54:
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance54 = AppWidgetManager.getInstance(context);
                    ComponentName componentName54 = new ComponentName(context, ClockStyle54ProviderReceiver.class);
                    if (!instance54.isRequestPinAppWidgetSupported()) {
                        Toast.makeText(context, getString(R.string.error_widget_pinning_not_supported_by_launcher), Toast.LENGTH_LONG).show();
                        return;
                    }
                    PendingIntent broadcast54 = PendingIntent.getBroadcast(this.context, this.BROADCAST_ID, new Intent(this.context, ClockStyle54ProviderReceiver.class), PendingIntent.FLAG_IMMUTABLE);
                    ClockStyle54ProviderReceiver.Companion companion54 = ClockStyle54ProviderReceiver.Companion;
                    RemoteViews remoteViews54 = companion54.getRemoteViews(context);
                    Bundle bundle54 = new Bundle();
                    bundle54.putParcelable("appWidgetPreview", remoteViews54);
                    instance54.requestPinAppWidget(componentName54, bundle54, broadcast54);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
