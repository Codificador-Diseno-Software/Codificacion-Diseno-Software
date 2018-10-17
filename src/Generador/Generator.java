package Generador;

import java.util.ArrayList;

public class Generator {
    FraseBuilder builder;

    public void setBuilder(int tipo, ArrayList<String> alfabeto) {
        switch (tipo){
            case 1:
                this.builder = new NoConsecutivosNoDuplicados(alfabeto);
                break;

            case 2:
                this.builder = new ConsecutivosNoDuplicados(alfabeto);
                break;

            case 3:
                this.builder = new ConsecutivosDuplicados(alfabeto);
                break;
        }
    }

    public String generar(int cantidad){
        String res;
        builder.generarFrase(cantidad);
        res = builder.getFrase();
        return res;
    }
}
