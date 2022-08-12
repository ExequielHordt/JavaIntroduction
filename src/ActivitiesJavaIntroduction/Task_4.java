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
public class Task_4 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        double celsiusTemp, fahrTemp;
        System.out.println("Temperatura en centigrados Celsius a Fahrenheit");
        System.out.println("");
        System.out.print("Ingrese la temperatura en centigrados (Cº): ");
        celsiusTemp = read.nextDouble();
        fahrTemp = 32 + ((9 * celsiusTemp) / 5);
        System.out.println("");
        System.out.println("La temperatura en Fahrenheit es: " + fahrTemp);
        System.out.println("");
    }
}
