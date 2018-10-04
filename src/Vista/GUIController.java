package Vista;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class GUIController {

    public GUIController() {
    }

    @FXML
    private AnchorPane paneTipoSalida = new AnchorPane();

    @FXML
    private AnchorPane paneAsignarAlfabeto = new AnchorPane();

    @FXML
    private AnchorPane paneCodificar = new AnchorPane();

    @FXML
    private AnchorPane paneDecodificar = new AnchorPane();

    @FXML
    private StackPane paneStack = new StackPane();

    @FXML
    private void handleButtonAsignarAlfabeto() {
        paneAsignarAlfabeto.toFront();
        System.out.println("ASDFIASD");
    }

    @FXML
    private void handleButtonTipoSalida() {
        paneTipoSalida.toFront();
    }

    @FXML
    private void handleButtonCodificar() {
        paneCodificar.toFront();
    }

    @FXML
    private void handleButtonDecodificar() {
        paneDecodificar.toFront();
    }

}
