import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Desafio11 {

    public static void main(String[] args) {

        List<Map<String, String>> listaPessoas = new ArrayList<>();
        DateTimeFormatter padraoOuro = DateTimeFormatter.ofPattern("dd-MM-uu");
        LocalDate now = LocalDate.now();

        listaPessoas.add(Map.of("nome", "João", "nascimento", "11-12-85"));
        listaPessoas.add(Map.of("nome", "Maria", "nascimento", "24-07-88"));
        listaPessoas.add(Map.of("nome", "Ana", "nascimento", "14-02-83"));
        listaPessoas.add(Map.of("nome", "Pedro", "nascimento", "02-11-89"));

        for (Map<String, String> pessoa : listaPessoas) {

            System.out.println(pessoa.get("nome") + " tem "
                    + Period.between(now, LocalDate.parse(pessoa.get("nascimento"), padraoOuro)).getYears()
                    + " anos.");

        }

    }

}
