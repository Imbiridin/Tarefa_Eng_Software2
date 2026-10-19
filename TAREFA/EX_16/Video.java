package EX_16;

public class Video extends Conteudo {

    private int duracaoMinutos;

    public Video(String codigo, String titulo, String autor, int duracaoMinutos) {
        super(codigo, titulo, autor);
        if (duracaoMinutos <= 0) {
            throw new IllegalArgumentException("A duração deve ser maior que zero.");
        }
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    @Override
    public int estimarTempoMinutos() {
        return duracaoMinutos;
    }
}
