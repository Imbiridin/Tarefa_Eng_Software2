package EX_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departamento {

    private String codigo;
    private String nome;
    private List<Colaborador> colaboradores;

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.colaboradores = new ArrayList<>(); // começa vazio: participação opcional
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<Colaborador> getColaboradores() {
        return Collections.unmodifiableList(colaboradores);
    }

    public int getQuantidadeColaboradores() {
        return colaboradores.size();
    }

    // Sem "public": só classes do mesmo pacote (Colaborador) chamam este método
    void adicionarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }
}
