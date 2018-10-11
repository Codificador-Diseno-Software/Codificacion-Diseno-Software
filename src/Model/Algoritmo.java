package Model;

import Controller.DTOAlgoritmos;

import java.util.*;


public abstract class Algoritmo {

    public Algoritmo() {
    }

    public abstract DTOAlgoritmos codificar(DTOAlgoritmos dtoAlgoritmos);


    public abstract DTOAlgoritmos decodificar(DTOAlgoritmos dtoAlgoritmos);

}