/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g09.e02;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Electrodomestico {
    Scanner leer = new Scanner(System.in);
    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;
    public static final int BASE = 1000;
public static final String[] COLORES= {"BLANCO", "NEGRO", "ROJO","AZUL","GRIS"};
public static final char[] CONSUMOENERGIA ={'A','B','C','D','E','F'};

    public Electrodomestico() {
    }

    
    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
        
    
    public final void comprobarConsumo(){
     boolean x= false;
      for (int i = 0; i < CONSUMOENERGIA.length; i++) {
            if(consumo == CONSUMOENERGIA[i]){
                x= true;
            }
        }
        if(x==false){
            consumo= 'F';
        }
    }
    
    public final void comprobarColor(){
        boolean x = false;
        for (int i = 0; i < COLORES.length; i++) {
            if(color.equalsIgnoreCase(COLORES[i])){
                x= true;
            }
        }
        if(x==false){
            color= "BLANCO";
        }
    }
    
    public void crearElectrodomestico(){
        System.out.println("Ingrese el precio");
        int n= leer.nextInt();
      precio= n + BASE;
        System.out.println("Ingrese color");
        color =leer.next().toUpperCase();
        System.out.println("Ingrese consumo energetico");
        consumo = leer.next().toUpperCase().charAt(0);
        comprobarConsumo();
        comprobarColor();
       
    }
    
    public void precioFinal(){
        switch (consumo) {
            case 'A':
                precio = precio +1000;
                break;
            case 'B':
                precio = precio +800;
                break;
            case 'C':
                precio = precio +600;
                break;
            case 'D':
                precio = precio +500;
                break;
            case 'E':
                precio = precio +300;
                break;
            case 'F':
                precio = precio +100;
                break;
            default:
                break;
        }
       
        if(peso>1 && peso<19){
            precio=precio+100;
        }else if(peso>19 && peso<49){
            precio=precio+500;
        }else if(peso>49 && peso<79){
            precio=precio+800;
        }else if( peso<79){
            precio=precio+1000;
        }                        
    }

    public void mostrar(){
    System.out.println("---");
    System.out.println(precio);
    System.out.println(color);
    System.out.println(consumo);
}
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "leer=" + leer + ", precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
}
