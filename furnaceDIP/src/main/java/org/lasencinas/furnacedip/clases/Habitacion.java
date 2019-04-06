
package org.lasencinas.furnacedip.clases;


public class Habitacion {
    
    //variables
    
    private double TemperaturaHabitacion=16;
    
    public Habitacion( double temperatura) {
        this.TemperaturaHabitacion=temperatura;
    }

    
    public double getTemperaturaHabitacion() {
        return TemperaturaHabitacion;
    }

   
    public void setTemperaturaHabitacion(double TemperaturaHabitacion) {
        this.TemperaturaHabitacion = TemperaturaHabitacion;
    }
    
    public void setAumentarTemperatura(double TemperaturaHabitacion) {
        this.TemperaturaHabitacion+= TemperaturaHabitacion;
    }
}
