package es.salesianos;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;

public class App {
     public static void main(String[] args) {
            
        Console actividad1 = System.console();
        
        String texto = actividad1.readLine("Introduzca un texto con un minimo de 30 caracteres: ");

        if(texto.length() < 30){
        while (texto.length() < 30) {
        System.out.println("Te faltaron caracteres: " + (30 - texto.length()));
        texto = actividad1.readLine("Vuelve a introducirlo: ");
        }
        }else{
            String textoNuevo = texto.toUpperCase().replace(" ", "_"); 
            System.out.println(textoNuevo);

            try {
                FileWriter textoArchivo = new FileWriter("src/es/salesianos/ficheros/Actividad1.txt");
                textoArchivo.write(textoNuevo);
                textoArchivo.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("nada supongo");
            }
        }

    }
}