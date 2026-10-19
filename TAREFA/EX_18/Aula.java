package EX_18;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Aula {
    private Instrutor instrutor;
    private LocalDate data;
    private LocalTime horario;
    private String modalidade;
    private List<Aluno> alunos = new ArrayList<>();
    private List<AvaliacaoDesempenho> avaliacoes = new ArrayList<>();

    public Aula(Instrutor instrutor, LocalDate data, LocalTime horario, String modalidade) {
        this.instrutor = instrutor;
        this.data = data;
        this.horario = horario;
        this.modalidade = modalidade;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) alunos.add(aluno);
    }

    public AvaliacaoDesempenho criarAvaliacao(Aluno aluno) {
        if (!alunos.contains(aluno))
            throw new IllegalArgumentException("Aluno não está matriculado na aula.");
        AvaliacaoDesempenho av = new AvaliacaoDesempenho(aluno, data);
        avaliacoes.add(av);
        return av;
    }

    public Instrutor getInstrutor() { return instrutor; }
    public LocalDate getData() { return data; }
    public LocalTime getHorario() { return horario; }
    public String getModalidade() { return modalidade; }
    public List<Aluno> getAlunos() { return alunos; }
    public List<AvaliacaoDesempenho> getAvaliacoes() { return avaliacoes; }

    @Override
    public String toString() {
        return String.format("Aula[%s, %s %s, instrutor=%s, alunos=%d, avaliações=%d]",
                modalidade, data, horario, instrutor.getNome(),
                alunos.size(), avaliacoes.size());
    }
}
