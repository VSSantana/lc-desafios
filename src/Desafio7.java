import java.util.ArrayList;
import java.util.List;

import email.Cabecalho;
import email.Envio;
import email.Mensagem;

public class Desafio7 {

    public static void main(String[] args) {

        Cabecalho cabecalho = new Cabecalho("br@gmail.com", "Press@tesla.com", "Thank you Tesla", null, null);
        Mensagem msg = new Mensagem();
        List<Envio.FormatoMsg> formatos = new ArrayList<>();

        msg.setMensagem("Thank you for not coming to Brazil. We don't need more shitty cars here.");

        System.out.println("\nMensagem original: " + msg.getMensagem());

        formatos.add(Envio.FormatoMsg.TUDO_MAIUSCULO);

        Envio envio1 = new Envio(cabecalho, msg, formatos);
        System.out.println("\nEmail 1 enviado: " + envio1.getEmailEnviado() + " | Formato: " + formatos);

        formatos.remove(Envio.FormatoMsg.TUDO_MAIUSCULO);
        formatos.add(Envio.FormatoMsg.TUDO_MINUSCULO);

        Envio envio2 = new Envio(cabecalho, msg, formatos);
        System.out.println("\nEmail 2 enviado: " + envio2.getEmailEnviado() + " | Formato: " + formatos);

        formatos.remove(Envio.FormatoMsg.TUDO_MINUSCULO);
        formatos.add(Envio.FormatoMsg.PONTUACAO_REMOVIDA);

        Envio envio3 = new Envio(cabecalho, msg, formatos);
        System.out.println("\nEmail 3 enviado: " + envio3.getEmailEnviado() + " | Formato: " + formatos);

        formatos.remove(Envio.FormatoMsg.PONTUACAO_REMOVIDA);
        formatos.add(Envio.FormatoMsg.CAMEL_CASE);

        Envio envio4 = new Envio(cabecalho, msg, formatos);
        System.out.println("\nEmail 4 enviado: " + envio4.getEmailEnviado() + " | Formato: " + formatos);

        formatos.remove(Envio.FormatoMsg.CAMEL_CASE);
        formatos.add(Envio.FormatoMsg.PONTUACAO_REMOVIDA);
        formatos.add(Envio.FormatoMsg.TUDO_MAIUSCULO);

        Envio envio5 = new Envio(cabecalho, msg, formatos);
        System.out.println("\nEmail 5 enviado: " + envio5.getEmailEnviado() + " | Formato: " + formatos);

    }

}
