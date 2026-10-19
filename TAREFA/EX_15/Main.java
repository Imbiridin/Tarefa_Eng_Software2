package EX_15;

public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("TI", "Tecnologia da Informação");

        Funcionario ana = new FuncionarioMensalista("1001", "Ana Souza", ti, 5000.00);
        Funcionario bruno = new FuncionarioHorista("1002", "Bruno Lima", ti, 40.00, 120);
        Funcionario carla = new FuncionarioHorista("1003", "Carla Dias", ti, 35.50, 80);

        for (Funcionario f : ti.getFuncionarios()) {
            System.out.println(f.exibirResumo());
        }

        System.out.printf("Folha do departamento %s: R$ %.2f%n", ti.getNome(), ti.calcularFolhaPagamento());
        System.out.println("Funcionários: " + ti.getQuantidadeFuncionarios());

        try {
            new FuncionarioHorista("1004", "Diego Alves", ti, -10, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Funcionários após o erro: " + ti.getQuantidadeFuncionarios());
    }
}
