package Model;

import java.util.*;
import Controller.*;

public class Binario extends Algoritmo{

    /**
     * Default constructor
     */
    public Binario() {
    }

    /**
     *
     */
    private ArrayList<ArrayList<String>> distSimbolos = new ArrayList<ArrayList<String>>();


    /**
     * @param mensaje
     * @return
     */
    public DTOAlgoritmos codificar(DTOAlgoritmos mensaje) {
        // TODO implement here
        return null;
    }

    /**
     * @param mensaje
     * @return
     */
    public DTOAlgoritmos decodificar(DTOAlgoritmos mensaje) {
        // TODO implement here
        return null;
    }

    /**
     * @param unAlfabeto
     * @return
     */
    public void distribuirAlfabeto(DTOAlgoritmos unAlfabeto) {
        // TODO implement here
        //Obtenemos el alfabeto
        Alfabeto actual = unAlfabeto.getElAlfabeto();
        //Obtenemos los simbolos
        ArrayList<String> simbolos = actual.getSimbolos();
        //Empezamos a recorrer los simbolos para asignar valores
        for (int i = 0; i < simbolos.size(); i++){
            ArrayList<String> temp = new ArrayList<String>();
            //Construir alfabeto
            temp.add(simbolos.get(i));
            temp.add(Integer.toBinaryString(i));
            distSimbolos.add(temp);
        }
    }

}
