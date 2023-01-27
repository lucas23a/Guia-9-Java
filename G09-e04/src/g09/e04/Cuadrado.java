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
public class Cuadrado implements CalculoFormas {
    Scanner leer = new Scanner(System.in);
    private double b, a;

    @Override
    public void calcularArea() {
        System.out.println("Ingrese la base del cuadrado");
        b=leer.nextDouble();
         System.out.println("Ingrese la altura del cuadrado");
         a= leer.nextDouble();
         double area = b*a;
         System.out.println("El area del cuadrado es " + area);
    }

    @Override
    public void calcularPerimetro() {
double perimetro =(b+a)*2;
        System.out.println("El perimetro del cuadrado es " + perimetro);
    }
}
