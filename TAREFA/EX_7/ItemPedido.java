package EX_7;

public class ItemPedido {

    private PedidoCompra pedido;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    // Sem "public": só PedidoCompra (mesmo pacote) cria itens. Isso é a composição.
    ItemPedido(PedidoCompra pedido, String descricao, int quantidade, double precoUnitario) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        if (precoUnitario < 0) {
            throw new IllegalArgumentException("O preço unitário não pode ser negativo.");
        }
        this.pedido = pedido;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public PedidoCompra getPedido() {
        return pedido;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
}
