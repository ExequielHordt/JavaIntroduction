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
public class Task_7 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String phrase;
        System.out.print("Ingrese una frase: ");
        phrase = read.nextLine();
        System.out.println("");
        if (phrase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("");
    }
}
