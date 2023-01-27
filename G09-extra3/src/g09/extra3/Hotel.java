/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra3;

import java.util.Comparator;


/**
 *
 * @author Cristian
 */
public class Hotel extends Alojamientos {
    protected int habitaciones;
    protected int cantCamas;
    protected int pisos;
    protected double precio;

    public Hotel() {
    }

    public Hotel(int habitaciones, int cantCamas, int pisos, double precio) {
        this.habitaciones = habitaciones;
        this.cantCamas = cantCamas;
        this.pisos = pisos;       
    }
   
    public void precioHabitacion(){
         precio= 50+(1*cantCamas);
              
    }

    @Override
    public String toString() {
        return "Hotel{" + "habitaciones=" + habitaciones + ", cantCamas=" + cantCamas + ", pisos=" + pisos + ", precio=" + precio + '}';
    }
    public static Comparator<Hotel> compararPrecio = (Hotel h1, Hotel h2)
            -> Double.compare(h2.precio, h1.precio);

    
}
