package respostas;

public class Desafio19Resp {

    public static void main(String[] args) {

        Thread processarPagamento = new Thread(() -> {
            System.out.println("Processar pagamento");
            synchronized (Thread.currentThread()) {
                Thread.currentThread().notifyAll();
            }
        });

        Thread verificarBloquearEstoque = new Thread(() -> {
            try {
                synchronized (processarPagamento) {
                    processarPagamento.wait();
                }
                System.out.println("Verificar e bloquear o estoque");
                synchronized (Thread.currentThread()) {
                    Thread.currentThread().notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread emitirNotaFiscal = new Thread(() -> {
            try {
                synchronized (verificarBloquearEstoque) {
                    verificarBloquearEstoque.wait();
                }
                System.out.println("Emitir nota fiscal");
                synchronized (Thread.currentThread()) {
                    Thread.currentThread().notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread envioEmailNotaFiscal = new Thread(() -> {
            try {
                synchronized (emitirNotaFiscal) {
                    emitirNotaFiscal.wait();
                }
                System.out.println("Enviar email para o cliente com NF");
                synchronized (Thread.currentThread()) {
                    Thread.currentThread().notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread prepararProduto = new Thread(() -> {
            try {
                synchronized (verificarBloquearEstoque) {
                    verificarBloquearEstoque.wait();
                }
                System.out.println("Preparar o produto para expediçao");
                synchronized (Thread.currentThread()) {
                    Thread.currentThread().notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread avisarTransportadora = new Thread(() -> {
            try {
                synchronized (verificarBloquearEstoque) {
                    verificarBloquearEstoque.wait();
                }
                System.out.println("Avisar Transportadora");
                synchronized (Thread.currentThread()) {
                    Thread.currentThread().notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        avisarTransportadora.start();
        prepararProduto.start();
        envioEmailNotaFiscal.start();
        emitirNotaFiscal.start();
        verificarBloquearEstoque.start();
        processarPagamento.start();

    }

}
