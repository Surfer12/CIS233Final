import java.util.HashMap;
import java.util.Map;

public class BookConnectionRecs {
    // We utilize an enum to assign our book titles as seen in
    // src/BookConnectionRecsTitles.java

    // We then create our graph using a HashMap
    // The key is the book title
    // The value is a HashMap of the book title and the edge weight of one to
    // indicate it is connected to another book

    // We then create a main method to initialize our graph

    // We then traverse our graph using a Depth-First Search (DFS) to determine the
    // edges that are connecting each of the book as seen in our 'traversal of the
    // graph' question where each node is visited and documented in the order they
    // are visited.

public static void main(final String[] args) {
final Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

// Add nodes and edges with weights
graph.put(a, new HashMap<>(Map.of(b, 1, c, 1, d, 1)));
graph.put(b, new HashMap<>(Map.of(e,1 f,1);
graph.put(c, new HashMap<>();
graph.put(d, new HashMap<>();
graph.put(e, new HashMap<>());
graph.put(f, new HashMap<>(Map.put(h, 1, i, 1));
graph.put(g, new HashMap<>());
graph.put(h, new HashMap<>());
graph.put(i, new HashMap<>());
graph.put(j, new HashMap<>(Map.of(k, 1, l, 1));
graph.put(k, new HashMap<>());
graph.put(l, new HashMap<>());

}
}
