/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra3;

/**
 *
 * @author Cristian
 */
public class ExtraHotelero extends Alojamientos {
    protected boolean privado;
    protected double mts2;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, double mts2) {
        this.privado = privado;
        this.mts2 = mts2;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", mts2=" + mts2 + '}';
    }
    
    
}
