
package org.lasencinas.furnacedip.clases;



import org.lasencinas.furnacedip.interfaces.Heater;
import org.lasencinas.furnacedip.interfaces.Thermometer;
import org.lasencinas.furnacedip.enumType.MensajesTemperatura;
import org.lasencinas.furnacedip.clases.Habitacion;

public class Regulador {
	
	public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature) {
		MensajesTemperatura code;
		while (t.read(temperature) < maxTemp) {
			code = MensajesTemperatura.CALENTADO;
			h.engage(temperature);
			message(code, temperature);
		}
		while (t.read(temperature) > minTemp) {
			code = MensajesTemperatura.RECALENTANDO;
			h.disengage(temperature);
			message(code, temperature);
		}
	}

	private void message(MensajesTemperatura code, RoomTemperature temperature) {
		switch (code) {
			case CALENTADO:
			System.out.println("Calentando => temperatura " + temperature.getTemperature());
				break;
			case RECALENTANDO:
				System.out.println("Apagado => temperatura " + temperature.getTemperature());
				break;
			default:
				System.out.println("Algo raro sucede...");
				break;
		}
	}

}