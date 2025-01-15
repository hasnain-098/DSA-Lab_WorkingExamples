package graphs;

public class CalculateDegreeForEachNodeOfUndirectedGraph {

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        Vertex a, b, c, d, e;
        a = graph.createVertex("A");
        b = graph.createVertex("B");
        c = graph.createVertex("C");
        d = graph.createVertex("D");
        e = graph.createVertex("E");

        // Undirected Graph
        a.addNeighbours(new Vertex[]{b, d});
        b.addNeighbours(new Vertex[]{a, c});
        c.addNeighbours(new Vertex[]{b});
        d.addNeighbours(new Vertex[]{a, e});
        e.addNeighbours(new Vertex[]{d});

        Queue queue = new Queue();
        queue.enqueue(a);
        System.out.print("\nBreadth First Traversal: ");
        graph.printGraphBFS(queue);

        System.out.println("\nVertex " + a.label + " has degree: " + calculateDegree(a));
        System.out.println("Vertex " + b.label + " has degree: " + calculateDegree(b));
        System.out.println("Vertex " + c.label + " has degree: " + calculateDegree(c));
        System.out.println("Vertex " + d.label + " has degree: " + calculateDegree(d));
        System.out.println("Vertex " + e.label + " has degree: " + calculateDegree(e));

    }

    // Task 1: Calculate degree of each node for an undirected graph.
    private static int calculateDegree(Vertex vertex) {
        return vertex.neighbour.length;
    }

}
