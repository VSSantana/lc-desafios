import java.util.Arrays;
import java.util.List;

import viagem.Edge;
import viagem.Graph;

public class Desafio9 {

    public static void main(String[] args) {

        List<Edge> edges = Arrays.asList(new Edge("BSB", 0, "SSA", 1),
                new Edge("BSB", 0, "NAT", 3),
                new Edge("BSB", 0, "GRU", 6),
                new Edge("SSA", 1, "NAT", 3),
                new Edge("SSA", 1, "REC", 7),
                new Edge("SDU", 2, "SSA", 1),
                new Edge("VCP", 4, "SSA", 1),
                new Edge("POA", 5, "BSB", 0),
                new Edge("GRU", 6, "BSB", 0),
                new Edge("GRU", 6, "NAT", 3),
                new Edge("GRU", 6, "POA", 5),
                new Edge("GRU", 6, "REC", 7));

        Graph graph = new Graph(edges, 8);

        System.out.println(graph.isReachable("POA", "REC", 1));

        System.out.println(graph.isReachable("POA", "REC", 2));

        System.out.println(graph.isReachable("BSB", "REC", 1));

        System.out.println(graph.isReachable("BSB", "POA", 0));

        System.out.println(graph.isReachable("GRU", "SSA", 2));

    }

}
