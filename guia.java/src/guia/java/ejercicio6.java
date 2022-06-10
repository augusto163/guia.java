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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un programa que dado un numero determine si es par o impar.
        
        Scanner leer= new Scanner(System.in);
        int numero;
        
        System.out.println("ingresa un numero");
        numero= leer.nextInt();
        
        if (numero%2==0) {
            System.out.println("tu numro es par");
        }  else{
            System.out.println("tu numero es impar");
        }
                
                    
       
        
                
    }
    
}
