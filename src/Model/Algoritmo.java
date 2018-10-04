package Model;

import java.util.*;

/**
 * 
 */
public abstract class Algoritmo {

    /**
     * Default constructor
     */
    public Algoritmo() {
    }

    /**
     * @param mensaje 
     * @return
     */
    public abstract String codificar(String mensaje);

    /**
     * @param mensaje 
     * @return
     */
    public abstract String decodificar(String mensaje);

}