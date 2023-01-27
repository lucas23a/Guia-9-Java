/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.e01;

/**
 *
 * @author Cristian
 */
public class Animal {
    protected String nombre;
    protected String alimento;
   protected int edad;
   protected String raza;

    public Animal() {
    }

   

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
   
   public void alimentarse(){
       System.out.println("Se alimenta de "+ alimento);
   }
    
    
    
}
