package EX_19;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private List<Veiculo> veiculos = new ArrayList<>();

    public Cliente(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public void adicionarVeiculo(Veiculo v) {
        if (!veiculos.contains(v)) {
            veiculos.add(v);
            v.setCliente(this);
        }
    }

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public List<Veiculo> getVeiculos() { return veiculos; }

    @Override
    public String toString() {
        return String.format("Cliente[%s, CPF=%s, Tel=%s]", nome, cpf, telefone);
    }
}