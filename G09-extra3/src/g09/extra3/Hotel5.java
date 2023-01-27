/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.extra3;

/**
 *
 * @author Cristian
 */
public class Hotel5 extends Hotel4{
    protected int salones;
    protected int suites;
    protected int limosinas;

    public Hotel5() {
    }

    public Hotel5(int salones, int suites, int limosinas, char gym, String nombreResto, int capacidadResto, int habitaciones, int cantCamas, int pisos, double precio) {
        super(gym, nombreResto, capacidadResto, habitaciones, cantCamas, pisos, precio);
        this.salones = salones;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion(); 
        int valorLimo=limosinas*15;
        precio= precio+valorLimo;        
    }
        
    @Override
    public String toString() {        
        return super.toString()+ ("Cantidad de Salones:"+salones+", Suites:"+ suites+", Limosinas:"+limosinas);
    }

    
   
    
}
