package EX_2;

public class Funcionario {

    private String matricula;
    private String nome;
    private double salarioBase;
    private double percentualBonus;

    public Funcionario(String matricula, String nome, double salarioBase, double percentualBonus) {
        validarPercentual(percentualBonus);
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.percentualBonus = percentualBonus;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        validarPercentual(percentualBonus);
        this.percentualBonus = percentualBonus;
    }

    public double calcularBonus() {
        return salarioBase * percentualBonus / 100;
    }

    public double calcularSalarioTotal() {
        return salarioBase + calcularBonus();
    }

    private void validarPercentual(double percentual) {
        if (percentual < 0) {
            throw new IllegalArgumentException("O percentual de bônus não pode ser negativo.");
        }
    }
}
