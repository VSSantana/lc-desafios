import java.util.ArrayList;
import java.util.List;

import servidor.Graph;

public class Desafio10 {

    public static void main(String[] args) {

        Graph graph = new Graph();
        List<List<Integer>> connections = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();
        List<Integer> list7 = new ArrayList<>();

        list0.add(0);
        list0.add(1);
        list1.add(0);
        list1.add(2);
        list2.add(1);
        list2.add(0);
        list3.add(1);
        list3.add(2);
        list4.add(1);
        list4.add(3);
        list5.add(2);
        list5.add(0);
        list6.add(2);
        list6.add(1);
        list7.add(3);
        list7.add(1);

        connections.add(list0);
        connections.add(list1);
        connections.add(list2);
        connections.add(list3);
        connections.add(list4);
        connections.add(list5);
        connections.add(list6);
        connections.add(list7);

        List<List<Integer>> result = graph.criticalHits(4, connections);

        System.out.println("\nConexões críticas: \n");

        for (List<Integer> list : result) {

            System.out.println(list);

        }

    }

}