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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numero para sumar");
int numero1= leer.nextInt();
int numero2=leer.nextInt();
int suma=numero1+numero2;
        System.out.println("el resultado de la suma es: "+suma);
    }
    
}
