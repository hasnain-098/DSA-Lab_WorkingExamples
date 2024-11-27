/*
 * Author   : Hasnain Memon
 * Date     : 21/11/2024
 */

public class FindPeekElementInStack {

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

        public int searchElement(int number) {

            for (int i = 0; i < index; i++) {
                if (arr[i] == number) {
                    return i;
                }
            }
            return -1;
        }

        // Task 4: Create a peek() method which will return but not remove the top of the stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return '\0';
            }
            return arr[index - 1];
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack(10);
        stack.push(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);

        System.out.println("Peek: " + stack.peek());
    }
}
