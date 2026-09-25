package com.clock.digital.widget.clockwidget.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.clock.digital.widget.clockwidget.R;
import com.clock.digital.widget.clockwidget.p005interface.ItemClickListenerWidgetImage;
import com.clock.digital.widget.clockwidget.p005interface.ItemLongClickListenerWidgetImage;


public final class ClockStyleSelectionAdapter extends RecyclerView.Adapter<ClockStyleSelectionAdapter.ItemHolder> {

    public ItemClickListenerWidgetImage clickListenerImage;
    private ArrayList<Integer> clockPreviewArrayList;
    private final Activity context;
    public ItemLongClickListenerWidgetImage longClickListener;

    public final ArrayList<Integer> getClockPreviewArrayList() {
        return this.clockPreviewArrayList;
    }

    public final void setClockPreviewArrayList(ArrayList<Integer> arrayList) {
        this.clockPreviewArrayList = arrayList;
    }

    public ClockStyleSelectionAdapter(Activity activity, ArrayList<Integer> arrayList) {
        this.context = activity;
        this.clockPreviewArrayList = arrayList;
    }

    public ItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_clock_style_selection, viewGroup, false);
        return new ItemHolder(inflate);
    }

    public void onBindViewHolder(ItemHolder itemHolder, int i) {

        ImageView ivWidgetPreview = itemHolder.getIvWidgetPreview();
        Integer num = clockPreviewArrayList.get(i);
        ivWidgetPreview.setImageResource(num.intValue());
    }

    public int getItemCount() {
        return clockPreviewArrayList.size();
    }

    public final void setClickListener(ItemClickListenerWidgetImage itemClickListenerWidgetImage) {
        this.clickListenerImage = itemClickListenerWidgetImage;
    }

    public final void setLongClickListener(ItemLongClickListenerWidgetImage itemLongClickListenerWidgetImage) {
        this.longClickListener = itemLongClickListenerWidgetImage;
    }


    public final class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        private final ImageView ivWidgetPreview;

        public ItemHolder( View view) {
            super(view);
            ivWidgetPreview = (ImageView) view.findViewById(R.id.item_widget_clock_style_selection_iv_image);
            ivWidgetPreview.setOnClickListener(this);
            ivWidgetPreview.setOnLongClickListener(this);
        }

        public final ImageView getIvWidgetPreview() {
            return this.ivWidgetPreview;
        }


        public void onClick(View view) {
            if (clickListenerImage != null) {
                clickListenerImage.onClickItem(view, getAdapterPosition() + 1);
            }
        }

        public boolean onLongClick(View view) {
            if (longClickListener != null) {
                longClickListener.onLongClickItem(view, getAdapterPosition() + 1);
            }
            return true;
        }
    }
}
