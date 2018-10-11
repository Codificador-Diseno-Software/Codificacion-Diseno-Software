package Model;

import Controller.DTOAlgoritmos;

import java.awt.*;
import java.io.*;
import java.util.*;


public class EscritorTxt extends Escritor implements IEscritor {


    public EscritorTxt() {
    }

    public boolean escribir(String text, String pathName) throws IOException {
        BufferedWriter bw = null;
        FileWriter fw = null;
        fw = new FileWriter("C:\\Users\\Joseph Salas\\IdeaProjects\\Codificacion-Diseno-Software\\src\\Utils\\"+ pathName+".txt");
        bw =  new BufferedWriter(fw);
        bw.write(String.valueOf(java.time.LocalDateTime.now()));
        bw.write(text);
        bw.flush();
        bw.close();
        return  true;


    }


}