/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack;

/**
 *
 * @author Cristian
 */
public class EdificioConOficinas extends Edificio {

    private int oficinas;
    private int cantPersonas;
    private int pisos;

    @Override
    public void crearEdificio() {
        System.out.println("---Edificio con oficinas---");
        System.out.println("Ancho");
        ancho = leer.nextInt();
        System.out.println("Largo");
        largo = leer.nextInt();
        System.out.println("Alto");
        alto = leer.nextInt();
        System.out.println("---Edificio con oficinas---");
        System.out.println("Cantidad de pisos");
        pisos = leer.nextInt();
        System.out.println("Cantidad de oficinas:");
        oficinas = leer.nextInt();
        System.out.println("Cantidad de personas por oficina");
        cantPersonas = leer.nextInt();
    }

    @Override
    public void calcularSuperficie() {
        double superficie = largo * ancho;
        System.out.println("La superficie del edifico es de: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen = largo * ancho * alto;
        System.out.println("El volumen del edificio es de: " + volumen);
    }

    public void cantPersonas() {

        int per = cantPersonas * oficinas * pisos;
        System.out.println("El total de personas en el edificio es de: " + per);
    }

}
