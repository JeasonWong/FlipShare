package me.wangyuwei.flipshare;

import android.graphics.Bitmap;
import android.graphics.Color;

/**
 * 作者： 巴掌 on 16/9/3 14:05
 * Github: https://github.com/JeasonWong
 */
public class ShareItem {

    public String title;
    public int titleColor = Color.BLACK;
    public int bgColor = Color.WHITE;
    public Bitmap icon;

    public ShareItem(String title) {
        this.title = title;
    }

    public ShareItem(String title, Bitmap icon) {
        this.title = title;
        this.icon = icon;
    }

    public ShareItem(String title, int bgColor) {
        this.title = title;
        this.bgColor = bgColor;
    }

    public ShareItem(String title, int titleColor, int bgColor) {
        this.title = title;
        this.titleColor = titleColor;
        this.bgColor = bgColor;
    }

    public ShareItem(String title, int bgColor, Bitmap icon) {
        this.title = title;
        this.bgColor = bgColor;
        this.icon = icon;
    }

    public ShareItem(String title, int titleColor, int bgColor, Bitmap icon) {
        this.title = title;
        this.titleColor = titleColor;
        this.bgColor = bgColor;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "ShareItem{"
                + "title='" + title + '\''
                + ", titleColor=" + titleColor
                + ", bgColor=" + bgColor
                + ", icon=" + icon
                + '}';
    }
}
