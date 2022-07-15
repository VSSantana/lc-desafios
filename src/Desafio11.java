import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Desafio11 {

    public static void main(String[] args) {

        List<Map<String, String>> listaPessoas = new ArrayList<>();

        listaPessoas.add(Map.of("nome", "João", "nascimento", "11-12-85"));
        listaPessoas.add(Map.of("nome", "Maria", "nascimento", "24-07-88"));
        listaPessoas.add(Map.of("nome", "Ana", "nascimento", "14-02-83"));
        listaPessoas.add(Map.of("nome", "Pedro", "nascimento", "02-11-89"));
        listaPessoas.add(Map.of("nome", "Jonatan", "nascimento", "02-06-23"));
        listaPessoas.add(Map.of("nome", "Danilo", "nascimento", "02-06-00"));
        listaPessoas.add(Map.of("nome", "James", "nascimento", "02-09-92"));

        for (Map<String, String> pessoa : listaPessoas) {

            System.out.println(pessoa.get("nome") + " nasceu em " + pessoa.get("nascimento") + " e tem "
                    + retornaIdade(pessoa.get("nascimento")) + " anos.");

        }

    }

    public static String retornaDataSeculo(String data) {

        String retorno;
        String[] dataSplitted = data.split("-");
        String anoString = LocalDate.now().toString().split("-")[0];
        Integer anoDivisor = (Integer.parseInt(anoString) - 99);

        anoString = anoDivisor.toString();

        String decadaDivisora = anoString.charAt(2) + "" + anoString.charAt(3);

        if (Integer.parseInt(dataSplitted[2]) >= Integer.parseInt(decadaDivisora)) {

            retorno = dataSplitted[0] + "-" + dataSplitted[1] + "-" + "19" + dataSplitted[2];

        }

        else {

            retorno = dataSplitted[0] + "-" + dataSplitted[1] + "-" + "20" + dataSplitted[2];

        }

        return retorno;

    }

    public static Integer retornaIdade(String dataNascimento) {

        DateTimeFormatter padraoOuro = DateTimeFormatter.ofPattern("dd-MM-uuuu");

        return Period.between(LocalDate.parse(retornaDataSeculo(dataNascimento), padraoOuro), LocalDate.now())
                .getYears();

    }

}
