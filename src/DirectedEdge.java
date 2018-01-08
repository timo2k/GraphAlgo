public class DirectedEdge extends Edge {
    public DirectedEdge(Node firstNode, Node secondNode) {
        super(firstNode, secondNode);
    }

    public Node getFrom() {
        return getFirstNode();
    }

    public Node getTo() {
        return getSecondNode();
    }
}
