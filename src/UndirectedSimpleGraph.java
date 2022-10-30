import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class UndirectedSimpleGraph<T>{
    List<T> nodes;
    boolean adjacencyMatrix[][];
    UndirectedSimpleGraph(int maxNumberOfNodes){
        nodes = new ArrayList<>(maxNumberOfNodes);
        adjacencyMatrix = new boolean[maxNumberOfNodes][maxNumberOfNodes];
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                adjacencyMatrix[i][j]=false;
            }
        }
    }

    public void addNode(T node) {
        nodes.add(node);
    }

    public void removeNode(T node) {
        nodes.remove(node);
    }

    public void addEdge(T node1, T node2) throws Exception {
        validateNodes(node1, node2);
        setEdge(node1, node2, true);
    }

    public void removeEdge(T node1, T node2) throws Exception {
        validateNodes(node1, node2);
        setEdge(node1, node2, false);
    }
    private void validateNodes(T node1, T node2) throws Exception {
        if (node1==node2) throw new Exception("Simple graphs cannot have loops");
        if (!nodes.contains(node1) || !nodes.contains(node2)){
            throw new Exception("One of the nodes is not on the graph");
        }
    }
    private void setEdge(T node1, T node2, boolean value) {
        int row = nodes.indexOf(node1);
        int col = nodes.indexOf(node2);
        adjacencyMatrix[row][col] = value;
        adjacencyMatrix[col][row] = value;
    }

    public List<T> adjacentsTo(T node) throws Exception {
        if (!nodes.contains(node)){
            throw new Exception("The node is not on the graph");
        }
        List<T> adjacents = new ArrayList<>();
        int row = nodes.indexOf(node);
        for (int i = 0; i< nodes.size(); i++){
            if (adjacencyMatrix[row][i]){
                adjacents.add(nodes.get(i));
            }
        }
        return adjacents;
    }

    public boolean areAdjacents(T node1, T node2) throws Exception {
        validateNodes(node1, node2);
        int row = nodes.indexOf(node1);
        int col = nodes.indexOf(node2);
        return adjacencyMatrix[row][col];
    }

    public List<T> getNodes() {
        return nodes;
    }
}
