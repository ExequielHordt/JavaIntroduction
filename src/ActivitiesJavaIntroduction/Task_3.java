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
public class Task_3 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String phrase;
        System.out.println("Ingrese una frase: ");
        phrase = read.nextLine();
        System.out.println("");
        phrase = phrase.toUpperCase();
        System.out.println("La frase en mayúsculas es: " + phrase);
        System.out.println("");
        phrase = phrase.toLowerCase();
        System.out.println("La frase en minúsculas es: " + phrase);
        System.out.println("");
    }
}
