import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(final String[] args) throws Exception {
        final Map<BookConnectionRecsTitles, Map<BookConnectionRecsTitles, Integer>> graph = new HashMap<>();

        // Add nodes and edges with weights
        graph.put(A, new HashMap<>(Map.of(B, 1, C, 1, D, 1)));
        graph.put(B, new HashMap<>(Map.of(E, 1, F, 1)));
        graph.put(C, new HashMap<>());
        graph.put(D, new HashMap<>());
        graph.put(E, new HashMap<>());
        graph.put(F, new HashMap<>(Map.of(H, 1, I, 1)));
        graph.put(G, new HashMap<>());
        graph.put(H, new HashMap<>());
        graph.put(I, new HashMap<>());
        graph.put(J, new HashMap<>(Map.of(K, 1, L, 1)));
        graph.put(K, new HashMap<>());
        graph.put(L, new HashMap<>());
    }
}
