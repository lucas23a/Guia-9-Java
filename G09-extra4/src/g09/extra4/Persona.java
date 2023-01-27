/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra4;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Persona {
    Scanner leer= new Scanner (System.in);
    protected String nombre;
    protected String apellido;
    protected long dni;
    protected String estadoC;

    public Persona() {
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    public Persona(String nombre, String apellido, long dni, String estadoC) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoC = estadoC;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estadoCivil=" + estadoC + '}';
    }
    
    public void cambiarEstadoCivil(){
        
    }
}
