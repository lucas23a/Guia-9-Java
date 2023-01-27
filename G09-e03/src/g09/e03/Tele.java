/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.e03;

/**
 *
 * @author Cristian
 */
public class Tele extends Electrodomesticos {
    private int pulgadas;
    private boolean tdt;

    public Tele(int pulgadas, boolean tdt, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    @Override
    public void precioFinal() {     
           super.precioFinal();
        if(tdt==true){
            precio= precio+500;
        }
           
        if(pulgadas> 40){
           precio= precio +(precio*0.30);           
        }
}
}