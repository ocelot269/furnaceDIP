package org.lasencinas.furnacedip.clases;

public class Habitacion {

    //variables
    private double temperaturaHabitacion;
    private static Habitacion LAHABITACION;
    
    
    //Constructor privado
    private Habitacion(double temperatura) {
        this.temperaturaHabitacion = temperatura;
    }
    
    //Metodo Singleton 
    public static Habitacion getSingletonInstance(double temperatura) {
        if (getLaHabitacion() == null) {
            LAHABITACION = new Habitacion(temperatura);
        } else {
            System.out.println("No se puede crear el objeto porque ya existe un objeto de la clase Habitacion");
        }

        return getLaHabitacion();
    }

    //Sobreescribimos el método clone, para que no se pueda clonar un objeto de esta clase
    @Override
    public Habitacion clone() {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase Habitacion");
        }
        return null;
    }

    
    //getters y setters
    
    
    public double getTemperaturaHabitacion() {
        return temperaturaHabitacion;
    }

    
    public void setTemperaturaHabitacion(double TemperaturaHabitacion) {
        this.temperaturaHabitacion = TemperaturaHabitacion;
    }

    
    public void setAumentarTemperatura(double TemperaturaHabitacion) {
        this.temperaturaHabitacion += TemperaturaHabitacion;
    }

    public static Habitacion getLaHabitacion() {
        return LAHABITACION;
    }
    
}
