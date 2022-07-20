package evento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;

public class Evento {

    private final String nomeEvento;
    private final LocalDate dataInicioEvento;
    private final LocalTime horaInicio;
    private final Integer diasIntervaloSessoes;
    private final Integer horasDuracaoSessao;
    private final Integer incrementoHorarioInicio;
    private final Integer mesEncerramento;
    private final List<Local> locais; // O primeiro elemento da lista deve ser o local sede.

    private Evento(Builder builder) {

        this.nomeEvento = builder.nomeEvento;
        this.dataInicioEvento = builder.dataInicioEvento;
        this.horaInicio = builder.horaInicio;
        this.diasIntervaloSessoes = builder.diasIntervaloSessoes;
        this.horasDuracaoSessao = builder.horasDuracaoSessao;
        this.incrementoHorarioInicio = builder.incrementoHorarioInicio;
        this.mesEncerramento = builder.mesEncerramento;
        this.locais = builder.locais;

    }

    public static class Builder {

        private String nomeEvento;
        private LocalDate dataInicioEvento;
        private LocalTime horaInicio;
        private Integer diasIntervaloSessoes;
        private Integer horasDuracaoSessao;
        private Integer incrementoHorarioInicio;
        private Integer mesEncerramento;
        private List<Local> locais;

        public Builder nomeEvento(final String nomeEvento) {

            this.nomeEvento = nomeEvento;

            return this;

        }

        public Builder dataInicioEvento(final LocalDate dataInicioEvento) {

            this.dataInicioEvento = dataInicioEvento;

            return this;

        }

        public Builder horaInicio(final LocalTime horaInicio) {

            this.horaInicio = horaInicio;

            return this;

        }

        public Builder diasIntervaloSessoes(final Integer diasIntervaloSessoes) {

            this.diasIntervaloSessoes = diasIntervaloSessoes;

            return this;

        }

        public Builder horasDuracaoSessao(final Integer horasDuracaoSessao) {

            this.horasDuracaoSessao = horasDuracaoSessao;

            return this;

        }

        public Builder incrementoHorarioInicio(final Integer incrementoHorarioInicio) {

            this.incrementoHorarioInicio = incrementoHorarioInicio;

            return this;

        }

        public Builder mesEncerramento(final Integer mesEncerramento) {

            this.mesEncerramento = mesEncerramento;

            return this;

        }

        public Builder locais(final List<Local> locais) {

            this.locais = locais;

            return this;

        }

        public Evento build() {

            return new Evento(this);

        }

    }

    public String getNomeEvento() {

        return nomeEvento;

    }

    public LocalDate getDataInicioEvento() {

        return dataInicioEvento;

    }

    public LocalTime getHoraInicio() {

        return horaInicio;

    }

    public Integer getDiasIntervaloSessoes() {

        return diasIntervaloSessoes;

    }

    public Integer getHorasDuracaoSessao() {

        return horasDuracaoSessao;

    }

    public Integer getIncrementoHorarioInicio() {

        return incrementoHorarioInicio;

    }

    public Integer getMesEncerramento() {

        return mesEncerramento;

    }

    public List<Local> getLocais() {

        return locais;

    }

    public void gerarAgendaEvento() {

        ZoneId zoneIdSede = locais.get(0).getZoneId();

        for (Local local : locais) {

            Integer numeroSessao = 1;
            LocalDateTime proximaSessao = LocalDateTime.of(dataInicioEvento.getYear(),
                    dataInicioEvento.getMonthValue(),
                    dataInicioEvento.getDayOfMonth(), horaInicio.getHour(), horaInicio.getMinute());

            System.out.println(
                    "\n################################### " + nomeEvento + " ###################################");
            System.out.println("\n===================================" + " Agenda " + local.getNomeCidade()
                    + " ===================================");

            while (proximaSessao.getMonthValue() <= mesEncerramento) {

                System.out.print(
                        "\nSessão nº " + numeroSessao++ + ":\n\n" + local.getNomeCidade() + ":\tDia "
                                + local.getPadraoData().format(proximaSessao.atZone(zoneIdSede)
                                        .withZoneSameInstant(local.getZoneId()))
                                + "\t("
                                + local.getPadraoDia().format(
                                        proximaSessao.atZone(zoneIdSede).withZoneSameInstant(local.getZoneId())
                                                .getDayOfWeek())
                                + ")"
                                + "\tInicio " + local.getPadraoHora().format(proximaSessao.atZone(zoneIdSede)
                                        .withZoneSameInstant(local.getZoneId()))
                                + "\tFim "
                                + local.getPadraoHora().format(proximaSessao.atZone(zoneIdSede)
                                        .withZoneSameInstant(local.getZoneId()).plusHours(6))
                                + "\n");

                proximaSessao = proximaSessao.plusDays(diasIntervaloSessoes);

                proximaSessao = proximaSessao.plusHours(2);

                if (proximaSessao.getHour() == 00) // Não deve avançar um dia e quebrar a regra do intervalo de 10 dias.
                    proximaSessao = proximaSessao.plusDays(-1);

            }

        }

    }

}
