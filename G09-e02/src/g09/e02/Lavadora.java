/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.e02;

/**
 *
 * @author Cristian
 */
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void crearElectrodomestico() {
        System.out.println("---LAVADORA---");
        super.crearElectrodomestico(); 
        System.out.println("Carga");
        carga= leer.nextInt();
    }

    
    @Override
    public void precioFinal() {
            super.precioFinal();
        if (carga>30){
            precio = precio +500;
        }    
    }




    

    
    
}
