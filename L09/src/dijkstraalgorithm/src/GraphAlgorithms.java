package dijkstraalgorithm.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphAlgorithms {

    public static <V> int[] shortestPathWeights(Graph<V> graph, V source) {
        List<Integer> exploredVertexIndexes = new ArrayList<>();
        // Opret en liste for udforskede noder (nodernes indeks)
        boolean[] visited = new boolean[graph.getSize()];
        int[] cost = new int[graph.getSize()];

        // Opret et array for mindst fundne "rejseomkostning" fra kildenode til nodeindeks (sum af kanters vægt)
        int sourceVertexIndex = graph.getIndex(source);

        for (int i = 0; i < graph.getSize(); i++) {
            visited[i] = false;
            cost[i] = Integer.MAX_VALUE;
        }
        cost[sourceVertexIndex] = 0;

        for (int i = 0; i < cost.length; i++) {
            int u = minDistance(cost, visited);

            visited[u] = true;

            for (Edge e : graph.getIncidentEdges(graph.getVertex(u))) {
                int v = e.endVertexIndex;
                if (!visited[v] && cost[u] != Integer.MAX_VALUE && cost[u] + e.weight < cost[v]) {
                    cost[v] = cost[u] + e.weight;
                }
            }
        }


        // TODO: Gentag nedenstående så længe der er uudforskede noder...
        while (exploredVertexIndexes.size() < graph.getSize()) {
            int minCostVertexIndex = -1;
            for (int i = 0; i < cost.length; i++) {
                if (cost[i] < minCostVertexIndex && !exploredVertexIndexes.contains(i)) {
//                    minCostVertexIndex
                }
            }
        }
        // TODO: Find den node, der foreløbigt har laveste rejseomkostning blandt de uudforskede noder
        // TODO: Udforsk rejseomkostningen for den fundne nodes uudforskede naboer
        // TODO: Opdater array for mindste omkostning (cost), hvor mindre omkostning findes
        // TODO: Tilføj den udforske node til listen (exploredVertexIndexes) og gentag udforskningen

        return cost;
    }

    private static int minDistance(int[] cost, boolean[] visited) {
        // Initialize minimum value
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < cost.length; v++) {
            if (!visited[v] && cost[v] <= min) {
                min = cost[v];
                minIndex = v;
            }
        }

        return minIndex;
    }
}