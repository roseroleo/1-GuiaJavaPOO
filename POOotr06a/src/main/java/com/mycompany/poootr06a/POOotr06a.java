/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.poootr06a;

import Entidad.SopaDeLetras;
import Servicio.ServicioSopa;
import java.util.Scanner;

/**
 *
 * @author roser
 */
public class POOotr06a {

    public static void main(String[] args) {
        ServicioSopa s1 = new ServicioSopa();
        SopaDeLetras sdl = new SopaDeLetras();
        String posicion;
        //Buscar palabra y devolver su posicion
        Scanner lr = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = lr.next();
        posicion = s1.ingresarPalabra(sdl.getMatriz(), palabra);
        s1.imprimirSopa(sdl.getMatriz());
        System.out.println("Posicion = "+posicion);
        //Reemplazar palabra
        System.out.println("Ingrese una nueva palabra para reemplazar la anterior");
        String nuevaPal = lr.next();
        s1.reemplazaPalabra(sdl.getMatriz(), palabra, nuevaPal);
        System.out.println("nueva matriz");
        s1.imprimirSopa(sdl.getMatriz());
    }
}
