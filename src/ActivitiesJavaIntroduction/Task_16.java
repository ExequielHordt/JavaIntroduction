/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActivitiesJavaIntroduction;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Exe
 */
public class Task_16 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int num;
       // 5 to 20
        int vectorSize = 5 + random.nextInt(20 - 5) ; 
        int[] vector = new int[vectorSize];
        toRefillVector(vector, random);
        System.out.println("Buscar número en el vector");
        System.out.println("**************************");
        System.out.print("Ingrese el número que desea buscar: ");
        num = read.nextInt();
        System.out.println("");
        findNumber(vector, num);
    }

    public static void toRefillVector(int[] vector, Random random) {
        int i;
        for (i = 0; i < vector.length; i++) {
            // 1 to 100
            vector[i] = random.nextInt(100 - 1) + 1;
        }
        
        

    }

    public static void findNumber(int[] vector, int num) {
        int i, account;
        boolean flag;
        flag = false;
        account = 0;

        for (i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                flag = true;
                account += 1;
            }
        }
        if (flag == true) {
            System.out.println("¡El número " + num + " fue encontrado!\nNúmero de veces repetido: " + account);
        } else {
            System.out.println("¡El número " + num + " NO fue encontrado!");

        }
    }
}
