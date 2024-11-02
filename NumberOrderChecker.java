/* Author   : Hasnain Memon
 * Date     : 02/11/2024
 */

import java.util.Scanner;

public class NumberOrderChecker {

    private static void checkOrder(int num1, int num2, int num3) {

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        checkOrder(num1, num2, num3);
    }

}
