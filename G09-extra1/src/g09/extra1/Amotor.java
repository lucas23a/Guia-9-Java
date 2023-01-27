/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra1;

/**
 *
 * @author Cristian
 */
public class Amotor extends Barco{
    private int cv;
  public Amotor() {
    }
    
    public Amotor(int cv, int matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
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

  /*  public void crearAmotor(){
          System.out.println("---BARCO A MOTOR---");
        System.out.println("Numero de matricula:");
        matricula= leer.nextInt();
        System.out.println("Año de fabricacion:");
        año=leer.nextInt();
        System.out.println("Eslora en mts:");
        eslora= leer.nextInt();
        System.out.println("CV motor");
        cv=leer.nextInt();
    }*/

    @Override
    public void crearBarco() {
System.out.println("---BARCO A MOTOR---");
        System.out.println("Numero de matricula:");
        matricula= leer.nextInt();
        System.out.println("Año de fabricacion:");
        año=leer.nextInt();
        System.out.println("Eslora en mts:");
        eslora= leer.nextInt();
        System.out.println("CV motor");
        cv=leer.nextInt();
    }

    @Override
    public double precio() {
      double pfinal =super.precio()+ cv; 
      return pfinal;
    }
    
    
}
