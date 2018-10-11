package Model;

import Controller.DTOAlgoritmos;

import java.util.*;

/**
 * 
 */
public class Trasposicion extends Algoritmo {


    public Trasposicion() {
    }

    @Override
    public DTOAlgoritmos codificar(DTOAlgoritmos dtoAlgoritmos) {
        String res = "";
        String encryp = "";
        char[] charArray = dtoAlgoritmos.getFraseOrigen().toCharArray();
        for (int i = 0; i< charArray.length; i++)
        {
            if(! String.valueOf(charArray[i]).equals(" ") )
            {
                res+= String.valueOf(charArray[i]);
            }
            else
            {
                for (int x= res.length()-1;x>=0;x--)
                {
                    encryp += res.charAt(x);
                }
                res = "";
                encryp += " ";

            }
        }
        dtoAlgoritmos.setResultados(encryp);
        dtoAlgoritmos.setModoCodificacion(true);
        return  dtoAlgoritmos;
    }

    @Override
    public DTOAlgoritmos decodificar(DTOAlgoritmos dtoAlgoritmos) {
        return null;
    }




}