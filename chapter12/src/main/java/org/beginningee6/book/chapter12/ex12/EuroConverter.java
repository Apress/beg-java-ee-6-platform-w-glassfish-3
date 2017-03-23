/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beginningee6.book.chapter12.ex12;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import java.text.DecimalFormat;

/**
 * @author damiengouyette
 */
@FacesConverter(value = "euroConverter")
public class EuroConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return value;
    }

    @Override
    public String getAsString(FacesContext ctx, UIComponent component, Object value) {
        float amountInDollars = Float.parseFloat(value.toString());
        double ammountInEuros = amountInDollars * 0.8;
        DecimalFormat df = new DecimalFormat("###,##0.##");
        return df.format(ammountInEuros);
    }
}