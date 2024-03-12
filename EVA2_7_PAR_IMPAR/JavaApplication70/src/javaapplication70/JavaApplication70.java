/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class JavaApplication70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num, divi, resi; 
    Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un numero entero");
       num= captu.nextInt ();
    divi = num / 2;
        System.out.println("Division entera de" + num + "/2 =" + divi);
        resi = num % 2;
         System.out.println("El residuo de" + num + "%2 =" + resi);
         if (resi == 0)
         //NUMERO PAR O IMPAR:
         
             System.out.println (num + " es impar");
         else 
                  System.out.println(num + "es par");
         
         System.out.println(num + "es impar");
         
            }
    
}
