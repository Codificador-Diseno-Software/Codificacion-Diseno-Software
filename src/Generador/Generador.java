import java.util.ArrayList;

public class Generador {
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
}
