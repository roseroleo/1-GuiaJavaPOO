/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fechas;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author roser
 */
public class Fechas {

    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        Date fecha = new Date();
        //Variables para Dia, Mes y Año
        String dd, mm, yyyy;
        System.out.println("Ingresar fecha DD/MM/AAAA ");
        System.out.print("Dia ");
        dd = lr.next();
        System.out.print("Mes ");
        mm = lr.next();
        System.out.print("Año ");
        yyyy = lr.next();
        
        //Establecer formato de fecha
        SimpleDateFormat fecha1 = new SimpleDateFormat ();
        fecha1.applyPattern(dd+mm+yyyy);
        
        //Imprimir fecha con formato establecido
        System.out.println("Fecha usuario "+fecha1.format(fecha));
        
        //Imprimir fecha actual con el formato establecido
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
        //Imprimir fecha con formato establecido
        System.out.println("Fecha de hoy "+dtf.format(LocalDateTime.now()));
//        fecha.compareTo(dtf.format(LocalDateTime.now()));
        Date f1 = new Date();
        System.out.println(f1.after(f1));
        SimpleDateFormat fecha2 = new SimpleDateFormat ();
        fecha2.applyPattern(dd+mm+yyyy);
        System.out.println("Fecha nueva "+fecha2.format(fecha));
        
    }
    
    public void fechas(){
        String[] fechas = {"12011999","12122002"};
        
    }
}
