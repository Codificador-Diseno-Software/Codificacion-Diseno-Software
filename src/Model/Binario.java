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
    private ArrayList<String> distSimbolos = new ArrayList<String>();


    /**
     * @param mensaje
     * @return
     */
    public DTOAlgoritmos codificar(DTOAlgoritmos mensaje) {
        //Alfabeto
        ArrayList<String> alfabeto = mensaje.getElAlfabeto().getSimbolos();
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
                    if (alfabeto.contains(letras[j])){
                        int indice = alfabeto.indexOf(letras[j]);
                        result = result + distSimbolos.get(indice) + " ";
                    }
                }
            }
            result = result + "*";
        }
        mensaje.setResultados(result);
        return mensaje;
    }

    /**
     * @param mensaje
     * @return
     */
    public DTOAlgoritmos decodificar(DTOAlgoritmos mensaje) {
        // TODO implement here
        //Alfabeto
        ArrayList<String> alfabeto = mensaje.getElAlfabeto().getSimbolos();
        //Resultado
        String result = "";
        //Obtenemos la frase por decodificar
        String frase = mensaje.getFraseOrigen();
        String[] palabras = frase.split("\\*");

        //Ahora recorremos cada palabra
        for (int i = 0; i < palabras.length; i++){

            //Separamos cada palabra por letra
            String[] letras = palabras[i].split(" ");

            //Recorremos todas las letras
            for (int j = 0; j < letras.length; j++){
                int indice = distSimbolos.indexOf(letras[j]);
                result = result + alfabeto.get(indice);
            }
            result = result + " ";
        }
        mensaje.setResultados(result);
        return mensaje;
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
            //Construir alfabeto
            distSimbolos.add(Integer.toBinaryString(i));
        }
    }

}
