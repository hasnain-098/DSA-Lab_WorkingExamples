/*
 * Author   : Hasnain Memon
 * Date     : 19/11/2024
 * Question : Print the middle node of a given SLL
 */

public class MiddleNodeOfSingleLinkedList {

    private Node head;
    private int size;

    public MiddleNodeOfSingleLinkedList() {
        head = null;
        size = 0;
    }

    public void printMiddleNode(Node head) {

        int middlePosition = (size % 2 == 0)? (size / 2) : ((size + 1) / 2);
        int i = 0;
        while (head.next != null) {
            if (i++ == middlePosition - 1) {
                if (size % 2 == 0) {
                    System.out.println("Middle = " + head.data + ", " +
                            head.next.data);
                } else {
                    System.out.println("Middle = " + head.data);
                }
                return;
            }
            head = head.next;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size ++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // traverse till last element
        }
        current.next = newNode;
        size++;
    }

    // inserts a new node at specified position
    public void insertAtPosition(int position, int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next; // traverse till one element before position
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // inserts a new node after the given node
    public void insertAfter(Node previousNode, int data) {
        if (previousNode == null) {
            System.out.println("The given previous node can't be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        size++;
    }

    // delete node at specified position
    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        if (position == 0) {
            head = head.next; // If position is 0, delete at front
            size--;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next; // Traverse to the node before the specified position
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        current.next = current.next.next; // Bypass the node to delete it
        size--;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty!");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next; // traverse to the second last node
        }
        current.next = null;
        size--;
    }

    // checks whether the value x is present in linked list
    public boolean search(int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        MiddleNodeOfSingleLinkedList list = new MiddleNodeOfSingleLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.printList();
        list.printMiddleNode(list.head);
    }
}
