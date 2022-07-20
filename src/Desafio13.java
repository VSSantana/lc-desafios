import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import evento.Evento;
import evento.Local;

public class Desafio13 {

    public static void main(String[] args) {

        Local saoPaulo = new Local.Builder().nomeCidade("São Paulo")
                .local(new Locale("pt", "BR"))
                .zoneId(ZoneId.of(ZoneId.SHORT_IDS.get("BET")))
                .padraoData(DateTimeFormatter.ofPattern("dd/MM/uuuu"))
                .padraoHora(DateTimeFormatter.ofPattern("HH:mm"))
                .padraoDia(DateTimeFormatter.ofPattern("EEEE", new Locale("pt", "BR")))
                .build();

        Local trizPariz = new Local.Builder().nomeCidade("Paris")
                .local(new Locale("fr", "FR"))
                .zoneId(ZoneId.of(ZoneId.SHORT_IDS.get("ECT")))
                .padraoData(DateTimeFormatter.ofPattern("dd/MM/uuuu"))
                .padraoHora(DateTimeFormatter.ofPattern("HH:mm"))
                .padraoDia(DateTimeFormatter.ofPattern("EEEE", new Locale("fr", "FR")))
                .build();

        List<Local> locais = new ArrayList<>();

        locais.add(saoPaulo);
        locais.add(trizPariz);

        Evento evento = new Evento.Builder().nomeEvento("Campeonato Mundial de CLASS BODY BUILDER!")
                .dataInicioEvento(LocalDate.of(2022, 07, 22))
                .horaInicio(LocalTime.of(10, 00))
                .diasIntervaloSessoes(10)
                .horasDuracaoSessao(6)
                .incrementoHorarioInicio(2)
                .mesEncerramento(10)
                .locais(locais)
                .build();

        evento.gerarAgendaEvento();

    }

}
