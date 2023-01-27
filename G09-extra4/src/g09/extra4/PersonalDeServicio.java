/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra4;

/**
 *
 * @author Cristian
 */
public class PersonalDeServicio extends Empleados {
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, String nombre, String apellido, long dni, String estadoC) {
        super(nombre, apellido, dni, estadoC);
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString()+("Seccion:"+seccion);
    }

    @Override
    public void cambiarEstadoCivil() {
          System.out.println("Cambiar estado civil");
        estadoC= leer.next();
    }
    
    public void cambiarSeccion(){
        System.out.println("Nueva seccion");
        seccion = leer.next();
    }
    
}
