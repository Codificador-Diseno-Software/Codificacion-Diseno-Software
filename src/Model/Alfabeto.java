package Model;

import java.util.*;
import Controller.IValidable;

/**
 * 
 */
public class Alfabeto implements IValidable {

    /**
     * Default constructor
     */
    public Alfabeto(String nombre, String[] simbolos) {
    }


    private int id;
    private String nombre;
    private ArrayList<String> simbolos;

    /**
     * @param s 
     * @return
     */
    public boolean validar(String s) {
        // TODO implement here
        boolean result = false;
        if (simbolos.contains(s)){
            result = true;
            return result;
        }
        return result;
    }

    /**
     * @param obj 
     * @return
     */
    public boolean validar(Object obj){
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(ArrayList<String> simbolos) {
        this.simbolos = simbolos;
    }
}