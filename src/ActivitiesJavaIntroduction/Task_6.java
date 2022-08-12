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
public class Task_6 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("Verificación de número (par o impar)");
        System.out.println("");
        System.out.print("Ingrese un número: ");
        num = read.nextInt();
        System.out.println("");
        if (num % 2 == 0) {
            System.out.println("El número " + num + " ES PAR");
        } else {
            System.out.println("El número " + num + " ES IMPAR");
        }
        System.out.println("");
    }
}
