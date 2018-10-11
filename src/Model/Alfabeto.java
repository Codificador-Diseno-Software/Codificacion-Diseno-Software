package Model;

import java.util.*;
import Controller.IValidable;

public class Alfabeto implements IValidable {

    private String nombre;
    private ArrayList<String> simbolos;

        public Alfabeto(String nombre, ArrayList<String> simbolos) {
            this.nombre = nombre;
            this.simbolos =simbolos;
    }

    public boolean validar(String s) {
        boolean result = false;
        if (simbolos.contains(s)){
            result = true;
            return result;
        }
        return result;
    }

    public boolean validar(Object obj){
        return false;
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