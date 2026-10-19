package EX_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {

    private String ra;
    private String nome;
    private List<Matricula> matriculas;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.matriculas = new ArrayList<>();
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public List<Matricula> getMatriculas() {
        return Collections.unmodifiableList(matriculas);
    }

    public Matricula matricular(Disciplina disciplina, int semestre, int ano) {
        if (disciplina == null) {
            throw new IllegalArgumentException("A disciplina é obrigatória.");
        }
        Matricula matricula = new Matricula(this, disciplina, semestre, ano);
        matriculas.add(matricula);
        disciplina.adicionarMatricula(matricula);
        return matricula;
    }
}
