/*
 * Author   : Hasnain Memon
 * Date     : 21/11/2024
 */
import java.util.Scanner;

public class ReverseStringUsingStack {

    static class Stack {

        private char[] arr;
        private int size;
        private int index;

        public Stack(int size) {
            this.size = size;
            arr = new char[size];
            index = 0;
        }

        public void push(char element) {

            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[index] = element;
            index++;
        }

        public char pop() {

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

    // Task 1: Reverse a string using stack.
    private static String reverseString(String text) {

        StringBuilder reversedString = new StringBuilder();
        Stack stack = new Stack(text.length());
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }
        for (int i = 0; i < text.length(); i++) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to reverse a string using stack\n");

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("Reversed text: " + reverseString(input));
    }
}
