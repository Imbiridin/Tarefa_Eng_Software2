package EX_19;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("123.456.789-00", "Maria Oliveira", "(11) 91234-5678");

        Carro carro = new Carro("ABC-1234", "Fiat Argo", 4);
        Moto moto   = new Moto("XYZ-9876", "Honda CG 160", 160);
        cliente.adicionarVeiculo(carro);
        cliente.adicionarVeiculo(moto);

        Vaga vagaCarro = new Vaga("A01", "A", TipoVaga.CARRO);
        Vaga vagaMoto  = new Vaga("B02", "B", TipoVaga.MOTO);

        LocalDateTime entrada = LocalDateTime.of(2025, 6, 10, 8, 15);

        Permanencia p1 = new Permanencia(carro, vagaCarro, entrada);
        p1.encerrar(LocalDateTime.of(2025, 6, 10, 11, 30));

        Permanencia p2 = new Permanencia(moto, vagaMoto, entrada);
        p2.encerrar(LocalDateTime.of(2025, 6, 10, 9, 0));

        System.out.println(cliente);
        System.out.println(vagaCarro);
        System.out.println(vagaMoto);
        System.out.println(p1);
        System.out.println(p2);

       
        try {
            Vaga v = new Vaga("A02", "A", TipoVaga.CARRO);
            new Permanencia(carro, v, entrada);
            new Permanencia(moto, v, entrada); 
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Regra violada: " + e.getMessage());
        }
    }
}