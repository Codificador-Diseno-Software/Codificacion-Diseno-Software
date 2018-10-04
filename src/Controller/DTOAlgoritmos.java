package Controller;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */

public class DTOAlgoritmos implements Serializable {


    private static final long serialVersionUID = 1L;
    private int elAlfabeto;
    private String fraseOrigen;
    private String algoritmoSelec;
    private List salidasSelect;
    private String resultados;
    private boolean modoCodificacion;

    public DTOAlgoritmos() {
    }

    public DTOAlgoritmos(int elAlfabeto, String fraseOrigen, String algoritmoSelec, List salidasSelect, String resultados, boolean modoCodificacion) {
        this.elAlfabeto = elAlfabeto;
        this.fraseOrigen = fraseOrigen;
        this.algoritmoSelec = algoritmoSelec;
        this.salidasSelect = salidasSelect;
        this.resultados = resultados;
        this.modoCodificacion = modoCodificacion;
    }

    public int getElAlfabeto() {
        return elAlfabeto;
    }

    public void setElAlfabeto(int elAlfabeto) {
        this.elAlfabeto = elAlfabeto;
    }

    public String getFraseOrigen() {
        return fraseOrigen;
    }

    public void setFraseOrigen(String fraseOrigen) {
        this.fraseOrigen = fraseOrigen;
    }

    public String getAlgoritmoSelec() {
        return algoritmoSelec;
    }

    public void setAlgoritmoSelec(String algoritmoSelec) {
        this.algoritmoSelec = algoritmoSelec;
    }

    public List getSalidasSelect() {
        return salidasSelect;
    }

    public void setSalidasSelect(List salidasSelect) {
        this.salidasSelect = salidasSelect;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public boolean isModoCodificacion() {
        return modoCodificacion;
    }

    public void setModoCodificacion(boolean modoCodificacion) {
        this.modoCodificacion = modoCodificacion;
    }
}

