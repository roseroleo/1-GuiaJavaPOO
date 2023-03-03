/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*
Crear una clase Sopa de letras que contenga un atributo matriz, y otro  palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
 */
public class SopaDeLetras {

    private char[][] matriz = {
        {'s', 'd', 'l', 'i', 'm', 'o', 'n', 'f', 'g', 'h'},
        {'w', 'p', 'a', 't', 'i', 'o', 'e', 'r', 't', 'y'},
        {'h', 'g', 'y', 'v', 'a', 'm', 'i', 'g', 'a', 'n'},
        {'n', 'm', 'p', 'e', 'd', 'r', 'o', 'z', 'd', 'h'},
        {'l', 'j', 'y', 'd', 'a', 'v', 'v', 'd', 'f', 'f'},
        {'t', 'r', 'o', 'l', 'l', 'j', 'k', 'e', 'l', 'r'},
        {'q', 'e', 'w', 'a', 'h', 'u', 'e', 'v', 'o', 's'},
        {'c', 'g', 'm', 'a', 't', 'e', 'o', 'h', 'j', 'k'},
        {'w', 'd', 'o', 'r', 'i', 's', 'r', 'y', 'j', 'k'},
        {'e', 'r', 't', 'y', 'j', 'p', 'o', 'l', 'l', 'o'}};

    private String palabra;

    public SopaDeLetras() {

    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public SopaDeLetras(String palabra) {
        this.palabra = palabra;
    }

    
}
