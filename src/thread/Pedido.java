package thread;

public class Pedido {

    private String item;
    private Double valor;
    private String nomeCliente;
    private String cpfCliente;
    private String emailCliente;
    private Boolean pagamentoProcessado = false;
    private Boolean notafiscalEmitida = false;
    private Boolean estoqueAtualizado = false;
    private Boolean transportadoraNotificada = false;
    private Boolean emailEnviado = false;
    private Boolean pedidoExpedido = false;

    public Pedido(String item, Double valor, String nomeCliente, String cpfCliente, String emailCliente) {
        this.item = item;
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public Boolean getPagamentoProcessado() {
        return pagamentoProcessado;
    }

    public Boolean getNotafiscalEmitida() {
        return notafiscalEmitida;
    }

    public Boolean getEstoqueAtualizado() {
        return estoqueAtualizado;
    }

    public Boolean getTransportadoraNotificada() {
        return transportadoraNotificada;
    }

    public Boolean getEmailEnviado() {
        return emailEnviado;
    }

    public Boolean getPedidoExpedido() {
        return pedidoExpedido;
    }

    public void processarPagamento() {

        System.out.println("O pagamento no valor de " + valor + "foi efetuado.");
        this.pagamentoProcessado = true;

    }

    public void atualizaEstoque() {

        synchronized (this) {

            while (!pagamentoProcessado) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        System.out.println("Estoque atualizado!");
        this.estoqueAtualizado = true;

    }

    public void emitirNotaFiscal() {

        System.out.println("Nota fiscal emitida!");
        this.notafiscalEmitida = true;

    }

    public void notificarCliente() {

        System.out.println("Email enviado!");
        this.emailEnviado = true;

    }

    public void expedirProduto() {

        System.out.println("Produto expedido!");
        this.pedidoExpedido = true;

    }

    public void notificarTransportadora() {

        System.out.println("Transportadora notificada!");
        this.transportadoraNotificada = true;

    }

    @Override
    public String toString() {
        return "Pedido [cpfCliente=" + cpfCliente + ", emailCliente=" + emailCliente + ", item=" + item
                + ", nomeCliente=" + nomeCliente + ", valor=" + valor + "]";
    }

}
