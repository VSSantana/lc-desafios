package thread;

public class Expedicao implements Runnable {

    private Pedido pedido;

    public Expedicao(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        pedido.expedirProduto();
    }

}
