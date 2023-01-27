/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra3;

/**
 *
 * @author Cristian
 */
public class Camping extends ExtraHotelero {

    private int cantCarpas;
    private int cantBaños;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(int cantCarpas, int cantBaños, boolean restaurant, boolean privado, double mts2) {
        super(privado, mts2);
        this.cantCarpas = cantCarpas;
        this.cantBaños = cantBaños;
        this.restaurant = restaurant;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return super.toString()+ " Cantidad de Carpas:"+cantCarpas+", Baños:"+ cantBaños+", Restaurant:"+restaurant; 
    }

}
