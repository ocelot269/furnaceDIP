package org.lasencinas.furnacedip.clases;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class EstufaIT {

    public EstufaIT() {
    }

    @Before
    public void setUp(){
        Habitacion.getSingletonInstance(20);
    }
    
    @Test
    public void testConstructor() {
        Estufa estufita = new Estufa();
        assertNotNull(estufita);
    }

    @Test
    public void testEngage() {
        Estufa estufita = new Estufa();
        estufita.engage(Habitacion.getLaHabitacion());
        assertEquals(20, Habitacion.getLaHabitacion().getTemperaturaHabitacion(), 0);
    }

  
    @Test
    public void testDisengage() {
        Estufa estufita = new Estufa();
        estufita.disengage(Habitacion.getLaHabitacion());
        assertEquals(19, Habitacion.getLaHabitacion().getTemperaturaHabitacion(), 0); 
    }

}
