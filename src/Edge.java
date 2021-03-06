public class Edge {
    private Node firstNode;
    private Node secondNode;

    public Edge(Node firstNode, Node secondNode) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getSecondNode() {
        return secondNode;
    }

    public Node[] getNodes() {
        Node[] nodes = {firstNode, secondNode};
        return nodes;
    }
}
