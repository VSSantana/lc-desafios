import thread.Email;
import thread.Estoque;
import thread.Expedicao;
import thread.NotaFiscal;
import thread.Pagamento;
import thread.Pedido;
import thread.Transportadora;

public class Desafio19 {

    public static void main(String[] args) {

        Pedido pedido = new Pedido("Ferrari Testa Rosa", 1500.00, "Fernando Collor", "02145874158",
                "collor.senador@senado.gov.br");

        new Thread(new Estoque(pedido)).start();
        new Thread(new Pagamento(pedido)).start();
        new Thread(new Email(pedido)).start();
        new Thread(new Expedicao(pedido)).start();
        new Thread(new NotaFiscal(pedido)).start();
        new Thread(new Transportadora(pedido)).start();

    }

}
