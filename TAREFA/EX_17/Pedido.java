package EX_17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private LocalDate data;
    private String status;
    private List<ItemPedido> itens;

    
    Pedido(Cliente cliente, LocalDate data, Prato prato, int quantidade) {
        if (cliente == null || data == null) {
            throw new IllegalArgumentException("Cliente e data são obrigatórios.");
        }
        this.cliente = cliente;
        this.data = data;
        this.status = "ABERTO";
        this.itens = new ArrayList<>();
        adicionarItem(prato, quantidade); // o pedido já nasce com pelo menos um item
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public ItemPedido adicionarItem(Prato prato, int quantidade) {
        ItemPedido item = new ItemPedido(prato, quantidade);
        itens.add(item);
        return item;
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.trim().isEmpty()) {
            throw new IllegalArgumentException("O status é obrigatório.");
        }
        this.status = novoStatus;
    }

    
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}
