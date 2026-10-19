package EX_15;

public class FuncionarioHorista extends Funcionario {

    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioHorista(String matricula, String nome, Departamento departamento,
                              double valorHora, double horasTrabalhadas) {
        super(matricula, nome, departamento);
        if (valorHora < 0) {
            throw new IllegalArgumentException("O valor da hora não pode ser negativo.");
        }
        if (horasTrabalhadas < 0) {
            throw new IllegalArgumentException("As horas trabalhadas não podem ser negativas.");
        }
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        registrarNoDepartamento(); // por último, depois de validar tudo
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularRemuneracao() {
        return valorHora * horasTrabalhadas;
    }
}
