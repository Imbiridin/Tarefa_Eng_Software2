package EX_11;

public class Produto {

    private String codigo;
    private String nome;
    private double preco;
    private Categoria categoria;

    public Produto(String codigo, String nome, double preco, Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("Todo produto precisa de uma categoria.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        categoria.adicionarProduto(this);
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

    public Categoria getCategoria() {
        return categoria;
    }

    public String exibirResumo() {
        return codigo + " - " + nome + " - R$ " + String.format("%.2f", preco)
             + " [" + categoria.getCaminho() + "]";
    }
}
