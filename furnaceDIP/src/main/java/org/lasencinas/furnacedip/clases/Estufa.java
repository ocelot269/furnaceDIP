package org.lasencinas.furnacedip.clases;

import org.lasencinas.furnacedip.interfaces.Heater;

public class Estufa implements Heater {
    
   
    
    public Estufa() {
    
    }

    
    @Override
    public void engage(Habitacion temperatura) {
        temperatura.setAumentarTemperatura(1);
    }

    @Override
    public void disengage(Habitacion temperatura) {
        temperatura.setAumentarTemperatura(-1);
    }
    
}
