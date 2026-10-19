package EX_2;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("1001", "Ana Souza", 3000.00, 10);

        System.out.printf("Bônus: R$ %.2f%n", f.calcularBonus());
        System.out.printf("Salário total: R$ %.2f%n", f.calcularSalarioTotal());

        try {
            f.setPercentualBonus(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

