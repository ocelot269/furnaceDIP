
package org.lasencinas.furnacedip.main;

import org.lasencinas.furnacedip.clases.Regulador;
import org.lasencinas.furnacedip.clases.SensorRemoto;
import org.lasencinas.furnacedip.interfaces.Heater;
import org.lasencinas.furnacedip.interfaces.Thermometer;
import org.lasencinas.furnacedip.clases.NachoVidal;
import org.lasencinas.furnacedip.clases.Estufa;
import org.lasencinas.furnacedip.clases.Habitacion;
import org.lasencinas.furnacedip.interfaces.regulable;


public class FurnaceApp {
    
    
    public static void main( String[] args ){
        
        
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        Habitacion.getSingletonInstance(17);
        Heater heater = new Estufa();
        Thermometer thermometer = new SensorRemoto();
        
        regulable regulator = new Regulador();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, Habitacion.getLaHabitacion());
        
        Heater nachete = new NachoVidal();
        System.out.println( "\nArrancando a nachete: " );
        regulator.regulate(thermometer, nachete, minTemp, maxTemp, Habitacion.getLaHabitacion());
        NachoVidal nachito =(NachoVidal)nachete;
        nachito.speak();
    }
}