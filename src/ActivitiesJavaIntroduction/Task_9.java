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
public class Task_9 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String phrase, characterA;
        System.out.println("");
        System.out.println("Verificar palabra o frase. Primera letra debe ser A");
        System.out.println("");
        System.out.print("Ingrese una palabra o frase: ");
        phrase = read.nextLine();
        System.out.println("");
        characterA = phrase.substring(0, 1);
        if (characterA.equals("A") || characterA.equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        System.out.println("");
    }

}
