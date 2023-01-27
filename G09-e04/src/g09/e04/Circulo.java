/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.e04;

import java.util.Scanner;
import newinterface.CalculoFormas;

/**
 *
 * @author Cristian
 */
public class Circulo implements CalculoFormas {
Scanner leer = new Scanner(System.in);
 private double r;
    @Override
    public void calcularArea() {
        System.out.println("Ingrese el radio");
    r=leer.nextDouble();
        double resultado = Math.PI* r/2;
        System.out.println("El area del cirulo es " + resultado);
    }

    @Override
    public void calcularPerimetro() {
        double diam = r*2;
        double perimetro = Math.PI*diam;
        System.out.println("El perimetro del circulo es " +perimetro);
    }

 
    
    
}
