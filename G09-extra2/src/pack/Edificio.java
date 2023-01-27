/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
abstract class Edificio {
    Scanner leer = new Scanner(System.in);
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public abstract void crearEdificio();
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();

    @Override
    public String toString() {
        return "Edificio{" +  ", ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
}
