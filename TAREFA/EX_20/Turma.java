package EX_20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private LocalDate dataInicio;
    private int limiteVagas;
    private Curso curso;
    private Professor professor;
    private List<Matricula> matriculas = new ArrayList<>();

    public Turma(String codigo, LocalDate dataInicio, int limiteVagas,
                 Curso curso, Professor professor) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.limiteVagas = limiteVagas;
        this.curso = curso;
        this.professor = professor;
        curso.adicionarTurma(this);
    }

    public int vagasOcupadas() {
        return (int) matriculas.stream()
                .filter(m -> m.getSituacao() != SituacaoMatricula.CANCELADA)
                .count();
    }

    public boolean temVaga() {
        return vagasOcupadas() < limiteVagas;
    }

    void adicionarMatricula(Matricula m) {
        matriculas.add(m);
    }

    public String getCodigo() { return codigo; }
    public LocalDate getDataInicio() { return dataInicio; }
    public int getLimiteVagas() { return limiteVagas; }
    public Curso getCurso() { return curso; }
    public Professor getProfessor() { return professor; }
    public List<Matricula> getMatriculas() { return matriculas; }

    @Override
    public String toString() {
        return String.format("Turma[%s, curso=%s, prof=%s, %d/%d vagas]",
                codigo, curso.getTitulo(), professor.getNome(),
                vagasOcupadas(), limiteVagas);
    }
}