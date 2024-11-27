/*
 * Author   : Hasnain Memon
 * Date     : 21/11/2024
 */

public class SearchElementInStack {

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

        // Task 3: Search an element in a stack and return its position (index).
        public int searchElement(int number) {

            for (int i = 0; i < index; i++) {
                if (arr[i] == number) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack(10);
        stack.push(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);

        int number = 20;
        int index = stack.searchElement(number);
        if (index == -1) {
            System.out.println(number + " not found!");
        } else {
            System.out.println(number + " found at index " + index);
        }
    }
}
