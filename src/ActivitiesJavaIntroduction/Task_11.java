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
public class Task_11 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num1, num2, result;
        double divisionResult;
        char option;
        System.out.println("CALCULADORA");
        System.out.println("-----------");
        System.out.print("Ingrese un valor númerico(entero positivo): ");
        num1 = read.nextInt();
        System.out.println("");
        System.out.print("Ingrese otro valor númerico: ");
        num2 = read.nextInt();
        System.out.println("");
        do {
            System.out.print("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nElija opción: ");
            option = read.next().charAt(0);
            System.out.println("");
            switch (option) {
                case '1':
                    result = num1 + num2;
                    System.out.println("El resultado de la suma es: " + result);
                    System.out.println("");
                    break;
                case '2':
                    result = num1 - num2;
                    System.out.println("El resultado de la resta es: " + result);
                    System.out.println("");
                    break;
                case '3':
                    result = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + result);
                    System.out.println("");
                    break;
                case '4':
                    divisionResult = num1 / num2;
                    System.out.println("El resultado de la división es: " + divisionResult);
                    System.out.println("");
                    break;
                case '5':
                    System.out.println("¿Esta seguro que desea salir del programa(S/N)? ");
                    option = read.next().charAt(0);
                    option = Character.toUpperCase(option);
                    System.out.println("");
                    break;
                default:
                    System.out.println("¡La opción ingresada NO se encuentra en el MENU!\nPor favor, seleccione una opción correcta");
                    System.out.println("");
            }

        } while (option != 'S');

    }
}
