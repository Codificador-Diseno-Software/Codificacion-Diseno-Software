package Controller;

import Model.Alfabeto;

import java.util.*;

/**
 * 
 */
public class DaoAlfabetos implements IValidable {

    ArrayList<Alfabeto> listaAlfabetos;

    /**
     * Default constructor
     */
    public DaoAlfabetos() {
        listaAlfabetos = new ArrayList<Alfabeto>();
    }

    /**
     * 
     */
    public void ACME() {
        // TODO implement here
    }

    /**
     * @param obj 
     * @return
     */
    public boolean validar(Object obj) {
        // TODO implement here
        return false;
    }

    public void insertarAlfabeto(Alfabeto alfabeto) {
        listaAlfabetos.add(alfabeto);
    }

    public ArrayList<Alfabeto> getAlfabetos() {
        return listaAlfabetos;
    }

    public void setListaAlfabetos(ArrayList<Alfabeto> listaAlfabetos) {
        this.listaAlfabetos = listaAlfabetos;
    }
}