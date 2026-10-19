package EX_17;

public class Prato {

    private String codigo;
    private String nome;
    private double preco;

    public Prato(String codigo, String nome, double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = novoPreco;
    }
}