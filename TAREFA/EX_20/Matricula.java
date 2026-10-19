package EX_20;

import java.time.LocalDate;

public class Matricula {
    private Aluno aluno;
    private Turma turma;
    private LocalDate data;
    private SituacaoMatricula situacao;
    private double notaFinal;

    public Matricula(Aluno aluno, Turma turma, LocalDate data) {
        if (!turma.temVaga()) {
            throw new IllegalStateException(
                "Turma " + turma.getCodigo() + " sem vagas disponíveis.");
        }
        this.aluno = aluno;
        this.turma = turma;
        this.data = data;
        this.situacao = SituacaoMatricula.ATIVA;
        turma.adicionarMatricula(this);
    }

    /** Regra de negócio: só ATIVA pode concluir; exige nota final. */
    public void concluir(double notaFinal) {
        if (situacao != SituacaoMatricula.ATIVA) {
            throw new IllegalStateException(
                "Só matrícula ATIVA pode ser concluída. Atual: " + situacao);
        }
        this.notaFinal = notaFinal;
        this.situacao = SituacaoMatricula.CONCLUIDA;
    }

    public void trancar() {
        if (situacao != SituacaoMatricula.ATIVA) {
            throw new IllegalStateException("Só matrícula ATIVA pode ser trancada.");
        }
        this.situacao = SituacaoMatricula.TRANCADA;
    }

    public void cancelar() {
        if (situacao == SituacaoMatricula.CONCLUIDA) {
            throw new IllegalStateException("Matrícula concluída não pode ser cancelada.");
        }
        this.situacao = SituacaoMatricula.CANCELADA;
    }

    public Aluno getAluno() { return aluno; }
    public Turma getTurma() { return turma; }
    public LocalDate getData() { return data; }
    public SituacaoMatricula getSituacao() { return situacao; }
    public double getNotaFinal() { return notaFinal; }

    @Override
    public String toString() {
        return String.format("Matricula[aluno=%s, turma=%s, situação=%s, nota=%.1f]",
                aluno.getNome(), turma.getCodigo(), situacao, notaFinal);
    }
}
