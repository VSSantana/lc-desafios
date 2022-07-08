package cliente;

import java.util.ArrayList;
import java.util.List;

import investimento.Acao;
import investimento.CDB;
import investimento.FundoImobiliario;
import investimento.Investimento;
import investimento.Tesouro;

public abstract class Cliente {

    private List<Investimento> carteiraInvestimentos = new ArrayList<>();

    public void contratarInvestimento(Acao investimento) {
        this.carteiraInvestimentos.add(investimento);
    }

    public void contratarInvestimento(Tesouro investimento) {
        this.carteiraInvestimentos.add(investimento);
    }

    public void contratarInvestimento(CDB investimento) {
        this.carteiraInvestimentos.add(investimento);
    }

    public void contratarInvestimento(FundoImobiliario investimento) {
        this.carteiraInvestimentos.add(investimento);
    }

    public List<Investimento> getCarteiraInvestimentos() {
        return this.carteiraInvestimentos;
    }

}
