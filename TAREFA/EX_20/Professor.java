package EX_20;

public class Professor extends Pessoa {
    private String siape;
    private String titulacao;

    public Professor(String nome, String cpf, String email, String siape, String titulacao) {
        super(nome, cpf, email);
        this.siape = siape;
        this.titulacao = titulacao;
    }

    public String getSiape() { return siape; }
    public String getTitulacao() { return titulacao; }
}