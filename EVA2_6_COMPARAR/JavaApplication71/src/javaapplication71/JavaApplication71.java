/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class JavaApplication71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  //CUAL ES EL MAYOR VALOR ENTRE DOS NUMEROS
    //PIDAN AL USUARIO DOS VALORES ENTEROS 
        
    int num1, num2; 
    Scanner captu = new Scanner (System.in);
        System.out.println("Valor 1:");
        num1 = captu.nextInt();
        System.out.println("Valor 2:");
        num2 = captu.nextInt();
        
        
    //CUAL ES EL MAYOR 
    
    if(num1 > num2){
        System.out.println(num1 + "es mayor!!!");
    
        }else{
     if (num1 == num2) // num1 es igual que num2?
             System.out.println("Son iguales");
        else
      System.out.println(num2 + "es mayor!!");
    
     }
 
    
    }
    
    

