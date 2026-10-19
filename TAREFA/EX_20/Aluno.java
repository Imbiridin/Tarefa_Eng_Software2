package EX_20;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, String email, String matricula) {
        super(nome, cpf, email);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }

    @Override
    public String toString() {
        return super.toString() + " matrícula=" + matricula;
    }
}