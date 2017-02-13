package com.tongxuweixin.util;


public class Menu {
    private WeChatButton[] button;

    private ViewButton[] viewButton;


    public ViewButton[] getViewButton() {
        return viewButton;
    }

    public void setViewButton(ViewButton[] viewButton) {
        this.viewButton = viewButton;
    }

    private Matchrule matchrule;

    public Matchrule getMatchrule() {
        return matchrule;
    }

    public void setMatchrule(Matchrule matchrule) {
        this.matchrule = matchrule;
    }

    public WeChatButton[] getButton() {
        return button;
    }

    public void setButton(WeChatButton[] button) {
        this.button = button;
    }
}
