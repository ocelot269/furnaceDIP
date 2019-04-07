
package org.lasencinas.furnacedip.main;

import org.lasencinas.furnacedip.clases.Regulador;
import org.lasencinas.furnacedip.clases.SensorRemoto;
import org.lasencinas.furnacedip.interfaces.Heater;
import org.lasencinas.furnacedip.interfaces.Thermometer;
//import org.foobarspam.furnaceDIP.otherstuff.Jedi;
import org.lasencinas.furnacedip.clases.Estufa;
import org.lasencinas.furnacedip.clases.Habitacion;


public class FurnaceApp {
    
    
    public static void main( String[] args ){
        
        
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        Habitacion.getSingletonInstance(17);
        Heater heater = new Estufa();
        Thermometer thermometer = new SensorRemoto();
        
        Regulador regulator = new Regulador();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, Habitacion.getLaHabitacion());
        
//        Jedi yoda = new Jedi();
//        System.out.println( "\nArrancando a Yoda: " );
//        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
//        yoda.speak();
    }
}