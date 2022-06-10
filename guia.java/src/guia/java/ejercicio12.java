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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String frase;
        int n;
        int h;
        n=0;
        h=-1;
        do{
            do{
        System.out.println("ingrese un fde");
        frase=leer.nextLine();
            }while (frase.length()>5);
            
        if (frase.substring(0,1).equals("x") && frase.substring(frase.length()-1,frase.length()).equals("o")){
               n++;
        } else{
            h++;
        }
        
        }while (!frase.equals("&&&&&"));
        
        System.out.println("la cantidad de codigos correctos es de "+n);
        System.out.println("la cantidad de codigos incorrectos es de "+h);
 
    }
    
}
