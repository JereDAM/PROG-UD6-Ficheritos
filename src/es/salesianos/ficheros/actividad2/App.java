package es.salesianos.ficheros.actividad2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main (String [] args) { 
        File actividad2 = new File("src/es/salesianos/ficheros/actividad2/Actividad2.txt");
        mostrarMensaje(actividad2);

    }

    public static void mostrarMensaje(File actividad2){
        try{
            FileReader lector = new FileReader(actividad2);
            int caracter;
            while ((caracter = lector.read()) != -1) {
                System.out.print((char) caracter + "_" + caracter + ",");
            }
            lector.close();
        } catch (IOException e){
            System.out.println("Error mi loco");
        }
    }

} 
