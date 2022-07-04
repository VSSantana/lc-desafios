import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String lista1 = new String();
        String lista2 = new String();
        List<Integer> listaConcatenada = new ArrayList<>();

        System.out.println("\n############################## START ##############################\n");

        System.out.println("Insira as listas de inteiros com os números separados por vírgula\n");

        System.out.print("Lista 1 => ");
        lista1 = sc.nextLine();

        System.out.print("\nLista 2 => ");
        lista2 = sc.nextLine();

        for (String elem : lista1.split("\\s*,\\s*")) {

            if (!listaConcatenada.contains(Integer.parseInt(elem)))
                listaConcatenada.add(Integer.parseInt(elem));

        }

        for (String elem : lista2.split("\\s*,\\s*")) {

            if (!listaConcatenada.contains(Integer.parseInt(elem)))
                listaConcatenada.add(Integer.parseInt(elem));

        }

        listaConcatenada.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {

                return o2.compareTo(o1);

            }

        });

        System.out.println("\nLista concatenada com elementos ordenados e sem repetições.\n");

        System.out.println("Resultado: " + listaConcatenada);

        sc.close();

        System.out.println("\n############################### END ###############################\n");

    }
}
