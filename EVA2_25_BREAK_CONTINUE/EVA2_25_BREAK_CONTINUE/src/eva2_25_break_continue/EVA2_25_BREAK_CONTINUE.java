/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_break_continue;

/**
 *
 * @author jesse
 */
public class EVA2_25_BREAK_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    for (int i = 0; i < 100; i++) {
        int mod = i % 2; 
        if (mod != 0) // queremos que los casos sean pares  // si da diferente da cero 
            continue; // CUANDO SE EJECUTA, INTERRUMPE LA ITERACION ACTUAL
        
        System.out.println(i); }
    
    { System.out.println("BREAK: >>>>>>>>>>>>>>>");
            for (int i = 0; i < 100; i++) {
                if (i == 50)
                    break; // cuando se ejecuta, detiene por completo el ciclo. 
            }
    }
    {
        
        
    }
    }
    
}
