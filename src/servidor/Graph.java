package servidor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;

public class Graph {

    private Map<Integer, List<Integer>> graph;
    private Map<Integer, Integer> rank;
    private Map<SimpleEntry<Integer, Integer>, Boolean> connectionDictionary;

    private void buildGraph(int n, List<List<Integer>> connections) {

        this.graph = new HashMap<>();
        this.rank = new HashMap<>();
        this.connectionDictionary = new HashMap<>();

        for (int i = 0; i < n; i++) {

            this.graph.put(i, new ArrayList<>());
            this.rank.put(i, null);

        }

        for (List<Integer> edge : connections) {

            int u = edge.get(0), v = edge.get(1);

            this.graph.get(u).add(v);
            this.graph.get(v).add(u);

            int sortedU = Math.min(u, v);
            int sortedV = Math.max(u, v);

            connectionDictionary.put(new SimpleEntry<>(sortedU, sortedV), true);

        }

    }

    private int dfs(int node, int discoveryRank) {

        if (this.rank.get(node) != null) {

            return this.rank.get(node);

        }

        this.rank.put(node, discoveryRank);

        int minRank = discoveryRank + 1;

        for (Integer neighbor : this.graph.get(node)) {

            Integer neighRank = this.rank.get(neighbor);

            if (neighRank != null && neighRank == discoveryRank - 1) {

                continue;

            }

            int recursiveRank = this.dfs(neighbor, discoveryRank + 1);

            if (recursiveRank <= discoveryRank) {

                int sortedU = Math.min(node, neighbor), sortedV = Math.max(node, neighbor);

                this.connectionDictionary.remove(new SimpleEntry<>(sortedU, sortedV));

            }

            minRank = Math.min(minRank, recursiveRank);

        }

        return minRank;
    }

    public List<List<Integer>> criticalHits(int n, List<List<Integer>> connections) {

        this.buildGraph(n, connections);
        this.dfs(0, 0);

        List<List<Integer>> result = new ArrayList<>();

        for (SimpleEntry<Integer, Integer> criticalConnection : this.connectionDictionary.keySet()) {

            result.add(new ArrayList<>(Arrays.asList(criticalConnection.getKey(), criticalConnection.getValue())));

        }

        return result;
    }

}
