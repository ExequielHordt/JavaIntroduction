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
public class Task_20 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Verificar matriz mágica");
        System.out.println("***********************");
        matrixLoad(matrix, read);
        System.out.println("");
        showMatrix(matrix);
        System.out.println("");
        magicMatrix(matrix);
    }

    public static void matrixLoad(int[][] matrix, Scanner read) {
        // matrix load
        // number verification between[1-9]
        int i, j;

        for (i = 0; i < matrix.length; i++) {

            for (j = 0; j < matrix.length; j++) {
                do {
                    System.out.print("Ingrese un valor en la posición " + "[ " + i + " ]" + "[ " + j + " ]: ");
                    matrix[i][j] = read.nextInt();
                } while (matrix[i][j] < 1 || matrix[i][j] > 9);

            }
        }
    }

    public static void showMatrix(int[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                System.out.print("[ " + matrix[i][j] + " ]");
            }
            System.out.println("");
        }
    }

    public static void magicMatrix(int[][] matrix) {
        if (verifyRows(matrix) == true && verifyColumns(matrix) == true && verifyDiagonals(matrix) == true) {
            System.out.println("¡La matriz es mágica!");
        } else {
            System.out.println("¡La matriz NO es mágica!");
        }
        System.out.println("");
    }
//Rows

    public static boolean verifyRows(int[][] matrix) {
        int rowA, rowB, i, j;
        boolean verifyMagic, firstRound;
        rowA = 0;
        rowB = 0;
        verifyMagic = false;
        firstRound = true;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                if (firstRound == true) {
                    rowA += matrix[i][j];
                }
                if (firstRound == false) {
                    rowB += matrix[i][j];
                }
                if (rowA == rowB && firstRound == false) {
                    verifyMagic = true;
                } else {
                    verifyMagic = false;
                }
            }
            firstRound = false;
            if (firstRound == false) {
                rowB = 0;
            }
        }
        return verifyMagic;
    }
//Columns

    public static boolean verifyColumns(int[][] matrix) {
        int columnA, columnB, i, j;
        boolean verifyMagic, firstRound;
        columnA = 0;
        columnB = 0;
        verifyMagic = false;
        firstRound = true;
        for (j = 0; j < matrix.length; j++) {
            for (i = 0; i < matrix.length; i++) {
                if (firstRound == true) {
                    columnA += matrix[i][j];
                }
                if (firstRound == false) {
                    columnB += matrix[i][j];
                }
                if (columnA == columnB && firstRound == false) {
                    verifyMagic = true;
                } else {
                    verifyMagic = false;
                }
            }
            firstRound = false;
            if (firstRound == false) {
                columnB = 0;
            }
        }
        return verifyMagic;

    }
//Diagonals

    public static boolean verifyDiagonals(int[][] matrix) {
        int diagonalA, diagonalB, i, j;
        boolean verifyMagic;
        diagonalA = 0;
        diagonalB = 0;
        verifyMagic = false;

        //Diagonal A
        for (i = 0; i < matrix.length; i++) {
            for (j = i; j <= i; j++) {
                diagonalA += matrix[i][j];
            }
        }

        //Diagonal B
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length - 1) {
                    diagonalB += matrix[i][j];
                }

            }
        }
//diagonal A with diagonal B comparative
        if (diagonalA == diagonalB) {
            verifyMagic = true;
        }
        return verifyMagic;
    }
}
