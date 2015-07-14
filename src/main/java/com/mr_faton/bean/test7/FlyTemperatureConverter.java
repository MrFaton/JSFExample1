package com.mr_faton.bean.test7;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by root on 14.07.2015.
 */
@ManagedBean
@RequestScoped
public class FlyTemperatureConverter {
    private static final double K = 273.15;
    private static final double F = 32;
    private static final double fMultiplier = 9 / 5;

    private double c = 0;

    public String getInKelvin() {
        return (c + K) + "";
    }

    public String getInFahrenheit() {
        return (c * fMultiplier + F) + "";
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
