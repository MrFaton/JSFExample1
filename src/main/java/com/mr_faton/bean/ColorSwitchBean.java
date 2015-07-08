package com.mr_faton.bean;

import javax.faces.application.Application;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.awt.*;

/**
 * Created by Mr_Faton on 08.07.2015.
 */
@ApplicationScoped/*change scope only for test*/
@ManagedBean(eager = true)/*this is like singleton with early load*/
public class ColorSwitchBean {
    static int colorChangeCount = 0;

    public void changeColorAndAddOutput(ActionEvent actionEvent) {
        colorChangeCount++;
        UIComponent uiComponent = actionEvent.getComponent();
        changeColor(uiComponent);
        addButtonLabel(uiComponent);
    }

    private void changeColor(UIComponent component) {
        HtmlCommandButton button = (HtmlCommandButton) component;
        Color color = getRandomColor();
        String hexStringColor = getHexStringColor(color);

        button.setStyle("color:" + hexStringColor);
        button.setValue("Color changed " + colorChangeCount + " time(s)");
    }

    private void addButtonLabel (UIComponent component) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application application = facesContext.getApplication();
        UIOutput label = (UIOutput) application.createComponent(HtmlOutputLabel.COMPONENT_TYPE);
        label.setValue("Label №" + colorChangeCount);
        //this is because List of Child is mutate and if we change it, than it will change is whole system
        component.getChildren().add(label);
    }




    private Color getRandomColor() {
        int r = getColorNum();
        int g = getColorNum();
        int b = getColorNum();

        return new Color(r, g, b);
    }

    public int getColorNum() {
        return (int) (Math.random() * 256);
    }

    private String getHexStringColor(Color color) {
        int rgb = color.getRGB();
        String hexColor = Integer.toHexString(rgb & 0xffffff);
        hexColor = "000000".substring(0, 6 - hexColor.length()) + hexColor;
        return "#" + hexColor;
    }
}