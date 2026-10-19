package EX_16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conteudo> catalogo = new ArrayList<>();
        catalogo.add(new Video("V001", "Introdução à POO", "Prof. Marina Alves", 18));
        catalogo.add(new Artigo("A001", "Herança e polimorfismo na prática", "Prof. Carlos Mendes", 1250));
        catalogo.add(new Artigo("A002", "Resumo de UML", "Prof. Carlos Mendes", 400));

        int total = 0;
        for (Conteudo c : catalogo) {
            System.out.println(c.exibirResumo());
            total += c.estimarTempoMinutos();
        }
        System.out.println("Tempo total estimado: " + total + " min");

        try {
            new Video("V002", "Sem duração", "Prof. Marina Alves", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
