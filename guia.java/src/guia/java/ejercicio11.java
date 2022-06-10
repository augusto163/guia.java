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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        
        int num1;
        int num2;
        int suma;
        int resta;
        int mult;
        double div;
        int salir;
        salir=0;
        System.out.println("ingresa el primer numero");
        num1=leer.nextInt();
        System.out.println("ingresa el segundo numero");
        num2=leer.nextInt();
        System.out.println("que desea hacer");
        System.out.println("1_sumar");
        System.out.println("2_restasr");
        System.out.println("3_dividir");
        System.out.println("4_multiplicar");
        System.out.println("5_salir");
        int opinion;
        opinion=leer.nextInt();
        
        do{
        switch (opinion){
            case 1:
                suma=num1+num2;
                System.out.println("el resultado de la suma es "+suma);
                System.out.println("¿que desea hacer?");
                opinion=leer.nextInt();
                break;
            case 2:
                resta=num1-num2;
                System.out.println("el resultado de la resta "+resta);
                System.out.println("¿que desea hacer?");
                opinion=leer.nextInt();
                break;
            case 3:
                div=num1/num2;
                System.out.println("el resultado de la division es "+div);
                System.out.println("¿que desea hacer?");
                opinion=leer.nextInt();
                break;
            case 4:
                mult=num1*num2;
                System.out.println("el resultado de la multiplicacion es "+mult);
                 System.out.println("¿que desea hacer?");
                opinion=leer.nextInt();
                break;
            case 5:
                salir=1;
                break;
        }         
                
        }while   (salir==0);
    }
    
}
