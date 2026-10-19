package EX_7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PedidoCompra {

    private int numero;
    private LocalDate data;
    private List<ItemPedido> itens;

    // Recebe os dados do primeiro item: o pedido nunca existe sem item (mínimo 1)
    public PedidoCompra(int numero, LocalDate data, String descricao, int quantidade, double precoUnitario) {
        this.numero = numero;
        this.data = data;
        this.itens = new ArrayList<>();
        adicionarItem(descricao, quantidade, precoUnitario);
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public List<ItemPedido> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    // O pedido (o "todo") é quem cria os itens (as "partes")
    public ItemPedido adicionarItem(String descricao, int quantidade, double precoUnitario) {
        ItemPedido item = new ItemPedido(this, descricao, quantidade, precoUnitario);
        itens.add(item);
        return item;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}
