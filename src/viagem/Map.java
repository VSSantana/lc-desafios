package viagem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Map {

    private List<Route>[] listaDeAdjacencias;

    @SuppressWarnings("unchecked")
    public Map(Integer numeroDeNos) {

        listaDeAdjacencias = new ArrayList[numeroDeNos];

        for (int i = 0; i < numeroDeNos; ++i)
            listaDeAdjacencias[i] = new ArrayList<>();

    }

    public void adicionarAresta(Route novaRota) {

        Integer index = -1;

        for (List<Route> rotas : listaDeAdjacencias) {

            if (rotas.size() != 0)
                index++;

            Iterator<Route> i = rotas.listIterator();

            while (i.hasNext()) {

                Route rota = i.next();

                if (rota.getOrigin().equals(novaRota.getOrigin())) {

                    novaRota.setOriginNodeIndex(index);
                    rotas.add(novaRota);
                    return;

                }

            }

        }

        if (index == -1)
            index = 0;
        System.out.println(index);
        novaRota.setOriginNodeIndex(index);
        listaDeAdjacencias[index].add(novaRota);

    }

    // public void removerAresta(int v, int w) {

    // // O nó w é removido da lista de vizinhos de v.
    // listaDeAdjacenciasOriginal[v].remove(w);
    // }

    // // Busca uma rota existete entre origem e destino.
    // public int buscaRota(int origem, int destino, int conexoes) {

    // // If current vertex is same as
    // // destination, then increment count
    // if (origem == destino) {
    // conexoes--;
    // }

    // // Recur for all the vertices
    // // listaDeAdjacenciasacent to this vertex
    // else {
    // Iterator<Integer> i = listaDeAdjacenciasCopia[origem].listIterator();
    // while (i.hasNext()) {
    // int n = i.next();
    // removerAresta(origem, n);
    // conexoes = buscaRota(n, destino, conexoes);
    // }
    // }
    // return conexoes;
    // }

    // public int countPaths(int s, int d, int conexoes) {

    // int pathCount = conexoes;
    // listaDeAdjacenciasCopia = listaDeAdjacenciasOriginal;
    // pathCount = buscaRota(s, d, pathCount);
    // return pathCount;

    // }

    public void imprimirMapa() {

        for (List<Route> rotas : listaDeAdjacencias) {

            Iterator<Route> i = rotas.listIterator();
            Integer contagemRotas = 0;

            System.out.println("\nLista de adjacências do vértice ");

            while (i.hasNext()) {

                Route rota = i.next();

                if (contagemRotas == 0) {

                    System.out.print(rota.getOriginNodeIndex() + " - " + rota.getOrigin() + ": ");
                    System.out.print(rota.getDestiny());

                }

                if (contagemRotas != 0)
                    System.out.print(" -> " + rota.getDestiny());

                contagemRotas++;

            }

        }

    }

}
