/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pooext03;

import Entidad.Raices;
import Servicio.constructor;

/**
 *
 * @author roser
 */
public class POOext03 {

    public static void main(String[] args) {
        constructor s1 = new constructor();
        Raices r1 = s1.constructor();
        if (s1.getDiscriminante(r1) > 0) {
            System.out.println("Tiene dos soluciones: ");
            s1.obtieneRaices(r1, 0, true);
        } else if (s1.getDiscriminante(r1) == 0) {
                System.out.println("Tiene una solución: ");
                s1.obtieneRaiz(r1, 0, true);
            } else {
                System.out.println("NO tiene solución posible");          
        }
    }
}
