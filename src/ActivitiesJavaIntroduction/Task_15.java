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
public class Task_15 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[] vector = new int[100];
        System.out.println("Números enteros naturales [1 - 100]"
                + "\nMostrados en orden descendente");
        System.out.println("***********************************");
        toRefill_Vector(vector);
    }

    public static void toRefill_Vector(int[] vector) {
        int account = 0;
        for (int i = 1; i <= vector.length; i++) {
            vector[account] = i;
            account += 1;
        }
        showVector(vector);
    }

    public static void showVector(int[] vector) {
        for (int i = (vector.length - 1); i >= 0; i--) {
            System.out.println("Posición " + i + ": " + "[" + vector[i] + "]");
        }
    }
}

// i = 100
// 0

