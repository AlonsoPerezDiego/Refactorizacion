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

    public static boolean esPrimo = false;

    public static void main(String[] args) {
        int numDigitos;
        int calcDigit;
        Refac objeto = new Refac();
        numDigitos = objeto.pedirNumDigitos();
        for (int i = 1; i <= 99999; i++) {
            calcDigit = objeto.calculaDigitos(i);
            if (calcDigit == numDigitos) {
                if (i < 4) {
                    esPrimo = true;
                } else if (i % 2 == 0) {
                    esPrimo = false;
                } else {
                    int metodo = objeto.sinUnoDosTres(i);

                    if (metodo == 1) {
                        esPrimo = true;
                    }
                }
                if (esPrimo == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
