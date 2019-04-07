
package org.lasencinas.furnacedip.clases;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.lasencinas.furnacedip.interfaces.Heater;
import org.lasencinas.furnacedip.interfaces.Thermometer;


public class ReguladorIT {
    
    public ReguladorIT() {
    }
    
    @Before
    public void setUp(){
        Habitacion.getSingletonInstance(15);
    }

    @Test
    public void testRegulate() {
        
        Thermometer detector = new SensorRemoto();
        
        Heater estufita = new Estufa();
        double maxTemperatura=22d;
        double minTemperatura=15d;
        Regulador regulator = new Regulador();
        regulator.regulate(detector, estufita, minTemperatura, maxTemperatura, Habitacion.getLaHabitacion());
        assertEquals(15, Habitacion.getLaHabitacion().getTemperaturaHabitacion(),0);
        
    }
    
}
