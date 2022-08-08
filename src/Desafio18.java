import pessoa.Pessoa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio18 {

    public static void main(String[] args) {

        Path arquivoPessoas = Paths.get("lc-desafios/src/pessoa/lista-pessoas.txt").toAbsolutePath();
        List<Pessoa> pessoas = null;

        try (BufferedReader reader = Files.newBufferedReader(arquivoPessoas, Charset.forName("UTF-8"))) {

            pessoas = Files.lines(arquivoPessoas).skip(1).map(l -> {

                Pessoa pessoa = new Pessoa(l.substring(0, 34).trim(),
                        LocalDate.parse(l.substring(34, 44)),
                        l.substring(49, 79).trim(),
                        l.substring(79, 81).trim());

                return pessoa;

            }).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }

    }

}
