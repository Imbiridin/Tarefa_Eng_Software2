package EX_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {

    private String nome;
    private List<EntradaPlaylist> entradas;

    public Playlist(String nome) {
        this.nome = nome;
        this.entradas = new ArrayList<>(); 
    }

    public String getNome() {
        return nome;
    }

    public List<EntradaPlaylist> getEntradas() {
        return Collections.unmodifiableList(entradas);
    }

    public int getQuantidadeEntradas() {
        return entradas.size();
    }

    public EntradaPlaylist adicionarMusica(Musica musica) {
        if (musica == null) {
            throw new IllegalArgumentException("A música é obrigatória.");
        }
        EntradaPlaylist entrada = new EntradaPlaylist(musica, entradas.size() + 1);
        entradas.add(entrada);
        return entrada;
    }

    public void excluir() {
        entradas.clear();
    }
}
