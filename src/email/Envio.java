package email;

import java.util.List;

public class Envio {

    private Boolean emailEnviado = false;

    public enum FormatoMsg {

        TUDO_MAIUSCULO, TUDO_MINUSCULO, CAMEL_CASE, PONTUACAO_REMOVIDA

    }

    public Envio(Cabecalho cabecalho, Mensagem msg, List<FormatoMsg> formatacao) {

        String msgEnviada = msg.formatarMensagem(formatacao);

        System.out.println("\nMensagem enviada:\n");
        System.out.println(msgEnviada);

        setEmailEnviado(true);

    }

    public Boolean getEmailEnviado() {
        return emailEnviado;
    }

    private void setEmailEnviado(Boolean emailEnviado) {
        this.emailEnviado = emailEnviado;
    }

}
