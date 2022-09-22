package com.swi.androidlist1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MiniatmHolder> {

    private ArrayList<Item> itemArrayList;
    Context context;

    public ItemAdapter(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @Override
    public MiniatmHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_layout, viewGroup, false);
        return new MiniatmHolder(v);
    }

    @Override
    public void onBindViewHolder(MiniatmHolder miniatmHolder, int i) {
        miniatmHolder.tvItemListMenuMiniAtm.setText((CharSequence) itemArrayList.get(i).getItem_list_menu());
        context = itemArrayList.get(i).getContext();
        if (itemArrayList.get(i).getDrawable() == 0) {
            miniatmHolder.imageView4.setVisibility(View.GONE);
        } else {
            miniatmHolder.imageView4.setImageResource(itemArrayList.get(i).getDrawable());
        }
        if (!itemArrayList.get(i).isSub_menu()) {
            miniatmHolder.imageView3.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public class MiniatmHolder extends RecyclerView.ViewHolder {
        private TextView tvItemListMenuMiniAtm;
        private ImageView imageView3;
        private ImageView imageView4;

        public MiniatmHolder(View view) {
            super(view);
            tvItemListMenuMiniAtm = (TextView) view.findViewById(R.id.tvItemListMenuMiniAtm);
            imageView3 = (ImageView) view.findViewById(R.id.imageView3);
            imageView4 = (ImageView) view.findViewById(R.id.imageView4);
        }
    }

}
