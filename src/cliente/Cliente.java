package cliente;

import java.util.ArrayList;
import java.util.List;

import investimento.Investimento;

public abstract class Cliente {

    private List<Investimento> carteiraInvestimentos = new ArrayList<>();

    public void adicionarInvestimento(Investimento investimento) {
        this.carteiraInvestimentos.add(investimento);
    }

    public List<Investimento> getCarteiraInvestimentos() {
        return this.carteiraInvestimentos;
    }

}
