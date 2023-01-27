/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack;

/**
 *
 * @author Cristian
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private boolean instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    @Override
    public void crearEdificio() {
        System.out.println("---Polideportivo---");
        System.out.println("Ancho");
        ancho = leer.nextInt();
        System.out.println("Largo");
        largo = leer.nextInt();
        System.out.println("Alto");
        alto = leer.nextInt();
        System.out.println("Nombre");
        nombre = leer.next();
        System.out.println("Techado: Si/No");
        String res = leer.next();
        if (res.equalsIgnoreCase("si")) {
            instalacion = true;
        } else {
            instalacion = false;
        }
    }

    public void techado() {
        System.out.println("El polideportivo es techado " + instalacion);
    }

    @Override
    public void calcularSuperficie() {
        double superficie = largo * ancho;
        System.out.println("La superficie del polideportido " + nombre + " es de: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen = largo * ancho * alto;
        System.out.println("El volumen del polideportido " + nombre + " es de: " + volumen);
    }

}
