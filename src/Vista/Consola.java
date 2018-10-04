package Vista;

import java.util.*;
import Controller.*;
import Model.*;

/**
 *
 */
public class Consola {


    public static void main(String[] args){
        menu();
    }

    /**
     * Default constructor
     */




    public static void menu(){

        System.out.println("Bienvenido al Sistema de codificación/decodificación");

        while(true) {
            //Controlador controlador;
            //Asignacion del Controlador
            Controlador controlador = new Controlador();

            //Menu
            System.out.println();
            System.out.println("Por favor seleccione una operación: ");
            System.out.println("1. Asignar alfabeto");
            System.out.println("2. Seleccionar tipo de salida");
            System.out.println("3. Codificar");
            System.out.println("4. Decodificar");
            System.out.println("5. Salir");
            Scanner operacion_in = new Scanner(System.in);
            String operacion = operacion_in.nextLine();

            //Operaciones
            if ("1".compareTo(operacion) == 0) { //Asigna alfabeto
                //Empezamos a construir el alfabeto
                System.out.println("Ingrese el nombre del nuevo alfabeto: ");
                Scanner nombre_in = new Scanner(System.in);
                String nombre = nombre_in.nextLine();

                //Id del alfabeto
                System.out.println("Ingrese el id del nuevo alfabeto: ");
                Scanner id_in = new Scanner(System.in);
                String id = id_in.nextLine();

                //Operaciones para asignar nuevo alfabeto
                System.out.println("Ingrese el nuevo alfabeto: ");
                Scanner alfabeto_in = new Scanner(System.in);
                String alfabeto = alfabeto_in.nextLine();
                controlador.insertarAlfabeto(new Alfabeto(nombre, alfabeto.split(" ")));




            } else if ("2".compareTo(operacion) == 0) {//Selecciona tipo de salida
                String escritorActual = salida();
                //controlador.setElEscritor(escritorActual);

            } else if ("3".compareTo(operacion) == 0) { //Codificar un texto
                codificar();
                /* se agrega funciones para codificar*/

            } else if ("4".compareTo(operacion) == 0) { //Decodificar un texto
                decodificar();
                /* se agrega funciones para decodificar*/

            } else if ("5".compareTo(operacion) == 0) { //Se sale de la aplicacion
                break;

            } else{ //Operacion Invalida
                System.out.println("Operacion Inválida");
            }

        }

    }

    public static void codificar() {
        while (true) {

            //Menu
            System.out.println();
            System.out.println("Por favor seleccione un tipo de codificación: ");
            System.out.println("1. Sustitución Vigenére");
            System.out.println("2. Transposición");
            System.out.println("3. Código Telefónico");
            System.out.println("4. Volver");
            Scanner tipo_in = new Scanner(System.in);
            String tipo = tipo_in.nextLine();
            String texto;

            //Operaciones
            if ("1".compareTo(tipo) == 0) { //Sustitución Vigenére
                System.out.println("Ingrese el texto: ");
                Scanner texto_in = new Scanner(System.in);
                texto = texto_in.nextLine();
                //Menu de otra salida
                //Operaciones para codificar


            } else if ("2".compareTo(tipo) == 0) { //Transposición
                System.out.println("Ingrese el texto: ");
                Scanner texto_in = new Scanner(System.in);
                texto = texto_in.nextLine();
                /* se agrega funciones para codificar*/


            } else if ("3".compareTo(tipo) == 0) { //Código Telefónico
                System.out.println("Ingrese el texto: ");
                Scanner texto_in = new Scanner(System.in);
                texto = texto_in.nextLine();
                //Operaciones para codificar
                /* se agrega funciones para codificar*/


            } else if ("4".compareTo(tipo) == 0) { //Se sale de las opciones de codificar
                break;

            } else { //Tipo Invalido
                System.out.println("Tipo Invalido");
                return;
            }

            new EscritorTxt().escribir(new DTOAlgoritmos(1, texto, tipo, null, null, true));

            System.out.println("Se codifico exitosamente");
            menu();
        }
    }

    public static void decodificar () {
        while (true) {

            //Menu
            System.out.println();
            System.out.println("Porfavor seleccione un tipo de decodificacion: ");
            System.out.println("1. Sustitución Vigenére");
            System.out.println("2. Transposición");
            System.out.println("3. Código Telefónico");
            System.out.println("4. Volver");
            Scanner tipo_in = new Scanner(System.in);
            String tipo = tipo_in.nextLine();
            String texto;

            //Operaciones
            if ("1".compareTo(tipo) == 0) { //Sustitución Vigenére
                System.out.println("Ingrese el texto: ");
                Scanner texto_in = new Scanner(System.in);
                texto = texto_in.nextLine();
                //Operaciones para decodificar
            } else if ("2".compareTo(tipo) == 0) { //Transposición
                System.out.println("Ingrese el texto: ");
                Scanner texto_in = new Scanner(System.in);
                texto = texto_in.nextLine();
                /* se agrega funciones para decodificar*/
            } else if ("3".compareTo(tipo) == 0) { //Código Telefónico
                System.out.println("Ingrese el texto: ");
                Scanner texto_in = new Scanner(System.in);
                texto = texto_in.nextLine();
                //Operaciones para decodificar
                /* se agrega funciones para decodificar*/
            } else if ("4".compareTo(tipo) == 0) { //Se sale de las opciones de decodificar
                break;
            } else { //Tipo Invalido
                System.out.println("Tipo Invalido");
                return;
            }
            System.out.println("Se decodifico exitosamente");

            new EscritorTxt().escribir(new DTOAlgoritmos(1, texto, tipo, null, null, true));


            menu();
        }



    }

    public static String salida(){
        while (true) {

            //Menu
            System.out.println();
            System.out.println("Porfavor seleccione un tipo de salida: ");
            System.out.println("1. Texto Plano (.txt)");
            System.out.println("2. PDF");
            System.out.println("3. XML");
            Scanner tipo_in = new Scanner(System.in);
            String tipo = tipo_in.nextLine();


            //Operaciones
            if ("1".compareTo(tipo) == 0) { //Texto Plano
                /*
                EscritorTxt result = new EscritorTxt();
                System.out.println("Selecciono Texto Plano");
                return result;
*/
                System.out.println("Selecciono Texto Plano");
                menu();

            } else if ("2".compareTo(tipo) == 0) { //PDF
                /*
                EscritorPDF result = new EscritorPDF();
                System.out.println("Selecciono PDF");
                return result;
*/
                System.out.println("Selecciono PDF");
                menu();

            } else if ("3".compareTo(tipo) == 0) { //XML
                /*
                EscritorXML result = new EscritorXML();
                System.out.println("Selecciono XML");
                return result;
*/
                System.out.println("Selecciono XML");
                menu();

            } else { //Tipo Invalido
                System.out.println("Tipo Invalido");
            }
        }
    }
}

