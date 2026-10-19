package EX_20;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String titulo;
    private int cargaHoraria;
    private List<Modulo> modulos = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();

    public Curso(String codigo, String titulo, int cargaHoraria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    /** Composição: módulos pertencem ao curso. */
    public void adicionarModulo(Modulo m) {
        // Regra de negócio: ordem única dentro do curso.
        for (Modulo existente : modulos) {
            if (existente.getOrdem() == m.getOrdem()) {
                throw new IllegalArgumentException(
                        "Já existe módulo com ordem " + m.getOrdem());
            }
        }
        modulos.add(m);
    }

    public void adicionarTurma(Turma t) {
        if (t.getCurso() != this) {
            throw new IllegalArgumentException("Turma pertence a outro curso.");
        }
        if (!turmas.contains(t)) turmas.add(t);
    }

    public double tempoTotalEstimado() {
        return modulos.stream().mapToDouble(Modulo::tempoEstimado).sum();
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public int getCargaHoraria() { return cargaHoraria; }
    public List<Modulo> getModulos() { return modulos; }
    public List<Turma> getTurmas() { return turmas; }

    @Override
    public String toString() {
        return String.format("Curso[%s - %s, CH=%dh, módulos=%d, turmas=%d]",
                codigo, titulo, cargaHoraria, modulos.size(), turmas.size());
    }
}
