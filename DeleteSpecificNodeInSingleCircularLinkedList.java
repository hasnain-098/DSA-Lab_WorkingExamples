/*
 * Author   : Hasnain Memon
 * Date     : 20/11/2024
 */
public class DeleteSpecificNodeInSingleCircularLinkedList {

    Node head;
    int size;

    public DeleteSpecificNodeInSingleCircularLinkedList() {
        head = null;
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

    // Task: Delete node at a specific position
    public void deleteAtPosition(int position) {

        if (position < 0 || position >= size) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 0) {
            deleteStart();
            return;
        }

        if (position == size - 1) {
            deleteEnd();
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++ ) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    public void printList() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public void insertAtHead(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            size++;
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next; // traverse till end of list
        }
        current.next = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAfter(Node previousNode, int data) {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        size++;
    }

    public void insertAtEnd(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            size++;
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next; // traverse till end of the list
        }
        current.next = newNode;
        newNode.next = head;
        size++;
    }

    public void deleteStart() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = head.next;
        head = head.next;
        size--;
    }

    public void deleteEnd() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        while (current.next.next != head) {
            current = current.next; // traverse till one node before the last node
        }
        current.next = head;
        size--;
    }

    public static void main(String[] args) {

        DeleteSpecificNodeInSingleCircularLinkedList list = new DeleteSpecificNodeInSingleCircularLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.printList();
        System.out.println("Size  = " + list.size);

//        list.insertAtHead(100);
//        list.printList();
//
//        list.deleteEnd();
//        list.printList();
//
//        list.deleteStart();
//        list.printList();
        
        list.deleteAtPosition(3);
        list.printList();
        System.out.println("Size  = " + list.size);
    }
}
