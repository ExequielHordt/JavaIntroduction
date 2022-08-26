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
public class Task_21 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[][] matrixContainer = new int[4][4];
        int[][] matrix = new int[3][3];

        System.out.println("Buscar Matriz");
        System.out.println("*************");

        loadMatrix(matrixContainer, matrix, read);
        showMatrix(matrixContainer, matrix);
        System.out.println("");
        if (searchMatrix(matrixContainer, matrix) == true) {
            System.out.println("¡Matriz encontrada!");
            System.out.println("");
        } else {
            System.out.println("¡Matriz NO encontrada!");
            System.out.println("");
        }

    }

    public static void loadMatrix(int[][] matrixContainer, int[][] matrix, Scanner read) {
        int i, j;
        System.out.println("Matriz contenedora: ");
        System.out.println("");
        for (i = 0; i < matrixContainer.length; i++) {
            for (j = 0; j < matrixContainer.length; j++) {
                System.out.print("Ingrese un valor númerico para la posición " + "[" + i + " ] " + " [ " + j + " ]: ");
                matrixContainer[i][j] = read.nextInt();
            }

        }

        System.out.println("");
        System.out.println("Matriz contenida: ");
        System.out.println("");
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                System.out.print("Ingrese un valor númerico para la posición " + "[" + i + "] " + "[" + j + "]: ");
                matrix[i][j] = read.nextInt();
            }
        }
        System.out.println("");

    }

    public static void showMatrix(int[][] matrixContainer, int[][] matrix) {
        int i, j;
        System.out.println("Matriz contenedora: ");
        System.out.println("");
        for (i = 0; i < matrixContainer.length; i++) {
            for (j = 0; j < matrixContainer.length; j++) {
                System.out.print(" [ " + matrixContainer[i][j] + " ] ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz contenida: ");
        System.out.println("");
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                System.out.print(" [ " + matrix[i][j] + " ] ");
            }
            System.out.println("");
        }

    }

    public static boolean searchMatrix(int[][] matrixContainer, int[][] matrix) {
        int i, j, baseCase, aux, a, b;
        boolean search;
        aux = 0;
        baseCase = 0;
        search = false;
        while (aux == 0) {
            i = 0;
            j = 0;
            baseCase = matrix[i][j];
            aux += 1;
        }
        for (i = 0; i < matrixContainer.length; i++) {
            for (j = 0; j < matrixContainer.length; j++) {
                if (baseCase == matrixContainer[i][j]) {
                    search = true;
                    for (a = 0; a < matrix.length; a++) {
                        for (b = 1; b < matrix.length; b++) {
                            search = matrix[a][b] == matrixContainer[i + a][j + b];
                        }
                    }
                }
            }
        }
        return search == true;
    }

}

//36 

