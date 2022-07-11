import viagem.Routes;

public class Desafio9 {

    public static void main(String[] args) {

        Routes mapaRotas = new Routes(8);

        mapaRotas.adicionarAresta(0, 1);
        mapaRotas.adicionarAresta(0, 3);
        mapaRotas.adicionarAresta(0, 6);
        mapaRotas.adicionarAresta(1, 3);
        mapaRotas.adicionarAresta(1, 5);
        mapaRotas.adicionarAresta(2, 1);
        mapaRotas.adicionarAresta(4, 1);
        mapaRotas.adicionarAresta(6, 3);
        mapaRotas.adicionarAresta(6, 5);
        mapaRotas.adicionarAresta(6, 7);
        mapaRotas.adicionarAresta(6, 0);
        mapaRotas.adicionarAresta(7, 1);

        int s = 0, d = 5, r = 0;
        r = mapaRotas.countPaths(s, d, 2);
        System.out.println(r);

    }

}
