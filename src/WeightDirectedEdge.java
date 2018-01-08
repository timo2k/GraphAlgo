public class WeightDirectedEdge extends WeightedEdge {

    public WeightDirectedEdge(Node firstNode, Node secondNode, double weight) {
        super(firstNode, secondNode, weight);
    }

    public Node getFrom() {
        return getFirstNode();
    }

    public Node getTo() {
        return getSecondNode();
    }
}
