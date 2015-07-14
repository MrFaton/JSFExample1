package com.mr_faton.bean.test5;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by root on 14.07.2015.
 */
@ManagedBean
@RequestScoped
public class AjaxBeanA {
    private static int count = 0;
    private static final String STR = "Hello buddy ";

    private String fieldValue;
    //Warning! For access to this method from .xhtml-page it is must starts with "get"!
    public String getMessage() {
        if (fieldValue != null) {
            return STR + fieldValue + " (" + (++count) + " time(s))";
        }
        return "";
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}
