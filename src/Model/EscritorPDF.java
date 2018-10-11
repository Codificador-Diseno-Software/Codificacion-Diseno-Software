package Model;

import Controller.DTOAlgoritmos;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;


public class EscritorPDF extends Escritor implements IEscritor {


    public EscritorPDF() {
    }


    public boolean escribir(String text, String pathName) throws FileNotFoundException, DocumentException {
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Joseph Salas\\IdeaProjects\\Codificacion-Diseno-Software\\src\\Utils\\"+pathName+".pdf"));
        doc.open();
        doc.add(new Paragraph(text));
        doc.close();
        return false;
    }
}