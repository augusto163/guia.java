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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
*es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
*diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
*la función Substring y equals() de Java.*/
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
      
        System.out.println("ingrese una frase que empiece con a");
        frase=leer.next();
        
        
        
        if (frase.substring(0,1).equals("a")){
                System.out.println("correcto");
        }
        else {
            System.out.println("incorrecto");
        }
                
    }
    
}
