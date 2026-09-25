package com.clock.digital.widget.clockwidget.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.clock.digital.widget.clockwidget.Ad.Common_Banner_google;
import com.clock.digital.widget.clockwidget.Ad.Common_native_google;

import java.util.ArrayList;

import com.clock.digital.widget.clockwidget.ContextKt;
import com.clock.digital.widget.clockwidget.PreferenceUtils;
import com.clock.digital.widget.clockwidget.R;
import com.clock.digital.widget.clockwidget.adapter.ClockStyleSelectionAdapter;
import com.clock.digital.widget.clockwidget.p005interface.ItemClickListenerWidgetImage;
import com.clock.digital.widget.clockwidget.p005interface.ItemLongClickListenerWidgetImage;


public final class MainActivity extends AppCompatActivity implements ItemClickListenerWidgetImage, ItemLongClickListenerWidgetImage {
    private final int REQ_CODE_CUSTOMIZATION_ACTIVITY = 2323;
    private ClockStyleSelectionAdapter adapter;
    private ArrayList<Integer> clockPreviewArrayList = new ArrayList<>();
    private TypedArray clockPreviewTypedArray;
    public Context context;
    public Dialog dialog;
    public Dialog dialogUserGuide;
    private GridLayoutManager gridLayoutManager;
    private ImageView ivInfo;
    private ImageView ivShare;
    private PreferenceUtils preferenceUtils;
    private RecyclerView recyclerView;


    public void onLongClickItem(View view, int i) {
    }



    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        Context context2 = this;
        this.context = context2;

        LinearLayout banner = (LinearLayout) findViewById(R.id.adView);
        Common_Banner_google common_bannerad = new Common_Banner_google();
        common_bannerad.GoogleBannerAds(getApplicationContext(), banner);

        initViews();
        preferenceUtils = PreferenceUtils.INSTANCE.getInstance(context2);

        this.dialog = new Dialog(context2);
        this.dialogUserGuide = new Dialog(context2);

        this.clockPreviewTypedArray = getResources().obtainTypedArray(R.array.widget_clock_style_images_array);
        clockPreviewArrayList.clear();

        int length = clockPreviewTypedArray.length() - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                clockPreviewArrayList.add(Integer.valueOf(clockPreviewTypedArray.getResourceId(i, 0)));
                if (i == length) {
                    break;
                }
                i++;
            }
        }

        adapter = new ClockStyleSelectionAdapter(this, clockPreviewArrayList);
        adapter.setClickListener(this);
        adapter.setLongClickListener(this);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.context, 1);
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.divider_grid_view, (Resources.Theme) null);
        dividerItemDecoration.setDrawable(drawable);

        recyclerView.addItemDecoration(dividerItemDecoration);
        this.gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        recyclerView.setLayoutManager(this.gridLayoutManager);
        recyclerView.clearOnScrollListeners();
        recyclerView.setAdapter(this.adapter);


        Boolean userGuideShowOrNot = preferenceUtils.getUserGuideShowOrNot();
        if (userGuideShowOrNot.booleanValue()) {
            showUserGuideDialog();
            preferenceUtils.setUserGudeShowOrNot(false);
        }


        ivShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });
        ivInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showUserGuideDialog();
            }
        });
    }


    public final void initViews() {
        ivShare = (ImageView) findViewById(R.id.activity_main_iv_share);
        ivInfo = (ImageView) findViewById(R.id.activity_main_iv_info);
        recyclerView = (RecyclerView) findViewById(R.id.activity_main_widget_selection_recycler_view);

    }

    public void onClickItem(View view, int i) {
        Intent intent = new Intent(this, ClockEditorActivity.class);
        intent.putExtra(ContextKt.WIDGET_CLOCK_TYPE, ContextKt.getWidgetID(i));
        startActivity(intent);

    }


    public final void showUserGuideDialog() {
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_user_guide);

        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);

        VideoView videoView = (VideoView) dialog.findViewById(R.id.dialog_user_guide_vv);
        TextView textView = (TextView) dialog.findViewById(R.id.dialog_user_guide_tv_ok);

        Shader linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 120.0f, ResourcesCompat.getColor(getResources(), R.color.colorYellow, (Resources.Theme) null), ResourcesCompat.getColor(getResources(), R.color.colorPink, (Resources.Theme) null), Shader.TileMode.CLAMP);

        TextPaint paint = textView.getPaint();
        paint.setShader(linearGradient);

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName().toString() + "/" + R.raw.user_guide));
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoView.start();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
                dialog.dismiss();
            }
        });

        dialog.show();

    }


    public void onBackPressed() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this, R.style.traparentdialog);
        View inflate = LayoutInflater.from(this).inflate(R.layout.namemean_popular_exit_dialog, (ViewGroup) null);
        if (Build.VERSION.SDK_INT >= 23) {
            inflate.setForegroundGravity(17);
        }
        builder.setView(inflate);
        final AlertDialog create = builder.create();
        create.show();

        LinearLayout fl_adplaceholder = (LinearLayout) inflate.findViewById(R.id.fl_adplaceholder1);
        Common_native_google commonNativeGoogle = new Common_native_google();
        commonNativeGoogle.GoogleloadNativeAds(this, fl_adplaceholder);


        ((TextView) inflate.findViewById(R.id.yes)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.finishAffinity();
                create.dismiss();
            }
        });
        ((TextView) inflate.findViewById(R.id.no)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        ((TextView) inflate.findViewById(R.id.rate)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
                String str = "android.intent.action.VIEW";
                Intent intent2 = new Intent(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http://play.google.com/store/apps/details?id=");
                sb2.append(getPackageName());
                intent2.setData(Uri.parse(sb2.toString()));
                startActivity(intent2);
            }
        });
    }

}
