package EX_9;

public class Musica {

    private String titulo;
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public String exibirResumo() {
        return String.format("%s - %s (%d:%02d)", titulo, artista,
                duracaoSegundos / 60, duracaoSegundos % 60);
    }
}
