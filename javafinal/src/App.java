import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(final String[] args) {
        final Map<BookConnectionRecsTitles, Map<BookConnectionRecsTitles, Integer>> graph = new HashMap<>();

        // Add nodes and edges with weights
        graph.put(BookConnectionRecsTitles.A, new HashMap<>(
                Map.of(BookConnectionRecsTitles.B, 1, BookConnectionRecsTitles.C, 1, BookConnectionRecsTitles.D, 1)));
        graph.put(BookConnectionRecsTitles.B, new HashMap<>(
                Map.of(BookConnectionRecsTitles.C, 1, BookConnectionRecsTitles.D, 1)));
        graph.put(BookConnectionRecsTitles.C, new HashMap<>());
        graph.put(BookConnectionRecsTitles.D, new HashMap<>());
        graph.put(BookConnectionRecsTitles.E, new HashMap<>());
        graph.put(BookConnectionRecsTitles.F, new HashMap<>(
                Map.of(BookConnectionRecsTitles.H, 1, BookConnectionRecsTitles.I, 1)));
        graph.put(BookConnectionRecsTitles.H, new HashMap<>(
                Map.of(BookConnectionRecsTitles.I, 1)));
        graph.put(BookConnectionRecsTitles.I, new HashMap<>());
        graph.put(BookConnectionRecsTitles.J, new HashMap<>(
                Map.of(BookConnectionRecsTitles.K, 1, BookConnectionRecsTitles.L, 1)));
        graph.put(BookConnectionRecsTitles.K, new HashMap<>());
        graph.put(BookConnectionRecsTitles.L, new HashMap<>());
    }
}
