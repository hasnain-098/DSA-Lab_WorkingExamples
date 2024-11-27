/*
 * Author   : Hasnain Memon
 * Date     : 20/11/2024
 */
public class InsertBeforeInDoubleLinkedList {
    
    Node head;
    Node tail;

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    // Task 3: Write a Java program to implement insertion of a node before specific node.
    public void insertBefore(Node nextNode, int data) {
        if (nextNode == null) {
            System.out.println("Give next node can't be null");
            return;
        }

        Node temp = nextNode.prev;
        Node newNode = new Node(data);
        nextNode.prev = newNode;
        newNode.next = nextNode;

        newNode.prev = temp;
        temp.next = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Given previous node can't be null");
            return;
        }
        Node newNode = new Node(data);
        Node temp = prevNode.next;

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = temp;

        if (temp != null) {
            temp.prev = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        current.next = current.next.next;
    }

    public static void main(String[] args) {

        InsertBeforeInDoubleLinkedList list = new InsertBeforeInDoubleLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtEnd(50);
        list.insertAtEnd(20);
        list.insertAtEnd(60);

        list.printList();

        Node nextNode = list.head.next.next;
        list.insertBefore(nextNode, 5);

        list.printList();
    }
}
