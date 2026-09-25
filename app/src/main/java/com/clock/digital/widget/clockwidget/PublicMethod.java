package com.clock.digital.widget.clockwidget;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;

import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileOutputStream;

public class PublicMethod {

    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

    public static void moreAppsPlayStore(Context context) {
        if (isNetworkAvailable(context)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.allappslink))));
            } catch (ActivityNotFoundException unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.allappsweblink))));
            }
        } else {
            Toast.makeText(context, context.getResources().getString(R.string.nointernet), Toast.LENGTH_LONG).show();
        }
    }

    public static void privacyPolicy(Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/view/photoeffecttech/privacy-policy")));
    }

    public static void shareApp(Context context) {
        Uri urishare;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.mipmap.logo);
        File file = new File(context.getExternalCacheDir() + "/image.png");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            decodeResource.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.TEXT", "\n\nThis is really amazing Clock Widget App. Its can provide us more attractive designs for your home screen. Download the Amazing MyApplication " + context.getResources().getString(R.string.app_name) + "  : \n\n" + "https://play.google.com/store/apps/details?id=" + context.getPackageName());
            if (Build.VERSION.SDK_INT >= 23) {
                urishare = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
            } else {
                urishare = Uri.fromFile(file);
            }
            intent.putExtra("android.intent.extra.STREAM", urishare);
            context.startActivity(Intent.createChooser(intent, "Share Image using"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void rateApp(Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + context.getPackageName())));
        }
    }

    private static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

}
