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

    public static boolean primo = false;

    public static void main(String[] args) {
        int numDigitos;
        int calcDigit;
        Refac objeto = new Refac();
        numDigitos = objeto.pedirNumDigitos();
        for (int i = 1; i <= 99999; i++) {
            calcDigit = objeto.calculaDigitos(i);

            if (calcDigit == numDigitos) {
                if (i < 4) {
                    primo = true;
                } else if (i % 2 == 0) {
                    primo = false;
                } else {
                    int metodo = objeto.siNoEsPrimo(i);

                    if (metodo == 1) {
                        primo = true;
                    }
                }

                if (primo == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
