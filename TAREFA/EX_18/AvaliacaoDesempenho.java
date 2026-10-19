package EX_18;

import java.time.LocalDate;

public class AvaliacaoDesempenho {
    private Aluno aluno;
    private double nota;
    private String observacao;
    private LocalDate dataAvaliacao;
    private StatusAvaliacao status;

    public AvaliacaoDesempenho(Aluno aluno, LocalDate dataAvaliacao) {
        this.aluno = aluno;
        this.dataAvaliacao = dataAvaliacao;
        this.status = StatusAvaliacao.PENDENTE;
    }

    // Ciclo de vida
    public void registrar(double nota, String observacao) {
        if (status != StatusAvaliacao.PENDENTE)
            throw new IllegalStateException("Avaliação já finalizada.");
        this.nota = nota;
        this.observacao = observacao;
        this.status = StatusAvaliacao.CONCLUIDA;
    }

    public void cancelar() {
        if (status == StatusAvaliacao.CONCLUIDA)
            throw new IllegalStateException("Não é possível cancelar avaliação concluída.");
        this.status = StatusAvaliacao.CANCELADA;
    }

    public Aluno getAluno() { return aluno; }
    public double getNota() { return nota; }
    public String getObservacao() { return observacao; }
    public LocalDate getDataAvaliacao() { return dataAvaliacao; }
    public StatusAvaliacao getStatus() { return status; }

    @Override
    public String toString() {
        return String.format("Avaliação[aluno=%s, nota=%.1f, status=%s]",
                aluno.getNome(), nota, status);
    }
}