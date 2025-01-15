package graphs;

public class LinkedListStack {

    LinkedList li = new LinkedList();

    public void push(Vertex element) {
        li.insertFirst(element);
    }

    public void pop() {
        li.deleteFirst();
    }

    public Vertex peek() {
        return li.front.data;
    }

    public void displayStack() {
        System.out.println(" ");
        li.displayList();
    }
}
