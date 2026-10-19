package EX_20;

public class ModuloVideo extends Modulo {
    private int duracaoMin;
    private int replays;

    public ModuloVideo(String titulo, int ordem, int cargaHoraria,
                       int duracaoMin, int replays) {
        super(titulo, ordem, cargaHoraria);
        this.duracaoMin = duracaoMin;
        this.replays = replays;
    }

    @Override
    public double tempoEstimado() {
        return duracaoMin * (1 + replays * 0.5);
    }
}
