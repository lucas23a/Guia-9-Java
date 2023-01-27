/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.e02;

/**
 *
 * @author Cristian
 */
public class Televisor extends Electrodomestico{
    private int pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    @Override
    public void crearElectrodomestico() {
        System.out.println("---TELE---");
        super.crearElectrodomestico(); 
        System.out.println("Pulgadas");
        pulgadas= leer.nextInt();
        System.out.println("Tiene TDT");
        if(leer.next().equalsIgnoreCase("si")){
            tdt=true;            
         }
    }

    @Override
    public void precioFinal() {     
           super.precioFinal();
        if(tdt==true){
            precio= precio+500;
        }
           double pfinal= precio;
        if(pulgadas> 40){
           pfinal= precio +(precio*0.30);           
        }
           System.out.println(pfinal);
           System.out.println(color);
           System.out.println(consumo);
    }


    
    
}
