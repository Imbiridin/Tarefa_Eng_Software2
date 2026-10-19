package EX_9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EntradaPlaylist {

    private int ordem;
    private LocalDateTime adicionadaEm;
    private Musica musica;

    EntradaPlaylist(Musica musica, int ordem) {
        this.musica = musica;
        this.ordem = ordem;
        this.adicionadaEm = LocalDateTime.now();
    }

    public int getOrdem() {
        return ordem;
    }

    public LocalDateTime getAdicionadaEm() {
        return adicionadaEm;
    }

    public Musica getMusica() {
        return musica;
    }

    public String exibirResumo() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return ordem + ". " + musica.exibirResumo()
             + " [adicionada em " + adicionadaEm.format(formato) + "]";
    }
}
