package graphs;

public class BfsDfsForDirectedGraph {

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        Vertex a, b, c, d, e;
        a = graph.createVertex("A");
        b = graph.createVertex("B");
        c = graph.createVertex("C");
        d = graph.createVertex("D");
        e = graph.createVertex("E");

        // Directed Graph
        a.addNeighbours(new Vertex[]{b, d});
        b.addNeighbours(new Vertex[]{c});
        c.addNeighbours(new Vertex[]{});
        d.addNeighbours(new Vertex[]{e});
        e.addNeighbours(new Vertex[]{});

        Queue queue = new Queue();
        queue.enqueue(a);
        System.out.print("\nBreadth First Traversal: ");
        bfsDirectedGraph(queue);

        resetVisitedFlags(a, b, c, d, e);

        LinkedListStack ls = new LinkedListStack();
        ls.push(a);
        System.out.print("\nDepth First Traversal: ");
        dfsDirectedGraph(ls);

    }

    // Task : Perform Breadth first traversal and depth first traversal for Directed graph.
    private static void bfsDirectedGraph(Queue queue) {

        if (queue.isEmpty()) {
            return;
        }
        Vertex current = queue.dequeue();
        if (current == null || current.isVisited) {
            bfsDirectedGraph(queue);
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
        bfsDirectedGraph(queue);
    }

    private static void dfsDirectedGraph(LinkedListStack s) {
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
                dfsDirectedGraph(s);
            }
        }
    }

    // helper method to reset visited flag for each node/vertex
    private static void resetVisitedFlags(Vertex... vertices) {
        for (Vertex vertex: vertices) {
            vertex.isVisited = false;
        }
    }
}
