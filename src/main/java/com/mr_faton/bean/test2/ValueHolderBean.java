package com.mr_faton.bean.test2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Mr_Faton on 07.07.2015.
 */
//@ManagedBean - this annotation means that bean name is "valueHolderBean"
//also I can declare this bean without annotation in faces-config.xml
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
