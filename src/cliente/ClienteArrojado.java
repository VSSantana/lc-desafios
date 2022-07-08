package cliente;

import investimento.CDB;
import investimento.Tesouro;

public class ClienteArrojado extends Cliente {

    @Override
    public void contratarInvestimento(CDB investimento) {
        super.contratarInvestimento(investimento);
    }

    @Override
    public void contratarInvestimento(Tesouro investimento) {
        super.contratarInvestimento(investimento);
    }

}
