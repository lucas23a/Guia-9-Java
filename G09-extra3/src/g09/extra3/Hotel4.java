/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra3;

/**
 *
 * @author Cristian
 */
public class Hotel4 extends Hotel {
    protected char gym;
    protected String nombreResto;
    protected int capacidadResto;

    public Hotel4() {
    }

    public Hotel4(char gym, String nombreResto, int capacidadResto, int habitaciones, int cantCamas, int pisos, double precio) {
        super(habitaciones, cantCamas, pisos, precio);
        this.gym = gym;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
    }

    @Override
    public void precioHabitacion() {
  super.precioHabitacion(); 
        int valorResto=0;
        if(capacidadResto<30){
            valorResto=10;
        }else if(capacidadResto>29 && capacidadResto<50){
            valorResto=30;
        }else if(capacidadResto>50){
            valorResto=50;}                
        int valorGym=0;
        if(gym=='A'){
            valorGym=50;
        }else{
            valorGym=30;
        }
        precio = precio + valorResto+valorGym;
    }
    

    @Override
    public String toString() {
           
        return  super.toString()+("Gym:" +gym+ ", Nombre de Restaurant: " +nombreResto+", Capacidad Restaurant:"+capacidadResto);
                }
    }

  

   


    
    

