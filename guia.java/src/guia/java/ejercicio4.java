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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        //Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner leer = new Scanner(System.in);
        int grados;
        int fahr;
   
        System.out.println("ingresar la cantidad de grados");
        grados= leer.nextInt();
        
        fahr=32+(9*grados/5);
        
        System.out.println("la cantidad en fahrenheit es de "+fahr);
        
                
    }
    
}
