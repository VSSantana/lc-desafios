import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Desafio3 {

    public static void main(String[] args) throws Exception {

        Integer input1 = 0, input2 = 0;
        String input = new String();

        System.out.println("\n############################## START ##############################\n");

        if (args.length == 2) {

            if (Integer.parseInt(args[0]) > Integer.parseInt(args[1])) {

                input1 = Integer.parseInt(args[1]);
                input2 = Integer.parseInt(args[0]);

            } else {

                input1 = Integer.parseInt(args[0]);
                input2 = Integer.parseInt(args[1]);

            }

        } else {

            Scanner sc = new Scanner(System.in);
            String answer = new String();

            System.out.print(
                    "Nenhum argumento inserido na chamada do programa. Deseja entrar com os números agora (S/N)? ");

            answer = sc.nextLine();

            while (!answer.equals("S") && !answer.equals("N") && !answer.equals("s") && !answer.equals("n")) {

                System.out.print("\nResposta não reconhecida. Insira S para inserir uma string ou N para sair: ");

                answer = sc.nextLine();

            }

            if (answer.equals("N") || answer.equals("n")) {

                sc.close();

                return;

            } else {

                System.out.print("\nInsira os números no padrão '1 25' (dois números separados por um espaço): ");

                input = sc.nextLine();

                sc.close();

                Pattern pattern = Pattern.compile("\\d*");
                Matcher matcher = pattern.matcher(input);
                String substringMatched = new String();
                int i = 0;
                boolean n1 = false, n2 = false;

                while (matcher.find() || i < 2) {

                    substringMatched = matcher.group(0);

                    if (i == 0) {

                        input1 = Integer.parseInt(substringMatched);
                        n1 = true;

                    }

                    if (i == 2 && !substringMatched.equals("")) {

                        input2 = Integer.parseInt(substringMatched);
                        n2 = true;

                    }

                    if (n1 == true)
                        i++;

                    if (n2 == true)
                        i++;

                }

                if (input1 > input2) {

                    int aux = input1;
                    input1 = input2;
                    input2 = aux;

                }

            }

        }

        System.out.println("Input: " + input1 + " " + input2);

        Integer sum = 0;

        for (int i = input1; i <= input2; i++) {

            if (i == input1)
                System.out.print("Output: ");

            System.out.print(i);

            if (i != input2)
                System.out.print(", ");

            sum += i;

        }

        System.out.println(" Sum: " + sum);

        System.out.println("\n############################### END ###############################\n");

    }

}
