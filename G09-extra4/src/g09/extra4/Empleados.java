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
public class Empleados extends Persona {
    protected Date ingreso= new Date();
    protected int despacho;

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

    
    public Empleados() {
    }

    public Empleados(String nombre, String apellido, long dni, String estadoC) {
        super(nombre, apellido, dni, estadoC);
    }

    @Override
    public String toString() {
        return super.toString()+("Fecha de ingreso:"+ingreso+" , Despacho:"+despacho);
    }

    @Override
    public void cambiarEstadoCivil() {        
    }
    
    public void cambiarDespacho(){
        System.out.println("Nuevo despacho");
        despacho=leer.nextInt();
    }
    
}
