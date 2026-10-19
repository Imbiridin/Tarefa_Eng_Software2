package EX_18;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private String matricula;
    private LocalDate dataIngresso;

    public Aluno(String nome, String cpf, String telefone, String email,
                 String matricula, LocalDate dataIngresso) {
        super(nome, cpf, telefone, email);
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
    }

    public String getMatricula() { return matricula; }
    public LocalDate getDataIngresso() { return dataIngresso; }

    @Override
    public String toString() {
        return "Aluno[" + super.toString() + ", matrícula=" + matricula + "]";
    }
}
