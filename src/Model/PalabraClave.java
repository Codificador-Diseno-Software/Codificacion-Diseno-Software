package Model;

import Controller.DTOAlgoritmos;

import java.util.ArrayList;

public class PalabraClave extends Algoritmo{
    private ArrayList<Integer> valorClave = new ArrayList<Integer>();
    //La palabra clave que se usa para saber como se codifican las cosas

    /**
     * @param mensaje
     * @return
     */
    public DTOAlgoritmos codificar(DTOAlgoritmos mensaje) {
        //palabra clave
        String palabraClave = mensaje.getPalabraClave();
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

            int posClave = 0;
            //Recorremos la palabra por letra
            for (int j = 0; j < letras.length; j++){

                //Buscamos cuale es el valor para la letra

                //Esto es para agarrar el campo que se debe si la palabra clave es mas pequena
                if (posClave >= palabraClave.length()){
                    posClave = 0;
                }

                //Hacemos la codificacion
                int newValue = alfabeto.indexOf(letras[j]) + 1;
                newValue = newValue + valorClave.get(posClave);
                posClave++;

                //Si no se sale del rango le asignamos el nuevo valor
                if (newValue <= alfabeto.size()){
                    result = result + alfabeto.get(newValue - 1) + " ";
                }else{
                    newValue = newValue - alfabeto.size();
                    result = result + alfabeto.get(newValue - 1) + " ";
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
        for (int i = 0; i < palabras.length; i++) {

            //Separamos cada palabra por letra
            String[] letras = palabras[i].split(" ");

            int posClave = 0;
            //Recorremos todas las letras
            for (int j = 0; j < letras.length; j++){

                //Esto es para agarrar el campo que se debe si la palabra clave es mas pequena
                if (posClave >= valorClave.size()){
                    posClave = 0;
                }

                //Hacemos la codificacion
                int newValue = alfabeto.indexOf(letras[j]) + 1;
                newValue = newValue - valorClave.get(posClave);
                posClave++;


                //Si no se sale del rango le asignamos el nuevo valor
                if (newValue >= 1){
                    result = result + alfabeto.get(newValue - 1);
                }else{
                    newValue = newValue + alfabeto.size();
                    result = result + alfabeto.get(newValue - 1);
                }
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
        //palabra clave
        String palabraClave = unAlfabeto.getPalabraClave();
        String[] separada = palabraClave.split("");
        //Alfabeto
        ArrayList<String> actual = unAlfabeto.getElAlfabeto().getSimbolos();
        for (int i = 0; i < separada.length; i++){
            int temp = actual.indexOf(separada[i]) + 1;
            valorClave.add(temp);
        }
    }

}
