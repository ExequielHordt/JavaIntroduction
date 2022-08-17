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
public class Task_8 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String phrase;
        System.out.println("");
        System.out.println("Verificar longitud de frase / palabra");
        System.out.println("");
        System.out.print("Ingrese una frase o palabra: ");
        phrase = read.nextLine();
        System.out.println("");
        if (phrase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        System.out.println("");
    }
}
