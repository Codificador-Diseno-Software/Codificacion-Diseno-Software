package Model;

import java.util.*;
import Controller.*;

public class PalabraClave extends Algoritmo{


    private ArrayList<Integer> valorClave = new ArrayList<Integer>();
    //La palabra clave que se usa para saber como se codifican las cosas
    private String palabraClave;

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
    public void distribuirAlfabeto(Alfabeto unAlfabeto) {
        // TODO implement here
        String[] separada = palabraClave.split("");
        //Alfabeto
        ArrayList<String> actual = unAlfabeto.getSimbolos();
        for (int i = 0; i < separada.length; i++){
            int temp = actual.indexOf(separada[i]) + 1;
            valorClave.add(temp);
        }
        return;
    }

}
