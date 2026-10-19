package EX_20;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Curso curso = new Curso("ESW2", "Engenharia de Software II", 60);
        curso.adicionarModulo(new ModuloVideo("Introdução", 1, 4, 30, 1));
        curso.adicionarModulo(new ModuloLeitura("UML na prática", 2, 6, 20, 200));
        curso.adicionarModulo(new ModuloVideo("Padrões de projeto", 3, 8, 45, 2));

        System.out.println(curso);
        curso.getModulos().forEach(m -> System.out.println("  " + m));
        System.out.printf("Tempo total estimado: %.1f min%n%n",
                curso.tempoTotalEstimado());

        
        Professor prof = new Professor("Dr. Silva", "111.222.333-44",
                "silva@uni.br", "SIAPE-001", "Doutor");
        Turma turma = new Turma("T2025-1", LocalDate.of(2025, 3, 1), 2, curso, prof);

        
        Aluno a1 = new Aluno("Ana", "555.666.777-88", "ana@aluno.br", "MAT001");
        Aluno a2 = new Aluno("Bruno", "999.888.777-66", "bruno@aluno.br", "MAT002");
        Aluno a3 = new Aluno("Carla", "333.444.555-22", "carla@aluno.br", "MAT003");

        Matricula m1 = new Matricula(a1, turma, LocalDate.of(2025, 2, 20));
        Matricula m2 = new Matricula(a2, turma, LocalDate.of(2025, 2, 21));

        System.out.println(turma);

       
        try {
            new Matricula(a3, turma, LocalDate.of(2025, 2, 22));
        } catch (IllegalStateException e) {
            System.out.println("Regra violada: " + e.getMessage());
        }

        
        m1.concluir(9.5);
        System.out.println(m1);
        try {
            m1.trancar();
        } catch (IllegalStateException e) {
            System.out.println("Regra violada: " + e.getMessage());
        }

        
        try {
            curso.adicionarModulo(new ModuloLeitura("Extra", 1, 2, 5, 200));
        } catch (IllegalArgumentException e) {
            System.out.println("Regra violada: " + e.getMessage());
        }

        System.out.println("Vagas ocupadas: " + turma.vagasOcupadas());
    }
}
