/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g09.e01;

/**
 *
 * @author Cristian
 */
public class G09E01 {

    /**Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal p = new Perro("Stich","dogchow",2,"pitbull");
       p.alimentarse();
       Animal g = new Gato("Pelusa","whiska",3, "siames");
       g.alimentarse();
       Animal c = new Caballo("Spark", "pasto", 5, "fino");
       c.alimentarse();
    }
    
}
