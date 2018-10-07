package Model;

import Controller.DTOAlgoritmos;

import java.util.*;

/**
 *
 */
public class CodigoTelefonico extends Algoritmo {

    /**
     * Default constructor
     */
    public CodigoTelefonico() {
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
        //Resultado
        String result = "";
        //Obtenemos la frase por codificar
        String frase = mensaje.getFraseOrigen();
        String[] separada = frase.split(" ");

        //Recorremos cada palabra de la frase
        for (int i = 0; i < separada.length; i++){

            //Tomamos la primer palabra por codificar y la recorremos por letra
            String[] letras = separada[i].split("");

            //Recorremos la palabra por letra
            for (int j = 0; j < letras.length; j++){

                //Buscamos cuale es el valor para la letra
                for (int x = 0; x < distSimbolos.size(); x++){
                    //Si la letra esta lo construimos
                    if (distSimbolos.get(x).contains(letras[j])){
                        result = result + Integer.toString(x) + distSimbolos.get(x).indexOf(letras[j]);
                    }
                }
                result = result + "*";
            }
            result = result + "*";

        }
        return null;
    }

    /**
     * @param mensaje
     * @return
     */
    public DTOAlgoritmos decodificar(DTOAlgoritmos mensaje) {
        // TODO implement here
        int cosas;
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

        //Obtenemos el tamano de cada uno de los digitos redondeado para arriba
        int campos = (int) Math.ceil(simbolos.size() / 10);

        ArrayList<String> listTemp = new ArrayList<String>();
        //Empezamos a recorrer los simbolos para asignar valores
        for (int i = 0; i < simbolos.size(); i++){
            if (listTemp.size() == campos){
                //Agregamos la listTemp a la final
                distSimbolos.add(listTemp);
                //Borramos la listTemp
                listTemp.clear();
            }else{
                //vamos agregando simbolos a la lista final
                listTemp.add(simbolos.get(i));
            }
        }
    }
}