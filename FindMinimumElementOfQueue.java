/*
 * Author   : Hasnain Memon
 * Date     : 22/11/2024
 */
class Queue {

    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        front = rear = null;
        size = 0;
    }

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {

        return (front == null);
    }

    public void enqueue(int data) {

        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
            size++;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    public int dequeue() {

        int temp = front.data;
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        // only one element
        if (front.next == null) {
            rear = null;
        }
        // more than one element
        front = front.next;
        size--;
        return temp;
    }

    public void displayQueue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {

        return size;
    }

    // Task 2: Implement a getMinimum() function for Queue.
    public int getMinimum() {

        int min = front.data;
        Node current = front;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }
}

public class FindMinimumElementOfQueue {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(30);
        queue.enqueue(45);
        queue.enqueue(60);
        queue.enqueue(2);

        queue.displayQueue();

        System.out.println("Size = " + queue.getSize());
        // Task 1
        System.out.println("Minimum = " + queue.getMinimum());
    }
}