package EX_3;

public class Main {
    public static void main(String[] args) {
        Ingresso i = new Ingresso("ING-001", "Show de Rock", 200.00);

        System.out.printf("Preço: R$ %.2f%n", i.getPreco());

        i.aplicarDesconto(25);
        System.out.printf("Preço com 25%% de desconto: R$ %.2f%n", i.getPreco());

        i.utilizar();
        System.out.println("Ingresso utilizado? " + i.isUtilizado());

        try {
            i.utilizar();
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            i.aplicarDesconto(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

