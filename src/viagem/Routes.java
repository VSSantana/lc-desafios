package viagem;

import java.util.Iterator;
import java.util.LinkedList;

public class Routes {

    // Lista para guardar os nodos vizinhos de um determinado nó.
    private LinkedList<Integer> listaDeAdjacenciasOriginal[];
    private LinkedList<Integer> listaDeAdjacenciasCopia[];

    // Inicializa as listas de cada nó.
    @SuppressWarnings("unchecked")
    public Routes(int v) {
        listaDeAdjacenciasOriginal = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            listaDeAdjacenciasOriginal[i] = new LinkedList<>();
    }

    public void adicionarAresta(int v, int w) {

        // O nó w é adicionado à lista de vizinhos de v.
        listaDeAdjacenciasOriginal[v].add(w);
    }

    public void removerAresta(int v, int w) {

        // O nó w é removido da lista de vizinhos de v.
        listaDeAdjacenciasOriginal[v].remove(w);
    }

    // Busca uma rota existete entre origem e destino.
    public int buscaRota(int origem, int destino, int conexoes) {

        // If current vertex is same as
        // destination, then increment count
        if (origem == destino) {
            conexoes--;
        }

        // Recur for all the vertices
        // listaDeAdjacenciasacent to this vertex
        else {
            Iterator<Integer> i = listaDeAdjacenciasCopia[origem].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                removerAresta(origem, n);
                conexoes = buscaRota(n, destino, conexoes);
            }
        }
        return conexoes;
    }

    public int countPaths(int s, int d, int conexoes) {

        int pathCount = conexoes;
        listaDeAdjacenciasCopia = listaDeAdjacenciasOriginal;
        pathCount = buscaRota(s, d, pathCount);
        return pathCount;

    }

    // public static void imprimirGrafo(ArrayList<ArrayList<Integer> > adj)
    // {
    // for (int i = 0; i < adj.size(); i++) {
    // System.out.println("\nAdjacency list of vertex"
    // + i);
    // System.out.print("head");
    // for (int j = 0; j < adj.get(i).size(); j++) {
    // System.out.print(" -> "
    // + adj.get(i).get(j));
    // }
    // System.out.println();
    // }
    // }

}
