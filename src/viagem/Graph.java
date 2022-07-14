package viagem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph implements Travel {

    List<List<Integer>> adjList = new ArrayList<>();
    List<Edge> edges;
    Integer numberOfVertexes;
    Integer numberConnections;

    public Graph(List<Edge> edges, Integer numberOfVertexes) {

        for (int i = 0; i <= numberOfVertexes; i++) {
            adjList.add(i, new ArrayList<>());
        }

        for (Edge edge : edges) {
            adjList.get(edge.getSourceNodeIndex()).add(edge.getDestinationNodeIndex());
        }

        this.edges = edges;
        this.numberOfVertexes = numberOfVertexes;

    }

    public boolean traversalDFS(int from, int to, boolean vnodelist[]) {

        vnodelist[from] = true;

        if (numberConnections < 0)
            return false;

        if (from == to)
            return true;

        if (numberConnections >= 0) {

            Iterator<Integer> i = adjList.get(from).listIterator();

            while (i.hasNext()) {

                int n = i.next();

                if (!vnodelist[n]) {

                    if (traversalDFS(n, to, vnodelist)) {

                        if (numberConnections-- < 0) {

                            numberConnections++;
                            return false;

                        }

                        return true;

                    }

                }

            }

        }

        return false;

    }

    public boolean isReachable(String from, String to, int numberConnections) {

        boolean visited[] = new boolean[numberOfVertexes];

        this.numberConnections = numberConnections;

        return traversalDFS(getVertexIndex(from), getVertexIndex(to), visited);

    }

    public Integer getVertexIndex(String vertexName) {

        Integer vertexIndex = -1;

        for (Edge edge : edges) {

            if (edge.getSource().equals(vertexName)) {

                return edge.getSourceNodeIndex();

            } else {

                if (edge.getDestination().equals(vertexName)) {

                    return edge.getDestinationNodeIndex();

                }

            }

        }

        return vertexIndex;

    }

    public static void showGraph(Graph graph) {

        int s = 0;

        int n = graph.adjList.size();

        System.out.println("\n############################### Printing graph ###############################\n");

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
