package email;

import java.util.List;

public class Mensagem {

    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String toCamelCase(String msg) {

        StringBuilder builder = new StringBuilder();
        String[] listaDePalavras = msg.split("[\\W_]+");

        for (int i = 0; i < listaDePalavras.length; i++) {

            String palavra = listaDePalavras[i];

            if (i == 0)
                palavra = palavra.isEmpty() ? palavra : palavra.toLowerCase();
            else
                palavra = palavra.isEmpty() ? palavra
                        : Character.toUpperCase(palavra.charAt(0)) + palavra.substring(1).toLowerCase();

            builder.append(palavra);

        }

        return builder.toString();

    }

    public String formatarMensagem(List<Envio.FormatoMsg> formatacao) {

        String msgFormatada = this.mensagem;

        if (formatacao != null) {

            for (Envio.FormatoMsg formato : formatacao) {

                switch (formato) {

                    case TUDO_MAIUSCULO:
                        msgFormatada = msgFormatada.toUpperCase();
                        break;

                    case TUDO_MINUSCULO:
                        msgFormatada = msgFormatada.toLowerCase();
                        break;

                    case CAMEL_CASE:
                        msgFormatada = toCamelCase(msgFormatada);
                        break;

                    case PONTUACAO_REMOVIDA:
                        msgFormatada = msgFormatada.replaceAll("\\p{Punct}", "");
                        break;

                }

            }

        }

        return msgFormatada;

    }

}
