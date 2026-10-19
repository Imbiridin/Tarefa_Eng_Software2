package EX_18;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Instrutor instrutor = new Instrutor(
                "Carlos Silva", "111.222.333-44",
                "(11) 98888-7777", "carlos@academia.com",
                "CREF-12345", "Musculação");

        Aluno aluno1 = new Aluno("Ana Souza", "555.666.777-88",
                "(11) 97777-6666", "ana@email.com",
                "MAT001", LocalDate.of(2024, 3, 1));
        Aluno aluno2 = new Aluno("Bruno Lima", "999.888.777-66",
                "(11) 96666-5555", "bruno@email.com",
                "MAT002", LocalDate.of(2024, 5, 15));

        Aula aula = new Aula(instrutor,
                LocalDate.of(2025, 6, 10), LocalTime.of(18, 0), "Musculação");
        aula.adicionarAluno(aluno1);
        aula.adicionarAluno(aluno2);

        AvaliacaoDesempenho av1 = aula.criarAvaliacao(aluno1);
        av1.registrar(9.5, "Excelente evolução");

        AvaliacaoDesempenho av2 = aula.criarAvaliacao(aluno2);
        av2.cancelar();

        System.out.println(instrutor);
        System.out.println(aluno1);
        System.out.println(aula);
        aula.getAvaliacoes().forEach(System.out::println);
    }
}