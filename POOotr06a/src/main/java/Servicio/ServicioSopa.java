/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.SopaDeLetras;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author roser
 */
public class ServicioSopa {
//Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
//posición de la matriz inicia la palabra.

    public String ingresarPalabra(char[][] ch, String palabra) {
        String ij = "";
        //Buscar la palabra en cada fila de la matriz y devolver posicion
        for (int i = 0; i < 10; i++) {
            String txt = crearTexto(ch, i);
            if (txt.contains(palabra)) {
                int j = txt.indexOf(palabra);
                ij = String.valueOf(i) + "," + String.valueOf(j);
            }
        }
        return ij;
    }

    //Crear texto con la fila indicada de de la matriz
    public String crearTexto(char[][] m, int i) {
        String texto = "";
        char[] pF = new char[10];
        for (int j = 0; j < 10; j++) {
            pF[j] = m[i][j];
        }
        texto = new String(pF);
        return texto;
    }

    //Imprimir la sopa de letras en pantalla
    public void imprimirSopa(char[][] m) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
    //decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a pollo). Para realizar esta
    //gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
    public void reemplazaPalabra(char[][] m, String palabra, String nuevaPal) {
        String posicion = ingresarPalabra(m, palabra);
        SopaDeLetras soup = new SopaDeLetras();
        char[] vector = nuevaPal.toCharArray();
        int posI = Integer.parseInt(posicion.substring(0, 1));
        int posJ = Integer.parseInt(posicion.substring(2, 3));
        for (int j = 0; j < 10; j++) {
            if (j >= posJ && j-posJ< vector.length) {
                m[posI][j] = vector[j-posJ];
            }
        }
        soup.setMatriz(m);
    }
}
