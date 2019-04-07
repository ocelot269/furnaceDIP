
package org.lasencinas.furnacedip.clases;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class HabitacionIT {
    
    public HabitacionIT() {
    }
    
    @Before
    public void setUp(){
        Habitacion.getSingletonInstance(15);
    }
    
    @Test
    public void testConstructor(){
        assertNotNull(Habitacion.getLaHabitacion());
    }
   
    @Test
    public void testGetTemperaturaHabitacion() {
        
        assertEquals(0, Habitacion.getLaHabitacion().getTemperaturaHabitacion(), 0);
    }

    
    @Test
    public void testSetAumentarTemperatura() {
        
        Habitacion.getLaHabitacion().setAumentarTemperatura(2);
        assertEquals(17, Habitacion.getLaHabitacion().getTemperaturaHabitacion(), 0);
    }

    
    @Test
    public void testSetTemperaturaHabitacion() {
        Habitacion.getLaHabitacion().setTemperaturaHabitacion(0);
        assertEquals(0, Habitacion.getLaHabitacion().getTemperaturaHabitacion(), 0);
    }
    
}
