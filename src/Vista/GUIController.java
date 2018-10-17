package Vista;

import Controller.Controlador;
import Controller.DTOAlgoritmos;
import Controller.DaoAlfabetos;
import Model.Alfabeto;
import com.itextpdf.text.DocumentException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class GUIController {

    public GUIController() {


    }

    Controlador controlador = new Controlador();


    @FXML
    private Spinner cifraVigenere;
    @FXML
    private ListView listAlgoritmos;
    @FXML
    private ListView tipoSalida;
    @FXML
    private TextField palabraClave;
    @FXML
    private ComboBox comboAlfabeto;
    @FXML
    private ComboBox comboGenerarFrase;
    @FXML
    private  Spinner spinnerCaracteres;
    @FXML
    private Button btnIniciar;
    @FXML
    private  Button btnCargarAlf;
    @FXML
    private TextField nombreAlfabeto;
    @FXML
    private TextField fraseOrigen;
    @FXML
    private  CheckBox selectedCod;
    @FXML
    private  TextArea resultado;
    @FXML
    private  Button btnGuardar;

    private  ArrayList<DTOAlgoritmos> listDTO = new ArrayList<DTOAlgoritmos>();


    public void initialize()
    {

        SpinnerValueFactory<Integer> cifrasVig = new SpinnerValueFactory.IntegerSpinnerValueFactory(10,99,10);
        this.cifraVigenere.setValueFactory(cifrasVig);

        SpinnerValueFactory<Integer> cifFrase = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99,1);
        this.spinnerCaracteres.setValueFactory(cifFrase);

        tipoSalida.getItems().addAll(".txt", ".xml", ".pdf");
        tipoSalida.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        listAlgoritmos.getItems().addAll("Vigenere", "Código telefónico", "Binario", "Transpocisión", "Palabra Clave");
        listAlgoritmos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        ObservableList<String> frases = FXCollections.observableArrayList("No consecutivos no duplicados", "Si consecutivos no duplicados", "Si consecutivos si duplicados", "otro");
        comboGenerarFrase.setValue("otro");
        comboGenerarFrase.setItems(frases);
        updateAlf();
        btnCargarAlf.setOnAction(event -> {
            FileChooser fc = new FileChooser();
            File selectedFile = fc.showOpenDialog(null);
            if (selectedFile != null)
            {
                try {
                    String line = Files.lines(selectedFile.toPath()).findFirst().get();
                    String[] alfAux = line.split(" ");
                    ArrayList<String> alf = new ArrayList<>();
                    for (int i = 0; i < alfAux.length; i++)
                    {
                        alf.add(alfAux[i]);
                    }
                    Alfabeto alfaNuevo = new Alfabeto(nombreAlfabeto.getText(), alf);
                    controlador.insertarAlfabeto(alfaNuevo);
                    updateAlf();

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }else
                {
                    JOptionPane.showMessageDialog(null, "Error", "Error",JOptionPane.ERROR_MESSAGE );
                }
        });
        btnIniciar.setOnAction(event ->
        {
            String res= "";
            ObservableList<String> selectedItems = listAlgoritmos.getSelectionModel().getSelectedItems();
            ObservableList<String> selectedExit = tipoSalida.getSelectionModel().getSelectedItems();

            for(String s : selectedItems){
                if(selectedCod.isSelected())
                {
                    DTOAlgoritmos dto = new DTOAlgoritmos(controlador.cargarAlfabetos().get(0),fraseOrigen.getText(), s, selectedExit, null,
                            true, cifrasVig.getValue(), palabraClave.getText());
                    controlador.activarAlgoritmos(dto);
                    listDTO.add(dto);
                    res+= dto.getAlgoritmoSelec()+ "\n"+ dto.getFraseOrigen()+ "\n"+ dto.getResultados()+"\n"+ dto.getCifra()+"\n";
                }
                else
                    {
                        DTOAlgoritmos dto = new DTOAlgoritmos(controlador.cargarAlfabetos().get(0),fraseOrigen.getText(), s, selectedExit, null,
                                false, cifrasVig.getValue(), palabraClave.getText());
                        controlador.activarAlgoritmos(dto);
                        res+= dto.getAlgoritmoSelec()+ "\n"+ dto.getFraseOrigen()+ "\n"+ dto.getResultados()+"\n"+ dto.getCifra()+"\n";
                    }
                    resultado.setText(res);
            }
        });
        btnGuardar.setOnAction(event ->
        {
            ObservableList<String> selectedExit = tipoSalida.getSelectionModel().getSelectedItems();
            for(String s : selectedExit)
            {
                if (s == ".txt")
                {
                    try {
                        controlador.escribirTxt(resultado.getText(), "algoritmoTXT");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else if(s == ".pdf")
                {
                    try {
                        controlador.escribirPDF(resultado.getText(), "algoritmoPDF");
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (DocumentException e) {
                        e.printStackTrace();
                    }
                }else
                    {
                        System.out.println("Hola");
                    }
            }


        });

    }

    private void updateAlf()
    {
        ObservableList<String> alfabetos = FXCollections.observableArrayList();
        ArrayList<Alfabeto> alfabetos1 = controlador.cargarAlfabetos();
        for (int i = 0; i< alfabetos1.size();i++)
        {
            alfabetos.add(alfabetos1.get(i).getNombre());
        }
        comboAlfabeto.setValue(alfabetos.get(0));
        comboAlfabeto.setItems(alfabetos);
    }


}
