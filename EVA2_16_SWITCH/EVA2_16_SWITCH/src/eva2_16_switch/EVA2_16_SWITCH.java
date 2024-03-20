/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_16_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int mes;
   Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero de mes: ");
        mes = captu.nextInt();
        
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;//termina el switch
            case 2:
                System.out.println("febrero");
                break;//termina el switch
            case 3:
                System.out.println("marzo");
                break;//termina el switch
            case 4:
                System.out.println("abril");
                break;//termina el switch
            case 5:
                System.out.println("mayo");
                break;//termina el switch
            case 6:
                System.out.println("junio");
               break;//termina el switch
                
            case 7:
                System.out.println("julio");
                break;//termina el switch
                
            case 8:
                System.out.println("agosto");
               break;//termina el switch
                
            case 9:
                System.out.println("septiembre");
                break;//termina el switch
                
            case 10:
                System.out.println("octubre");
               break;//termina el switch
                
            case 11:
                System.out.println("noviembre");
               break;//termina el switch
            case 12:
                System.out.println("diciembre");
               break;//termina el switch
                }
                
        }
    
    }
    
}
