package EX_8;

public class Matricula {

    private static final double MEDIA_MINIMA = 6.0;

    private Aluno aluno;
    private Disciplina disciplina;
    private int semestre;
    private int ano;
    private double notaFinal;
    private String situacao;

    // Sem "public": só Aluno.matricular() cria matrículas
    Matricula(Aluno aluno, Disciplina disciplina, int semestre, int ano) {
        if (semestre < 1 || semestre > 2) {
            throw new IllegalArgumentException("O semestre deve ser 1 ou 2.");
        }
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.semestre = semestre;
        this.ano = ano;
        this.situacao = "Cursando"; // a nota só existe depois de lançada
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getAno() {
        return ano;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void lancarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.notaFinal = nota;
        this.situacao = (nota >= MEDIA_MINIMA) ? "Aprovado" : "Reprovado";
    }

    public boolean estaAprovado() {
        return "Aprovado".equals(situacao);
    }

    public String exibirResumo() {
        String nota = "Cursando".equals(situacao) ? "-" : String.format("%.1f", notaFinal);
        return aluno.getNome() + " em " + disciplina.getNome()
             + " (" + semestre + "/" + ano + ") - Nota: " + nota + " - " + situacao;
    }
}
