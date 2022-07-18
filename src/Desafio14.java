import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Desafio14 {

    public static void main(String[] args) {

        ZoneId saoPauloSP = ZoneId.of(ZoneId.SHORT_IDS.get("BET"));
        ZoneId parisFR = ZoneId.of(ZoneId.SHORT_IDS.get("ECT"));
        LocalDateTime dataInicioEvento = LocalDateTime.of(2022, 07, 22, 10, 00, 00);
        DateTimeFormatter padraoOuro = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm");

        gerarAgendaEvento(LocalDate.of(2022, 07, 22), LocalTime.of(10, 00));

    }

    public static void gerarAgendaEvento(LocalDate dataInicioEvento, LocalTime horaInicio) {

        ZoneId saoPauloSP = ZoneId.of(ZoneId.SHORT_IDS.get("BET"));
        ZoneId parisFR = ZoneId.of(ZoneId.SHORT_IDS.get("ECT"));
        LocalDate proximaSessao = dataInicioEvento;
        LocalTime horarioInicioSessao = horaInicio;
        LocalTime horarioFimSessao = horarioInicioSessao.plusHours(6);
        Integer diasIntervaloSessoes = 10, numeroSessao = 1;
        DateTimeFormatter padraoOuro = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        while (proximaSessao.getMonthValue() < 11) {

            horarioFimSessao = horarioInicioSessao.plusHours(6);

            System.out.println("Sessão nº " + numeroSessao + " " + padraoOuro.format(proximaSessao));
            System.out.println(horarioFimSessao);

            proximaSessao = proximaSessao.plusDays(diasIntervaloSessoes);

            horarioInicioSessao = horarioInicioSessao.plusHours(2);

        }

    }

}
