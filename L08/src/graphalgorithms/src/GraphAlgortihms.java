package graphalgorithms.src;

import java.util.*;

public class GraphAlgortihms {

    /**
     * Returnerer en liste af grafens knuder fundet ved et dybdeførst gennemløb af
     * grafen med startknude v.
     */
    public static <V> List<V> dfs(Graph<V> graph, V v) {
        boolean[] visited = new boolean[graph.getSize()];
        List<V> visitedOrder = new ArrayList<>();

        return dfs(graph, v, visited, visitedOrder);
    }

    public static <V> List<V> dfs(Graph<V> graph, V vertex, boolean[] visited, List<V> visitedOrder) {
        visited[graph.getIndex(vertex)] = true;
        visitedOrder.add(vertex);

        for (V neighbour : graph.getNeighbors(vertex)) {
            if (visited[graph.getIndex(neighbour)] != true) {
                dfs(graph, neighbour, visited, visitedOrder);
            }
        }
        return visitedOrder;
    }


    /**
     * Returnerer en liste af grafens knuder fundet ved et breddeførst gennemløb af
     * grafen med startknude v.
     */
    public static <V> List<V> bfs(Graph<V> graph, V v) {
        List<V> visited = new ArrayList<>();
        Queue<V> queue = new LinkedList<>();
        queue.add(v);

        while (!queue.isEmpty()) {
            V current = queue.poll();

            if (!visited.contains(current)) {
                visited.add(current);

                List<V> neighbours = graph.getNeighbors(current);
                for (V neighbour : neighbours) {
                    if (!visited.contains(neighbour)) {
                        queue.add(neighbour);
                    }
                }
            }
        }
        return visited;
    }

    /**
     * Returnerer om grafen er sammenhængende
     * Pre: Grafen er ikke tom
     */
    public static <V> boolean connected(Graph<V> graph) {
        // TODO Opgave 4
        return false;
    }

    /**
     * Returnerer om der er en vej fra v1 til v2 i graph
     */
    public static <V> boolean isPath(Graph<V> graph, V v1, V v2) {
        // TODO Opgave 5
        return false;
    }
}