package EX_12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ReservaLaboratorio {

    private Professor professor;
    private Turma turma;
    private Laboratorio laboratorio;
    private LocalDate data;
    private LocalTime horaInicial;
    private LocalTime horaFinal;

    // Sem "public": só Laboratorio.reservar() cria reservas
    ReservaLaboratorio(Professor professor, Turma turma, Laboratorio laboratorio,
                       LocalDate data, LocalTime horaInicial, LocalTime horaFinal) {
        if (professor == null || turma == null || laboratorio == null
                || data == null || horaInicial == null || horaFinal == null) {
            throw new IllegalArgumentException(
                "Professor, turma, laboratório, data e horários são obrigatórios.");
        }
        if (!horaFinal.isAfter(horaInicial)) {
            throw new IllegalArgumentException("A hora final deve ser depois da hora inicial.");
        }
        this.professor = professor;
        this.turma = turma;
        this.laboratorio = laboratorio;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Turma getTurma() {
        return turma;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHoraInicial() {
        return horaInicial;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    // Dois intervalos se sobrepõem quando cada um começa antes de o outro terminar
    public boolean conflitaCom(LocalDate outraData, LocalTime outraInicial, LocalTime outraFinal) {
        return data.equals(outraData)
            && horaInicial.isBefore(outraFinal)
            && horaFinal.isAfter(outraInicial);
    }

    public long calcularDuracaoMinutos() {
        return Duration.between(horaInicial, horaFinal).toMinutes();
    }

    public String exibirResumo() {
        DateTimeFormatter dia = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm");
        return laboratorio.getNome() + " - " + data.format(dia) + " "
             + horaInicial.format(hora) + " às " + horaFinal.format(hora)
             + " | Prof. " + professor.getNome()
             + " | Turma " + turma.getNome();
    }
}
