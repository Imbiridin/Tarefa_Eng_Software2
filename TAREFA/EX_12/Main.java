package EX_12;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Professor carlos = new Professor("PR01", "Carlos Mendes");
        Professor marina = new Professor("PR02", "Marina Alves");
        Turma turmaA = new Turma("T-A", "ES2 - Turma A");
        Turma turmaB = new Turma("T-B", "BD - Turma B");
        Laboratorio lab1 = new Laboratorio("Laboratório 1", 30);

        LocalDate dia = LocalDate.of(2025, 10, 20);

        ReservaLaboratorio r1 = lab1.reservar(carlos, turmaA, dia, LocalTime.of(8, 0), LocalTime.of(10, 0));
        ReservaLaboratorio r2 = lab1.reservar(marina, turmaB, dia, LocalTime.of(10, 0), LocalTime.of(12, 0));

        System.out.println(r1.exibirResumo());
        System.out.println("Duração: " + r1.calcularDuracaoMinutos() + " min");
        System.out.println(r2.exibirResumo());
        System.out.println(lab1.getNome() + " tem " + lab1.getReservas().size() + " reserva(s)");

        try {
            lab1.reservar(carlos, turmaB, dia, LocalTime.of(9, 0), LocalTime.of(11, 0));
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            lab1.reservar(carlos, turmaA, dia, LocalTime.of(14, 0), LocalTime.of(13, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}