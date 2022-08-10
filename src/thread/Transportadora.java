package thread;

public class Transportadora implements Runnable {

    private Pedido pedido;

    public Transportadora(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        pedido.notificarTransportadora();
    }

}
