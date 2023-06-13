package es.salesianos.ficheros.actividad3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class App {
    
    public static void main(String[] args) {
        File miFichero = new File("src/es/salesianos/ficheros/actividad3/Actividad3.txt");

        fusionarFicheros(miFichero);

        String firmita = "ESE ADRI";
        anadirFirma(miFichero, firmita);
    }

    public static void fusionarFicheros(File miFichero) {
        try{
            
            FileReader lector1 = new FileReader("src/es/salesianos/ficheros/actividad1/Actividad1.txt");
            BufferedReader buffer1 = new BufferedReader(lector1);
            String texto1 = buffer1.readLine();

            FileReader lector2 = new FileReader("src/es/salesianos/ficheros/actividad2/Actividad2.txt");
            BufferedReader buffer2 = new BufferedReader(lector2);
            String texto2 = buffer1.readLine();

            FileWriter fusionFicheros = new FileWriter(miFichero);
            fusionFicheros.write(texto1 + "\n") ;
            fusionFicheros.write(texto2 + "\n") ;

            buffer1.close();
            buffer2.close();
            fusionFicheros.close();
            
        } catch (IOException e){
            System.out.println("Cagaste");
            e.printStackTrace();
        } 
    }

    public static void anadirFirma(File miFichero, String firma) {
        try {
            FileWriter miFirma = new FileWriter(miFichero, true);
            miFirma.write(firma);
            miFirma.close();
        } catch (IOException e) {
            System.out.println("volviste a cagarla");
        }
    }
}
