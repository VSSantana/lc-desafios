package thread;

public class Pagamento implements Runnable {

    private Pedido pedido;

    public Pagamento(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        pedido.processarPagamento();
    }

}
