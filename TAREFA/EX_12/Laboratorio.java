package EX_12;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laboratorio {

    private String nome;
    private int capacidade;
    private List<ReservaLaboratorio> reservas;

    public Laboratorio(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<ReservaLaboratorio> getReservas() {
        return Collections.unmodifiableList(reservas);
    }

    public ReservaLaboratorio reservar(Professor professor, Turma turma,
                                       LocalDate data, LocalTime horaInicial, LocalTime horaFinal) {
    
        ReservaLaboratorio nova =
            new ReservaLaboratorio(professor, turma, this, data, horaInicial, horaFinal);

        for (ReservaLaboratorio existente : reservas) {
            if (existente.conflitaCom(data, horaInicial, horaFinal)) {
                throw new IllegalStateException("O laboratório já está reservado nesse horário.");
            }
        }
        reservas.add(nova);
        return nova;
    }
}