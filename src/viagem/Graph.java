package viagem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph {

    List<List<Integer>> adjList = new ArrayList<>();
    List<Edge> edges;
    Integer numberOfVertexes;

    public Graph(List<Edge> edges, Integer vertexesNumber) {

        for (int i = 0; i <= vertexesNumber; i++) {
            adjList.add(i, new ArrayList<>());
        }

        for (Edge current : edges) {
            adjList.get(current.getSourceNodeIndex()).add(current.getDestinationNodeIndex());
        }

        this.edges = edges;
        this.numberOfVertexes = vertexesNumber;

    }

    public boolean traversalDFS(int start, int end, boolean vnodelist[]) {

        vnodelist[start] = true;
        System.out.print(start + " ");

        if (start == end)
            return true;

        Iterator<Integer> i = adjList.get(start).listIterator();

        while (i.hasNext()) {

            int n = i.next();

            if (!vnodelist[n])
                if (traversalDFS(n, end, vnodelist))
                    return true;

        }

        return false;

    }

    public boolean DFS(int start, int end) {

        boolean visited[] = new boolean[numberOfVertexes];

        return traversalDFS(start, end, visited);

    }

    public static void showGraph(Graph graph) {

        int s = 0;

        int n = graph.adjList.size();

        while (s < n) {

            for (int d : graph.adjList.get(s)) {

                System.out.print("Adjacency List for the graph is:");

                System.out.print("(" + s + " -- > " + d + ")\t");

            }

            System.out.println();

            s++;

        }

    }

}
