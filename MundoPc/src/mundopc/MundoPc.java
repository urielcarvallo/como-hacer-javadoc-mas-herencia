/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

/**
 *
 * @author uriel
 */
public class MundoPc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raton raton1 = new Raton("Usb","Geniuh");
        Raton raton2 = new Raton("Ps2","Logiltech");
        Raton raton3 = new Raton("Ps2","lala");
        
        Teclado Teclado1=new Teclado("Usb","Nogachet");
        Teclado Teclado2=new Teclado("Usb","Steelseries");
        Teclado Teclado3=new Teclado("Usb","mama");
        
        
        Monitor Monitor1=new Monitor("PAPA", 24.7);
        Monitor Monitor2=new Monitor("papi", 28.7);
        Monitor Monitor3=new Monitor("kaina", 25.7);
        
        
        Computadora lala =new Computadora("Martha",Monitor1,Teclado1,raton1);
       
        Orden palpatine =new Orden();
        
       
        
     
      Computadora lolo=new Computadora("Jonas",Monitor2,Teclado2,raton2);
      
      Computadora lali=new Computadora("Batman",Monitor3,Teclado3,raton3);
      
       palpatine.agregarComputadora(lala);
      palpatine.agregarComputadora(lolo);
       palpatine.agregarComputadora(lali);
       
//        Computadora lale=new Computadora("Batman",tuViejis,tuVecino,tuPrima);
//        palpatine.agregarComputadora(lale);
        
        
        
        palpatine.mostrarOrden();
        System.out.println("----------------------------------------------------");
        
        Orden Anakin =new Orden();
        
        Anakin.agregarComputadora(lala);
      Anakin.agregarComputadora(lolo);
       Anakin.agregarComputadora(lali);
        
        
        Anakin.mostrarOrden();
        
        
    }
    
}
