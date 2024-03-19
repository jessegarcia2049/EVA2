/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int califa;
Scanner captu = new Scanner (System.in);
System.out.println("Introduce el dia de la semana en numero (0 - 100): "); 
        califa = captu.nextInt();
 
        	
if(califa >= 90 && califa <= 100)//A
System.out.println("A");	
else if (califa >= 80 && califa <= 89)
            System.out.println("B");
else if (califa >= 70 && califa <= 79)
            System.out.println("C");
    else if (califa >= 60 && califa <= 679)
            System.out.println("D");
else if (califa >= 0 && califa <= 59)
            System.out.println("F");
else
            System.out.println("Calificacion no valida!!!");
    
    }
    
}
