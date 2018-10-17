package Model;

import Controller.DTOAlgoritmos;
import com.itextpdf.text.DocumentException;

import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public interface IEscritor {


    public boolean escribir(String text, String pathName) throws IOException, DocumentException, ParserConfigurationException;



}