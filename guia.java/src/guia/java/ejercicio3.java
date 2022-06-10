/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.java;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author AUGUSTO
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        Scanner leer= new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase=leer.nextLine();
        System.out.println("frase en minuscalas");
        System.out.println(toLowerCase(frase));
        System.out.println("frase en mayusculas");
        System.out.println(toUpperCase(frase));
        
        
    }
    
}
