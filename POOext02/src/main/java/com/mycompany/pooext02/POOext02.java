/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pooext02;

import Entidad.Puntos;
import java.util.Scanner;

/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
public class POOext02 {

    public static void main(String[] args) {
        Puntos p1 = new Puntos();        
        p1 = crearPuntos();
        System.out.println("Distancia "+dist(p1));
        
    }
    
    public static Puntos crearPuntos() {
        Scanner lr = new Scanner(System.in);
        double x1, y1, x2, y2;
        System.out.println("Ingrese coordenadas del primer punt P1(X,Y) ");
        x1 = lr.nextDouble();
        y1 = lr.nextDouble();
        System.out.println("Ingrese coordenadas del segundo punt P2(X,Y) ");
        x2 = lr.nextDouble();
        y2 = lr.nextDouble();
        return new Puntos(x1,y1,x2,y2);
    }
    public static double dist(Puntos p1){
        double distancia = Math.sqrt((Math.pow(p1.getX1()-p1.getX2(), 2)+Math.pow(p1.getY1()-p1.getY2(), 2)));
        return distancia;
    }
}
