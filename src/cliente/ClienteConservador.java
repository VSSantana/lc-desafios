package cliente;

import investimento.CDB;
import investimento.Tesouro;

public class ClienteConservador extends Cliente {

    public void contratarInvestimento(CDB investimento) {
        super.adicionarInvestimento(investimento);
    }

    public void contratarInvestimento(Tesouro investimento) {
        super.adicionarInvestimento(investimento);
    }

}
