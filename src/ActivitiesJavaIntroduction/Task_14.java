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
public class Task_14 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        double euro;
        String option;
        System.out.println("Divisas");
        System.out.println("*******");
        System.out.print("Euros: ");
        euro = read.nextDouble();
        System.out.println("");
        do {
            System.out.print("1)Libras\n2)Dólar\n3)Yenes\nSeleccione la moneda a convertir: ");
            option = read.next();
        } while (!option.equals("1") && !option.equals("2") && !option.equals("3"));

        System.out.println("");
        currencyTransformation(euro, option);

    }

    public static void currencyTransformation(double euro, String option) {
        double pounds, dollar, yen;
        switch (option) {
            case "1":
                pounds = euro * 0.86;
                System.out.println(euro + "€ a libras es " + pounds);
                break;
            case "2":
                dollar = euro * 1.28611;
                System.out.println(euro + "€ a dólar es " + dollar);
                break;
            case "3":
                yen = euro * 129.852;
                System.out.println(euro + "€ a yenes es " + yen);
                break;

        }
        System.out.println("");
    }

}
