/*
 * Author   : Hasnain Memon
 * Date     : 02/11/2024
 * Question : Write a program that finds the transpose of a 2D matrix.
 */

import java.util.Scanner;

public class TransposeOf2DMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows, columns;
        int[][] matrix;

        System.out.print("Enter number of rows of a matrix: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns of a matrix: ");
        columns = sc.nextInt();

        matrix = new int[rows][columns];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("2D matrix of " + rows + " rows and " + columns + " columns");
        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposeMatrix = new int[columns][rows];
        //Finding Transpose of the matrix
        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of 2D matrix of " + columns + " rows and " + rows + " columns");
        for (int i = 0 ; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
