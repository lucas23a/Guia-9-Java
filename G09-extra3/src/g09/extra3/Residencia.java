/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra3;

/**
 *
 * @author Cristian
 */
public class Residencia extends ExtraHotelero {
   private int habitaciones;
   private boolean descGremio;
    private boolean campoDeport;

    public Residencia() {
    }

    public Residencia(int habitaciones, boolean descGremio, boolean campoDeport, boolean privado, double mts2) {
        super(privado, mts2);
        this.habitaciones = habitaciones;
        this.descGremio = descGremio;
        this.campoDeport = campoDeport;
    } 

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean getDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampoDeport() {
        return campoDeport;
    }

    public void setCampoDeport(boolean campoDeport) {
        this.campoDeport = campoDeport;
    }
    

    @Override
    public String toString() {
 return super.toString()+", Habitaciones:"+ habitaciones+", Descuento de gremio:"+ descGremio+", Campo de deportes:"+ campoDeport; 
    }
    
    
}
