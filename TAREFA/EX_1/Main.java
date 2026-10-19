public class Main {
    public static void main(String[] args) {
        Equipamento e = new Equipamento("PAT-001", "Notebook Inspiron 15", "Dell", 3500.00);

        System.out.println(e.exibirResumo());

        e.atualizarValor(3200.00);
        System.out.println(e.exibirResumo());

        System.out.println("Ultrapassa R$ 3000,00? " + e.valorUltrapassaLimite(3000.00));
        System.out.println("Ultrapassa R$ 5000,00? " + e.valorUltrapassaLimite(5000.00));
    }
}


