package evento;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Local {

    private final String nomeCidade;
    private final Locale local;
    private final ZoneId zoneId;
    private final DateTimeFormatter padraoData;
    private final DateTimeFormatter padraoHora;
    private final DateTimeFormatter padraoDia;

    private Local(Builder builder) {

        this.nomeCidade = builder.nomeCidade;
        this.local = builder.local;
        this.zoneId = builder.zoneId;
        this.padraoData = builder.padraoData;
        this.padraoHora = builder.padraoHora;
        this.padraoDia = builder.padraoDia;

    }

    public static class Builder {

        private String nomeCidade;
        private Locale local;
        private ZoneId zoneId;
        private DateTimeFormatter padraoData;
        private DateTimeFormatter padraoHora;
        private DateTimeFormatter padraoDia;

        public Builder nomeCidade(String nomeCidade) {

            this.nomeCidade = nomeCidade;

            return this;

        }

        public Builder local(Locale local) {

            this.local = local;

            return this;

        }

        public Builder zoneId(ZoneId zoneId) {

            this.zoneId = zoneId;

            return this;

        }

        public Builder padraoData(DateTimeFormatter padraoData) {

            this.padraoData = padraoData;

            return this;

        }

        public Builder padraoHora(DateTimeFormatter padraoHora) {

            this.padraoHora = padraoHora;

            return this;

        }

        public Builder padraoDia(DateTimeFormatter padraoDia) {

            this.padraoDia = padraoDia;

            return this;

        }

        public Local build() {

            return new Local(this);

        }

    }

    public String getNomeCidade() {

        return nomeCidade;

    }

    public Locale getLocal() {

        return local;

    }

    public ZoneId getZoneId() {

        return zoneId;

    }

    public DateTimeFormatter getPadraoData() {

        return padraoData;

    }

    public DateTimeFormatter getPadraoHora() {

        return padraoHora;

    }

    public DateTimeFormatter getPadraoDia() {

        return padraoDia;

    }

}
