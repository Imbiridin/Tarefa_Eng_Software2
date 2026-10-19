package EX_15;

public class FuncionarioMensalista extends Funcionario {

    private double salarioMensal;

    public FuncionarioMensalista(String matricula, String nome, Departamento departamento,
                                 double salarioMensal) {
        super(matricula, nome, departamento);
        if (salarioMensal < 0) {
            throw new IllegalArgumentException("O salário mensal não pode ser negativo.");
        }
        this.salarioMensal = salarioMensal;
        registrarNoDepartamento(); 
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public double calcularRemuneracao() {
        return salarioMensal;
    }
}