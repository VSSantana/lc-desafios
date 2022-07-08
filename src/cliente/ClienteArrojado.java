package cliente;

import investimento.Acao;
import investimento.FundoImobiliario;

public class ClienteArrojado extends Cliente {

    public void contratarInvestimento(Acao investimento) {
        super.adicionarInvestimento(investimento);
    }

    public void contratarInvestimento(FundoImobiliario investimento) {
        super.adicionarInvestimento(investimento);
    }

}
