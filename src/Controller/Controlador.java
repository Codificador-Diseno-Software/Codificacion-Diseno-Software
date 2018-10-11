package Controller;

import Model.*;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public class Controlador implements IValidable {

    private Alfabeto alfabetoActual;

    private Algoritmo elAlgoritmo = new Algoritmo() {
        @Override
        public DTOAlgoritmos codificar(DTOAlgoritmos dtoAlgoritmos) {
            return null;
        }

        @Override
        public DTOAlgoritmos decodificar(DTOAlgoritmos dtoAlgoritmos) {
            return null;
        }
    };

    private  Vigenere vigenere = new Vigenere();
    private  Trasposicion trans = new Trasposicion();
    private CodigoTelefonico codTel = new CodigoTelefonico();
    private Binario bin = new Binario();
    private PalabraClave palclv = new PalabraClave();
    private EscritorTxt escritorTxt = new EscritorTxt();
    private  EscritorPDF escritorPDF = new EscritorPDF();
    private  EscritorXML escritorXML = new EscritorXML();
    private DaoAlfabetos bdAlfabetos =new DaoAlfabetos();


    public Controlador() {

        ArrayList<String> alfabeto = new  ArrayList<String>();
        alfabeto.add("a"); alfabeto.add("b"); alfabeto.add("c");alfabeto.add("d"); alfabeto.add("e");alfabeto.add("f");
        alfabeto.add("g");alfabeto.add("h");alfabeto.add("i");alfabeto.add("j");alfabeto.add("k");alfabeto.add("l");
        alfabeto.add("m"); alfabeto.add("n"); alfabeto.add("o"); alfabeto.add("p"); alfabeto.add("q"); alfabeto.add("r");
        alfabeto.add("s"); alfabeto.add("t"); alfabeto.add("u"); alfabeto.add("v"); alfabeto.add("w"); alfabeto.add("x");
        alfabeto.add("y"); alfabeto.add("z"); alfabeto.add(" ");
        Alfabeto alfabetoDefault = new Alfabeto("default", alfabeto);
        insertarAlfabeto(alfabetoDefault);
    }


    public ArrayList<Alfabeto> cargarAlfabetos() {
        return  bdAlfabetos.getAlfabetos();
    }

    public void procesarPeticion(DTOAlgoritmos elDTO) {
        // TODO implement here
        return;
    }


    private void predefinirAlfabeto(DTOAlgoritmos elDTO) {
        // TODO implement here
        return;
    }

    private boolean validar(DTOAlgoritmos elDTO) {
        // TODO implement here
        return false;
    }


    public void activarAlgoritmos(DTOAlgoritmos elDTO) {

        codTel.distribuirAlfabeto(elDTO);
        bin.distribuirAlfabeto(elDTO);
        palclv.distribuirAlfabeto(elDTO);

        if(elDTO.getAlgoritmoSelec() == "Vigenere")
        {
            if(elDTO.isModoCodificacion())
            {
                vigenere.codificar(elDTO);
            }else
                {
                    vigenere.decodificar(elDTO);
                }
        }else if(elDTO.getAlgoritmoSelec()== "Transpocisión")
        {
            if (elDTO.isModoCodificacion())
            {
                trans.codificar(elDTO);
            }trans.codificar(elDTO);
        }else if(elDTO.getAlgoritmoSelec()== "Código telefónico")
        {
            if(elDTO.isModoCodificacion())
            {
                codTel.codificar(elDTO);
            }
            else
                {
                    codTel.decodificar(elDTO);
                }
        }
        else if(elDTO.getAlgoritmoSelec() == "Binario")
        {
            if(elDTO.isModoCodificacion())
            {
                bin.codificar(elDTO);
            }
            else
                {
                    bin.decodificar(elDTO);
                }

        }
        else
            {
                if(elDTO.isModoCodificacion())
                {
                    palclv.codificar(elDTO);
                }
                else
                    {
                        palclv.decodificar(elDTO);
                    }
            }
    }


    private void escribir(DTOAlgoritmos DTO) {
        // TODO implement here
        return;
    }


    public boolean validar(Object obj){
        return false;
    }

    public void insertarAlfabeto(Alfabeto alfabeto) {
        bdAlfabetos.insertarAlfabeto(alfabeto);
    }

    public  void escribirTxt(String text, String pathName) throws IOException {
        escritorTxt.escribir(text, pathName);
    }
    public void escribirPDF(String text, String pathName) throws FileNotFoundException, DocumentException {
        escritorPDF.escribir(text,pathName);
    }
}

