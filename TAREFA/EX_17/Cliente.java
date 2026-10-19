package EX_17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private String codigo;
    private String nome;
    private List<Pedido> pedidos;

    public Cliente(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.pedidos = new ArrayList<>(); // pode não ter pedidos: 0..*
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<Pedido> getPedidos() {
        return Collections.unmodifiableList(pedidos);
    }

    public Pedido fazerPedido(LocalDate data, Prato prato, int quantidade) {
        Pedido pedido = new Pedido(this, data, prato, quantidade); // valida antes de registrar
        pedidos.add(pedido);
        return pedido;
    }
}
