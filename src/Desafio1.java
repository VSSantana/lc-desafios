import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Desafio1 {
    public static void main(String[] args) throws Exception {

        String input = new String();

        System.out.println("\n############################## START ##############################\n");

        if (args.length != 0) {

            input = args[0];

        } else {

            Scanner sc = new Scanner(System.in);
            String answer = new String();

            System.out.print(
                    "Nenhum argumento inserido na chamada do programa. Deseja entrar com a string agora (S/N)? ");

            answer = sc.nextLine();

            while (!answer.equals("S") && !answer.equals("N") && !answer.equals("s") && !answer.equals("n")) {

                System.out.print("\nResposta não reconhecida. Insira S para inserir uma string ou N para sair: ");

                answer = sc.nextLine();

            }

            if (answer.equals("N") || answer.equals("n")) {

                sc.close();

                return;

            } else {

                System.out.print("\nInsira uma string no padrão 'frdts2XXX6xxbl2XXXeee5': ");

                input = sc.nextLine();

                sc.close();

            }

        }

        System.out.println("\nString da entrada: " + input);

        System.out.println("Resultado da busca pelo padrão: " + finder(input));

        System.out.println("\n############################### END ###############################\n");

    }

    public static boolean finder(String input) {

        Pattern pattern = Pattern.compile("\\dXXX\\d");
        Matcher matcher = pattern.matcher(input);
        String substringMatched = new String();
        Integer number1 = 0, number2 = 0;

        while (matcher.find()) {

            substringMatched = matcher.group(0);

            number1 = Integer.parseInt(substringMatched.substring(0, 1));
            number2 = Integer.parseInt(substringMatched.substring(4, 5));

            if ((number1 + number2) == 8) {

                return true;

            }

        }

        return false;

    }

}
