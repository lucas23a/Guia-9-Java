/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra4;

/**
 *
 * @author Cristian
 */
public class Estudiante extends Persona {
    private String matricula;

    public Estudiante() {
    }

    public Estudiante(String matricula, String nombre, String apellido, long dni, String estadoC) {
        super(nombre, apellido, dni, estadoC);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString()+("Matricula:"+matricula); 
    }

    @Override
    public void cambiarEstadoCivil() {
  System.out.println("Cambiar estado civil");
        estadoC= leer.next();
    }
    
    public void matriculacionNueva(){
        System.out.println("Nueva matricula");
        matricula=leer.next();
    }
}
