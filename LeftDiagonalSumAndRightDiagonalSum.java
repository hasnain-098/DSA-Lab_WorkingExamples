import java.util.Scanner;

/*
 * Author   : Hasnain Memon
 * Date     : 02/11/2024
 * Question : Q2. Write functions for square matrix to calculate
                  1. Left diagonal sum
                  2. Right diagonal sum
 */
public class LeftDiagonalSumAndRightDiagonalSum {

    private static int findLeftDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    private static int findRightDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) == (matrix.length - 1)) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

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

        if (rows != columns) {
            System.out.println("\nNon-Square matrix doesn't have left and right diagonals.");
        } else {
            System.out.println("\nLeft diagonal sum = " + findLeftDiagonalSum(matrix));
            System.out.println("Right diagonal sum = " + findRightDiagonalSum(matrix));
        }
    }
}
