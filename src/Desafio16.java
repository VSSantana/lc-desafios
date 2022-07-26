import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.io.FileNotFoundException;

public class Desafio16 {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        Locale local = new Locale("pt", "BR");
        DateTimeFormatter padraoMes = DateTimeFormatter.ofPattern("MMMM", local);
        String fileOutputName = "relatorio-" + padraoMes.format(LocalDate.now()) + ".txt";
        String fileInputName = "src/processamento/variaveis.txt";
        String fileModelName = "src/processamento/modelo.txt";
        StringBuilder token = new StringBuilder();
        String key = "", value = "";
        int character, flagKeyValue = 0, flagSubstitution = 0;
        FileWriter fw = new FileWriter(fileOutputName);
        FileReader fr = null;
        Map<String, String> variables = new HashMap<>();
        Pattern numberPattern = Pattern.compile("[0-9]+");
        Pattern wordPattern = Pattern.compile("[a-z]+");
        Pattern substitutionTokenStart = Pattern.compile("<%");
        Pattern substitutionTokenEnd = Pattern.compile("%>");

        // Descobrimento das variáveis.

        try {

            fr = new FileReader(fileInputName);

        } catch (FileNotFoundException fe) {

            fw.close();
            throw new FileNotFoundException("O arquivo de variáveis " + fileInputName + " não foi encontrado!");

        }

        do {

            character = fr.read();

            if (Pattern.matches(wordPattern.pattern(), String.valueOf((char) character))
                    || Pattern.matches(numberPattern.pattern(), String.valueOf((char) character))) {

                token.append((char) character);

            } else {

                if (flagKeyValue == 0 && (Pattern.matches(wordPattern.pattern(), token.toString())
                        || Pattern.matches(numberPattern.pattern(), token.toString()))) {

                    key = token.toString();
                    flagKeyValue = 1;

                } else {

                    if (Pattern.matches(numberPattern.pattern(), token.toString())) {

                        variables.put(key, token.toString());
                        flagKeyValue = 0;

                    }

                }

                token.setLength(0);

            }

        } while (character != -1);

        fr.close();

        // Leitura do modelo e escrita do relatório.

        try {

            fr = new FileReader(fileModelName);

        } catch (FileNotFoundException fe) {

            fw.close();
            throw new FileNotFoundException("O arquivo de modelo " + fileModelName + " não foi encontrado!");

        }

        while ((character = fr.read()) != -1) {

            if (!Pattern.matches(Pattern.compile(" ").pattern(), String.valueOf((char) character))
                    && !Pattern.matches(substitutionTokenStart.pattern(), token.toString())
                    && !Pattern.matches(substitutionTokenEnd.pattern(), token.toString())) {

                token.append((char) character);

            } else {

                if (!Pattern.matches(substitutionTokenStart.pattern(), token.toString())
                        && !Pattern.matches(substitutionTokenEnd.pattern(), token.toString())
                        && Pattern.matches(Pattern.compile(" ").pattern(), String.valueOf((char) character))
                        && flagSubstitution == 0) {

                    for (int i = 0; i < token.toString().length(); i++) {

                        fw.write(token.charAt(i));

                    }

                    fw.write(" ");

                }

                if (flagSubstitution == 1) {

                    key = token.toString();

                    if (key.equals("mes")) {
                        value = padraoMes.format(LocalDate.now());
                    } else {
                        if (key.equals("ano")) {
                            value = Integer.toString(LocalDate.now().getYear());
                        } else {
                            value = variables.get(key);
                        }
                    }

                    for (int i = 0; i < value.length(); i++) {

                        fw.write(value.charAt(i));

                    }

                    fw.write(" ");

                    flagSubstitution = 0;

                }

                if (Pattern.matches(substitutionTokenStart.pattern(), token.toString())) {

                    flagSubstitution = 1;

                }

                token.setLength(0);

            }

        }

        fw.close();
        fr.close();

    }

}