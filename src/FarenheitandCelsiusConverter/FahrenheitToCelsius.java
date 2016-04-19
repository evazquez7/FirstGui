/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FarenheitandCelsiusConverter;

/**
 *
 * @author Emilio
 */
public class FahrenheitToCelsius implements TempConverterStrategy{
    
    @Override
    public double getTemperature(double degrees) {
     double fahrenheitToCelsius = ((degrees - 32)*5/9);
     return fahrenheitToCelsius;
    }
    
}
