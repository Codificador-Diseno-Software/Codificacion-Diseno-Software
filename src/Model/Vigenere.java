package Model;

import Controller.DTOAlgoritmos;

import java.util.*;

public class Vigenere extends Algoritmo {

    public Vigenere() {
    }


    @Override
    public DTOAlgoritmos codificar(DTOAlgoritmos dtoAlgoritmos) {
        String res = "";
        int cifra = dtoAlgoritmos.getCifra();
        boolean primero = true;
        ArrayList<String> alfabeto = dtoAlgoritmos.getElAlfabeto().getSimbolos();
        char [] fraseArray = dtoAlgoritmos.getFraseOrigen().toCharArray();
        for (int i = 0; i < fraseArray.length; i++)
        {
            String a = String.valueOf(fraseArray[i]);
            if (a.equals(" "))
            {
                primero = true;
                res+= a;
            }
            else
            {
                if(primero)
                {
                    if (alfabeto.indexOf(a)+(int) Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra)))) > alfabeto.size()-1)
                    {
                        res += alfabeto.get(alfabeto.indexOf("a")+(int)(Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra))))));
                        primero = false;
                    }
                    else
                    {
                        res+= alfabeto.get(alfabeto.indexOf(a)+(int) Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra)))));
                        primero = false;
                    }
                }else
                {
                    if (alfabeto.indexOf(a)+ cifra % 10 > alfabeto.size()-1) {
                        res += alfabeto.get(alfabeto.indexOf("a") + cifra % 10);
                        primero = true;
                    }
                    else
                    {
                        res += alfabeto.get(alfabeto.indexOf(a) + cifra % 10);
                        primero = true;
                    }
                }
            }
        }

        dtoAlgoritmos.setModoCodificacion(true);
        dtoAlgoritmos.setResultados(res);
        return dtoAlgoritmos;
    }


    @Override
    public DTOAlgoritmos decodificar(DTOAlgoritmos dtoAlgoritmos) {
        String res = "";
        int cifra = dtoAlgoritmos.getCifra();
        boolean primero = true;
        ArrayList<String> alfabeto = dtoAlgoritmos.getElAlfabeto().getSimbolos();
        char [] fraseArray = dtoAlgoritmos.getFraseOrigen().toCharArray();
        for (int i = 0; i < fraseArray.length; i++)
        {
            String a = String.valueOf(fraseArray[i]);
            if (a.equals(" "))
            {
                primero = true;
                res+= a;
            }
            else
            {
                if(primero)
                {
                    if (alfabeto.indexOf(a)-(int) Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra)))) < 0)
                    {
                        res += alfabeto.get(alfabeto.indexOf("z")-(int)(Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra))))));
                        primero = false;
                    }
                    else
                    {
                        res+= alfabeto.get(alfabeto.indexOf(a)-(int) Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra)))));
                        primero = false;
                    }
                }else
                {
                    if (alfabeto.indexOf(a)- cifra % 10 < 0) {
                        res += alfabeto.get(alfabeto.indexOf("z") - cifra % 10);
                        primero = true;
                    }
                    else
                    {
                        res += alfabeto.get(alfabeto.indexOf(a) - cifra % 10);
                        primero = true;
                    }
                }
            }
        }

        dtoAlgoritmos.setModoCodificacion(false);
        dtoAlgoritmos.setResultados(res);
        return dtoAlgoritmos;
    }
}