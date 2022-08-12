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
public class Task_5 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num, numDouble, numTriple;
        double squareRoot;
        System.out.println("Calcular el doble, triple y raiz cuadrada de un número");
        System.out.println("");
        do {
            System.out.print("Ingrese un valor númerico entero: ");
            num = read.nextInt();
        } while (num < 0);
        numDouble = num * 2;
        numTriple = num * 3;
        squareRoot = Math.sqrt(num);
        System.out.println("");
        System.out.println("El doble de " + num + " es: " + numDouble);
        System.out.println("");
        System.out.println("El triple de " + num + " es: " + numTriple);
        System.out.println("");
        System.out.println("La raíz cuadrada de " + num + " es: " + squareRoot);
        System.out.println("");

    }
}
