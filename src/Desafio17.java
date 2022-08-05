import java.util.regex.Pattern;

public class Desafio17 {

    public static void main(String[] args) {

        System.out
                .println("\n################################## VALIDAÇÃO DE LINK ##################################\n");

        String link1 = "https://sitenoticas.com.br/negocios/investimentos/2022/04/01/fim-de-semana-com-muita-chuva.html";

        System.out.println("Link enviado: " + link1);

        System.out.println("\nResultado da avaliação da validade do link: " + linkCheck(link1));

        String link2 = "https://www.unb.br/";

        System.out.println("\nLink enviado: " + link2);

        System.out.println("\nResultado da avaliação da validade do link: " + linkCheck(link2));

    }

    public static Boolean linkCheck(String link) {

        Pattern linkPattern = Pattern.compile(
                "^(http)[s]?(:\\/\\/)[a-zA-Z0-9]+(.com.br\\/)[a-zA-Z]+(\\/)[a-zA-Z]+(\\/)[0-9]{4}(\\/)[0-9]{2}(\\/)[0-9]{2}(\\/)[a-zA-Z\\-]+(.html)$");
        Boolean validLink = false;

        if (Pattern.matches(linkPattern.pattern(), link)) {
            validLink = true;
        }

        return validLink;

    }

}
