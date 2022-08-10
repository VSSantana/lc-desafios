package thread;

public class NotaFiscal implements Runnable {

    private Pedido pedido;

    public NotaFiscal(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        pedido.emitirNotaFiscal();
    }

}
