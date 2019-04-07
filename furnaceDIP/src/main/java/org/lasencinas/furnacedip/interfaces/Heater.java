
package org.lasencinas.furnacedip.interfaces;

import org.lasencinas.furnacedip.clases.Habitacion;


 public interface Heater {
    void engage(Habitacion temperatura);
    void disengage(Habitacion temperatura);
}
