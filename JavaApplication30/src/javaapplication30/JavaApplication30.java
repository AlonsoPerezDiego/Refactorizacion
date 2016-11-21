/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Diego
 */
public class JavaApplication30 {

    public static boolean p = false;
    public static void main(String[] args) {
        int numDigitos;
        int calcDigit;
        Refac objeto=new Refac();
        numDigitos=objeto.pedirNumDigitos();
        for (int i = 1; i <= 99999; i++) {
            calcDigit = objeto.calculaDigitos(i);

            if (calcDigit == numDigitos) {
                if (i < 4)
                    p = true;
                else  {
            if (i % 2 == 0) p = false; 
                else
                {
                    int contador1 = 0;  
                    int i1 = 1; 
                    int limite = (i - 1) / 2; 
                    if  (limite % 2 == 0) limite--;  
             
                    while(i1 <= limite)
                    {
                        if (i % i1 == 0) contador1++;
                            i1 += 2;
                            if (contador1 == 2) i1 = limite + 1;
                    }
 
        if (contador1 == 1) p = true;
            } 
        } 
     
                if (p == true) 
                    System.out.println(i);    
            }
        }
    }
    
}
