/*
 * Author   : Hasnain Memon
 * Date     : 21/11/2024
 */
import java.util.Scanner;

public class ReverseNumberUsingStack {

    static class Stack {

        private int[] arr;
        private int size;
        private int index;

        public Stack(int size) {
            this.size = size;
            arr = new int[size];
            index = 0;
        }

        public void push(int element) {

            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[index] = element;
            index++;
        }

        public int pop() {

            if (isEmpty()) {
                System.out.println("Stack is empty");
                return '\0';
            }
            return arr[--index];
        }

        public boolean isEmpty() {

            return index == 0;
        }

        public boolean isFull() {
            return index == size;
        }
    }

    // Task 2: Reverse a number using stack.
    private static int reverseNumber(int number) {

        int length = String.valueOf(number).length();
        Stack stack = new Stack(length);
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            stack.push(digit);
        }
        int reversedNumber = 0;
        int multiplier = 1;
        while (!stack.isEmpty()) {
            reversedNumber += stack.pop() *  multiplier;
            multiplier *= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to reverse a number using stack\n");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Reversed number: " + reverseNumber(number));
    }
}
