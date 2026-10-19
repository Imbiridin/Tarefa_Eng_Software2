package EX_6;

public class Colaborador {

    private String matricula;
    private String nome;
    private String cargo;
    private Departamento departamento;

    public Colaborador(String matricula, String nome, String cargo, Departamento departamento) {
        if (departamento == null) { // participação obrigatória
            throw new IllegalArgumentException("Todo colaborador precisa estar lotado em um departamento.");
        }
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        departamento.adicionarColaborador(this);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String exibirResumo() {
        return matricula + " - " + nome + " (" + cargo + ") - Departamento: " + departamento.getNome();
    }
}
