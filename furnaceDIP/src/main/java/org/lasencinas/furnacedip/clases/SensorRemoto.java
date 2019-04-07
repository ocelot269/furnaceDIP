
package org.lasencinas.furnacedip.clases;

import org.lasencinas.furnacedip.interfaces.Thermometer;


public class SensorRemoto implements  Thermometer{

    public SensorRemoto() {
    }

    @Override
    public double read(Habitacion temperatura) {
        return temperatura.getTemperaturaHabitacion();
    }
    
    
}
