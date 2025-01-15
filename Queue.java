package graphs;

public class Queue {

    LinkedList linkedList;

    public Queue() {
        linkedList = new LinkedList();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public void enqueue(Vertex newData) {
        if (newData != null) {
            linkedList.insertLast(newData);
        }
    }

    public Vertex dequeue() {
        return linkedList.deleteFirst();
    }

    public Vertex front() {
        return (linkedList.front == null)? null : linkedList.front.data;
    }
}
