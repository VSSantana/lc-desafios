package respostas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Desafio12Resp {

    final static BigDecimal BONUS_DIARIO = new BigDecimal("0.5");
    final static DateTimeFormatter formatterMes = DateTimeFormatter.ofPattern("MM/yy");

    public static void main(String[] args) {
        calcSalarioAno(new BigDecimal(1000), 2022);
    }

    static void calcSalarioAno(BigDecimal salario, int ano) {

        LocalDate dataAno = LocalDate.of(ano, 1, 1);

        for (int i = 1; i <= 12; i++) {
            LocalDate dataMes = dataAno.withMonth(i);
            calcSalarioMes(salario, dataMes);
        }

    }

    static void calcSalarioMes(BigDecimal salarioMensal, LocalDate mes) {

        LocalDate inicioMes = mes.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate fimMes = mes.with(TemporalAdjusters.lastDayOfMonth());

        long diasMes = ChronoUnit.DAYS.between(inicioMes, fimMes);

        BigDecimal valorSalarioDia = salarioMensal.divide(new BigDecimal(30), 2, RoundingMode.HALF_UP);
        BigDecimal bonusDiario = valorSalarioDia.multiply(BONUS_DIARIO).divide(new BigDecimal(100), 2,
                RoundingMode.HALF_UP);

        BigDecimal bonusTotal = BigDecimal.ZERO;

        for (int i = 0; i < diasMes; i++) {
            LocalDate diaMes = inicioMes.plusDays(i);
            if (!isFinalSemana(diaMes)) {
                bonusTotal = bonusTotal.add(bonusDiario);
            }
        }

        BigDecimal previsaoSalarioMes = salarioMensal.add(bonusTotal).setScale(2, RoundingMode.HALF_UP);

        System.out.printf("%s -  R$ %.2f \n", mes.format(formatterMes), previsaoSalarioMes);

    }

    static boolean isFinalSemana(final LocalDate data) {
        return data.getDayOfWeek().equals(DayOfWeek.SATURDAY)
                || data.getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }

}