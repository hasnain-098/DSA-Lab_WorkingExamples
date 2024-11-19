/*
 * Author   : Hasnain Memon
 * Date     : 19/11/2024
 * Question : Merge two sorted SLL.
 */

public class MergeTwoSortedSingleLinkedLists {

    private Node head;
    private int size;

    public MergeTwoSortedSingleLinkedLists() {
        head = null;
        size = 0;
    }

    public Node mergeTwoSortedLists(Node head1, Node head2) {

        while (head1.next != null) {
            head1 = head1.next; // traverse till end of list 1
        }

        // merging
        while (head2 != null) {
            head1.next = new Node(head2.data);
            head1 = head1.next;
            size++;
            head2 = head2.next;
        }

        return head1;
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

    public void printList(Node head) {
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        MergeTwoSortedSingleLinkedLists list1 = new MergeTwoSortedSingleLinkedLists();
        list1.insertAtEnd(10);
        list1.insertAtEnd(20);
        list1.insertAtEnd(30);
        list1.insertAtEnd(40);
        list1.insertAtEnd(50);
        list1.printList(list1.head);
        System.out.println("Size = "  + list1.size);

        MergeTwoSortedSingleLinkedLists list2 = new MergeTwoSortedSingleLinkedLists();
        list2.insertAtEnd(60);
        list2.insertAtEnd(70);
        list2.insertAtEnd(80);
        list2.insertAtEnd(90);
        list2.insertAtEnd(100);
        list2.printList(list2.head);
        System.out.println("Size = "  + list2.size);

        System.out.println("Merging both lists...");
        list1.mergeTwoSortedLists(list1.head, list2.head);
        list1.printList(list1.head);
        System.out.println("Size = "  + list1.size);
    }
}
