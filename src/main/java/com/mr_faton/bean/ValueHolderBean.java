package com.mr_faton.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Mr_Faton on 07.07.2015.
 */
@ManagedBean(name = "valueHolder")
@RequestScoped
public class ValueHolderBean {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
