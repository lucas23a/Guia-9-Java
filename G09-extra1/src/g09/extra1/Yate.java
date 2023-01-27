/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra1;

/**
 *
 * @author Cristian
 */
public class Yate extends Barco {
    private int cv;
    private int camarotes;

    public Yate() {
    }

    public Yate(int cv, int camarotes, int matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
   
 /*   public void crearYate(){
        System.out.println("---YATE---");
        System.out.println("Numero de matricula:");
        matricula= leer.nextInt();
        System.out.println("Año de fabricacion:");
        año=leer.nextInt();
        System.out.println("Eslora en mts:");
        eslora= leer.nextInt();
        System.out.println("CV motor");
        cv=leer.nextInt();
        System.out.println("Cantidad de camarotes");
        camarotes=leer.nextInt();
    }*/

    @Override
    public void crearBarco() {
             System.out.println("---YATE---");
        System.out.println("Numero de matricula:");
        matricula= leer.nextInt();
        System.out.println("Año de fabricacion:");
        año=leer.nextInt();
        System.out.println("Eslora en mts:");
        eslora= leer.nextInt();
        System.out.println("CV motor");
        cv=leer.nextInt();
        System.out.println("Cantidad de camarotes");
        camarotes=leer.nextInt();
    }

    @Override
    public double precio() {
        super.precio(); 
        double pfinal;
      double parcial= super.precio(); 
      pfinal = parcial + camarotes+cv;
      return pfinal;
    }

 
    
    }
    

