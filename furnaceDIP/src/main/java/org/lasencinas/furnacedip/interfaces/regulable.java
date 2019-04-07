
package org.lasencinas.furnacedip.interfaces;


import org.lasencinas.furnacedip.clases.Habitacion;
import org.lasencinas.furnacedip.enumType.MensajesTemperatura;


public interface regulable {
    
    
     void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, Habitacion temperatura);
     void message(MensajesTemperatura code, Habitacion temperatura);
}
