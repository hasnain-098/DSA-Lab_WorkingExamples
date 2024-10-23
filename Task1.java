import java.util.Scanner;
/*
 * Author : Hasnain Memon
 * Date   : 10/23/2024
 */

public class Task1 {

    public static void main(String[] args) {

        System.out.print("Enter number of first natural numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Sum = " + sum(n));
    }

    private static int sum(int n) {
        int sum = 0;
        for (int i=1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
