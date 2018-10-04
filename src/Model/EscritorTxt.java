package Model;

import Controller.DTOAlgoritmos;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class EscritorTxt extends Escritor implements IEscritor {

    /**
     * Default constructor
     */
    public EscritorTxt() {
    }
//hola
    /**
     * @param dto 
     * @return
     */
    public boolean escribir(DTOAlgoritmos dto)
    {
        try {
            FileOutputStream f = new FileOutputStream(new File("archivoTXT.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(dto);
            o.close();
            f.close();
            return true;
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
        return false;
    }


}