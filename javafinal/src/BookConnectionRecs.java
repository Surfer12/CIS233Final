import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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

    // We then traverse our graph using a Breadth-First Search (BFS) to determine
    // the
    // edges that are connecting each of the book as seen in our 'traversal of the
    // graph' question where each node is visited and documented in the order they
    // are visited.

    public static void main(final String[] args) {
        final Map<BookConnectionRecsTitles, Map<BookConnectionRecsTitles, Integer>> graph = new HashMap<>();

        graph.put(BookConnectionRecsTitles.A, new HashMap<>(
                Map.of(BookConnectionRecsTitles.B, 1, BookConnectionRecsTitles.C, 1, BookConnectionRecsTitles.D, 1)));
        graph.put(BookConnectionRecsTitles.C, new HashMap<>());
        graph.put(BookConnectionRecsTitles.D, new HashMap<>());
        graph.put(BookConnectionRecsTitles.E, new HashMap<>());
        graph.put(BookConnectionRecsTitles.F,
                graph.put(Map.of(BookConnectionRecsTitles.H, 1, BookConnectionRecsTitles.I, 1)));
        graph.put(BookConnectionRecsTitles.H, new HashMap<>());
        graph.put(BookConnectionRecsTitles.I, new HashMap<>());
        graph.put(BookConnectionRecsTitles.J,
                graph.put(Map.of(BookConnectionRecsTitles.K, 1, BookConnectionRecsTitles.L, 1)));
        graph.put(BookConnectionRecsTitles.K, new HashMap<>());
        graph.put(BookConnectionRecsTitles.L, new HashMap<>());

        System.out.println("\nBFS Traversal:");
        BookConnectionRecs.breadthFirstSearch(graph, BookConnectionRecsTitles.A);
    }

    public static void breadthFirstSearch(
            final Map<BookConnectionRecsTitles, Map<BookConnectionRecsTitles, Integer>> graph,
            final BookConnectionRecsTitles start) {
        final Set<BookConnectionRecsTitles> visited = new HashSet<>();
        final Queue<BookConnectionRecsTitles> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            final BookConnectionRecsTitles current = queue.poll();
            System.out.println(current.getTitle());

            for (final BookConnectionRecsTitles neighbor : graph.get(current).keySet()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
