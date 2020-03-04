
package com.gm.mundopc;

/**
 * Esta clase permite instanciar objetos de tipo Raton
 *
 * @author uriel
 * @version 1.0
 */
public class Raton extends DispositivoEntrada {
    /**
     * Variable Id del raton
     */
    private int idRaton;
    /**
     * Variable estatica para contar la cantidad de raton
     */
    private static int contadorRatones;
    
    /**
     * Constructor de la clase con 2 parametros
     * @param tipoEntrada heredado de la clase DispositivoEntrada
     * @param marca heredado de la clase DispositivoEntrada
     */
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        contadorRatones++;
        idRaton=contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + "Cantidad de Ratones: " +contadorRatones;
    }

    
    
}
