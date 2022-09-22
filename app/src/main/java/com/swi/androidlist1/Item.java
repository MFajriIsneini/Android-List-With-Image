package com.swi.androidlist1;

import android.content.Context;

public class Item {
    private String item_list_menu;
    private boolean sub_menu;
    Context context;
    private int drawable = 0;

    public Item(String item_list_menu, boolean subMenu, Context context) {
        this.item_list_menu = item_list_menu;
        this.sub_menu = subMenu;
        this.context = context;
    }

    public Item(int drawable, String item_list_menu, boolean subMenu, Context context) {
        this.item_list_menu = item_list_menu;
        this.sub_menu = subMenu;
        this.context = context;
        this.drawable = drawable;
    }

    public String getItem_list_menu() {
        return item_list_menu;
    }

    public void setItem_list_menu(String item_list_menu) {
        this.item_list_menu = item_list_menu;
    }

    public boolean isSub_menu() {
        return sub_menu;
    }

    public void setSub_menu(boolean sub_menu) {
        this.sub_menu = sub_menu;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
