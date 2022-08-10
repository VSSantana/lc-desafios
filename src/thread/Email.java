package thread;

public class Email implements Runnable {

    private Pedido pedido;

    public Email(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        pedido.notificarCliente();
    }

}
