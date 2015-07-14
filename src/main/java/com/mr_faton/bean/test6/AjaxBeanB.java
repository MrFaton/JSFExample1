package com.mr_faton.bean.test6;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.AjaxBehaviorEvent;
import java.util.Date;

/**
 * Created by root on 14.07.2015.
 */
@RequestScoped
@ManagedBean
public class AjaxBeanB {
    private String message = "";

    public void handleEvent(AjaxBehaviorEvent event) {
        UIComponent component = event.getComponent();
        message = "" +
                "component type - " + component.getRendererType() + "\n" +
                "component id - " + component.getClientId() + "\n" +
                "event date - " + new Date();
    }

    public String getMessage() {
        return message;
    }
}
