package EX_17;

public class ItemPedido {

    private Prato prato;
    private int quantidade;
    private double precoUnitario; 

    
    ItemPedido(Prato prato, int quantidade) {
        if (prato == null) {
            throw new IllegalArgumentException("O prato é obrigatório.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        this.prato = prato;
        this.quantidade = quantidade;
        this.precoUnitario = prato.getPreco(); // guarda uma "foto" do preço
    }

    public Prato getPrato() {
        return prato;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
}