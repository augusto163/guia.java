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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        //doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        double raiz;
        int triple;
        int doble;
        
        System.out.println("ingresa un numero");
        numero= leer.nextInt();
        
        raiz= (int) Math.sqrt(numero);
        triple=numero*3;
        doble=numero*2;
        
        System.out.println("el doble es "+doble);
        System.out.println("el triple es "+triple);   
        System.out.println("la raiz cuadrada es "+raiz);
              
        
    }
    
}
