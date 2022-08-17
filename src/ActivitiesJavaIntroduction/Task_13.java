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
public class Task_13 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num, i, j, k, l, m;
        System.out.println("Cuadrado de *");
        System.out.println("");
        do {
            System.out.print("Ingrese un valor númerico: ");
            num = read.nextInt();
        } while (num < 2);
        System.out.println("");

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i >= 2 && j >= 2 && i <= num - 1 && j <= num - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
// 4
//i = 1 and j = 1
//First turn
//****
//i = 2 and j = 1
//Second turn
//*  *
//*  *
//****

