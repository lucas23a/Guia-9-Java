/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Alojamientos {

    ArrayList<Alojamientos> catalogo = new ArrayList();
    ArrayList<Hotel> lista = new ArrayList();
    ArrayList<Camping> camp = new ArrayList();
    ArrayList<Residencia> resi = new ArrayList();

    public void cargarAlojamientos() {
        //ArrayList<Alojamientos> catalogo = new ArrayList();
        Hotel hot1 = new Hotel4('B', "La estancia", 20, 35, 72, 5, 0);
        hot1.precioHabitacion();
        Hotel hot2 = new Hotel4('B', "Patio de comidas", 35, 50, 80, 7, 0);
        hot2.precioHabitacion();
        Hotel hot3 = new Hotel5(3, 4, 2, 'A', "Il gato", 55, 105, 210, 15, 0);
        hot3.precioHabitacion();
        Hotel hot4 = new Hotel5(5, 8, 4, 'A', "salt bae", 60, 150, 302, 20, 0);
        hot4.precioHabitacion();
        Camping camp1 = new Camping(40, 6, false, false, 2500);
        Camping camp2 = new Camping(60, 10, true, true, 2600);
        Residencia res1 = new Residencia(12, false, false, true, 3000);
        Residencia res2 = new Residencia(10, true, true, true, 2500);
        catalogo.add(hot3);
        catalogo.add(hot2);
        catalogo.add(hot1);
        catalogo.add(hot4);
        catalogo.add(camp1);
        catalogo.add(camp2);
        catalogo.add(res1);
        catalogo.add(res2);
        lista.add(hot4);
        lista.add(hot1);
        lista.add(hot2);
        lista.add(hot3);
        camp.add(camp2);
        camp.add(camp1);
        resi.add(res2);
        resi.add(res1);
    }

    private void mostrarAlojamientos() {
        for (Alojamientos aux : catalogo) {
            System.out.println(aux.getClass());
            System.out.println(aux);
        }
    }

    private void mostrarHoteles() {
        for (Hotel aux : lista) {
            System.out.println(aux);
        }
    }

    public void verMenu() {
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("----Alojamientos----");
            System.out.println("1- Ver alojamientos");
            System.out.println("2- Hotel de más a caro a barato");
            System.out.println("3- Camping con restaurant");
            System.out.println("4- Residencias con descuento");
            System.out.println("5- Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    mostrarAlojamientos();
                    break;
                case 2:
                    lista.sort(Hotel.compararPrecio);
                    mostrarHoteles();
                    break;
                case 3:
                    for (int i = 0; i < camp.size(); i++) {
                        if (camp.get(i).getRestaurant() == true) {
                            System.out.println(camp.get(i));
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < resi.size(); i++) {
                        if (resi.get(i).getDescGremio() == true) {
                            System.out.println(resi.get(i));
                        }
                    }
                    break;

                case 5:
                    break;

            }
        } while (opc < 5);
    }
}
