/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra1;

/**
 *
 * @author Cristian
 */
public class Velero extends Barco {
    private int velas;

    public Velero() {
    }


    public Velero(int velas, int matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.velas = velas;
    }

    public int getVelas() {
        return velas;
    }

    public void setVelas(int velas) {
        this.velas = velas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
   /* public void crearVelero(){
          System.out.println("---Velero---");
        System.out.println("Numero de matricula:");
        matricula= leer.nextInt();
        System.out.println("Año de fabricacion:");
        año=leer.nextInt();
        System.out.println("Eslora en mts:");
        eslora= leer.nextInt();
        System.out.println("Cantidad de velas");
        velas=leer.nextInt();
    }*/

    @Override
    public void crearBarco() {
System.out.println("---Velero---");
        System.out.println("Numero de matricula:");
        matricula= leer.nextInt();
        System.out.println("Año de fabricacion:");
        año=leer.nextInt();
        System.out.println("Eslora en mts:");
        eslora= leer.nextInt();
        System.out.println("Cantidad de velas");
        velas=leer.nextInt();
    }

    @Override
    public double precio() {
        double pfinal;
        pfinal=super.precio()+ velas; 
        return pfinal;
    }
    
}
