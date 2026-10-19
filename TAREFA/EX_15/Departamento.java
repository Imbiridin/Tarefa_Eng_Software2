package EX_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departamento {

    private String codigo;
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<Funcionario> getFuncionarios() {
        return Collections.unmodifiableList(funcionarios);
    }

    public int getQuantidadeFuncionarios() {
        return funcionarios.size();
    }


    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularRemuneracao();
        }
        return total;
    }

    void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
