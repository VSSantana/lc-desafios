package pessoa;

import java.time.LocalDate;

public class Pessoa {

    String nome;
    LocalDate dataNascimento;
    String cidade;
    String uf;

    public Pessoa(String nome, LocalDate dataNascimento, String cidade, String uf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Pessoa [cidade=" + cidade + ", dataNascimento=" + dataNascimento + ", nome=" + nome + ", uf=" + uf
                + "]";
    }

}
