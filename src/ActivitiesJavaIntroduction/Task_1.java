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
public class Task_1 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num1, num2, toAdd;
        toAdd = 0;
        System.out.println("Operación SUMA");
        System.out.println("");
        System.out.print("Ingrese un valor númerico: ");
        num1 = read.nextInt();
        System.out.print("Ingrese otro valor númerico: ");
        num2 = read.nextInt();
        toAdd = num1 + num2;
        System.out.println("");
        System.out.println("La suma de los dos números ingresados es: " + toAdd);
        System.out.println("");
    }
}
