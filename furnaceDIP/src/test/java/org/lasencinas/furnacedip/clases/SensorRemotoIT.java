
package org.lasencinas.furnacedip.clases;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.lasencinas.furnacedip.interfaces.Thermometer;


public class SensorRemotoIT {
    
    public SensorRemotoIT() {
        
    }
    
    @Before
    public void setUp(){
        Habitacion.getSingletonInstance(15);
    }
    
    @Test
    public void testRead() {
        Thermometer detector = new SensorRemoto();
        assertEquals(15,detector.read(Habitacion.getLaHabitacion()),0);
    }
    
}
