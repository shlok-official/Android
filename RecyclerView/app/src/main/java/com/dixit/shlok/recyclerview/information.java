package com.dixit.shlok.recyclerview;

/**
 * Created by ShlokDixit on 3/22/17.
 */

public class information {
    private int iconId;
    private String title;

    public information(int iconId, String title) {
        this.iconId = iconId;
        this.title = title;
    }

    public int getIconId() {
        return iconId;
    }

    public String getTitle() {
        return title;
    }
}
