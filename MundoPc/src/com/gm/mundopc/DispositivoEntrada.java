
package com.gm.mundopc;

/**
 * Esta es la clase padre de Teclado y Raton
 *
 * @author uriel
 * @version 1.0
 */
public class DispositivoEntrada {
       /**
     * Variable tipoEntrada
     */
    private String tipoEntrada;
    /**
     * Variable marca
     */
    private String marca;
    
    
    public DispositivoEntrada(String tipoEntrada, String marca){
         /**
     * Variable Id del raton
     */
        this.marca=marca;
        this.tipoEntrada=tipoEntrada;
                
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
    
}
