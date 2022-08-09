package respostas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio18Resp {

    public static void main(String[] args) throws IOException {
        new Desafio18Resp().lerArquivo();
    }

    public void lerArquivo() throws IOException {

        Path arquivo = Paths.get("lc-desafios/src/pessoa/lista-pessoas.txt").toAbsolutePath();

        List<Pessoa> pessoas = Files.lines(arquivo)
                .skip(1)
                .map(linha -> {
                    Pessoa pessoa = new Pessoa();
                    pessoa.nome = linha.substring(0, 34).trim();
                    pessoa.dataNascimento = LocalDate.parse(linha.substring(34, 44));
                    pessoa.cidade = linha.substring(49, 79).trim();
                    pessoa.uf = linha.substring(79, 81).trim();
                    return pessoa;
                })
                .collect(Collectors.toList());

        System.out.println(pessoas);

    }

    class Pessoa {
        String nome;
        LocalDate dataNascimento;
        String cidade;
        String uf;
    }
}