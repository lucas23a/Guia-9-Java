/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g09.e03;

import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class G09E03 {

    /**
     * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Electrodomesticos lava1= new Lavadora(45, 1200, "negro", 'A', 50);
      lava1.precioFinal();
      Electrodomesticos tele1= new Tele(32, false, 1100, "gris", 'R', 3);
      tele1.precioFinal();
      Electrodomesticos lava2 = new Lavadora(30, 900,"rosa", 'D', 50);
      lava2.precioFinal();
      Electrodomesticos tele2= new Tele(60, true, 3200,"gris", 'B', 7);
      tele2.precioFinal();
      ArrayList<Electrodomesticos> catalogo = new ArrayList();
      catalogo.add(lava1);
      catalogo.add(lava2);
      catalogo.add(tele1);
      catalogo.add(tele2);
     double total = lava1.getPrecio()+lava2.getPrecio()+ tele1.getPrecio()+tele2.getPrecio();
      
        for (Electrodomesticos aux : catalogo) {
            System.out.println(aux.getClass());
            System.out.println(aux);
        }
        System.out.println("El total es de $" +total);
    }
    
}
