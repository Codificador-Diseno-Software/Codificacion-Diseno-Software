package Controller;

import Model.Alfabeto;
import Model.Algoritmo;
import Model.Escritor;
import Model.IEscritor;

import java.util.*;

/**
 * 
 */
public class Controlador implements IValidable {

    private Alfabeto alfabetoActual;

    private Algoritmo elAlgoritmo;

    private Escritor elEscritor;

    private DaoAlfabetos bdAlfabetos;

    /**
     * Default constructor
     */
    public Controlador() {
    }


    /**
     * @return
     */
    public Collection cargarAlfabetos() {
        bdAlfabetos.getAlfabetos();
        return null;
    }

    /**
     * @param elDTO 
     * @return
     */
    public void procesarPeticion(DTOAlgoritmos elDTO) {
        // TODO implement here
        return;
    }

    /**
     * @param elDTO 
     * @return
     */
    private void predefinirAlfabeto(DTOAlgoritmos elDTO) {
        // TODO implement here
        return;
    }

    /**
     * @param elDTO 
     * @return
     */
    private boolean validar(DTOAlgoritmos elDTO) {
        // TODO implement here
        return false;
    }

    /**
     * @param elDTO 
     * @return
     */
    private void activarAlgoritmos(DTOAlgoritmos elDTO) {
        // TODO implement here
        return;
    }

    /**
     * @param DTO 
     * @return
     */
    private void escribir(DTOAlgoritmos DTO) {
        // TODO implement here
        return;
    }

    /**
     * @param obj 
     * @return
     */
    public boolean validar(Object obj){
        return false;
    }

    public void insertarAlfabeto(Alfabeto alfabeto) {
        bdAlfabetos.insertarAlfabeto(alfabeto);
    }
}