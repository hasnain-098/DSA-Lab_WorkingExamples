package graphs;

public class LinkedList {

    Node front;
    Node rear;

    public LinkedList() {
        front = rear = null;
    }

    static class Node {
        Vertex data;
        Node next;

        public Node(Vertex data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void insertLast(Vertex newData) {
        Node newNode = new Node(newData);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public void insertFirst(Vertex newData) {
        Node newNode = new Node(newData);
        if (!isEmpty()) {
            newNode.next = front;
        }
        front = newNode;
    }

    public Vertex deleteFirst() {
        if (front == null) {
            return null;
        }
        Vertex temp = front.data;
        if (front.next == null) {
            rear = null;
        }
        front = front.next;
        return temp;
    }

    public Vertex deleteLast() {
        Vertex temp = rear.data;
        Node current = front;
        while (current.next != rear) {
            current = current.next;
        }
        current.next = null;
        rear = current;
        return temp;
    }

    public void displayList() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data.label + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}
