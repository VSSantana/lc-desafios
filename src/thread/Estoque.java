package thread;

public class Estoque implements Runnable {

    private Pedido pedido;

    public Estoque(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        pedido.atualizaEstoque();
    }

}
