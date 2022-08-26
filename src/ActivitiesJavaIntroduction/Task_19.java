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
public class Task_19 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[][] t_Matrix = new int[3][3];
        System.out.println("Matriz anti-simétrica");
        System.out.println("*********************");
        matrixLoad(matrix, read);
        antiSymmetric(matrix, t_Matrix);
        showMatrix(matrix, t_Matrix);
    }

    public static void matrixLoad(int[][] matrix, Scanner read) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                System.out.print("Ingrese un valor a la matriz en la posición " + "[ " + i + " ]" + "[ " + j + " ]: ");
                matrix[i][j] = read.nextInt();
            }
        }
    }

    public static void antiSymmetric(int[][] matrix, int[][] t_Matrix) {
        int i, j;

        for (i = 0; i < t_Matrix.length; i++) {

            for (j = 0; j < t_Matrix.length; j++) {
                matrix[j][i] *= -1;
                t_Matrix[i][j] = matrix[j][i];
            }

        }
    }

    public static void showMatrix(int[][] matrix, int[][] t_Matrix) {
        int i, j;
        System.out.println("Matriz: ");

        System.out.println("");
        
        for (i = 0; i < matrix.length; i++) {

            for (j = 0; j < matrix.length; j++) {

                System.out.print("[ " + matrix[i][j] + " ]");
            }

            System.out.println("");
        }
        System.out.println("");

        System.out.println("Matriz Transpuesta anti-simétrica: ");
        
        System.out.println("");

        for (i = 0; i < t_Matrix.length; i++) {

            for (j = 0; j < t_Matrix.length; j++) {

                System.out.print("[ " + t_Matrix[i][j] + " ]");

            }

            System.out.println("");

        }

        System.out.println("");
    }
}
