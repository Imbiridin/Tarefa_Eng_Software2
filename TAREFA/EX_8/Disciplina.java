package EX_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Disciplina {

    private String codigo;
    private String nome;
    private List<Matricula> matriculas;

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.matriculas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<Matricula> getMatriculas() {
        return Collections.unmodifiableList(matriculas);
    }

    public int getQuantidadeMatriculas() {
        return matriculas.size();
    }

    // Sem "public": só Aluno (mesmo pacote) chama, dentro de matricular()
    void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }
}