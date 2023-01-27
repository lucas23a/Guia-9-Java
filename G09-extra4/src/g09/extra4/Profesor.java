/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra4;

import java.util.Date;

/**
 *
 * @author Cristian
 */
public class Profesor extends Empleados {
    private String depto;

    public Profesor() {
      
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public Profesor(String depto) {
        this.depto = depto;
    }

    public Profesor(String depto, String nombre, String apellido, long dni, String estadoC) {
        super(nombre, apellido, dni, estadoC);
        this.depto = depto;
    }

    @Override
    public void cambiarEstadoCivil() {
        System.out.println("Cambiar estado civil");
        estadoC= leer.next();
    }

    @Override
    public String toString() {
        return super.toString()+("Departamento:"+depto); 
    }
    
    public void cambiarDepto(){
        System.out.println("Nuevo depto");
        depto=leer.next();
    }
    
}
