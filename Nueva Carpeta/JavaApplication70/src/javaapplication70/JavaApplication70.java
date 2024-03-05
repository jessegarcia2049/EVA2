/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;

/**
 *
 * @author invitado
 */
public class JavaApplication70 {

    private static double doubleDivi;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num1, num2;
num1= 5;
num2= 3;
int suma = num1 + num2; // operador de suma +

// Si en el operador + uno de los terminos es // una cadena, todo se convierte a cadena y se unen
//concatenacion: union de cadenas de texto

System.out.println("La suma es"+suma);
boolean prueba = true; 
        System.out.println("El valor de prueba es" + prueba);
        // control + shift + flecha hacia abajo para multiplicar renglones
        System.out.println("El valor de prueba es" + prueba);
        
       //MULTIPLICACION * 
               int multi; 
               multi = num1 * num2; 
        System.out.println("La multiplicacion es" + multi);
    // DIVISION, AHI SI TOMARSE CIERTAS PRECAUCIONES 
    //ASAN COSAS MUY RARAS EN JAVA CUANDO DIVIDEN ALGUNAS COSAS, ENTEROS POR EJEMPLO
    int divi = 7 / 2;
        System.out.println("la division es 5 / 3 es" + divi);
        
                  doubleDivi = 7 / 2.0;
                              System.out.println("la division (double) es 7 / 2 es" + divi);
                              doubleDivi = 7 / 2.0; 
                                      
                                      //ACUMULADORES 
                                      //SUMA +=, RESTA -=, MULTI *=, DIVI /=
                                      
                                      int sumatoria = 0; 
                                      /*sumatoria = sumatoria + 90; 
                                      sumatoria = sumatoria + 80; 
                                      sumatoria = sumatoria + 80;*/ 
                                      sumatoria += 90;
                                      sumatoria += 80;
                                      sumatoria += 80;
                                      
                                      System.out.println("La sumatoria es "+ sumatoria );
                                      sumatoria -= 70; //le resto 70 a sumatoria
                                      System.out.println("La sumatoria es "+ sumatoria);
                                      //sumatoria = sumatoria -70;
                                      System.out.println("La sumatoria es "+ sumatoria);
                                      
                                      int multiAcum = 1;
                                      multiAcum *= 100;
                                     
                                      System.out.println("Multiacum =" + multiAcum);
                                      
                                     multiAcum *= 5;
                                      System.out.println("Multiacum =" + multiAcum);
                                      
  
                           
    }

