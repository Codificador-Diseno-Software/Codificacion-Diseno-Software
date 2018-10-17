package Generador;

import java.util.ArrayList;
import java.util.Random;

public class ConsecutivosNoDuplicados extends FraseBuilder {

    public ConsecutivosNoDuplicados(ArrayList<String> alfabeto) {
        super(alfabeto);
    }

    @Override
    public String getFrase() {
        return frase;
    }

    @Override
    public void generarFrase(int cantidad) {
        Random random = new Random();
        int x;
        for(int i = 0; i<cantidad; i++){
            if(alfabeto.size() == 0) return;
            x = random.nextInt(alfabeto.size());
            frase += alfabeto.get(x);
            alfabeto.remove(x);
        }
    }
}
