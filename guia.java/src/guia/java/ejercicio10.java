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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        
        Scanner leer=new Scanner(System.in);
        int numero;
        
        System.out.println("ingrese un numero positivo");
        numero=leer.nextInt();
        
        while (numero<=0){
               System.out.println("ingrese un numero positivo");
               numero=leer.nextInt();   
        }
        System.out.println("ingrese numeros para sumar y superar al primer numero ingresado");
        int sum;
        sum=leer.nextInt();
        int suma;
        suma=0;
        while (numero>suma){
            suma=sum+suma;
             System.out.println("ingrese numeros para sumar y superar al primer numero ingresado");
             sum=leer.nextInt();
        }
    }
    
}
