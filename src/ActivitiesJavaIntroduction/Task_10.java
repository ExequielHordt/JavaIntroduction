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
public class Task_10 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int limit, num, toAdd;
        toAdd = 0;
        System.out.println("");
        System.out.println("Superar limite positivo");
        System.out.println("------------------------");
        System.out.print("Ingrese un límite (valor númerico positivo): ");
        limit = read.nextInt();
        System.out.println("");
        //if limit < 0, ask again to the user
        while (limit < 0) {
            System.out.print("¡El limite ingresado NO es correcto! Por favor, ingrese un límite(valor númerico positivo): ");
            limit = read.nextInt();
        }
        System.out.println("");
        do {
            System.out.print("Ingrese un valor númerico: ");
            num = read.nextInt();
            toAdd += num;
        } while (toAdd <= limit);
        System.out.println("La suma de los números ingresados por el usuario " + toAdd + " superan al límite " + limit);
        System.out.println("");
    }
}
