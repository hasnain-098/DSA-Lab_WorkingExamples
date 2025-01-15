package graphs;

public class Graph {

    private int v;

    public Graph(int v) {
        this.v = v;
    }

    public Vertex createVertex(String label) {
        return new Vertex(label);
    }

    public void printGraphDFS(LinkedListStack s) {
        s.peek().isVisited = true;
        Vertex current = s.peek();
        if (current == null) {
            return;
        }
        System.out.print(current.label + " ");
        s.pop();
        for (int i = 0; i < current.neighbour.length; i++) {
            if (!current.neighbour[i].isVisited) {
                s.push(current.neighbour[i]);
                printGraphDFS(s);
            }
        }
    }

    // Recursive Approach - not ideal for large graphs
    public void printGraphBFS(Queue queue) {

        if (queue.isEmpty()) {
            return;
        }
        Vertex current = queue.dequeue();
        if (current == null || current.isVisited) {
            printGraphBFS(queue);
            return;
        }
        current.isVisited = true;
        System.out.print(current.label + " ");
        if (current.neighbour != null) {
            for (Vertex neighbour: current.neighbour) {
                if (neighbour != null  && !neighbour.isVisited) {
                    queue.enqueue(neighbour);
                }
            }
        }
        printGraphBFS(queue);
    }
}
