package cliente;

import investimento.Acao;
import investimento.FundoImobiliario;

public class ClienteConservador extends Cliente {

    @Override
    public void contratarInvestimento(Acao investimento) {
        super.contratarInvestimento(investimento);
    }

    @Override
    public void contratarInvestimento(FundoImobiliario investimento) {
        super.contratarInvestimento(investimento);
    }

}
