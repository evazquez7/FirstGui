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
public interface TempConverterStrategy {
    public abstract double getTemperature(double degrees);
}
