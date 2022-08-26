/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActivitiesJavaIntroduction;

import java.util.Random;

/**
 *
 * @author Exe
 */
public class Task_18 {

    public static void main(String args[]) {
        System.out.println("Transpuesta de una matriz");
        System.out.println("*************************");
        int[][] matrix = new int[4][4];
        int[][] t_Matrix = new int[4][4];
        matrixLoad(matrix);
        transposeMatrix(matrix, t_Matrix);
        showMatrix(matrix, t_Matrix);
    }

    public static void matrixLoad(int[][] matrix) {
        int i, j;
        Random random = new Random();
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                //-10 to 10
                matrix[i][j] = random.nextInt(10 - (-10)) + -10;
            }

        }
    }

    public static void transposeMatrix(int[][] matrix, int[][] t_matrix) {
        int i, j;
        for (i = 0; i < t_matrix.length; i++) {
            for (j = 0; j < t_matrix.length; j++) {
                //-10 to 10
                t_matrix[i][j] = matrix[j][i];
            }

        }
    }

    public static void showMatrix(int[][] matrix, int[][] t_matrix) {
        int i, j;
        System.out.println("Matriz: ");
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                System.out.print("[ " + matrix[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz Transpuesta: ");
        for (i = 0; i < t_matrix.length; i++) {
            for (j = 0; j < t_matrix.length; j++) {
                System.out.print("[ " + t_matrix[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
