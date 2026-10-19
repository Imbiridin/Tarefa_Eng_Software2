package EX_13;

public abstract class Usuario {

    private String nome;
    private String cpf;
    private String email;
    private String senha;

    protected Usuario(String nome, String cpf, String email, String senha) {
        if (senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("A senha é obrigatória.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    // Não existe getSenha: a classe só confirma se a senha digitada confere
    public boolean autenticar(String senhaDigitada) {
        return senha.equals(senhaDigitada);
    }

    public String exibirResumo() {
        return nome + " | CPF: " + cpf + " | " + email;
    }
}