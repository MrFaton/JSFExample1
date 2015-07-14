package com.mr_faton.bean.test7;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created by root on 14.07.2015.
 */
@FacesValidator("temperatureValidator")
public class TemperatureValidator implements Validator {
    private static final int limit = 500_000;

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        double temperature;
        try {
            System.out.println("Start validator");
            System.out.println("temp = " + o);
            temperature = Double.valueOf(o.toString());
            if (temperature < (-limit) || temperature > limit) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            System.out.println("catch exception");
            FacesMessage errorMessage = new FacesMessage("" +
                    "You input not a number or number that over the limit!",
                    "Please, input number like 15 and the limit is: from " + (-limit) + "to " + limit);
            errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(errorMessage);
        }
    }
}
