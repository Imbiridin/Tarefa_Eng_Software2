package EX_7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PedidoCompra p = new PedidoCompra(1001, LocalDate.of(2025, 10, 5), "Teclado USB", 2, 80.00);
        p.adicionarItem("Mouse óptico", 3, 35.00);
        p.adicionarItem("Monitor 24 pol", 1, 900.00);

        System.out.println("Pedido " + p.getNumero() + " de " + p.getData());
        for (ItemPedido item : p.getItens()) {
            System.out.printf("- %s: %d x R$ %.2f = R$ %.2f%n",
                item.getDescricao(), item.getQuantidade(),
                item.getPrecoUnitario(), item.calcularSubtotal());
        }
        System.out.printf("Total: R$ %.2f%n", p.calcularTotal());

        try {
            p.adicionarItem("Cabo HDMI", 0, 20.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}