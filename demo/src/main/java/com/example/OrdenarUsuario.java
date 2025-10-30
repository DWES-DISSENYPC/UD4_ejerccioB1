package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OrdenarUsuario {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String nom = "0";
         String linea = "";

        do {

            System.out.println("Menu:"); 
            System.out.println(" Introduce el nombre, 0 para salir");
            nom = ent.nextLine(); 

            if (!nom.equals("0")) {

                try (BufferedReader lector = new BufferedReader(new FileReader("E:\\Mis Documentos\\Documentos\\ESTUDIOS DAW 2\\DESARROLLO WEB ENTORNO SERVIDOR\\EJERCICIOS JAVA\\DEWS_UD4\\ud4 ejercicios lectura y escritura ficheros\\UD4_ejerccioB1\\demo\\src\\main\\resources\\usuarios.txt"))) {

                   while ((linea = lector.readLine()) != null) {
                        int indice = linea.indexOf(" ");

                        if (linea.substring(0, indice).equals(nom)) {

                            System.out.println(linea);
                        }

                     }   

                } catch (IOException e) {

                    System.err.println("Error al leer el archivo: " + e.getMessage());
                 }

            }

        } while (!nom.equals("0"));
        
        
        

    }

}