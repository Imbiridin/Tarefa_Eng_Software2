package EX_17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Prato lasanha = new Prato("P01", "Lasanha", 42.00);
        Prato suco = new Prato("P02", "Suco de laranja", 9.50);

        Cliente ana = new Cliente("C01", "Ana Souza");
        Cliente bruno = new Cliente("C02", "Bruno Lima");

        Pedido p1 = ana.fazerPedido(LocalDate.of(2025, 10, 20), lasanha, 2);
        p1.adicionarItem(suco, 2);
        Pedido p2 = bruno.fazerPedido(LocalDate.of(2025, 10, 20), lasanha, 1);

        System.out.printf("Pedido 1 (%s): R$ %.2f%n", p1.getStatus(), p1.calcularTotal());
        System.out.printf("Pedido 2 (%s): R$ %.2f%n", p2.getStatus(), p2.calcularTotal());

        // O preço do prato muda DEPOIS dos pedidos
        lasanha.atualizarPreco(50.00);
        System.out.printf("Depois do reajuste, Pedido 1: R$ %.2f%n", p1.calcularTotal());

        Pedido p3 = ana.fazerPedido(LocalDate.of(2025, 10, 21), lasanha, 1);
        System.out.printf("Pedido 3 (preço novo): R$ %.2f%n", p3.calcularTotal());

        p1.atualizarStatus("ENTREGUE");
        System.out.println("Pedidos da Ana: " + ana.getPedidos().size());
        System.out.println("Status do Pedido 1: " + p1.getStatus());

        try {
            ana.fazerPedido(LocalDate.of(2025, 10, 22), suco, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Pedidos da Ana após o erro: " + ana.getPedidos().size());
    }
}