package EX_20;

public abstract class Modulo {
    protected String titulo;
    protected int ordem;
    protected int cargaHoraria;

    public Modulo(String titulo, int ordem, int cargaHoraria) {
        this.titulo = titulo;
        this.ordem = ordem;
        this.cargaHoraria = cargaHoraria;
    }

    /** Polimorfismo: cada tipo de módulo calcula o tempo de estudo de forma própria. */
    public abstract double tempoEstimado();

    public String getTitulo() { return titulo; }
    public int getOrdem() { return ordem; }
    public int getCargaHoraria() { return cargaHoraria; }

    @Override
    public String toString() {
        return String.format("%s[ordem=%d, título=%s, tempoEstimado=%.1f min]",
                getClass().getSimpleName(), ordem, titulo, tempoEstimado());
    }
}