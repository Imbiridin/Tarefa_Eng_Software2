package EX_13;

public class Cliente extends Usuario {

    private int pontosFidelidade;

    public Cliente(String nome, String cpf, String email, String senha) {
        super(nome, cpf, email, senha);
        this.pontosFidelidade = 0;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void adicionarPontos(int pontos) {
        if (pontos <= 0) {
            throw new IllegalArgumentException("Os pontos devem ser maiores que zero.");
        }
        pontosFidelidade += pontos;
    }

    @Override
    public String exibirResumo() {
        return "[Cliente] " + super.exibirResumo() + " | Pontos: " + pontosFidelidade;
    }
}
