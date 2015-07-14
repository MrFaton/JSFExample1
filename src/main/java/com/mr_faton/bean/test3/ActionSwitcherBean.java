package com.mr_faton.bean.test3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Mr_Faton on 08.07.2015.
 */
@ManagedBean
@RequestScoped
public class ActionSwitcherBean {
    private String line;
    private final int divider = 3;

    private final String page0 = "action-switcher-page0";
    private final String page1 = "action-switcher-page1";
    private final String page2 = "action-switcher-page2";

    public String nextPage() {
        int remainder = line.length() % divider;
        switch (remainder) {
            case 0: {
                return page0;
            }
            case 1: {
                return page1;
            }
            case 2: {
                return page2;
            }
            default: {
                throw new RuntimeException("That's couldn't happen!");
            }
        }
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}