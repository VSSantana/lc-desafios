import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.time.*;

public class App {

    public static void main(String[] args) throws Exception {

        List<Map<String, String>> original = new ArrayList<>();
        Pattern padrao1 = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");

        original.add(Map.of("nome", "João", "nascimento", "1985-12-11 12:10:33"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-1988 23:02:41"));
        original.add(Map.of("nome", "Ana", "nascimento", "03:58:26 14-02-1983"));
        original.add(Map.of("nome", "Pedro", "nascimento", "08:03:07 1989-11-02"));

        // System.out.println(original.toString());

        for (Map<String, String> registro : original) {

            for (Map.Entry<String, String> dados : registro.entrySet()) {

                String chave = dados.getKey();

                if (chave.equals("nascimento"))
                    System.out.println(registro.get(chave));

            }

        }

    }

}
