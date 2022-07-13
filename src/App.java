import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) throws Exception {

        List<Map<String, String>> original = new ArrayList<>();
        List<Map<String, String>> padronizado;

        original.add(Map.of("nome", "João", "nascimento", "1985-12-11 12:10:33"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-1988 23:02:41"));
        original.add(Map.of("nome", "Ana", "nascimento", "03:58:26 14-02-1983"));
        original.add(Map.of("nome", "Pedro", "nascimento", "08:03:07 1989-11-02"));

        padronizado = padronizaDatas(original);

        System.out.println(original);

        System.out.println(padronizado);

    }

    public static List<Map<String, String>> padronizaDatas(List<Map<String, String>> conjuntoOriginal) {

        List<Map<String, String>> conjuntoPadronizado = new ArrayList<>();
        Pattern padrao1 = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        Pattern padrao2 = Pattern.compile("\\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}:\\d{2}");
        Pattern padrao3 = Pattern.compile("\\d{2}:\\d{2}:\\d{2} \\d{2}-\\d{2}-\\d{4}");
        Pattern padrao4 = Pattern.compile("\\d{2}:\\d{2}:\\d{2} \\d{4}-\\d{2}-\\d{2}");
        DateTimeFormatter padraoOuro = DateTimeFormatter.ofPattern("dd-MM-uuuu HH:mm:ss");
        DateTimeFormatter padraoData1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter padraoData2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter padraoData3 = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        DateTimeFormatter padraoData4 = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");

        for (Map<String, String> registro : conjuntoOriginal) {

            String nome = registro.get("nome");
            String data = registro.get("nascimento");

            if (data.matches(padrao1.pattern())) {

                conjuntoPadronizado.add(
                        Map.of("nome", nome, "nascimento", padraoOuro.format(LocalDateTime.parse(data, padraoData1))));

            }

            if (data.matches(padrao2.pattern())) {

                conjuntoPadronizado.add(
                        Map.of("nome", nome, "nascimento", padraoOuro.format(LocalDateTime.parse(data, padraoData2))));

            }

            if (data.matches(padrao3.pattern())) {

                conjuntoPadronizado.add(
                        Map.of("nome", nome, "nascimento", padraoOuro.format(LocalDateTime.parse(data, padraoData3))));

            }

            if (data.matches(padrao4.pattern())) {

                conjuntoPadronizado.add(
                        Map.of("nome", nome, "nascimento", padraoOuro.format(LocalDateTime.parse(data, padraoData4))));

            }

        }

        return conjuntoPadronizado;

    }

    public static Map<String, String> pessoaMaisNova(List<Map<String, String>> dados) {

        Map<String, String> retorno;

        retorno = dados.get(0);

        for (Map<String, String> registro : dados) {

        }

        return retorno;

    }

}
