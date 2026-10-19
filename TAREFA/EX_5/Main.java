package EX_5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Autor ana = new Autor(1, "Ana Souza", "ana@exemplo.com");
        Autor bruno = new Autor(2, "Bruno Lima", "bruno@exemplo.com");

        Artigo a1 = new Artigo("ART-001", "Redes Neurais na Medicina", LocalDate.of(2025, 3, 10), ana);
        Artigo a2 = new Artigo("ART-002", "Aprendizado por Reforço", LocalDate.of(2025, 8, 22), ana);

        System.out.println(a1.exibirResumo());
        System.out.println(a2.exibirResumo());

        System.out.println(ana.getNome() + " publicou " + ana.getQuantidadeArtigos() + " artigo(s)");
        System.out.println(bruno.getNome() + " publicou " + bruno.getQuantidadeArtigos() + " artigo(s)");

        try {
            new Artigo("ART-003", "Sem autor", LocalDate.now(), null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}