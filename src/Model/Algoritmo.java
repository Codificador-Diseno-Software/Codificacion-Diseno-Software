package Model;

import Controller.DTOAlgoritmos;

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
    public abstract DTOAlgoritmos codificar(DTOAlgoritmos mensaje);

    /**
     * @param mensaje 
     * @return
     */
    public abstract DTOAlgoritmos decodificar(DTOAlgoritmos mensaje);

}