import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Desafio15 {

    public static void main(String[] args) {

        List<Map<String, String>> agenda = List.of(
                Map.of("nome", "João", "telefone", "9329823423"),
                Map.of("nome", "Maria", "telefone", "9124235435"),
                Map.of("nome", "Marta", "telefone", "9456335387"),
                Map.of("nome", "José", "telefone", "9632874738"),
                Map.of("nome", "Judas", "telefone", "9329244683"));

        Stream<Map<String, String>> agenda7 = agenda.stream().filter(c -> c.get("telefone").contains("7"))
                .sorted((c1, c2) -> c1.get("nome").compareTo(c2.get("nome")));

        agenda7.forEach(c7 -> System.out.println(c7));

    }

}
