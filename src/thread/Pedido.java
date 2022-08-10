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

    public synchronized void processarPagamento() {
        System.out.println("O pagamento no valor de " + valor + " foi efetuado.");
        this.pagamentoProcessado = true;
        this.notifyAll();
    }

    public synchronized void atualizaEstoque() {

        while (!pagamentoProcessado) {
            System.out.println("Atualização do estoque aguardando processamento do pagamento.");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Estoque atualizado!");
        this.estoqueAtualizado = true;
        this.notifyAll();
    }

    public synchronized void emitirNotaFiscal() {

        while (!estoqueAtualizado) {
            System.out.println("Emissão da nota fiscal aguardando atualização do estoque.");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Nota fiscal emitida!");
        this.notafiscalEmitida = true;
        this.notifyAll();
    }

    public void notificarCliente() {

        synchronized (this) {

            while (!notafiscalEmitida) {
                System.out.println("Envio do email aguardando emissão da nota fiscal.");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        System.out.println("Email enviado para o cliente!");
        this.emailEnviado = true;

    }

    public synchronized void expedirProduto() {

        while (!estoqueAtualizado) {
            System.out.println("Aguardando atualização do estoque para expedir o produto.");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Produto expedido!");
        this.pedidoExpedido = true;
        this.notifyAll();
    }

    public void notificarTransportadora() {

        synchronized (this) {

            while (!pedidoExpedido) {
                System.out.println("Aguardando confirmação de expedição para notificar a transportadora.");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        System.out.println("Transportadora notificada!");
        this.transportadoraNotificada = true;

    }

    @Override
    public String toString() {
        return "Pedido [cpfCliente=" + cpfCliente + ", emailCliente=" + emailCliente + ", item=" + item
                + ", nomeCliente=" + nomeCliente + ", valor=" + valor + "]";
    }

}
