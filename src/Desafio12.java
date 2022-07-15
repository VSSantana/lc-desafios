import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Desafio12 {

    public static void main(String[] args) {

        previsaoSalarioAnual(2022, 1000.00);

    }

    public static void previsaoSalarioAnual(Integer ano, Double salarioBase) {

        Locale local = new Locale("pt", "BR");
        DateTimeFormatter padraoOuro = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DateTimeFormatter padraoMes = DateTimeFormatter.ofPattern("MMMM", local);
        LocalDate primeiroDiaDoAno = LocalDate.parse("01/01/" + ano.toString(), padraoOuro);
        LocalDate diaIteracao = primeiroDiaDoAno;
        Integer ultimoDiaMes, numeroDiasUteis, mes;
        Double comissoes, diaria;

        System.out.println(primeiroDiaDoAno.getDayOfWeek().getValue());

        mes = 1;

        while (mes < 13) {

            numeroDiasUteis = 0;
            diaria = 0.0;
            comissoes = 0.0;
            ultimoDiaMes = diaIteracao.lengthOfMonth();

            System.out.print("\n" + padraoMes.format(diaIteracao.getMonth()).substring(0, 1).toUpperCase()
                    + padraoMes.format(diaIteracao.getMonth()).substring(1) + " : \nDias úteis: ");

            for (int i = 1; i <= ultimoDiaMes; i++) {

                if (diaIteracao.getDayOfWeek().getValue() < 6) {

                    numeroDiasUteis++;

                }

                if (i == ultimoDiaMes) {

                    mes++;

                    diaria = (salarioBase / ultimoDiaMes);

                }

                diaIteracao = diaIteracao.plusDays(1);

            }

            comissoes = (diaria * 0.5) * numeroDiasUteis;

            System.out.print(
                    numeroDiasUteis + "\t| Salário base: " + formatacaoMonetaria(salarioBase, local) + "\t| Diária: "
                            + formatacaoMonetaria(diaria, local)
                            + "\t| Comissões: " + formatacaoMonetaria(comissoes, local)
                            + "\t| Total (Salário + Comissões): " + formatacaoMonetaria(comissoes + salarioBase, local)
                            + "\n");

        }

    }

    private static String formatacaoMonetaria(Double valor, Locale local) {
        return NumberFormat.getCurrencyInstance(local).format(valor);
    }

}
