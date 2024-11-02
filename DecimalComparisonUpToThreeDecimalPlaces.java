/* Author   : Hasnain Memon
 * Date     : 02/11/2024
 */

import java.util.Scanner;

public class DecimalComparisonUpToThreeDecimalPlaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (floating-point): ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number (floating-point): ");
        float num2 = sc.nextFloat();

        num1 = Math.round(num1 * 1000.0f) / 1000.0f;
        num2 = Math.round(num2 * 1000.0f) / 1000.0f;

        if (num1 == num2) {
            System.out.println("Both numbers are equal up to three decimal places");
        } else {
            System.out.println("Both numbers are not equal up to three decimal places");
        }
    }
}
