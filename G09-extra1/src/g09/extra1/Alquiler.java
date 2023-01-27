/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra1;

import java.util.Date;

/**
 *
 * @author Cristian
 */
public class Alquiler extends Barco {

    private String nombre;
    private long dni;
    private Date alq;
    private Date devolucion;
private Barco rentado;

    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, Date alq, Date devolucion, Barco rentado) {
        this.nombre = nombre;
        this.dni = dni;
        this.alq = alq;
        this.devolucion = devolucion;
        this.rentado = rentado;
    }

{
        this.rentado = rentado;
    }

public void nuevoAlquiler(){
    System.out.println("Nombre completo:");
    nombre= String.valueOf(leer.nextLine());
    System.out.println("DNI:");
    dni=leer.nextLong();
    System.out.println("Fecha de alquiler (d/mm/aaaa):");
    int d= leer.nextInt();
    int m =leer.nextInt();
    int a = leer.nextInt();
    alq = new Date(a-1900, m-1, d);
    System.out.println("Fecha de devolucion (d/mm/aaaa):");
    int q= leer.nextInt();
    int w =leer.nextInt();
    int e = leer.nextInt();
    devolucion = new Date(e-1900, w-1, q);
    rentado= elegir();
    
}

private Barco elegir(){
    Barco nuevo = null;
    System.out.println("Elija un tipo de barco:");
    System.out.println("1- Velero");
    System.out.println("2- A motor");
    System.out.println("3- Yate");
    System.out.println("4- Barco comun");
    int opc = leer.nextInt();
    switch (opc) {
        case 1 : nuevo = new Velero();
        nuevo.crearBarco();
        break;
        case 2 :nuevo = new Amotor();
        nuevo.crearBarco();
        break;
        case 3: nuevo = new Yate();
        nuevo.crearBarco();
        break;
        case 4: nuevo= new Barco();
        default: System.out.println("Opcion no valida");
        break;
    }
    return nuevo;
}
    
public void precioFinal(){
    int dias = devolucion.getDate()- alq.getDate();
   double preciofinal=  rentado.precio()*dias;
   
    System.out.println("El monto total del alquiler es $"+ preciofinal );
}

}
