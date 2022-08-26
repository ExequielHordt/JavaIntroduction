/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActivitiesJavaIntroduction;

import java.util.Scanner;

/**
 *
 * @author Exe
 */
public class Task_17 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int vectorSize;
        int[] vector;
        System.out.println("Contabilizar dígitos");
        System.out.println("********************");
        System.out.print("Ingrese el tamaño del vector: ");
        vectorSize = read.nextInt();
        vector = new int[vectorSize];
        System.out.println("");
        vectorLoad(vector, read);
        digitsCounter(vector);
    }

    public static int[] vectorLoad(int[] vector, Scanner read) {
        int i;
        for (i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un número entero [Posición " + i + "]: ");
            vector[i] = read.nextInt();
        }

        return vector;
    }

    public static void digitsCounter(int[] vector) {
        int i, counterD1, counterD2, counterD3, counterD4, counterD5;

        counterD1 = 0;
        counterD2 = 0;
        counterD3 = 0;
        counterD4 = 0;
        counterD5 = 0;
        String textNumber;
        for (i = 0; i < vector.length; i++) {
            textNumber = Integer.toString(vector[i]);
            switch (textNumber.length()) {
                case 1:
                    counterD1 += 1;
                    break;
                case 2:
                    counterD2 += 1;
                    break;
                case 3:
                    counterD3 += 1;
                    break;
                case 4:
                    counterD4 += 1;

                    break;
                case 5:
                    counterD5 += 1;

                    break;
            }
        }
        System.out.println("Resultados: " + "\n1 dígito: " + +counterD1 + "\n2 dígitos: " + counterD2 + "\n3 dígitos: " + counterD3 + "\n4 dígitos: " + counterD4 + "\n5 dígitos: " + counterD5);
        System.out.println("");
    }

}
