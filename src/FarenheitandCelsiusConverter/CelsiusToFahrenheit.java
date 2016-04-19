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
public class CelsiusToFahrenheit implements TempConverterStrategy{

    @Override
    public double getTemperature(double degrees) {
        double celsiusToFahrenheit = ((degrees * 5/9) + 32);
        return celsiusToFahrenheit;
    }
    
}
