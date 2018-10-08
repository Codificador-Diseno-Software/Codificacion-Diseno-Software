package Model;

import Controller.DTOAlgoritmos;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<String> simbolos = new ArrayList<String>();
        simbolos.add("a");
        simbolos.add("b");
        simbolos.add("c");
        simbolos.add("d");
        simbolos.add("e");
        simbolos.add("f");
        simbolos.add("g");
        simbolos.add("h");
        simbolos.add("i");
        simbolos.add("j");
        simbolos.add("k");
        simbolos.add("l");
        simbolos.add("m");
        simbolos.add("n");
        simbolos.add("o");
        simbolos.add("p");
        simbolos.add("q");
        simbolos.add("r");
        simbolos.add("s");
        simbolos.add("t");
        simbolos.add("u");
        simbolos.add("v");
        simbolos.add("w");
        simbolos.add("x");
        simbolos.add("y");
        simbolos.add("z");

        Alfabeto alfa = new Alfabeto("Numero 1", simbolos);
        DTOAlgoritmos prueba = new DTOAlgoritmos();
        String frase = "tarea programada";
        prueba.setElAlfabeto(alfa);
        prueba.setFraseOrigen(frase);

        CodigoTelefonico testTel = new CodigoTelefonico();
        Binario testBin = new Binario();
        PalabraClave testPal = new PalabraClave();

        testTel.distribuirAlfabeto(prueba);
        testBin.distribuirAlfabeto(prueba);
        testPal.distribuirAlfabeto(prueba);

        prueba = testTel.codificar(prueba);
        System.out.println(prueba.getResultados());
        prueba.setFraseOrigen("71 10 62 21 10 *60 62 52 30 62 10 50 10 20 10 *");
        testTel.decodificar(prueba);
        System.out.println(prueba.getResultados());



    }


}
