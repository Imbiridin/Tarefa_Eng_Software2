package EX_15;

public abstract class Funcionario {

    private String matricula;
    private String nome;
    private Departamento departamento;

    protected Funcionario(String matricula, String nome, Departamento departamento) {
        if (departamento == null) {
            throw new IllegalArgumentException("Todo funcionário precisa de um departamento.");
        }
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    
    protected final void registrarNoDepartamento() {
        departamento.adicionarFuncionario(this);
    }

    
    public abstract double calcularRemuneracao();

    public String exibirResumo() {
        return "[" + getClass().getSimpleName() + "] " + matricula + " - " + nome
             + " (" + departamento.getNome() + ") - Remuneração: R$ "
             + String.format("%.2f", calcularRemuneracao());
    }
}
