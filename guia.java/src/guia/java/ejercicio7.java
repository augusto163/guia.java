/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.java;

import java.util.Scanner;

/**
 *
 * @author AUGUSTO
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
*pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
*la función equals() en Java.*/
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("ingresa la palabra eureka");
        nombre= leer.next();
        
        if (nombre.equals("eureka")){
            System.out.println("bien");
        }
        else {
            System.out.println("mal");
        }
    }
    
}
