/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra1;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Barco {
    protected int matricula;
     protected int eslora; 
     protected int año;
 Scanner leer = new Scanner(System.in);
    public Barco() {
    }

    public Barco(int matricula, int eslora, int año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }
    
    public void crearBarco(){
        System.out.println("---Barco comun---");
        System.out.println("Numero de matricula:");
        matricula= leer.nextInt();
        System.out.println("Año de fabricacion:");
        año=leer.nextInt();
        System.out.println("Eslora en mts:");
        eslora= leer.nextInt();
    }
    public double precio(){
        double modulo = eslora*10;
      return modulo;
    }
}
