public class Node {
    private Object obj;

    public Node(Object obj) {
        this.obj = obj;
    }

    public Object getObject() {
        return obj;
    }

    @Override
    public String toString() {
        return "Node{" +
                "obj=" + obj +
                '}';
    }
}
