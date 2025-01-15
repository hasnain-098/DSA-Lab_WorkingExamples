package graphs;

public class Vertex {

    String label;
    boolean isVisited;
    Vertex[] neighbour;

    public Vertex(String label) {
        this.label = label;
        isVisited = false;
    }

    public void addNeighbours(Vertex[] v) {
        neighbour = new Vertex[v.length];
        for (int i = 0; i < v.length; i++) {
            neighbour[i] = v[i];
        }
    }
}
