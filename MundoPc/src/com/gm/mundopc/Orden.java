/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author uriel
 */
public class Orden {
    private int idOrden;
    private Computadora [] computadoras;
    private static int contadorOrden;
    private int contadorComputadoras=-1;
    private int maxComputadoras=3;

    public Orden() {
        contadorOrden++;
        idOrden=contadorOrden;
        computadoras = new Computadora[maxComputadoras];
        
    }
    
    public void agregarComputadora(Computadora computadora){
        try{
        if(contadorComputadoras<maxComputadoras){
         contadorComputadoras++;
        computadoras[contadorComputadoras]=computadora;
        }  else
            System.out.println("No se puede agregar...");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error..no se puede agregar");
        }
    }
    public void mostrarOrden(){
        for (Computadora computadora : computadoras) {
            System.out.println(computadora);
        }
        
    }

    
    
}
