import java.util.List;

public class Graph {
    private List<Node> nodes;
    private List<Edge> edges;

    Graph(List<Node> nodes, List<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }

    public void removeEdge(Edge edge) {
        this.edges.remove(edge);
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    public void removeNode(Node node) {
        this.nodes.remove(node);
    }
}
