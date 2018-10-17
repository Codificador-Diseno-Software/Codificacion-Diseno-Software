package Generador;

import java.util.ArrayList;

public abstract class FraseBuilder {
    public ArrayList<String> alfabeto;
    String frase;

    public FraseBuilder(ArrayList<String> alfabeto) {
        this.alfabeto = alfabeto;
        frase = "";
    }

    public abstract String getFrase();
    public abstract void generarFrase(int cantidad);
}
