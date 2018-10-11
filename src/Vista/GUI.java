package Vista;

import Controller.DTOAlgoritmos;
import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.*;

import static javafx.application.Application.launch;

/**
 * 
 */
public class GUI extends Application {

    private AnchorPane rootLayout;
    private Stage primaryStage;
    /**
     * Default constructor
     */
    public GUI() {
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Sistema de codificación");

        initRootLayout();
    }


    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Vista/GUI.fxml"));
            //loader.setController(new GUIController());
            rootLayout = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


/*
    public void showAsignarAlfabeto() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GUI.class.getResource("Vista/AsignarAlfabeto.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);

            // Give the controller access to the main app.
            PersonOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */


/*    public static String codificar(String frase, int cifra) {
        String res = "";
        boolean primero = true;
        ArrayList<String> alfabeto = new  ArrayList<String>();
        alfabeto.add("a"); alfabeto.add("b"); alfabeto.add("c");alfabeto.add("d"); alfabeto.add("e");alfabeto.add("f");
        alfabeto.add("g");alfabeto.add("h");alfabeto.add("i");alfabeto.add("j");alfabeto.add("k");alfabeto.add("l");
        alfabeto.add("m"); alfabeto.add("n"); alfabeto.add("o"); alfabeto.add("p"); alfabeto.add("q"); alfabeto.add("r");
        alfabeto.add("s"); alfabeto.add("t"); alfabeto.add("u"); alfabeto.add("v"); alfabeto.add("w"); alfabeto.add("x");
        alfabeto.add("y"); alfabeto.add("z"); alfabeto.add(" ");
        char [] fraseArray = frase.toCharArray();
        for (int i = 0; i < fraseArray.length; i++)
        {
            String a = String.valueOf(fraseArray[i]);
            if (a.equals(" "))
            {
                primero = true;
                res+= a;
            }
            else
            {
                if(primero)
                {
                    if (alfabeto.indexOf(a)+(int) Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra)))) > alfabeto.size()-1)
                    {
                        res += alfabeto.get(alfabeto.indexOf("a")+(int)(Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra))))));
                        primero = false;
                    }
                    else
                        {
                            res+= alfabeto.get(alfabeto.indexOf(a)+(int) Math.floor(cifra / Math.pow(10, Math.floor(Math.log10(cifra)))));
                            primero = false;
                        }
                }else
                {
                    if (alfabeto.indexOf(a)+ cifra % 10 > alfabeto.size()-1) {
                        res += alfabeto.get(alfabeto.indexOf("a") + cifra % 10);
                        primero = true;
                    }
                    else
                        {
                            res += alfabeto.get(alfabeto.indexOf(a) + cifra % 10);
                            primero = true;
                        }
                }
            }
        }
        return res;
    }
*/




    public static void main(String[] args){
        launch(args);

    }

}