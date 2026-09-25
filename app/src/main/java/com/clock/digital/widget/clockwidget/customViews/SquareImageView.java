package com.clock.digital.widget.clockwidget.customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageView;




public final class SquareImageView extends AppCompatImageView {


    public SquareImageView(Context context) {
        super(context);
        
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        
    }

    
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(min, min);
    }
}
