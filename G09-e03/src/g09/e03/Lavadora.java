/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.e03;

/**
 *
 * @author Cristian
 */
public class Lavadora extends Electrodomesticos {
    private int carga;

    public Lavadora(int carga, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }
    
    @Override
    public void precioFinal() {
            super.precioFinal();
        if (carga>30){
            precio = precio +500;
        }    
    }
}
