package Controller;

import Model.Alfabeto;

import java.util.*;


public class DaoAlfabetos implements IValidable {

    ArrayList<Alfabeto> listaAlfabetos;

    public DaoAlfabetos() {
        listaAlfabetos = new ArrayList<Alfabeto>();
    }


    public void ACME() {
        // TODO implement here
    }


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