package EX_20;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String email;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("%s[%s, CPF=%s]", getClass().getSimpleName(), nome, cpf);
    }
}
