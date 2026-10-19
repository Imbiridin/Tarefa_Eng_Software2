package EX_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Autor {

    private int id;
    private String nome;
    private String email;
    private List<Artigo> artigos;

    public Autor(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.artigos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Artigo> getArtigos() {
        return Collections.unmodifiableList(artigos);
    }

    public int getQuantidadeArtigos() {
        return artigos.size();
    }

    // Sem "public": só classes do mesmo pacote (Artigo) chamam este método
    void adicionarArtigo(Artigo artigo) {
        artigos.add(artigo);
    }
}
