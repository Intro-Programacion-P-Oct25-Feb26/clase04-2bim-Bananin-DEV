/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo043 {

    public static void main(String[] args) {
        // 
        int[] valores1 = {10, 100, 1000, 20, 200, 2000};
        int[] valores2 = {1000, 1001, 1002, 1003, 1004, 1005};

        for (int i = 0; i < valores1.length; i++) {
            int v1 = valores1[i];
            int v2 = valores2[i];
            obtenerSuma(v1, v2);
            /*
            En este codigo estamos enviando dos valores repetidamente, estos valores
            se actualizan a la vez que el contador i cambia de valor moviendose
            gracias al .lenght que estamos usando en el for, los valores enviados llegan
            a la funcion obtenerSuma la cual los suma y los presenta por ejemplo:
            si i = 0 entonces v1 = 10 y v2 = 1000 sumados = 1010
             */
        }

        // obtenerSuma(10, 30); // se invoca al método (procedimiento) obtenerSuma
    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

}
