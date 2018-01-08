import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lege Knoten an
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");

        // Lege Kanten an
        Edge edgeOneToTow = new Edge(node1, node2);
        Edge edgeOneToThree = new Edge(node1, node2);

        // Baller die Knoten in die Liste
        List<Node> nodes = new ArrayList<Node>();
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);

        // Baller die Kanten in die Liste
        List<Edge> edges = new ArrayList<Edge>();
        edges.add(edgeOneToTow);
        edges.add(edgeOneToThree);

        // Erstelle neuen Graph und packe Knoten und Kanten rein
        Graph graph = new Graph(nodes, edges);

        System.out.println(graph.getNodes());

        // Gib die Zugehörigen Knoten zur Kante aus
        for (Node node: edgeOneToTow.getNodes()) {
            System.out.println(node);
        }

    }
}
