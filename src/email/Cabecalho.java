package email;

public class Cabecalho {

    private String emailDe;
    private String emailPara;
    private String emailCC;
    private String emailCCO;
    private String assunto;

    public Cabecalho(String emailDe, String emailPara, String emailCC, String emailCCO, String assunto) {

        setEmailDe(emailDe);
        setEmailPara(emailPara);
        setAssunto(assunto);

        if (emailCC != null)
            setEmailCC(emailCC);

        if (emailCCO != null)
            setEmailCCO(emailCCO);

    }

    public String getEmailDe() {
        return emailDe;
    }

    public void setEmailDe(String emailDe) {
        this.emailDe = emailDe;
    }

    public String getEmailPara() {
        return emailPara;
    }

    public void setEmailPara(String emailPara) {
        this.emailPara = emailPara;
    }

    public String getEmailCC() {
        return emailCC;
    }

    public void setEmailCC(String emailCC) {
        this.emailCC = emailCC;
    }

    public String getEmailCCO() {
        return emailCCO;
    }

    public void setEmailCCO(String emailCCO) {
        this.emailCCO = emailCCO;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

}
